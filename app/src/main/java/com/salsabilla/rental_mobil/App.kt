package com.salsabilla.rental_mobil

import android.app.Application
import com.salsabilla.rental_mobil.utils.ReleaseTree
import timber.log.Timber

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(ReleaseTree())
        }
    }
}