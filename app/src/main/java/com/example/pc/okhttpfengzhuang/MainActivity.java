package com.example.pc.okhttpfengzhuang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpUtils instance = HttpUtils.getInstance();
//        instance.doGet();
//        instance.doPost();
    }
}
