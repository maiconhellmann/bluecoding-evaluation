package com.maiconhellmann.bluecodingevaluation.feature.employee.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\b\u0010#\u001a\u00020$H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/maiconhellmann/bluecodingevaluation/feature/employee/add/EmployeeAddViewModel;", "Lcom/maiconhellmann/bluecodingevaluation/feature/viewmodel/BaseViewModel;", "useCase", "Lcom/maiconhellmann/bluecodingevaluation/feature/employee/EmployeeUseCase;", "uiScheduler", "Lio/reactivex/Scheduler;", "(Lcom/maiconhellmann/bluecodingevaluation/feature/employee/EmployeeUseCase;Lio/reactivex/Scheduler;)V", "age", "Landroidx/databinding/ObservableField;", "", "fieldAgeValidator", "Landroidx/lifecycle/MutableLiveData;", "Lcom/maiconhellmann/bluecodingevaluation/feature/employee/add/ValidationCodeEnum;", "getFieldAgeValidator", "()Landroidx/lifecycle/MutableLiveData;", "fieldNameValidator", "getFieldNameValidator", "fieldSalaryValidator", "getFieldSalaryValidator", "name", "", "kotlin.jvm.PlatformType", "salary", "", "state", "Lcom/maiconhellmann/bluecodingevaluation/feature/viewmodel/ViewState;", "Lcom/maiconhellmann/bluecodingevaluation/data/model/Employee;", "getState", "addEmployee", "", "setAge", "text", "", "setName", "setSalary", "validateFields", "", "app_debug"})
public final class EmployeeAddViewModel extends com.maiconhellmann.bluecodingevaluation.feature.viewmodel.BaseViewModel {
    
    /**
     * Field name
     */
    private final androidx.databinding.ObservableField<java.lang.String> name = null;
    
    /**
     * Field salary
     */
    private final androidx.databinding.ObservableField<java.lang.Double> salary = null;
    
    /**
     * Field age
     */
    private final androidx.databinding.ObservableField<java.lang.Integer> age = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.employee.add.ValidationCodeEnum> fieldNameValidator = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.employee.add.ValidationCodeEnum> fieldSalaryValidator = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.employee.add.ValidationCodeEnum> fieldAgeValidator = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState<com.maiconhellmann.bluecodingevaluation.data.model.Employee>> state = null;
    private final com.maiconhellmann.bluecodingevaluation.feature.employee.EmployeeUseCase useCase = null;
    private final io.reactivex.Scheduler uiScheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.employee.add.ValidationCodeEnum> getFieldNameValidator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.employee.add.ValidationCodeEnum> getFieldSalaryValidator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.employee.add.ValidationCodeEnum> getFieldAgeValidator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.maiconhellmann.bluecodingevaluation.feature.viewmodel.ViewState<com.maiconhellmann.bluecodingevaluation.data.model.Employee>> getState() {
        return null;
    }
    
    /**
     * Call an API to create an employee and update view state
     */
    public final void addEmployee() {
    }
    
    /**
     * Validate all the fields to ensure they are not null or empty
     */
    private final boolean validateFields() {
        return false;
    }
    
    /**
     * Used by dataBinding to set a name and validate it
     */
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * Used by dataBinding to set a salary and validate it
     */
    public final void setSalary(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * Used by dataBinding to set an age and validate it
     */
    public final void setAge(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    public EmployeeAddViewModel(@org.jetbrains.annotations.NotNull()
    com.maiconhellmann.bluecodingevaluation.feature.employee.EmployeeUseCase useCase, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler uiScheduler) {
        super();
    }
}