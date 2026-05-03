package com.powersurge.userdirectory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.powersurge.userdirectory.ui.UserDirectoryApp
import com.powersurge.userdirectory.ui.theme.UserDirectoryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UserDirectoryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    UserDirectoryApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun preview() {
    UserDirectoryTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            UserDirectoryApp()
        }
    }
}