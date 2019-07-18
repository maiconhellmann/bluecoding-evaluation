package com.maiconhellmann.bluecodingevaluation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentEmployeeDetailBinding extends ViewDataBinding {
  @NonNull
  public final Button btnTryAgain;

  @NonNull
  public final ImageView imageViewAvatar;

  @NonNull
  public final TextView labelAge;

  @NonNull
  public final TextView labelSalary;

  @NonNull
  public final ConstraintLayout layoutEmployeeDetails;

  @NonNull
  public final FrameLayout progressBar;

  @NonNull
  public final TextView sectionLabelEmployeeDetails;

  @NonNull
  public final View separator;

  @NonNull
  public final TextView textViewAge;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewSalary;

  @NonNull
  public final Toolbar toolbar;

  protected FragmentEmployeeDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnTryAgain, ImageView imageViewAvatar, TextView labelAge,
      TextView labelSalary, ConstraintLayout layoutEmployeeDetails, FrameLayout progressBar,
      TextView sectionLabelEmployeeDetails, View separator, TextView textViewAge,
      TextView textViewName, TextView textViewSalary, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnTryAgain = btnTryAgain;
    this.imageViewAvatar = imageViewAvatar;
    this.labelAge = labelAge;
    this.labelSalary = labelSalary;
    this.layoutEmployeeDetails = layoutEmployeeDetails;
    this.progressBar = progressBar;
    this.sectionLabelEmployeeDetails = sectionLabelEmployeeDetails;
    this.separator = separator;
    this.textViewAge = textViewAge;
    this.textViewName = textViewName;
    this.textViewSalary = textViewSalary;
    this.toolbar = toolbar;
  }

  @NonNull
  public static FragmentEmployeeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_employee_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEmployeeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEmployeeDetailBinding>inflateInternal(inflater, com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEmployeeDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_employee_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEmployeeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEmployeeDetailBinding>inflateInternal(inflater, com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_detail, null, false, component);
  }

  public static FragmentEmployeeDetailBinding bind(@NonNull View view) {
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
  public static FragmentEmployeeDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEmployeeDetailBinding)bind(component, view, com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_detail);
  }
}
