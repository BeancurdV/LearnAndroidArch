package com.beancurdv.learnandroidarch

import android.app.Application
import com.beancurdv.common.dagger.mall.IMallInfoViewLoader
import com.beancurdv.common.factory.IMallInfoViewLoaderFactory
import com.beancurdv.learnandroidarch.dagger2.AppComponent
import com.beancurdv.learnandroidarch.dagger2.DaggerAppComponent

/**
 *
 *
 * @author  on 2024/2/23
 */
class ArchApplication : Application(), IMallInfoViewLoaderFactory {

    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    override fun obtain(): IMallInfoViewLoader {
        return appComponent.mallComponent().create().mallInfoLoader()
    }
}