package com.codeinger.multimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.codeinger.codeingertoast.showToast
import com.codeinger.dateformatter.formatDate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = "12/12/2021"
        showToast(date.formatDate("dd/MM/yyyy","dd MMM, yyyy"))

    }
}


