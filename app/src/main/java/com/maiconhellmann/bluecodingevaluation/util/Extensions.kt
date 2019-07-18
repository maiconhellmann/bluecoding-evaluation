package com.maiconhellmann.bluecodingevaluation.util

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 18/07/2019
 * 
 * (c) 2019 
 */
import android.content.Context
import android.view.View
import android.widget.Toast

fun View.visible(visible: Boolean = false) {
    visibility = if (visible) View.VISIBLE else View.GONE
}

fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}