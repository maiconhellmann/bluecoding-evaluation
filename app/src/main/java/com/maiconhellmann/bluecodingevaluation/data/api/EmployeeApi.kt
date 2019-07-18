package com.maiconhellmann.bluecodingevaluation.data.api

import com.maiconhellmann.bluecodingevaluation.data.model.Employee
import io.reactivex.Single
import retrofit2.http.*

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 17/07/2019
 * 
 * (c) 2019 
 */
interface EmployeeApi {
    @GET("/api/v1/employees")
    fun fetchEmployees(): Single<List<Employee>>

    @GET("/api/v1/employee/{id}")
    fun fetchEmployeeById(@Path("id") id: Int): Single<Employee>

    @POST("/api/v1/create")
    fun createEmployee(@Body employee: Employee): Single<Employee>

    @PUT("/api/v1/update/{id}")
    fun updateEmployee(@Path("id") id: Int, @Body employee: Employee)

    @DELETE("/api/v1/update/{id}")
    fun deleteEmployee(@Path("id") id: Int)
}