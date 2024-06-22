package duyndph34554.fpoly.bai_1.fragment

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import duyndph34554.fpoly.bai_1.R

class ContainerViewActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
//                modifier = Modifier.fillMaxSize(),
//                color = MaterialTheme.colors.background
            ) {
                // Add FragmentContainerView
                androidx.compose.ui.viewinterop.AndroidView({ context ->
                    androidx.fragment.app.FragmentContainerView(context).apply {
                        id = R.id.fragment_container_view
                    }
                })

                // Add Fragment A
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<FragmentA>(R.id.fragment_container_view)
                }
            }
        }
    }
}