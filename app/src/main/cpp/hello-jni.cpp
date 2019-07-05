#include <cstring>
#include <jni.h>
#include <android/log.h>

extern "C" {
#include <libavformat/avformat.h>
}

#define LOGI(...) ((void)__android_log_print(ANDROID_LOG_INFO, "hello-jni::", __VA_ARGS__))
#define LOGE(...) ((void)__android_log_print(ANDROID_LOG_ERROR, "hello-jni::", __VA_ARGS__))
#define FFmpeg(name)Java_com_robert_ffmpegdemo_##name

extern "C" JNIEXPORT jstring JNICALL
FFmpeg(FFmpegModule_avFormatInfo)(JNIEnv *env,
                                  jobject thiz) {
    LOGE("编码器配置： %s", avcodec_configuration());
    return env->NewStringUTF(avcodec_configuration());
}

