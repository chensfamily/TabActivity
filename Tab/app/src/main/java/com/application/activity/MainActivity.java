package com.application.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.bottombar.BottomBar;

import com.application.R;
import com.example.bottombar.fragment.Fragment3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(com.example.bottombar.fragment.Fragment1.class,
                        "首页",
                        R.mipmap.ic_launcher,
                        R.mipmap.ic_launcher)
                .addItem(com.example.bottombar.fragment.Fragment2.class,
                        "订单",
                        R.mipmap.ic_launcher,
                        R.mipmap.ic_launcher)
                .addItem(Fragment3.class,
                        "我的",
                        R.mipmap.ic_launcher,
                        R.mipmap.ic_launcher)
                .build();
    }
}
