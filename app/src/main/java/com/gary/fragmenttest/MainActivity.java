package com.gary.fragmenttest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int clickCount = 0;
    private TextView tv_main;

    private Button button;
    private Button button_test;

    private Button bt_one;
    private Button bt_two;

    private RadioButton one;
    private RadioButton two;
    private CheckBox a;
    private CheckBox b;
    private CheckBox c;

    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "on 活动创建: ");

       fragmentTest();

    }





    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
               // replaceFragment(new AnotherRightFragment());   测试页面限定符属性，对本行代码注释消掉
                Toast.makeText(MainActivity.this,"测试一",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_test:
                Toast.makeText(MainActivity.this,"测试二",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this,"我是默认",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void fragmentTest() {
        button = findViewById(R.id.button);
        button_test = findViewById(R.id.button_test);
        button.setOnClickListener(this);
        button_test.setOnClickListener(this);
        // replaceFragment(new RightFragment());
    }


    //动态注册，调用另一个fragment页面
//    private  void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        //transaction.replace(R.id.right_layout,fragment);
//
//        //模拟返回栈
//        transaction.addToBackStack(null);
//
//        transaction.commit();
//    }






//    class OneClickListener implements View.OnClickListener {
//        @Override
//        public void onClick(View v) {
//            clickCount++;
//            String clickOrder = "第" + clickCount + "次点击";
//            tv_main.setText(clickOrder);
//            Toast.makeText(MainActivity.this, clickOrder, Toast.LENGTH_SHORT).show();
//
//        }
//    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart:活动 ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 运行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 暂停");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 结束");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 销毁");
    }
}
