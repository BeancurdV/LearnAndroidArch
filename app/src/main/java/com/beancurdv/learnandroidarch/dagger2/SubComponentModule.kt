package com.beancurdv.learnandroidarch.dagger2

import com.beancurdv.learnandroidarch.dagger2.mall.MallComponent
import dagger.Module
import javax.inject.Singleton

/**
 * @author  on 2024/2/23
 */

@Module(subcomponents = [MallComponent::class])
class SubComponentModule {}