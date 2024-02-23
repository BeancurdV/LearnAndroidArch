package com.beancurdv.learnandroidarch.dagger2

import com.beancurdv.learnandroidarch.dagger2.mall.MallComponent
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * 全局组件
 *
 * @author beancurdv on 2024/2/23
 */

@Component(modules = [SubComponentModule::class])
interface AppComponent {
    fun mallComponent(): MallComponent.Factory
}