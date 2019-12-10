package com.babaetskv.myresume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import com.babaetskv.myresume.data.helpers.provideEmployee
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.header_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private val employee = provideEmployee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Picasso.get()
            .load(employee.photoUrl)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(employee_photo)
        employee_name.text = "${employee.firstName} ${employee.lastName}"
        employee_position.text = employee.position
    }
}
