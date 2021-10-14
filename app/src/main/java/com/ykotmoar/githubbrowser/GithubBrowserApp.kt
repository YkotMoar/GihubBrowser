package com.ykotmoar.githubbrowser

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GithubBrowserApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("GithubBrowserApp", "onCreate: ====================================================")
        Log.d("GithubBrowserApp", "onCreate: ============= Created GithubBrowserApp =============")
        Log.d("GithubBrowserApp", "onCreate: ====================================================")
    }
}