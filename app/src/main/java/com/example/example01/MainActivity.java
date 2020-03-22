package com.example.example01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity start.");

        final TextView log = findViewById(R.id.message);

        ImageButton download = findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log.setText("当前所有下载任务已完成");
                Log.d(TAG, "当前所有下载任务已完成");
            }
        });


        Switch auto_update = findViewById(R.id.auto_update_switch);
        auto_update.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    log.setText("版本自动更新已开启");
                    Log.d(TAG, "版本自动更新已开启");
                }
                else
                {
                    log.setText("版本自动更新已关闭");
                    Log.d(TAG, "版本自动更新已关闭");
                }
            }
        });

    }
}
