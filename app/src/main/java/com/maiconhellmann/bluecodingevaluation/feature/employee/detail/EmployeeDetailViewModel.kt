package com.maiconhellmann.bluecodingevaluation.feature.employee.detail

import androidx.lifecycle.MutableLiveData
import com.maiconhellmann.bluecodingevaluation.data.model.Employee
import com.maiconhellmann.bluecodingevaluation.feature.employee.EmployeeUseCase
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.BaseViewModel
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.StateMachineSingle
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState
import io.reactivex.Scheduler
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 18/07/2019
 * 
 * (c) 2019 
 */class EmployeeDetailViewModel(
    private val useCase: EmployeeUseCase,
    private val uiScheduler: Scheduler
) : BaseViewModel() {

    val state = MutableLiveData<ViewState<Employee>>().apply {
        value = ViewState.Loading
    }

    /**
     * Fetch employee details and update the status
     */
    fun getEmployeeDetails(id: Int) {
        disposables += useCase.fetchEmployeeDetails(id)
            .compose(StateMachineSingle())
            .observeOn(uiScheduler)
            .subscribeBy(
                onSuccess = {
                    state.postValue(it)
                }
            )
    }
}