package com.maiconhellmann.bluecodingevaluation.feature.employee.list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.maiconhellmann.bluecodingevaluation.R
import com.maiconhellmann.bluecodingevaluation.databinding.FragmentEmployeeListBindingImpl
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState
import com.maiconhellmann.bluecodingevaluation.util.toast
import com.maiconhellmann.bluecodingevaluation.util.visible
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 18/07/2019
 * 
 * (c) 2019 
 */class EmployeeListFragment: Fragment() {

    private lateinit var binding: FragmentEmployeeListBindingImpl
    private val adapter: EmployeeAdapter by inject()
    private val viewModel: EmployeeListViewModel by viewModel()

    /**
     * TAG used manly for logging
     */
    private val TAG = EmployeeListFragment::class.java.simpleName

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_employee_list, container, false)

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this

        (activity as? AppCompatActivity)?.setSupportActionBar(binding.toolbar)
        setupRecyclerView()
        setupViewModel()
        setupSwipeRefresh()
        addListeners()
    }

    /**
     * Centralized method to add listeners
     */
    private fun addListeners() {
        binding.fabAddEmployee.setOnClickListener {
            with(EmployeeListFragmentDirections.actionEmployeeListFragmentToEmployeeAddFragment()){
                Navigation.findNavController(binding.root).navigate(this)
            }
        }
    }

    /**
     * Setup SwipeRefresh(swipe to reload the employees from a remote data source)
     */
    private fun setupSwipeRefresh() {
        binding.swipeRefresh.setOnRefreshListener {
            viewModel.getEmployees()
        }
    }

    /**
     * Setup viewModel and observe its status
     */
    private fun setupViewModel() {
        viewModel.getEmployees()

        viewModel.state.observe(this, Observer { state->
            when(state) {
                is ViewState.Success -> {
                    adapter.employees = state.data
                    setVisibilities(showList = true)
                }
                is ViewState.Failed -> {
                    setVisibilities(showError = true)
                    showError(state.throwable)
                }
                is ViewState.Loading -> {
                    setVisibilities(showProgressBar = true)
                }
            }
        })
    }

    /**
     * Setup recyclerView and its adapter.
     */
    private fun setupRecyclerView() {
        binding.recyclerView.adapter = adapter
    }

    /**
     * Centralized handler to keep the correct components visible
     */
    private fun setVisibilities(
        showProgressBar: Boolean = false,
        showList: Boolean = false,
        showError: Boolean = false,
        isRefreshing: Boolean = false
    ) {
        binding.progressBar.visible(showProgressBar)
        binding.recyclerView.visible(showList)
        binding.btnTryAgain.visible(showError)
        binding.swipeRefresh.isRefreshing = isRefreshing
    }


    /**
     * Show a very simple Toast with an error
     */
    private fun showError(throwable: Throwable) {
        view?.context?.toast(throwable.toString())
        Log.e(TAG, "Error", throwable)
    }
}