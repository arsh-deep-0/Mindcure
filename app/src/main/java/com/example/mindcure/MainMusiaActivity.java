package com.example.mindcure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.mindcure.databinding.ActivityMain6Binding;
import com.example.mindcure.databinding.ActivityMainMusiaBinding;
import com.example.mindcure.databinding.ActivityMainMusicActivitiyBinding;
import com.example.mindcure.databinding.ActivityMainMusikBinding;

public class MainMusiaActivity extends AppCompatActivity {
    MediaPlayer player;
    ActivityMainMusiaBinding binding;
  /*  ViewGroup tcontainer;
    TextView txt;
    com.airbnb.lottie.LottieAnimationView abc;
    ImageButton btn;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main_music_activitiy);

      /*/  tcontainer=findViewById(R.id.tcontainer);
        btn =findViewById(R.id.play);
        abc = findViewById(R.id.equi);


        binding.play.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tcontainer);
                visible=!visible;
                abc.setVisibility(visible ? View.VISIBLE: View.GONE);


            }
        });*/

        binding = ActivityMainMusiaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMusiaActivity.this,MainActivity4.class));
            }
        });


    }
    public void play(View v){
        if (player==null){
            player=MediaPlayer.create(this,R.raw.eelven);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }
    public void pause(View V){
        if(player != null){
            player.pause();
        }
    }

    public void prev(View v) {
        stopPlayerz();

    }
    private void stopPlayerz(){
        if(player !=null){
            player.release();
            player=null;
            startActivity(new Intent(MainMusiaActivity.this,MainMusikActivity.class));
        }
    }

    public void next(View v) {
        stopPlayers();

    }
    private void stopPlayers(){
        if(player !=null){
            player.release();
            player=null;
            startActivity(new Intent(MainMusiaActivity.this,MainMusibActivity.class));
        }
    }

    public void stop(View v) {
        stopPlayer();

    }
    private void stopPlayer(){
        if(player !=null){
            player.release();
            player=null;

        }
    }

    @Override
    protected void onStop(){
        super.onStop();
        stopPlayer();
    }


}