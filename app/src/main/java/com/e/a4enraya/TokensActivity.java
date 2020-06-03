package com.e.a4enraya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TokensActivity extends AppCompatActivity {

    ImageView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokens);
        t1=findViewById(R.id.ficha1cont1);
        t2=findViewById(R.id.ficha1cont2);
        t3=findViewById(R.id.ficha1cont3);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animdilfast);
        animation.setRepeatMode(Animation.REVERSE);
        t1.startAnimation(animation);
        t2.startAnimation(animation);
        t3.startAnimation(animation);

    }

    public void abrir(View view){
        Intent intent =  new Intent(this,GameActivity.class);
        startActivity(intent);
    }
}
