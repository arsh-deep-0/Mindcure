package com.example.mindcure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.mindcure.databinding.ActivityMain6Binding;
import com.example.mindcure.databinding.ActivityMainSigninBinding;

public class MainActivity6 extends AppCompatActivity {
    ActivityMain6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main6);

        binding = ActivityMain6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}