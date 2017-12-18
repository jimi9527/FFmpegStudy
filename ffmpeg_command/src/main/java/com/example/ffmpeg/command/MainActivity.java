package com.example.ffmpeg.command;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.ffmpeg_command.R;

import java.util.FormatFlagsConversionMismatchException;

/**
 * Created by dengjx on 2017/12/6.
 */
public class MainActivity extends AppCompatActivity{
    private static final String TAG = "ffmpegkit";
    String basepath;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        basepath = Environment.getExternalStorageDirectory().getPath();
        Log.d(TAG, "basepath:"+ basepath);
    }
    public void run(View view){

        String[] commnds = new String[9];
        commnds[0] = "ffmpeg";
        commnds[1] = "-i";
        commnds[2] =  basepath + "/input.mp4";
        commnds[3] = "-i";
        commnds[4] = basepath + "/input.mp3";
        commnds[5] = "-strict";
        commnds[6] = "-2";
        commnds[7] = "-y";
        commnds[8] = basepath + "/merge.mp4";
        int result = FFmpegKit.run(commnds);
        if(result == 0){
            Log.d(TAG, "命令执行完成");
        }
    }
}
