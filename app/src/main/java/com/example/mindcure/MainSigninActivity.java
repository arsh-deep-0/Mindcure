package com.example.mindcure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


import com.example.mindcure.databinding.ActivityMainSigninBinding;

public class MainSigninActivity extends AppCompatActivity {
    ActivityMainSigninBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        binding = ActivityMainSigninBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main_signin);

        binding.btnSignin.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view) {
                                                     startActivity(new Intent(MainSigninActivity.this,MainActivity3.class));

                                                 }
                                             }
        );
    }
}