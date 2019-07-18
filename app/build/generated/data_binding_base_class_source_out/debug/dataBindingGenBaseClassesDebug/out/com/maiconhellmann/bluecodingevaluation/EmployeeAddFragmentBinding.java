package com.maiconhellmann.bluecodingevaluation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EmployeeAddFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText editTextAge;

  @NonNull
  public final TextInputEditText editTextName;

  @NonNull
  public final TextInputEditText editTextSalary;

  @NonNull
  public final FloatingActionButton fabSave;

  @NonNull
  public final ImageView imageViewAvatar;

  @NonNull
  public final TextView labelAvatar;

  @NonNull
  public final ConstraintLayout layoutEmployeeDetails;

  @NonNull
  public final TextInputLayout layoutInputAge;

  @NonNull
  public final TextInputLayout layoutInputName;

  @NonNull
  public final TextInputLayout layoutInputSalary;

  @NonNull
  public final FrameLayout progressBar;

  @NonNull
  public final TextView sectionLabelEmployeeDetails;

  @NonNull
  public final View separator;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected EmployeeAddViewModel mViewModel;

  protected EmployeeAddFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText editTextAge, TextInputEditText editTextName,
      TextInputEditText editTextSalary, FloatingActionButton fabSave, ImageView imageViewAvatar,
      TextView labelAvatar, ConstraintLayout layoutEmployeeDetails, TextInputLayout layoutInputAge,
      TextInputLayout layoutInputName, TextInputLayout layoutInputSalary, FrameLayout progressBar,
      TextView sectionLabelEmployeeDetails, View separator, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.editTextAge = editTextAge;
    this.editTextName = editTextName;
    this.editTextSalary = editTextSalary;
    this.fabSave = fabSave;
    this.imageViewAvatar = imageViewAvatar;
    this.labelAvatar = labelAvatar;
    this.layoutEmployeeDetails = layoutEmployeeDetails;
    this.layoutInputAge = layoutInputAge;
    this.layoutInputName = layoutInputName;
    this.layoutInputSalary = layoutInputSalary;
    this.progressBar = progressBar;
    this.sectionLabelEmployeeDetails = sectionLabelEmployeeDetails;
    this.separator = separator;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable EmployeeAddViewModel viewModel);

  @Nullable
  public EmployeeAddViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static EmployeeAddFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.employee_add_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EmployeeAddFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EmployeeAddFragmentBinding>inflateInternal(inflater, com.maiconhellmann.bluecodingevaluation.R.layout.employee_add_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static EmployeeAddFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.employee_add_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EmployeeAddFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EmployeeAddFragmentBinding>inflateInternal(inflater, com.maiconhellmann.bluecodingevaluation.R.layout.employee_add_fragment, null, false, component);
  }

  public static EmployeeAddFragmentBinding bind(@NonNull View view) {
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
  public static EmployeeAddFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (EmployeeAddFragmentBinding)bind(component, view, com.maiconhellmann.bluecodingevaluation.R.layout.employee_add_fragment);
  }
}
