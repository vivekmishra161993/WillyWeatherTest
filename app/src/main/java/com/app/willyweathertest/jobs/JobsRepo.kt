package com.app.willyweathertest.jobs

import androidx.lifecycle.LiveData
import com.app.willyweathertest.network.models.Jobs

interface JobsRepo  {
    fun getJobs(): LiveData<Pair<Boolean,ArrayList<Jobs> >>

}