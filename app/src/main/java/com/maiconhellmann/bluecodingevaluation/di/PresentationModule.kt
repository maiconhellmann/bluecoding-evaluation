package com.maiconhellmann.bluecodingevaluation.di

import com.maiconhellmann.bluecodingevaluation.feature.employee.EmployeeUseCase
import com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel
import com.maiconhellmann.bluecodingevaluation.feature.employee.detail.EmployeeDetailViewModel
import com.maiconhellmann.bluecodingevaluation.feature.employee.list.EmployeeAdapter
import com.maiconhellmann.bluecodingevaluation.feature.employee.list.EmployeeListViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 17/07/2019
 * 
 * (c) 2019 
 */

val useCaseModule = module {
    factory { EmployeeUseCase(get()) }
    factory { EmployeeAdapter() }
}

val presentationModule = module {
    viewModel { EmployeeListViewModel(get(), AndroidSchedulers.mainThread()) }
    viewModel { EmployeeDetailViewModel(get(), AndroidSchedulers.mainThread()) }
    viewModel { EmployeeAddViewModel(get(), AndroidSchedulers.mainThread()) }
}
