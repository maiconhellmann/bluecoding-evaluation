package com.maiconhellmann.bluecodingevaluation.data.model

import com.google.gson.annotations.SerializedName

data class Employee (
	val id : Int,
	@SerializedName("name", alternate = ["employee_name"]) val name : String,
	@SerializedName("salary", alternate = ["employee_salary"]) val salary : Double,
	@SerializedName("age", alternate = ["employee_age"]) val age : Int,
	@SerializedName("image", alternate = ["profile_image"]) val image : String?= null
) {
	companion object {
		val EMPTY = Employee(0, "", 0.0, 0, "")
	}
}