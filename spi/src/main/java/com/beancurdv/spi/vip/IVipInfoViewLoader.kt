package com.beancurdv.spi.vip

import android.app.Activity
import android.view.View

/**
 * VipInfoView加载类
 *
 * @author beancurdv on 2024/2/23
 */
interface IVipInfoViewLoader {
    fun getVipInfoView(act: Activity): View
}