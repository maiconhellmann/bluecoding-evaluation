package com.maiconhellmann.bluecodingevaluation.feature.employee.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002J\u001c\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010&\u001a\u00020\u000fH\u0002J\b\u0010\'\u001a\u00020\u000fH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006("}, d2 = {"Lcom/maiconhellmann/bluecodingevaluation/feature/employee/add/EmployeeAddFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "binding", "Lcom/maiconhellmann/bluecodingevaluation/EmployeeAddFragmentBinding;", "viewModel", "Lcom/maiconhellmann/bluecodingevaluation/feature/employee/add/EmployeeAddViewModel;", "getViewModel", "()Lcom/maiconhellmann/bluecodingevaluation/feature/employee/add/EmployeeAddViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addListeners", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setVisibilities", "showProgressBar", "", "showFields", "setupViewModel", "showError", "throwable", "", "showFieldError", "editText", "Landroid/widget/EditText;", "error", "showNotImplementedMessage", "showSuccessMessage", "app_debug"})
public final class EmployeeAddFragment extends androidx.fragment.app.Fragment {
    private com.maiconhellmann.bluecodingevaluation.EmployeeAddFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    /**
     * TAG used manly for logging
     */
    private final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel getViewModel() {
        return null;
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
     * Centralized method to add listeners to the components
     */
    private final void addListeners() {
    }
    
    /**
     * Show a simple message to let the user know this feature is not implemented yet
     */
    private final void showNotImplementedMessage() {
    }
    
    /**
     * Setup and observe viewmodel fields
     */
    private final void setupViewModel() {
    }
    
    /**
     * Show an error in a EditText(red dot with a description)
     */
    private final void showFieldError(android.widget.EditText editText, java.lang.String error) {
    }
    
    /**
     * Show a very simple success message
     */
    private final void showSuccessMessage() {
    }
    
    /**
     * Centralized handler to keep the correct components visible
     */
    private final void setVisibilities(boolean showProgressBar, boolean showFields) {
    }
    
    /**
     * Show a very simple Toast with an error
     */
    private final void showError(java.lang.Throwable throwable) {
    }
    
    public EmployeeAddFragment() {
        super();
    }
}