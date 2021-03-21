package com.example.androidhomework1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.androidhomework1.R;
import com.example.androidhomework1.interfaces.ActivityFragmentComunication;

public class MainActivity extends AppCompatActivity implements ActivityFragmentComunication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void openActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void replaceWithThirdFragment() {

    }

    @Override
    public void removeFromStack() {

    }

    @Override
    public void finishActivity() {
        this.finish();
    }
}