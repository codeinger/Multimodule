package com.codeinger.feature2app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.codeinger.codeingertoast.showToast
import com.codeinger.feature2.Feature2Activity

class Feature2AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature2_app)

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            startActivityForResult(Feature2Activity.getInstance(this,2), REQUEST_FEATURE2)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when {
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
    }
}