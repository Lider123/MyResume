package com.babaetskv.myresume.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.babaetskv.myresume.R
import com.babaetskv.myresume.adapter.ProjectAdapter
import com.babaetskv.myresume.data.models.Project
import kotlinx.android.synthetic.main.fragment_projects.*
import java.util.ArrayList

class ProjectsFragment : Fragment() {
    private var projects: List<Project>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            projects = it.getParcelableArrayList(ARG_PROJECTS)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_projects, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setProjectList()
    }

    private fun setProjectList() {
        projects_list.layoutManager = LinearLayoutManager(requireContext())
        projects?.let {
            projects_list.adapter = ProjectAdapter(it)
        }
    }

    companion object {
        private const val ARG_PROJECTS = "projects"

        fun createInstance(projects: List<Project>) = ProjectsFragment().apply {
            arguments = Bundle().apply {
                putParcelableArrayList(ARG_PROJECTS, projects as ArrayList)
            }
        }
    }
}
