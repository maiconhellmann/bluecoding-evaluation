package com.maiconhellmann.bluecodingevaluation.feature.employee.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J0\u0010 \u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010\'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/maiconhellmann/bluecodingevaluation/feature/employee/list/EmployeeListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "adapter", "Lcom/maiconhellmann/bluecodingevaluation/feature/employee/list/EmployeeAdapter;", "getAdapter", "()Lcom/maiconhellmann/bluecodingevaluation/feature/employee/list/EmployeeAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "viewModel", "Lcom/maiconhellmann/bluecodingevaluation/feature/employee/list/EmployeeListViewModel;", "getViewModel", "()Lcom/maiconhellmann/bluecodingevaluation/feature/employee/list/EmployeeListViewModel;", "viewModel$delegate", "addListeners", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setVisibilities", "showProgressBar", "", "showList", "showError", "isRefreshing", "setupRecyclerView", "setupSwipeRefresh", "setupViewModel", "throwable", "", "app_debug"})
public final class EmployeeListFragment extends androidx.fragment.app.Fragment {
    private error.NonExistentClass binding;
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    /**
     * TAG used manly for logging
     */
    private final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.maiconhellmann.bluecodingevaluation.feature.employee.list.EmployeeAdapter getAdapter() {
        return null;
    }
    
    private final com.maiconhellmann.bluecodingevaluation.feature.employee.list.EmployeeListViewModel getViewModel() {
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
     * Centralized method to add listeners
     */
    private final void addListeners() {
    }
    
    /**
     * Setup SwipeRefresh(swipe to reload the employees from a remote data source)
     */
    private final void setupSwipeRefresh() {
    }
    
    /**
     * Setup viewModel and observe its status
     */
    private final void setupViewModel() {
    }
    
    /**
     * Setup recyclerView and its adapter.
     */
    private final void setupRecyclerView() {
    }
    
    /**
     * Centralized handler to keep the correct components visible
     */
    private final void setVisibilities(boolean showProgressBar, boolean showList, boolean showError, boolean isRefreshing) {
    }
    
    /**
     * Show a very simple Toast with an error
     */
    private final void showError(java.lang.Throwable throwable) {
    }
    
    public EmployeeListFragment() {
        super();
    }
}