package com.maiconhellmann.bluecodingevaluation.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.maiconhellmann.bluecodingevaluation.data.model.Employee
import com.maiconhellmann.bluecodingevaluation.di.presentationModuleTest
import com.maiconhellmann.bluecodingevaluation.feature.employee.EmployeeUseCase
import com.maiconhellmann.bluecodingevaluation.feature.employee.list.EmployeeListViewModel
import com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState
import io.reactivex.Single
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.test.AutoCloseKoinTest
import org.koin.test.inject
import org.mockito.Mockito
import org.mockito.Mockito.mock

/**
 * Example of a test for ViewModels
 */
class EmployeeListViewModelTest: AutoCloseKoinTest(){

    private val viewModel: EmployeeListViewModel by inject()

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Before
    fun before() {
        val mockUseCase = mock(EmployeeUseCase::class.java)
        val module = module { factory { mockUseCase } }

        //Needs to be mocked before injection(maybe try using mock by koin
        Mockito.`when`(mockUseCase.fetchEmployees()).then {
            Single.just(listOf(Employee.EMPTY, Employee.EMPTY))
        }

        startKoin {
            modules(presentationModuleTest + module)
        }
    }

    @Test
    fun viewModelTest() {

        assert(viewModel.state.value == ViewState.Loading)

        viewModel.getEmployees()

        //returned success
        assert(viewModel.state.value is ViewState.Success)

        with(viewModel.state.value as ViewState.Success) {
            //list of employees is not empty
            assert(data.isNotEmpty())
            //assert fields are equals
            assert(data.first().id == Employee.EMPTY.id)
        }
    }
}
