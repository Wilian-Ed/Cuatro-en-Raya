package com.e.a4enraya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button unJugador,DosJugadores;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.Title);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.parpadeo);
        animation.setRepeatMode(Animation.REVERSE);
        title.startAnimation(animation);
        unJugador=findViewById(R.id.Un_Jugador);
    }

    public void Game(View view){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animdil);
        unJugador.startAnimation(animation);
        Intent intent = new Intent(this,TokensActivity.class);
        startActivity(intent);
    }
}