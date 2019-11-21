package com.example.lizhuang.fragment_animation_demo.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lizhuang.fragment_animation_demo.MyApplication;
import com.example.lizhuang.fragment_animation_demo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment1 extends Fragment implements View.OnClickListener {


    private Button btn_test;

    public BlankFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment1, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        btn_test = (Button) view.findViewById(R.id.btn_test);

        btn_test.setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MyApplication.out=1;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test:
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.fragment2_enter, R.anim.fragment1_exit);
                fragmentTransaction.replace(R.id.fragment_content, new BlankFragment2()).commit();
                break;
        }
    }
}
