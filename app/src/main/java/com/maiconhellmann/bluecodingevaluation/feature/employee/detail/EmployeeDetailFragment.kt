package com.maiconhellmann.bluecodingevaluation.feature.employee.detail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.maiconhellmann.bluecodingevaluation.R
import com.maiconhellmann.bluecodingevaluation.data.model.Employee
import com.maiconhellmann.bluecodingevaluation.databinding.FragmentEmployeeDetailBinding
import com.maiconhellmann.bluecodingevaluation.feature.employee.list.EmployeeListFragment
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState
import com.maiconhellmann.bluecodingevaluation.util.GlideApp
import com.maiconhellmann.bluecodingevaluation.util.toast
import com.maiconhellmann.bluecodingevaluation.util.visible
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.text.NumberFormat

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 18/07/2019
 * 
 * (c) 2019 
 */
class EmployeeDetailFragment: Fragment() {

    private lateinit var binding: FragmentEmployeeDetailBinding

    private val viewModel: EmployeeDetailViewModel by viewModel()

    /**
     * Screen arguments
     */
    private val employeeId: Int by lazy {
        val safeArgs: EmployeeDetailFragmentArgs by navArgs()
        safeArgs.employeeId
    }

    /**
     * TAG used manly for logging
     */
    private val TAG = EmployeeListFragment::class.java.simpleName


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_employee_detail, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? AppCompatActivity)?.setSupportActionBar(binding.toolbar)

        binding.lifecycleOwner = this

        setupViewModel()
    }

    /**
     * Setup and observe fields from a viewModel
     */
    private fun setupViewModel() {
        viewModel.getEmployeeDetails(employeeId)

        viewModel.state.observe(this, Observer { state ->
            when(state) {
                is ViewState.Success -> {
                    setVisibilities(showDetails = true)
                    updateView(state.data)
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
     * Update view with the employee info
     */
    private fun updateView(employee: Employee) {
        binding.textViewName.text = employee.name
        binding.textViewAge.text = context?.getString(R.string.age_value, employee.age)

        val format = NumberFormat.getCurrencyInstance()
        format.maximumFractionDigits = 2

        binding.textViewSalary.text = format.format(employee.salary)

        employee.image?.let { url->
            GlideApp.with(binding.imageViewAvatar).load(url)
        }
    }

    /**
     * Centralized handler to keep the correct components visible
     */
    private fun setVisibilities(
        showProgressBar: Boolean = false,
        showDetails: Boolean = false,
        showError: Boolean = false
    ) {
        binding.progressBar.visible(showProgressBar)
        binding.layoutEmployeeDetails.visible(showDetails)
        binding.btnTryAgain.visible(showError)

        context?.let { ctx ->
                binding.toolbar.navigationIcon = if (showError){
                ContextCompat.getDrawable(ctx, R.drawable.ic_arrow_back_black_24dp)
            } else {
                ContextCompat.getDrawable(ctx, R.drawable.ic_arrow_back_white_24dp)
            }
        }
    }

    /**
     * Show a very simple Toast with an error
     */
    private fun showError(throwable: Throwable) {
        view?.context?.toast(throwable.toString())
        Log.e(TAG, "Error", throwable)
    }
}