package com.codeinger.feature1app

import android.R.attr
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.codeinger.feature1.Feature1Activity
import android.app.Activity

import android.R.attr.data
import com.codeinger.codeingertoast.showToast


class Feature1AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1_app)

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            startActivityForResult(Feature1Activity.getInstance(this,2), REQUEST_FEATURE1)
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
        }
    }

    companion object{
        const val REQUEST_FEATURE1 = 123
    }
}