package com.beancurdv.learnandroidarch.dagger2.mall

import com.beancurdv.common.dagger.mall.IMallInfoViewLoader
import com.beancurdv.mall.dagger.MallDaggerModule
import dagger.Subcomponent
import javax.inject.Singleton

/**
 *
 * TODO zfc 还可以加一个注解
 * @author  on 2024/2/23
 */

@Subcomponent(modules = [MallDaggerModule::class])
interface MallComponent {

    // Factory that is used to create instances of this subcomponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): MallComponent
    }


    fun mallInfoLoader(): IMallInfoViewLoader
}
