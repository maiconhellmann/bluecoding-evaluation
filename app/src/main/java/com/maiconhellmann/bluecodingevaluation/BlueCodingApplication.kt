package com.maiconhellmann.bluecodingevaluation

import android.app.Application
import com.maiconhellmann.bluecodingevaluation.di.presentationModule
import com.maiconhellmann.bluecodingevaluation.di.remoteDataSourceModule
import com.maiconhellmann.bluecodingevaluation.di.useCaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/*
 * This file is part of BlueCodingEvaluation.
 * 
 * Created by maiconhellmann on 17/07/2019
 * 
 * (c) 2019 
 */
class BlueCodingApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        //Start dependency injection
        startKoin {
            androidContext(this@BlueCodingApplication)
            modules(useCaseModule + presentationModule + remoteDataSourceModule)
        }
    }
}