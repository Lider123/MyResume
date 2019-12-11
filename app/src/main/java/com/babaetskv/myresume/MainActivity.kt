package com.babaetskv.myresume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.babaetskv.myresume.data.helpers.provideEmployee
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.header_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private val employee = provideEmployee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initHeader()
        initPager()
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

    private inner class MainFragmentPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> ProfileFragment.createInstance(employee.summary, employee.skills)
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
