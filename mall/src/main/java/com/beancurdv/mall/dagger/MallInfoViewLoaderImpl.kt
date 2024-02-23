package com.beancurdv.mall.dagger

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.widget.TextView
import com.beancurdv.common.dagger.mall.IMallInfoViewLoader
import javax.inject.Inject

/**
 *
 *
 * @author  on 2024/2/23
 */
class MallInfoViewLoaderImpl @Inject constructor() : IMallInfoViewLoader {
    override fun getMallInfoView(act: Activity): View {
        return TextView(act)
            .apply {
                text = "VipInfo From vip module"
                setTextColor(Color.BLUE)
                textSize = 40f
            }
    }
}