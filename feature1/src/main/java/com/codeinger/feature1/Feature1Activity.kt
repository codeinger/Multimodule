package com.codeinger.feature1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.app.Activity




class Feature1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_featuer1)

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            goBack()
        }

    }

    private fun goBack() {
        val input = intent.getIntExtra("input",-1)
        val result = when (input) {
            1 -> "Feature 1 Result 1"
            2 -> "Feature 1 Result 2"
            else -> "Feature 1 Result -1"
        }

        val returnIntent = Intent()
        returnIntent.putExtra("result", result)
        setResult(RESULT_OK, returnIntent)
        finish()
    }

    companion object{
        fun getInstance(context : Context,input : Int) = Intent(context,Feature1Activity::class.java).apply {
            putExtra("input",input)
        }
    }
}