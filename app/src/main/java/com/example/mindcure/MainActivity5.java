package com.example.mindcure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.mindcure.databinding.ActivityMain5Binding;
import com.example.mindcure.databinding.ActivityMainSigninBinding;

public class MainActivity5 extends AppCompatActivity {
    ActivityMain5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main5);

        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.opA.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view) {
                                                     startActivity(new Intent(MainActivity5.this,MainActivity6.class));

                                                 }
                                             }
        );
        binding.b.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               startActivity(new Intent(MainActivity5.this,MainActivity6.class));

                                           }
                                       }
        );
        binding.c.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               startActivity(new Intent(MainActivity5.this,MainActivity6.class));

                                           }
                                       }
        );
        binding.d.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               startActivity(new Intent(MainActivity5.this,MainActivity6.class));

                                           }
                                       }
        );
    }
}