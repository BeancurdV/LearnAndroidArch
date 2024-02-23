package com.beancurdv.learnandroidarch

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.beancurdv.learnandroidarch.ui.theme.LearnAndroidArchTheme
import com.beancurdv.loan.LoanHomeActivity
import com.beancurdv.vip.spi.VipInfoViewLoaderImpl
import java.util.ServiceLoader

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnAndroidArchTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Button(onClick = { goToLoan()}) {
                        Greeting("Android")
                    }
                }
            }
        }
        goToLoan()
    }

    private fun goToLoan() {
        startActivity(Intent(this@MainActivity, LoanHomeActivity::class.java))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnAndroidArchTheme {
        Greeting("Android")
    }
}