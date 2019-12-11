package com.babaetskv.myresume.ui


import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.babaetskv.myresume.R
import com.babaetskv.myresume.adapter.UniversityAdapter
import com.babaetskv.myresume.data.models.University
import kotlinx.android.synthetic.main.fragment_education.*
import java.util.ArrayList

class EducationFragment : Fragment() {
    private var education: List<University>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            education = it.getParcelableArrayList(ARG_EDUCATION)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_education, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUniversityList()
    }

    private fun setUniversityList() {
        university_list.layoutManager = LinearLayoutManager(requireContext())
        education?.let {
            university_list.adapter = UniversityAdapter(it)
        }
    }

    companion object {
        private const val ARG_EDUCATION = "education"

        fun createInstance(education: List<University>) = EducationFragment().apply {
            arguments = Bundle().apply {
                putParcelableArrayList(ARG_EDUCATION, education as ArrayList)
            }
        }
    }
}
