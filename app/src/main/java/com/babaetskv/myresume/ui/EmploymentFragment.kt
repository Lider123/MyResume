package com.babaetskv.myresume.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.babaetskv.myresume.R
import com.babaetskv.myresume.adapter.EmploymentAdapter
import com.babaetskv.myresume.data.models.Employment
import kotlinx.android.synthetic.main.fragment_employment.*

class EmploymentFragment : Fragment() {
    private var employment: List<Employment>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            employment = it.getParcelableArrayList(ARG_EMPLOYMENT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_employment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setEmploymentList()
    }

    private fun setEmploymentList() {
        employment_list.layoutManager = LinearLayoutManager(requireContext())
        employment?.let {
            employment_list.adapter = EmploymentAdapter(it)
        }
    }

    companion object {
        private const val ARG_EMPLOYMENT = "employment"

        fun createInstance(employment: List<Employment>): EmploymentFragment = EmploymentFragment().apply {
            arguments = Bundle().apply {
                putParcelableArrayList(ARG_EMPLOYMENT, employment as ArrayList)
            }
        }
    }
}
