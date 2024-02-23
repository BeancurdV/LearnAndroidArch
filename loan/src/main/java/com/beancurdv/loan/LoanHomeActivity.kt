package com.beancurdv.loan

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.beancurdv.spi.vip.IVipInfoViewLoader
import java.util.ServiceLoader

/**
 *
 *
 * @author  on 2024/2/23
 */
class LoanHomeActivity : AppCompatActivity() {

    private lateinit var mFlContainer : FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loan_activity_home)
        findViewById<TextView>(R.id.tv_page_tile).run {
            setOnClickListener {
                syncVipView()
            }
        }
        mFlContainer = findViewById<FrameLayout>(R.id.fl_container)
    }

    private fun syncVipView() {
        val loader = ServiceLoader.load(IVipInfoViewLoader::class.java)
        val iterator = loader.iterator()
        while (iterator.hasNext()) {
            val vipInfoLoader = iterator.next()
            mFlContainer.addView(vipInfoLoader.getVipInfoView(this))
        }
    }
}