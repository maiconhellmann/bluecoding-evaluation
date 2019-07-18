package com.maiconhellmann.bluecodingevaluation.feature.employee.add

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.maiconhellmann.bluecodingevaluation.data.model.Employee
import com.maiconhellmann.bluecodingevaluation.feature.employee.EmployeeUseCase
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.BaseViewModel
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.StateMachineSingle
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState
import io.reactivex.Scheduler
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 18/07/2019
 * 
 * (c) 2019 
 */class EmployeeAddViewModel(
    private val useCase: EmployeeUseCase,
    private val uiScheduler: Scheduler
): BaseViewModel() {

    /** Field name */
    private val name = ObservableField("")
    /** Field salary */
    private val salary = ObservableField<Double>()
    /** Field age */
    private val age = ObservableField<Int>()

    //VALIDATORS
    val fieldNameValidator = MutableLiveData<ValidationCodeEnum>()
    val fieldSalaryValidator = MutableLiveData<ValidationCodeEnum>()
    val fieldAgeValidator = MutableLiveData<ValidationCodeEnum>()

    val state = MutableLiveData<ViewState<Employee>>().apply {
        value = ViewState.Success(Employee.EMPTY)
    }

    /**
     * Call an API to create an employee and update view state
     */
    fun addEmployee() {

        if (!validateFields()) return

        val employee = Employee(
            id = 0,
            name = name.get() ?: throw IllegalStateException("name is null"),
            salary = salary.get() ?: throw IllegalStateException("salary is null"),
            age = age.get() ?: throw IllegalStateException("age is null"),
            image = ""
        )

        useCase.addEmployee(employee)
            .compose(StateMachineSingle())
            .observeOn(uiScheduler)
            .doOnSubscribe { state.postValue(ViewState.Loading) }
            .subscribeBy(
                onSuccess =  {
                    state.postValue(it)
                }
            )
    }

    /**
     * Validate all the fields to ensure they are not null or empty
     */
    private fun validateFields(): Boolean {
        var isValid = true

        if (name.get()?.isEmpty() == true) {
            fieldNameValidator.postValue(ValidationCodeEnum.INVALID_EMPTY_FIELD)
            isValid = false
        }
        if (age.get() == null) {
            fieldAgeValidator.postValue(ValidationCodeEnum.INVALID_EMPTY_FIELD)
            isValid = false
        }
        if (salary.get() == null) {
            fieldSalaryValidator.postValue(ValidationCodeEnum.INVALID_EMPTY_FIELD)
            isValid = false
        }

        return isValid
    }

    /**
     * Used by dataBinding to set a name and validate it
     */
    fun setName(text: CharSequence) {
        if(text.isEmpty()){
            fieldNameValidator.postValue(ValidationCodeEnum.INVALID_EMPTY_FIELD)
        } else {
            fieldNameValidator.postValue(ValidationCodeEnum.VALID)
            name.set(text.toString())
        }
    }

    /**
     * Used by dataBinding to set a salary and validate it
     */
    fun setSalary(text: CharSequence) {
        if (text.isEmpty()) {
            fieldAgeValidator.postValue(ValidationCodeEnum.INVALID_EMPTY_FIELD)
        } else {
            try {
                salary.set(text.toString().toDouble())
                fieldSalaryValidator.postValue(ValidationCodeEnum.VALID)
            } catch (ex: NumberFormatException) {
                fieldSalaryValidator.postValue(ValidationCodeEnum.INVALID_INVALID_FORMAT)
            }
        }
    }


    /**
     * Used by dataBinding to set an age and validate it
     */
    fun setAge(text: CharSequence) {
        if (text.isEmpty()) {
            fieldAgeValidator.postValue(ValidationCodeEnum.INVALID_EMPTY_FIELD)
        } else {
            try {
                age.set(text.toString().toInt())
                fieldAgeValidator.postValue(ValidationCodeEnum.VALID)
            } catch (ex: NumberFormatException) {
                fieldAgeValidator.postValue(ValidationCodeEnum.INVALID_INVALID_FORMAT)
            }
        }
    }
}