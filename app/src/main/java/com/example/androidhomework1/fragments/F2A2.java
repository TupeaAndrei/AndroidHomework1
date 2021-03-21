package com.example.androidhomework1.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidhomework1.R;
import com.example.androidhomework1.interfaces.ActivityFragmentComunication;

public class F2A2 extends Fragment {

    private ActivityFragmentComunication activityFragmentComunication;

    public static F2A2 newInstance() {

        Bundle args = new Bundle();

        F2A2 fragment = new F2A2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f2_a2,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button replaceButton = view.findViewById(R.id.replace_button);
        replaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (activityFragmentComunication != null)
                {
                    activityFragmentComunication.replaceWithThirdFragment();
                }
            }
        });
        Button backButton = view.findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (activityFragmentComunication != null){
                    activityFragmentComunication.removeFromStack();
                }
            }
        });
        Button exitButton = view.findViewById(R.id.close_button);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (activityFragmentComunication != null){
                    activityFragmentComunication.finishActivity();
                }
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ActivityFragmentComunication){
            activityFragmentComunication = (ActivityFragmentComunication) context;
        }
    }
}
