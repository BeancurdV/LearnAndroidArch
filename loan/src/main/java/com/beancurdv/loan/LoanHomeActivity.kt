package com.beancurdv.loan

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.beancurdv.common.factory.IMallInfoViewLoaderFactory
import com.beancurdv.spi.vip.IVipInfoViewLoader
import java.util.ServiceLoader

/**
 *
 *
 * @author  on 2024/2/23
 */
class LoanHomeActivity : AppCompatActivity() {

    private lateinit var mLlContainer : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loan_activity_home)
        findViewById<TextView>(R.id.tv_page_tile).run {
            setOnClickListener {
                syncVipView()
                syncMallView()
            }
        }
        mLlContainer = findViewById<LinearLayout>(R.id.fl_container)
    }

    private fun syncVipView() {
        val loader = ServiceLoader.load(IVipInfoViewLoader::class.java)
        val vipLoader = if(loader.iterator().hasNext()) loader.iterator().next() else null
        vipLoader?.getVipInfoView(this)?.run {
            mLlContainer.addView(this)
        }
    }

    private fun syncMallView() {
        mLlContainer.addView(
            (application as IMallInfoViewLoaderFactory).obtain().getMallInfoView(this)
        )
    }
}