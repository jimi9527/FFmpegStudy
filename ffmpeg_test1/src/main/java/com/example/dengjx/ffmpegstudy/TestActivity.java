package com.example.dengjx.ffmpegstudy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.example.ffmpeg_test1.R;

/**
 * Created by dengjx on 2017/12/6.
 */

public class TestActivity extends Activity {
    static {
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("avformat-57");
        System.loadLibrary("avutil-55");
        System.loadLibrary("swresample-2");
        System.loadLibrary("swscale-4");
        System.loadLibrary("ffmpegdemo");
    }
    //jni
    public native String avformatinfo();
    public native String avcodecinfo();
    public native String avfilterinfo();
    public native String configurationinfo();
    private TextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        textView = findViewById(R.id.textview);
    }


    public void format(View view) {
        textView.setText(avformatinfo());
    }

    public void codec(View view) {
        textView.setText(avcodecinfo());
    }

    public void filter(View view) {
        textView.setText(avfilterinfo());
    }

    public void config(View view) {
        textView.setText(configurationinfo());
    }
}


