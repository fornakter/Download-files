package com.app.downloadfiles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.app.downloadfiles.ui.theme.DownloadFilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val downloader = AndroidDownloader(this)
        // downloader.downloadFire("https://pl-coding.com/wp-content/uploads/2022/04/pic-squared.jpg")
        super.onCreate(savedInstanceState)
        setContent {
            DownloadFilesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(onClick = {
                            downloader.downloadFire("https://drive.google.com/file/d/1PbM6k8211A4RFuBT7QEl0cHRWpgOFvLx/view?usp=drive_link")
                        }) {
                            Text(text = "Download")
                    }
                    }
                }
            }
        }
    }
}