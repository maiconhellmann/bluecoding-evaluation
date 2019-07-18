package com.maiconhellmann.bluecodingevaluation.feature.employee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\t\u001a\u00020\u0007J\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e0\u000e0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/maiconhellmann/bluecodingevaluation/feature/employee/EmployeeUseCase;", "", "employeeApi", "Lcom/maiconhellmann/bluecodingevaluation/data/api/EmployeeApi;", "(Lcom/maiconhellmann/bluecodingevaluation/data/api/EmployeeApi;)V", "addEmployee", "Lio/reactivex/Single;", "Lcom/maiconhellmann/bluecodingevaluation/data/model/Employee;", "kotlin.jvm.PlatformType", "employee", "fetchEmployeeDetails", "id", "", "fetchEmployees", "", "app_debug"})
public final class EmployeeUseCase {
    private final com.maiconhellmann.bluecodingevaluation.data.api.EmployeeApi employeeApi = null;
    
    /**
     * @return list of employees from the remote data source
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.maiconhellmann.bluecodingevaluation.data.model.Employee>> fetchEmployees() {
        return null;
    }
    
    /**
     * @return fetch details of a employee
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.maiconhellmann.bluecodingevaluation.data.model.Employee> fetchEmployeeDetails(int id) {
        return null;
    }
    
    /**
     * Add an employee using a remote data source
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.maiconhellmann.bluecodingevaluation.data.model.Employee> addEmployee(@org.jetbrains.annotations.NotNull()
    com.maiconhellmann.bluecodingevaluation.data.model.Employee employee) {
        return null;
    }
    
    public EmployeeUseCase(@org.jetbrains.annotations.NotNull()
    com.maiconhellmann.bluecodingevaluation.data.api.EmployeeApi employeeApi) {
        super();
    }
}