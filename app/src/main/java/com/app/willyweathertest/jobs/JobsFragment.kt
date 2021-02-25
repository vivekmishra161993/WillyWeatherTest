package com.app.willyweathertest.jobs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.app.willyweathertest.databinding.FragmentJobsBinding
import org.koin.androidx.viewmodel.ext.android.getViewModel

class JobsFragment: Fragment() {

    private lateinit var jobsViewModel: JobsViewModel
    private lateinit var binding: FragmentJobsBinding
    private var companyName = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentJobsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClasses()
    }
    override fun onResume() {
        super.onResume()
        //setting user initials
        getJobs()
    }

    private fun initClasses() {
        jobsViewModel = getViewModel()
        binding.viewModel = jobsViewModel
        binding.lifecycleOwner = this
        binding.executePendingBindings()

    }
    private fun getJobs() {
            jobsViewModel.getJobs().observe(this, Observer {
                if (it.first) {
                    if (it.second != null) {

                    } else {

                       // Utils.showToast("No Data Found", activity!!)
                    }

                } else {

                    // Utils.showToast(it.second.statusMessage, activity!!)
                }
            })
    }


}