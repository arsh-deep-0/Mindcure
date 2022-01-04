package com.example.mindcure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.mindcure.databinding.ActivityMain4Binding;
import com.example.mindcure.databinding.ActivityMain5Binding;
import com.example.mindcure.databinding.ActivityMainSigninBinding;

public class MainActivity4 extends AppCompatActivity {
    ActivityMain4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main4);

        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.quick.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View view) {
                                                     startActivity(new Intent(MainActivity4.this,MainActivity5.class));

                                                 }
                                             }
        );
        binding.music.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 startActivity(new Intent(MainActivity4.this,MainMusicActivitiy.class));

                                             }
                                         }
        );
    }
}