package com.maiconhellmann.bluecodingevaluation.feature.employee.list

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.maiconhellmann.bluecodingevaluation.R
import kotlin.Int

class EmployeeListFragmentDirections private constructor() {
    private data class ActionEmployeeListFragmentToEmployeeDetailFragment(val employeeId: Int) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_employeeListFragment_to_employeeDetailFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putInt("employeeId", this.employeeId)
            return result
        }
    }

    companion object {
        fun actionEmployeeListFragmentToEmployeeDetailFragment(employeeId: Int): NavDirections =
                ActionEmployeeListFragmentToEmployeeDetailFragment(employeeId)

        fun actionEmployeeListFragmentToEmployeeAddFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_employeeListFragment_to_employeeAddFragment)
    }
}
