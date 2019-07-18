package com.maiconhellmann.bluecodingevaluation.di

import com.maiconhellmann.bluecodingevaluation.feature.employee.list.EmployeeAdapter
import com.maiconhellmann.bluecodingevaluation.feature.employee.list.EmployeeListViewModel
import io.reactivex.schedulers.Schedulers
import org.koin.dsl.module

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 18/07/2019
 * 
 * (c) 2019 
 */
val presentationModuleTest = module {
    factory { EmployeeAdapter() }

    factory {
        EmployeeListViewModel(useCase = get(), uiScheduler = Schedulers.trampoline())
    }
}