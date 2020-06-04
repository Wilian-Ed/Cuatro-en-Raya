package com.e.a4enraya;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TokensActivity extends AppCompatActivity {

    ArrayList<ImageView> fichas1 = new ArrayList<>();
    ArrayList<ImageView> fichas2 = new ArrayList<>();
    ArrayList<ImageView> fichas3 = new ArrayList<>();
    int selectficha1,selectficha2,selectficha3;
    LinearLayout container1,container2,container3;
    Button fder1,fder2,fder3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokens);
        container1=findViewById(R.id.ContainerToken1);
        container2=findViewById(R.id.ContainerToken2);
        container3=findViewById(R.id.ContainerToken3);
        selectficha1=0;
        selectficha2=1;
        selectficha3=2;
        Alltokens();
        start();
    }

    @SuppressLint("ResourceAsColor")
    public void start(){
        container1.removeView(fichas1.get(1));container1.removeView(fichas1.get(2));
        container2.removeView(fichas2.get(0));container2.removeView(fichas2.get(2));
        container3.removeView(fichas3.get(0));container3.removeView(fichas3.get(1));
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animdilfast);
        animation.setRepeatMode(Animation.REVERSE);
        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.parpadeolento);
        animation2.setRepeatMode(Animation.REVERSE);
        fichas1.get(0).startAnimation(animation);
        fichas1.get(0).setBackgroundColor(R.color.colorPrimary);
        fichas2.get(1).startAnimation(animation);
        fichas2.get(1).setBackgroundColor(R.color.colorPrimary);
        fichas3.get(2).startAnimation(animation);
        fichas3.get(2).setBackgroundColor(R.color.colorPrimary);
        fder1=findViewById(R.id.flechader1);fder1.startAnimation(animation2);
        fder2=findViewById(R.id.flechader2);fder2.startAnimation(animation2);
        fder3=findViewById(R.id.flechader3);fder3.startAnimation(animation2);
    }

    @SuppressLint("ResourceAsColor")
    public void tokenClick(ImageView imageView, int anterior, int container,int selected){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animdilfast);
        animation.setRepeatMode(Animation.REVERSE);
        switch (container){
            case 1:
                fichas1.get(anterior).clearAnimation();fichas1.get(anterior).setBackground(null);
                container2.removeView(fichas2.get(selected));
                container3.removeView(fichas3.get(selected));
                container2.addView(fichas2.get(anterior));
                container3.addView(fichas3.get(anterior));
                break;
            case 2:
                fichas2.get(anterior).clearAnimation();fichas2.get(anterior).setBackground(null);
                container1.removeView(fichas1.get(selected));
                container3.removeView(fichas3.get(selected));
                container1.addView(fichas1.get(anterior));
                container3.addView(fichas3.get(anterior));
                break;
            case 3:
                fichas3.get(anterior).clearAnimation();fichas3.get(anterior).setBackground(null);
                container1.removeView(fichas1.get(selected));
                container2.removeView(fichas2.get(selected));
                container1.addView(fichas1.get(anterior));
                container2.addView(fichas2.get(anterior));
                break;
        }
        imageView.startAnimation(animation);
        imageView.setBackgroundColor(R.color.colorPrimary);
    }

    public void abrir(View view){
        Intent intent =  new Intent(this,GameActivity.class);
        startActivity(intent);
    }

    public void Alltokens(){
        for (int i = 0; i < 16; i++) {
            fichas1.add(newTokenCont1(i));
            fichas2.add(newTokenCont2(i));
            fichas3.add(newTokenCont3(i));
        }
    }


    public ImageView newTokenCont1(final int numToken){
        ImageView imageView = new ImageView(this);
        switch (numToken){
            case 0: imageView=findViewById(R.id.ficha1);break;
            case 1: imageView=findViewById(R.id.ficha2);break;
            case 2: imageView=findViewById(R.id.ficha3);break;
            case 3: imageView=findViewById(R.id.ficha4);break;
            case 4: imageView=findViewById(R.id.ficha5);break;
            case 5: imageView=findViewById(R.id.ficha6);break;
            case 6: imageView=findViewById(R.id.ficha7);break;
            case 7: imageView=findViewById(R.id.ficha8);break;
            case 8: imageView=findViewById(R.id.ficha9);break;
            case 9: imageView=findViewById(R.id.ficha10);break;
            case 10: imageView=findViewById(R.id.ficha11);break;
            case 11: imageView=findViewById(R.id.ficha12);break;
            case 12: imageView=findViewById(R.id.ficha13);break;
            case 13: imageView=findViewById(R.id.ficha14);break;
            case 14: imageView=findViewById(R.id.ficha15);break;
            case 15: imageView=findViewById(R.id.ficha16);break;
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tokenClick(fichas1.get(numToken), selectficha1, 1,numToken);
                selectficha1 = numToken;
            }
        });
        return  imageView;
    }

    public ImageView newTokenCont2(final int numToken){
        ImageView imageView = new ImageView(this);
        switch (numToken){
            case 0: imageView=findViewById(R.id.ficha1cont2);break;
            case 1: imageView=findViewById(R.id.ficha2cont2);break;
            case 2: imageView=findViewById(R.id.ficha3cont2);break;
            case 3: imageView=findViewById(R.id.ficha4cont2);break;
            case 4: imageView=findViewById(R.id.ficha5cont2);break;
            case 5: imageView=findViewById(R.id.ficha6cont2);break;
            case 6: imageView=findViewById(R.id.ficha7cont2);break;
            case 7: imageView=findViewById(R.id.ficha8cont2);break;
            case 8: imageView=findViewById(R.id.ficha9cont2);break;
            case 9: imageView=findViewById(R.id.ficha10cont2);break;
            case 10: imageView=findViewById(R.id.ficha11cont2);break;
            case 11: imageView=findViewById(R.id.ficha12cont2);break;
            case 12: imageView=findViewById(R.id.ficha13cont2);break;
            case 13: imageView=findViewById(R.id.ficha14cont2);break;
            case 14: imageView=findViewById(R.id.ficha15cont2);break;
            case 15: imageView=findViewById(R.id.ficha16cont2);break;
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tokenClick(fichas2.get(numToken), selectficha2, 2,numToken);
                selectficha2 = numToken;
            }
        });
        return  imageView;
    }

    public ImageView newTokenCont3(final int numToken){
        ImageView imageView = new ImageView(this);
        switch (numToken){
            case 0: imageView=findViewById(R.id.ficha1cont3);break;
            case 1: imageView=findViewById(R.id.ficha2cont3);break;
            case 2: imageView=findViewById(R.id.ficha3cont3);break;
            case 3: imageView=findViewById(R.id.ficha4cont3);break;
            case 4: imageView=findViewById(R.id.ficha5cont3);break;
            case 5: imageView=findViewById(R.id.ficha6cont3);break;
            case 6: imageView=findViewById(R.id.ficha7cont3);break;
            case 7: imageView=findViewById(R.id.ficha8cont3);break;
            case 8: imageView=findViewById(R.id.ficha9cont3);break;
            case 9: imageView=findViewById(R.id.ficha10cont3);break;
            case 10: imageView=findViewById(R.id.ficha11cont3);break;
            case 11: imageView=findViewById(R.id.ficha12cont3);break;
            case 12: imageView=findViewById(R.id.ficha13cont3);break;
            case 13: imageView=findViewById(R.id.ficha14cont3);break;
            case 14: imageView=findViewById(R.id.ficha15cont3);break;
            case 15: imageView=findViewById(R.id.ficha16cont3);break;
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tokenClick(fichas3.get(numToken), selectficha3, 3,numToken);
                selectficha3 = numToken;
            }
        });
        return  imageView;
    }
}