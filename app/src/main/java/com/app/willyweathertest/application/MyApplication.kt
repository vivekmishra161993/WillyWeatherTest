package com.app.willyweathertest.application


import android.app.Application
import com.app.willyweathertest.di.jobsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    private val TAG = "MyApplication"

    init {
        instance = this
    }

    companion object {
        private var instance: MyApplication? = null

    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                listOf(
                    jobsModule
                )
            )
        }

    }

}