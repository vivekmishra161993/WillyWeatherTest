package com.app.willyweathertest.jobs

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.app.willyweathertest.network.models.Jobs

class JobsViewModel(val repo: JobsRepo) : ViewModel() {
//    private var upcomingOrdersGroupAdapter = UpcomingOrdersGroupAdapter()

    fun getJobs(): LiveData<Pair<Boolean, ArrayList<Jobs>>> {
        return repo.getJobs();
    }

    /*fun getJobsAdapter(): UpcomingOrdersGroupAdapter {
        return upcomingOrdersGroupAdapter

    }

    fun setJobsList(orderList: ArrayList<Jobs>){
        upcomingOrdersGroupAdapter.setOrderItems(orderList)

    }*/

}