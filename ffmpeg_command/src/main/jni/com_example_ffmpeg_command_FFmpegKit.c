//
// Created by dengjx on 2017/12/7.
//

#include <stdio.h>
#include "com_example_ffmpeg_command_FFmpegKit.h"
#include "ffmpeg.h"
JNIEXPORT jint JNICALL Java_com_example_ffmpeg_command_FFmpegKit_run
        (JNIEnv *env, jclass obj, jobjectArray commands){
    int argc = (*env)->GetArrayLength(env, commands);
    char *argv[argc];
    int i;
    for (i = 0; i < argc; i++) {
        jstring js = (jstring) (*env)->GetObjectArrayElement(env, commands, i);
        argv[i] = (char*) (*env)->GetStringUTFChars(env, js, 0);
    }
    return run(argc, argv);
}