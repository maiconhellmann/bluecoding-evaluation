package com.maiconhellmann.bluecodingevaluation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.maiconhellmann.bluecodingevaluation.databinding.ActivityMainBindingImpl;
import com.maiconhellmann.bluecodingevaluation.databinding.FragmentEmployeeDetailBindingImpl;
import com.maiconhellmann.bluecodingevaluation.databinding.FragmentEmployeeListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_EMPLOYEEADDFRAGMENT = 2;

  private static final int LAYOUT_FRAGMENTEMPLOYEEDETAIL = 3;

  private static final int LAYOUT_FRAGMENTEMPLOYEELIST = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.maiconhellmann.bluecodingevaluation.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.maiconhellmann.bluecodingevaluation.R.layout.employee_add_fragment, LAYOUT_EMPLOYEEADDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_detail, LAYOUT_FRAGMENTEMPLOYEEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_list, LAYOUT_FRAGMENTEMPLOYEELIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_EMPLOYEEADDFRAGMENT: {
          if ("layout/employee_add_fragment_0".equals(tag)) {
            return new EmployeeAddFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for employee_add_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEMPLOYEEDETAIL: {
          if ("layout/fragment_employee_detail_0".equals(tag)) {
            return new FragmentEmployeeDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_employee_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEMPLOYEELIST: {
          if ("layout/fragment_employee_list_0".equals(tag)) {
            return new FragmentEmployeeListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_employee_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", com.maiconhellmann.bluecodingevaluation.R.layout.activity_main);
      sKeys.put("layout/employee_add_fragment_0", com.maiconhellmann.bluecodingevaluation.R.layout.employee_add_fragment);
      sKeys.put("layout/fragment_employee_detail_0", com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_detail);
      sKeys.put("layout/fragment_employee_list_0", com.maiconhellmann.bluecodingevaluation.R.layout.fragment_employee_list);
    }
  }
}
