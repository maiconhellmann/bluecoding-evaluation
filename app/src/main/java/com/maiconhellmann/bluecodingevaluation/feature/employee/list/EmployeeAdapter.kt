package com.maiconhellmann.bluecodingevaluation.feature.employee.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.maiconhellmann.bluecodingevaluation.R
import com.maiconhellmann.bluecodingevaluation.data.model.Employee
import com.maiconhellmann.bluecodingevaluation.util.GlideApp
import kotlinx.android.synthetic.main.item_employee.view.imageViewAvatar
import kotlinx.android.synthetic.main.item_employee.view.textViewName

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 18/07/2019
 * 
 * (c) 2019 
 */
class EmployeeAdapter : RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {

    var employees: List<Employee> = listOf()

    inner class ViewHolder(parent: ViewGroup) :
        RecyclerView.ViewHolder(parent.inflate(R.layout.item_employee)) {

        /**
         * Bind employee model to the screen`s components
         */
        fun bind(employee: Employee) = with(itemView) {
            textViewName.text = employee.name

            if (employee.image.isNullOrEmpty()) {
                //default image
                imageViewAvatar.setImageResource(R.drawable.person_circle_background)
            } else {
                //load image by its url
                GlideApp.with(imageViewAvatar).load(employee.image)
            }

            //Open details screen. Could be moved to its fragment to easier to maintain
            val directions =
                EmployeeListFragmentDirections.actionEmployeeListFragmentToEmployeeDetailFragment(
                    employee.id)

            setOnClickListener(Navigation.createNavigateOnClickListener(directions))

            itemView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(parent)

    override fun getItemCount(): Int = employees.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(employees[position])
    }
}

private fun ViewGroup.inflate(@LayoutRes layout: Int): View {
    return LayoutInflater.from(context).inflate(layout, this, false)
}
