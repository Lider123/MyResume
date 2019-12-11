package com.babaetskv.myresume.ui

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.babaetskv.myresume.R
import com.babaetskv.myresume.data.helpers.provideEmployee
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.header_main.*

class MainActivity : AppCompatActivity() {
    private val employee = provideEmployee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initHeader()
        initPager()
        setActions()
    }

    @SuppressLint("MissingPermission")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            PERMISSION_CALL_REQUEST_CODE -> if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:${employee.phone}"))
                startActivity(intent)
            } else Toast.makeText(this, getString(R.string.no_permission_call), Toast.LENGTH_LONG).show()
            PERMISSION_SMS_REQUEST_CODE -> if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:${employee.phone}"))
                startActivity(intent)
            } else Toast.makeText(this, getString(R.string.no_permission_sms), Toast.LENGTH_LONG).show()
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    private fun initHeader() {
        Picasso.get()
            .load(employee.photoUrl)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(employee_photo)
        employee_name.text = "${employee.firstName} ${employee.lastName}"
        employee_position.text = employee.position
    }

    private fun initPager() {
        val adapter = MainFragmentPagerAdapter(supportFragmentManager)
        view_pager.adapter = adapter
        sliding_tabs.setupWithViewPager(view_pager)
    }

    private fun setActions() {
        action_call.setOnClickListener {
            val permissions = arrayOf(Manifest.permission.CALL_PHONE)
            ActivityCompat.requestPermissions(this, permissions, PERMISSION_CALL_REQUEST_CODE)
        }
        action_email.setOnClickListener {  }
        action_message.setOnClickListener {
            val permissions = arrayOf(Manifest.permission.SEND_SMS)
            ActivityCompat.requestPermissions(this, permissions, PERMISSION_SMS_REQUEST_CODE)
        }
    }

    companion object {
        private const val PERMISSION_CALL_REQUEST_CODE = 101
        private const val PERMISSION_SMS_REQUEST_CODE = 102
    }

    private inner class MainFragmentPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> ProfileFragment.createInstance(
                    employee.summary,
                    employee.skills
                )
                1 -> Fragment()
                2 -> Fragment()
                3 -> Fragment()
                else -> Fragment()
            }
        }

        override fun getCount() = 4

        override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                0 -> getString(R.string.title_profile)
                1 -> getString(R.string.title_projects)
                2 -> getString(R.string.title_employment)
                3 -> getString(R.string.title_education)
                else ->super.getPageTitle(position)
            }
        }
    }
}
