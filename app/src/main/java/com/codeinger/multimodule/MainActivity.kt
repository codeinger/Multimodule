package com.codeinger.multimodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.codeinger.codeingertoast.showToast
import com.codeinger.dateformatter.formatDate
import com.codeinger.feature1.Feature1Activity
import com.codeinger.feature2.Feature2Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = "12/12/2021"
        showToast(date.formatDate("dd/MM/yyyy","dd MMM, yyyy"))

        val btn_feature1 = findViewById<Button>(R.id.btn_feature1)
        val btn_feature2 = findViewById<Button>(R.id.btn_feature2)

        btn_feature1.setOnClickListener {
            startActivityForResult(Feature1Activity.getInstance(this,2), REQUEST_FEATURE1)
        }

        btn_feature2.setOnClickListener {
            startActivityForResult(Feature2Activity.getInstance(this,2), REQUEST_FEATURE2)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when {
            requestCode === REQUEST_FEATURE1 -> {
                if (resultCode === RESULT_OK) {
                    val result = data?.getStringExtra("result")
                    showToast(result?:"")
                }
            }
            requestCode === REQUEST_FEATURE2 -> {
                if (resultCode === RESULT_OK) {
                    val result = data?.getStringExtra("result")
                    showToast(result?:"")
                }
            }
        }
    }

    companion object{
        const val REQUEST_FEATURE2 = 2323
        const val REQUEST_FEATURE1 = 123
    }
}


