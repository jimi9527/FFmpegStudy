package com.example.ffmpeg.command;

/**
 * Created by dengjx on 2017/12/6.
 */

public class FFmpegKit {
    static {
        System.loadLibrary("ffmpeg");
        System.loadLibrary("ffmpeginvoke");
    }
    public native static int run(String[] commands);

}

