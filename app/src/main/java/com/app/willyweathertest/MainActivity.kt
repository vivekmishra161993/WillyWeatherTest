package com.app.willyweathertest

import android.os.Bundle
import com.app.willyweathertest.jobs.JobsFragment
import com.app.willyweathertest.utils.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(R.id.container,JobsFragment(),"JobsFragment")
    }

}