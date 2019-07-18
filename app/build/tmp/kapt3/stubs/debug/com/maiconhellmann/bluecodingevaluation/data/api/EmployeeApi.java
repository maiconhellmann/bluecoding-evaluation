package com.maiconhellmann.bluecodingevaluation.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u0003H\'J\u001c\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/maiconhellmann/bluecodingevaluation/data/api/EmployeeApi;", "", "createEmployee", "Lio/reactivex/Single;", "Lcom/maiconhellmann/bluecodingevaluation/data/model/Employee;", "employee", "deleteEmployee", "", "id", "", "fetchEmployeeById", "fetchEmployees", "", "updateEmployee", "app_debug"})
public abstract interface EmployeeApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/v1/employees")
    public abstract io.reactivex.Single<java.util.List<com.maiconhellmann.bluecodingevaluation.data.model.Employee>> fetchEmployees();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/v1/employee/{id}")
    public abstract io.reactivex.Single<com.maiconhellmann.bluecodingevaluation.data.model.Employee> fetchEmployeeById(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/v1/create")
    public abstract io.reactivex.Single<com.maiconhellmann.bluecodingevaluation.data.model.Employee> createEmployee(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.maiconhellmann.bluecodingevaluation.data.model.Employee employee);
    
    @retrofit2.http.PUT(value = "/api/v1/update/{id}")
    public abstract void updateEmployee(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.maiconhellmann.bluecodingevaluation.data.model.Employee employee);
    
    @retrofit2.http.DELETE(value = "/api/v1/update/{id}")
    public abstract void deleteEmployee(@retrofit2.http.Path(value = "id")
    int id);
}