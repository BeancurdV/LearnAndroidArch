package com.beancurdv.common.dagger.mall

import android.app.Activity
import android.view.View

/**
 * VipInfoView加载类
 *
 * @author beancurdv on 2024/2/23
 */
interface IMallInfoViewLoader {
    fun getMallInfoView(act: Activity): View
}