package com.example.honey.mywork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.honey.mytry.R;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }
    public void Wel2Bri(View v) {
        // 给bnt1添加点击响应事件
        Intent intent =new Intent(Welcome.this,Classification.class);
        // 启动
        startActivity(intent);
    }
}
