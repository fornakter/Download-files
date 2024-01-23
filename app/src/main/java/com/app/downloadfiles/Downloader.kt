package com.app.downloadfiles

interface Downloader {
    fun downloadFire(url: String): Long
}