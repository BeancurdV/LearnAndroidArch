package com.beancurdv.mall.dagger

import com.beancurdv.common.dagger.mall.IMallInfoViewLoader
import dagger.Binds
import dagger.Module

/**
 * MallDaggerModule
 *
 * @author beancurdv on 2024/2/23
 */
@Module
interface MallDaggerModule {
    @Binds fun bindMallInfoViewLoader(impl:MallInfoViewLoaderImpl): IMallInfoViewLoader

}