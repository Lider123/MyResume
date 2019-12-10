package com.babaetskv.myresume

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.babaetskv.myresume.data.models.Skill
import kotlinx.android.synthetic.main.fragment_profile.*
import java.util.ArrayList

class ProfileFragment : Fragment() {
    private var summary: String? = null
    private var skills: List<Skill>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            summary = it.getString(ARG_SUMMARY)
            skills = it.getParcelableArrayList(ARG_SKILLS)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        profile_summary.text = summary
    }

    companion object {
        private const val ARG_SUMMARY = "summary"
        private const val ARG_SKILLS = "skills"

        @JvmStatic
        fun createInstance(summary: String, skills: List<Skill>) =
            ProfileFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_SUMMARY, summary)
                    putParcelableArrayList(ARG_SKILLS, skills as ArrayList)
                }
            }
    }
}
