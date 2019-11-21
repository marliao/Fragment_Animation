package com.example.lizhuang.fragment_animation_demo.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lizhuang.fragment_animation_demo.MyApplication;
import com.example.lizhuang.fragment_animation_demo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends Fragment {


    public BlankFragment3() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MyApplication.out=3;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
    }

}
