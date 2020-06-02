package com.e.a4enraya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TokensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokens);
    }

    public void abrir(View view){
        Intent intent =  new Intent(this,GameActivity.class);
        startActivity(intent);
    }
}
