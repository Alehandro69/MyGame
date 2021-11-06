package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class RandomNumActivity extends AppCompatActivity {

    private ImageView backIv;
    private TextView tvInfo;
    private EditText minNum, maxNum;
    private Button randomBt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_num);

        backIv = findViewById(R.id.backIv);
        tvInfo = findViewById(R.id.tvInfo);
        minNum = findViewById(R.id.minNum);
        maxNum = findViewById(R.id.maxNum);
        randomBt = findViewById(R.id.randomBt);

        backIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        randomBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minR=Integer.parseInt(minNum.getText().toString());
                int maxR=Integer.parseInt(maxNum.getText().toString());
                if(minR >= maxR){
                    tvInfo.setText("Наоборот)");
                }else{
                    int diff = maxR - minR;
                    Random random = new Random();
                    int i = random.nextInt(diff + 1);
                    i += minR;
                    String res = String.valueOf(i);
                    tvInfo.setText(res);
                }
            }
        });

    }


}