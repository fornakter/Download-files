package com.app.downloadfiles

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

class AndroidDownloader(
    private val context: Context
): Downloader {
    private val downloadManager = context.getSystemService(DownloadManager::class.java)

    override fun downloadFire(url: String): Long {
        val request = DownloadManager.Request(url.toUri())
            .setMimeType("audio/mp3")
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setTitle("audio.mp3")
            .addRequestHeader("Auth", "token")
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "audio.mp3")

        return downloadManager.enqueue(request)
    }
}