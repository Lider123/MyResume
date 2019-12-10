package com.babaetskv.myresume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.babaetskv.myresume.data.helpers.provideEmployee
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.header_main.*

class MainActivity : AppCompatActivity() {
    private val employee = provideEmployee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Picasso.with(this)
            .load(employee.photoUrl)
            .into(employee_photo)
        employee_name.text = "${employee.firstName} ${employee.lastName}"
        employee_position.text = employee.position
    }
}
