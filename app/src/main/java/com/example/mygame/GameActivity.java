package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {

    private ImageView backIv;
    private Button guessBt, RandomNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        backIv = findViewById(R.id.backIv);
        guessBt = findViewById(R.id.guessBt);
        RandomNum = findViewById(R.id.RandomNum);

        backIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        guessBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this, GuessTheNumberActivity.class);
                GameActivity.this.startActivity(intent);
            }
        });
        RandomNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this, RandomNumActivity.class);
                GameActivity.this.startActivity(intent);
            }
        });
    }
}