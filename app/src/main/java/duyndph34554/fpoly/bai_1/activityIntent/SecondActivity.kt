package duyndph34554.fpoly.bai_1.activityIntent

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import duyndph34554.fpoly.bai_1.R
import duyndph34554.fpoly.bai_1.ui.theme.MyApplicationTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SecondActivity", "onCreate called")

//        Nhan du lieu duoc truyen tu man Main
        val receivedData = intent.getStringExtra("data_key")

        setContent {
            MyApplicationTheme {
                Box (
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = receivedData ?: "No data received")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy called")
    }
}