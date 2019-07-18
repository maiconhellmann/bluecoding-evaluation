package com.maiconhellmann.bluecodingevaluation;
import com.maiconhellmann.bluecodingevaluation.R;
import com.maiconhellmann.bluecodingevaluation.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EmployeeAddFragmentBindingImpl extends EmployeeAddFragmentBinding implements com.maiconhellmann.bluecodingevaluation.generated.callback.OnTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layoutEmployeeDetails, 4);
        sViewsWithIds.put(R.id.imageViewAvatar, 5);
        sViewsWithIds.put(R.id.labelAvatar, 6);
        sViewsWithIds.put(R.id.separator, 7);
        sViewsWithIds.put(R.id.sectionLabelEmployeeDetails, 8);
        sViewsWithIds.put(R.id.layoutInputName, 9);
        sViewsWithIds.put(R.id.layoutInputSalary, 10);
        sViewsWithIds.put(R.id.layoutInputAge, 11);
        sViewsWithIds.put(R.id.progressBar, 12);
        sViewsWithIds.put(R.id.toolbar, 13);
        sViewsWithIds.put(R.id.fabSave, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback3;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback1;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EmployeeAddFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private EmployeeAddFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[14]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[13]
            );
        this.editTextAge.setTag(null);
        this.editTextName.setTag(null);
        this.editTextSalary.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.maiconhellmann.bluecodingevaluation.generated.callback.OnTextChanged(this, 3);
        mCallback1 = new com.maiconhellmann.bluecodingevaluation.generated.callback.OnTextChanged(this, 1);
        mCallback2 = new com.maiconhellmann.bluecodingevaluation.generated.callback.OnTextChanged(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextAge, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback3, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback1, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextSalary, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback2, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setAge(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setName(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.maiconhellmann.bluecodingevaluation.feature.employee.add.EmployeeAddViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSalary(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}