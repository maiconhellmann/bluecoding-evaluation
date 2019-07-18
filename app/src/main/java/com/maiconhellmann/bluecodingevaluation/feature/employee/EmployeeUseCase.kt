package com.maiconhellmann.bluecodingevaluation.feature.employee

import com.maiconhellmann.bluecodingevaluation.data.api.EmployeeApi
import com.maiconhellmann.bluecodingevaluation.data.model.Employee
import io.reactivex.schedulers.Schedulers

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 17/07/2019
 *
 *
 * (c) 2019 
 */
class EmployeeUseCase(private val employeeApi: EmployeeApi) {

    /**
     * @return list of employees from the remote data source
     */
    fun fetchEmployees() = employeeApi.fetchEmployees().subscribeOn(Schedulers.io())

    /**
     * @return fetch details of a employee
     */
    fun fetchEmployeeDetails(id: Int) =
        employeeApi.fetchEmployeeById(id).subscribeOn(Schedulers.io())

    /**
     * Add an employee using a remote data source
     */
    fun addEmployee(employee: Employee) =
        employeeApi.createEmployee(employee).subscribeOn(Schedulers.io())
}