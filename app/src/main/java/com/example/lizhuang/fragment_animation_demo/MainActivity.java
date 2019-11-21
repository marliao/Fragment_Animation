package com.example.lizhuang.fragment_animation_demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.lizhuang.fragment_animation_demo.fragment.BlankFragment1;
import com.example.lizhuang.fragment_animation_demo.fragment.BlankFragment2;
import com.example.lizhuang.fragment_animation_demo.fragment.BlankFragment3;
import com.example.lizhuang.fragment_animation_demo.fragment.BlankFragment4;
import com.example.lizhuang.fragment_animation_demo.fragment.BlankFragment5;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "===============";
    private FrameLayout fragment_content;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        fragment_content = (FrameLayout) findViewById(R.id.fragment_content);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1://淡入淡出
                changeFragment(new BlankFragment1(), R.anim.fragment1_enter);
                break;
            case R.id.btn_2://从左向右跳转
                changeFragment(new BlankFragment2(), R.anim.fragment2_enter);
                break;
            case R.id.btn_3://从右向左跳转
                changeFragment(new BlankFragment3(), R.anim.fragment3_enter);
                break;
            case R.id.btn_4://从小到大缩放
                changeFragment(new BlankFragment4(), R.anim.fragment4_enter);
                break;
            case R.id.btn_5://旋转动画
                changeFragment(new BlankFragment5(), R.anim.fragment5_enter);
                break;
        }
    }

    private void changeFragment(Fragment fragment, int in) {
        int out = getOutAniamtion();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.setCustomAnimations(in, out);
        beginTransaction.replace(R.id.fragment_content, fragment).commit();
    }

    private int getOutAniamtion() {
        int out = R.anim.fragment1_exit;
        switch (MyApplication.out) {
            case 1:
                out = R.anim.fragment1_exit;
                break;
            case 2:
                out = R.anim.fragment2_exit;
                break;
            case 3:
                out = R.anim.fragment3_exit;
                break;
            case 4:
                out = R.anim.fragment4_exit;
                break;
            case 5:
                out = R.anim.fragment5_exit;
                break;
        }
        return out;
    }

}
