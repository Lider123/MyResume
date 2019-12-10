package com.babaetskv.myresume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.babaetskv.myresume.data.helpers.provideEmployee

class MainActivity : AppCompatActivity() {
    private val employee = provideEmployee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
