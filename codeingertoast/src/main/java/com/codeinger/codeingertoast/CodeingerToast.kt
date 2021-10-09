package com.codeinger.codeingertoast

import android.content.Context
import android.widget.Toast

fun Context.showToast(text : String,time : Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,text,time).show()
}