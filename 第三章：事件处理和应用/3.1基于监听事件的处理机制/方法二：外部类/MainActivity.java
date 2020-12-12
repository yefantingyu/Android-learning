package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {
    private Button buttonst1;
    private Button buttonst2;
    private Button buttonst3;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
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
        // 当然传参数很灵活的，就算你不传Textview传递字符串也是可以的
        buttonst3.setOnClickListener(new MyClick(textView));




    }

    class BtnClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "按钮被点击了", Toast.LENGTH_SHORT).show();
        }
    }
}

class MyClick implements View.OnClickListener{
    //注意如果你要是想要传参数，就一定需要外部类，因为直接传参onclick接受不到值的，不能接受，所以为了
    //能良好的传参，还是要外部类的
    private TextView textshow;
    public MyClick (TextView txt){
        textshow=txt;
    }
	// 两个功能额
	// Toast: 显示一串东西
	// TextView: 将Text内容改变
    @Override
    public void onClick(View v) {
        // 注意，这已经在类外了，Toast不能直接写getApplicationContext，因为这个方法事类里面的方法，不能在类外用
        //换一种思路 getApplicationContext() 返回的事application， 应该用View的参数v.getContext()
        Toast.makeText(v.getContext(), "caonima"+textshow.getText().toString(), Toast.LENGTH_SHORT).show();
        textshow.setText("除了草泥马你会啥");
    }
}