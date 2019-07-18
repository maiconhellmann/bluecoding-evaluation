package com.maiconhellmann.bluecodingevaluation.feature.employee.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/maiconhellmann/bluecodingevaluation/feature/employee/detail/EmployeeDetailViewModel;", "Lcom/maiconhellmann/bluecodingevaluation/feature/viewmodel/BaseViewModel;", "useCase", "Lcom/maiconhellmann/bluecodingevaluation/feature/employee/EmployeeUseCase;", "uiScheduler", "Lio/reactivex/Scheduler;", "(Lcom/maiconhellmann/bluecodingevaluation/feature/employee/EmployeeUseCase;Lio/reactivex/Scheduler;)V", "state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/maiconhellmann/bluecodingevaluation/feature/viewmodel/ViewState;", "Lcom/maiconhellmann/bluecodingevaluation/data/model/Employee;", "getState", "()Landroidx/lifecycle/MutableLiveData;", "getEmployeeDetails", "", "id", "", "app_debug"})
public final class EmployeeDetailViewModel extends com.maiconhellmann.bluecodingevaluation.feature.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState<com.maiconhellmann.bluecodingevaluation.data.model.Employee>> state = null;
    private final com.maiconhellmann.bluecodingevaluation.feature.employee.EmployeeUseCase useCase = null;
    private final io.reactivex.Scheduler uiScheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState<com.maiconhellmann.bluecodingevaluation.data.model.Employee>> getState() {
        return null;
    }
    
    /**
     * Fetch employee details and update the status
     */
    public final void getEmployeeDetails(int id) {
    }
    
    public EmployeeDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.maiconhellmann.bluecodingevaluation.feature.employee.EmployeeUseCase useCase, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler uiScheduler) {
        super();
    }
}