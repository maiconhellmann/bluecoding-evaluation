package com.maiconhellmann.bluecodingevaluation.feature.employee.detail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

data class EmployeeDetailFragmentArgs(val employeeId: Int) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putInt("employeeId", this.employeeId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): EmployeeDetailFragmentArgs {
            bundle.setClassLoader(EmployeeDetailFragmentArgs::class.java.classLoader)
            val __employeeId : Int
            if (bundle.containsKey("employeeId")) {
                __employeeId = bundle.getInt("employeeId")
            } else {
                throw IllegalArgumentException("Required argument \"employeeId\" is missing and does not have an android:defaultValue")
            }
            return EmployeeDetailFragmentArgs(__employeeId)
        }
    }
}
