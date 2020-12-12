package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {
    private Button buttonst1;
    private Button buttonst2;
    private Button buttonst3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取屏幕的中心按钮的ID，也就是获取该组件
        buttonst1 = (Button) findViewById(R.id.button1);
        //直接new 一个内部类对象作为参数
        buttonst1.setOnClickListener(new BtnClickListener());

        //获取屏幕的中心按钮的ID，也就是获取该组件
        buttonst2 = (Button) findViewById(R.id.button2);
        //直接new 一个内部类对象作为参数
        buttonst2.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "做个人吧", Toast.LENGTH_SHORT).show();
                }
            }
        );

        //获取屏幕的中心按钮的ID，也就是获取该组件
        buttonst3 = (Button) findViewById(R.id.button3);
        //直接new 一个内部类对象作为参数
        buttonst3.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "做个人吧1231231", Toast.LENGTH_SHORT).show();
                }
            }
        );


    }
    
    class BtnClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "按钮被点击了", Toast.LENGTH_SHORT).show();
        }
    }
}