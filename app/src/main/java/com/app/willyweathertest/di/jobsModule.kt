package com.app.willyweathertest.di

import com.app.willyweathertest.jobs.JobsRepo
import com.app.willyweathertest.jobs.JobsRepoImpl
import com.app.willyweathertest.jobs.JobsViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val jobsModule = module(override = true){

    viewModel { JobsViewModel(get()) }
    single<JobsRepo>{ JobsRepoImpl(androidApplication()) }
}