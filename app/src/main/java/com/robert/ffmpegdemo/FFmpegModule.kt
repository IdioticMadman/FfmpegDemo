package com.robert.ffmpegdemo

object FFmpegModule {
    init {
        System.loadLibrary("hello-jni")
        System.loadLibrary("avcodec")
        System.loadLibrary("avfilter")
        System.loadLibrary("avformat")
        System.loadLibrary("avutil")
        System.loadLibrary("swresample")
        System.loadLibrary("swscale")
    }

    @JvmStatic
    external fun avFormatInfo(): String



}