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
import android.widget.Toast;

import com.example.mindcure.databinding.ActivityMain6Binding;
import com.example.mindcure.databinding.ActivityMainMusicActivitiyBinding;

public class MainMusicActivitiy extends AppCompatActivity {
    MediaPlayer player;
    ActivityMainMusicActivitiyBinding binding;
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

        binding = ActivityMainMusicActivitiyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMusicActivitiy.this,MainActivity4.class));
            }
        });


    }



    public void play(View v){
        if (player==null){
            Toast.makeText(MainMusicActivitiy.this,"Music playing",Toast.LENGTH_SHORT).show();
            player=MediaPlayer.create(this,R.raw.peace);
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
        Toast.makeText(MainMusicActivitiy.this,"Music paused",Toast.LENGTH_SHORT).show();

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
startActivity(new Intent(MainMusicActivitiy.this,MainMusikActivity.class));
            Toast.makeText(MainMusicActivitiy.this,"Tap on play button",Toast.LENGTH_SHORT).show();

        }
    }

    public void next(View v) {
        stopPlayers();

    }
    private void stopPlayers(){
        if(player !=null){
            player.release();
            player=null;
            startActivity(new Intent(MainMusicActivitiy.this,MainMusikActivity.class));
            Toast.makeText(MainMusicActivitiy.this,"Tap on play button",Toast.LENGTH_SHORT).show();

        }
    }

    public void stop(View v) {
        stopPlayer();
        Toast.makeText(MainMusicActivitiy.this,"Music stopped",Toast.LENGTH_SHORT).show();


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