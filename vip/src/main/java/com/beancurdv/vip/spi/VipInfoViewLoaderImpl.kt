package com.beancurdv.vip.spi

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.widget.TextView
import com.beancurdv.spi.vip.IVipInfoViewLoader

/**
 * IVipInfoViewLoader的实现类
 *
 * @author BeancurdV on 2024/2/23
 */
class VipInfoViewLoaderImpl : IVipInfoViewLoader {
    override fun getVipInfoView(act: Activity): View {
        return TextView(act)
            .apply {
                text = "VipInfo From vip module"
                setTextColor(Color.RED)
                textSize = 20f
            }
    }
}