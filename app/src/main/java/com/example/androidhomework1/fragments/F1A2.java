package com.example.androidhomework1.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidhomework1.R;

public class F1A2 extends Fragment {

    public static F1A2 newInstance() {
        
        Bundle args = new Bundle();
        
        F1A2 fragment = new F1A2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f1_a2,container,false);
        return view;
    }

}
