package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Scanner;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GuessTheNumberActivity extends AppCompatActivity {

    private ImageView backIv;

    private TextView tvInfo;
    private EditText etInput;
    private Button bControl;

    int guess;
    boolean gameFinished;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_number);

        tvInfo = findViewById(R.id.tvInfo);
        etInput = findViewById(R.id.etInput);
        bControl = findViewById(R.id.bControl);
        backIv = findViewById(R.id.backIv);

        backIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        guess = (int)(Math.random()*1000);
        gameFinished = false;
    }

    public void onClick(View v){
            if (!gameFinished){
                int inp=Integer.parseInt(etInput.getText().toString());
                if (inp > guess)
                    tvInfo.setText(getResources().getString(R.string.ahead));
                if (inp < guess)
                    tvInfo.setText(getResources().getString(R.string.behind));
                if (inp == guess)
                {
                    tvInfo.setText(getResources().getString(R.string.hit));
                    bControl.setText(getResources().getString(R.string.play_more));
                    gameFinished = true;
                }
            }
            else
            {
                guess = (int)(Math.random()*100);
                bControl.setText(getResources().getString(R.string.input_value));
                tvInfo.setText(getResources().getString(R.string.try_to_guess));
                gameFinished = false;
            }
            etInput.setText("");

    }
}