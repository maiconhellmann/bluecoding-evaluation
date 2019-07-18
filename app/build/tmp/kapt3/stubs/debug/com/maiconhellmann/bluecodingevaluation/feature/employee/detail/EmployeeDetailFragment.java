package com.maiconhellmann.bluecodingevaluation.feature.employee.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020(H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006)\u00b2\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, d2 = {"Lcom/maiconhellmann/bluecodingevaluation/feature/employee/detail/EmployeeDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "binding", "Lcom/maiconhellmann/bluecodingevaluation/databinding/FragmentEmployeeDetailBinding;", "employeeId", "", "getEmployeeId", "()I", "employeeId$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/maiconhellmann/bluecodingevaluation/feature/employee/detail/EmployeeDetailViewModel;", "getViewModel", "()Lcom/maiconhellmann/bluecodingevaluation/feature/employee/detail/EmployeeDetailViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setVisibilities", "showProgressBar", "", "showDetails", "showError", "setupViewModel", "throwable", "", "updateView", "employee", "Lcom/maiconhellmann/bluecodingevaluation/data/model/Employee;", "app_debug", "safeArgs", "Lcom/maiconhellmann/bluecodingevaluation/feature/employee/detail/EmployeeDetailFragmentArgs;"})
public final class EmployeeDetailFragment extends androidx.fragment.app.Fragment {
    private com.maiconhellmann.bluecodingevaluation.databinding.FragmentEmployeeDetailBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    /**
     * Screen arguments
     */
    private final kotlin.Lazy employeeId$delegate = null;
    
    /**
     * TAG used manly for logging
     */
    private final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.maiconhellmann.bluecodingevaluation.feature.employee.detail.EmployeeDetailViewModel getViewModel() {
        return null;
    }
    
    /**
     * Screen arguments
     */
    private final int getEmployeeId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Setup and observe fields from a viewModel
     */
    private final void setupViewModel() {
    }
    
    /**
     * Update view with the employee info
     */
    private final void updateView(com.maiconhellmann.bluecodingevaluation.data.model.Employee employee) {
    }
    
    /**
     * Centralized handler to keep the correct components visible
     */
    private final void setVisibilities(boolean showProgressBar, boolean showDetails, boolean showError) {
    }
    
    /**
     * Show a very simple Toast with an error
     */
    private final void showError(java.lang.Throwable throwable) {
    }
    
    public EmployeeDetailFragment() {
        super();
    }
}