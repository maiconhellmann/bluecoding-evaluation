package com.maiconhellmann.bluecodingevaluation.feature.employee.list

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
 * Created by maiconhellmann on 17/07/2019
 * 
 * (c) 2019 
 */class EmployeeListViewModel(private val useCase: EmployeeUseCase, private val uiScheduler: Scheduler): BaseViewModel() {

    /**
     * Handle states
     */
    val state = MutableLiveData<ViewState<List<Employee>>>().apply {
        value = ViewState.Loading
    }

    /**
     * Fetch employees and handle the response
     */
    fun getEmployees() {
        disposables += useCase.fetchEmployees()
            .compose(StateMachineSingle())
            .observeOn(uiScheduler)
            .doOnSubscribe { state.postValue(ViewState.Loading) }
            .subscribeBy(
                onSuccess = {
                    state.postValue(it)
                }
            )
    }
}