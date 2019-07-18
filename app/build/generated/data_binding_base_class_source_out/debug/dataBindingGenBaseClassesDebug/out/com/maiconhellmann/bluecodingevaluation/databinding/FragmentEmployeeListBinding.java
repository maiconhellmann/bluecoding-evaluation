package com.maiconhellmann.bluecodingevaluation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEmployeeListBinding extends ViewDataBinding {
  @NonNull
  public final Button btnTryAgain;

  @NonNull
  public final FloatingActionButton fabAddEmployee;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SwipeRefreshLayout swipeRefresh;

  @NonNull
  public final Toolbar toolbar;

  protected FragmentEmployeeListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnTryAgain, FloatingActionButton fabAddEmployee, ProgressBar progressBar,
      RecyclerView recyclerView, SwipeRefreshLayout swipeRefresh, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnTryAgain = btnTryAgain;
    this.fabAddEmployee = fabAddEmployee;
    this.progressBar = progressBar;
    this.recyclerView = recyclerView;
    this.swipeRefresh = swipeRefresh;
    this.toolbar = toolbar;
  }

  @NonNull
  public static FragmentEmployeeListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_employee_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEmployeeListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEmployeeListBinding>inflateInternal(inflater, com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEmployeeListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_employee_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEmployeeListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEmployeeListBinding>inflateInternal(inflater, com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_list, null, false, component);
  }

  public static FragmentEmployeeListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentEmployeeListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEmployeeListBinding)bind(component, view, com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_list);
  }
}
