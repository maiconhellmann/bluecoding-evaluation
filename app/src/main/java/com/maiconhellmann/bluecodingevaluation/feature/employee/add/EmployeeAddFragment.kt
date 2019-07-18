package com.maiconhellmann.bluecodingevaluation.feature.employee.add

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.maiconhellmann.bluecodingevaluation.EmployeeAddFragmentBinding
import com.maiconhellmann.bluecodingevaluation.R
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState
import com.maiconhellmann.bluecodingevaluation.util.toast
import com.maiconhellmann.bluecodingevaluation.util.visible
import org.koin.androidx.viewmodel.ext.android.viewModel

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 18/07/2019
 * 
 * (c) 2019 
 */class EmployeeAddFragment: Fragment() {

    private lateinit var binding: EmployeeAddFragmentBinding
    private val viewModel: EmployeeAddViewModel by viewModel()

    /**
     * TAG used manly for logging
     */
    private val TAG = EmployeeAddFragment::class.java.simpleName

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.employee_add_fragment, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? AppCompatActivity)?.setSupportActionBar(binding.toolbar)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        setupViewModel()
        addListeners()
    }

    /**
     * Centralized method to add listeners to the components
     */
    private fun addListeners() {
        binding.fabSave.setOnClickListener {
            viewModel.addEmployee()
        }
        binding.imageViewAvatar.setOnClickListener {
            showNotImplementedMessage()
        }
    }

    /**
     * Show a simple message to let the user know this feature is not implemented yet
     */
    private fun showNotImplementedMessage() {
        view?.context?.toast(getString(R.string.not_implemented))
    }

    /**
     * Setup and observe viewmodel fields
     */
    private fun setupViewModel() {
        viewModel.state.observe(this, Observer {
            when(it) {
                is ViewState.Success -> {
                    setVisibilities(showFields = true)

                    if(it.data.id != 0){
                        showSuccessMessage()
                        Navigation.findNavController(binding.root).popBackStack()
                    }
                }
                is ViewState.Failed -> {
                    showError(it.throwable)
                    setVisibilities()
                }
                is ViewState.Loading -> {
                    setVisibilities(showProgressBar = true)
                }
            }
        })

        //Name validation
        viewModel.fieldNameValidator.observe(this, Observer { state->
            when (state) {
                ValidationCodeEnum.VALID -> showFieldError(binding.editTextName)
                ValidationCodeEnum.INVALID_EMPTY_FIELD -> {
                    showFieldError(binding.editTextName, getString(R.string.error_empty))
                }
                ValidationCodeEnum.INVALID_INVALID_FORMAT -> {
                    showFieldError(binding.editTextName, getString(R.string.error_invalid_format))
                }
            }
        })

        //Age validations
        viewModel.fieldAgeValidator.observe(this, Observer { state->
            when (state) {
                ValidationCodeEnum.VALID -> showFieldError(binding.editTextAge)
                ValidationCodeEnum.INVALID_EMPTY_FIELD -> {
                    showFieldError(binding.editTextAge, getString(R.string.error_empty))
                }
                ValidationCodeEnum.INVALID_INVALID_FORMAT -> {
                    showFieldError(binding.editTextAge, getString(R.string.error_invalid_format))
                }
            }
        })

        //Salary validations
        viewModel.fieldSalaryValidator.observe(this, Observer { state->
            when (state) {
                ValidationCodeEnum.VALID -> showFieldError(binding.editTextSalary)
                ValidationCodeEnum.INVALID_EMPTY_FIELD -> {
                    showFieldError(binding.editTextSalary, getString(R.string.error_empty))
                }
                ValidationCodeEnum.INVALID_INVALID_FORMAT -> {
                    showFieldError(binding.editTextSalary, getString(R.string.error_invalid_format))
                }
            }
        })
    }

    /**
     * Show an error in a EditText(red dot with a description)
     */
    private fun showFieldError(editText: EditText, error: String?= null){
        editText.error = error
    }

    /**
     * Show a very simple success message
     */
    private fun showSuccessMessage() {
        view?.context?.toast(getString(R.string.employee_added_successfully))
    }

    /**
     * Centralized handler to keep the correct components visible
     */
    private fun setVisibilities(
        showProgressBar: Boolean = false,
        showFields: Boolean = false
    ) {
        binding.progressBar.visible(showProgressBar)
        binding.layoutEmployeeDetails.visible(showFields)
    }

    /**
     * Show a very simple Toast with an error
     */
    private fun showError(throwable: Throwable) {
        view?.context?.toast(throwable.toString())
        Log.e(TAG, "Error", throwable)
    }
}