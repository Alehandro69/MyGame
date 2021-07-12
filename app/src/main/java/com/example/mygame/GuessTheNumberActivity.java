package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Scanner;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GuessTheNumberActivity extends AppCompatActivity {

    private EditText enterEt;
    private ImageView goIv;
    private TextView endTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_number);

        enterEt = findViewById(R.id.enterEt);
        endTv = findViewById(R.id.endTv);
        goIv = findViewById(R.id.goIv);

        int randomInt = new Random().nextInt(1000);

        int userInput = -1;

        goIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomInt = new Random().nextInt(1000);

                while (userInput != randomInt) {
                    double userInput = Double.parseDouble(enterEt.getText().toString());
                    if (userInput < randomInt) {
                        endTv.setText("Больше");
                    } else if (userInput > randomInt) {
                        endTv.setText("Меньше");
                    }
                }
                endTv.setText("Верно!!!");
            }
        });

    }
}