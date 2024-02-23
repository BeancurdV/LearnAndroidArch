package com.beancurdv.common.factory

import com.beancurdv.common.dagger.mall.IMallInfoViewLoader

/**
 *
 *
 * @author  on 2024/2/23
 */
interface IMallInfoViewLoaderFactory {
    fun obtain(): IMallInfoViewLoader
}