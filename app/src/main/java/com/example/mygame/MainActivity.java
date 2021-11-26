package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mygame.fragment.CardRandomFragment;
import com.example.mygame.fragment.CasinoRandomFragment;
import com.example.mygame.fragment.CoinRandomFragment;
import com.example.mygame.fragment.NumberRandomFragment;
import com.example.mygame.fragment.SymbolRandomFragment;
import com.example.mygame.fragment.TextRandomFragment;
import com.example.mygame.fragment.YesOrNotRandomFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView randomText, randomNum, randomCasino, randomCard, randomMovie, randomMusic,
            randomYesOrNot, randomSymbol, randomCoin, randomDate, randomContact, randomCountry;

    private ScrollView menuSv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuSv = findViewById(R.id.menuSv);

        randomText = findViewById(R.id.randomText);
        randomNum = findViewById(R.id.randomNum);
        randomCasino = findViewById(R.id.randomCasino);
        randomCard = findViewById(R.id.randomCard);
        randomYesOrNot = findViewById(R.id.randomYesOrNot);
        randomCoin = findViewById(R.id.randomCoin);
        randomSymbol = findViewById(R.id.randomSymbol);
        randomDate = findViewById(R.id.randomDate);
        randomCountry = findViewById(R.id.randomCountry);

        randomText.setOnClickListener(this);
        randomNum.setOnClickListener(this);
        randomCasino.setOnClickListener(this);
        randomCard.setOnClickListener(this);
        randomYesOrNot.setOnClickListener(this);
        randomCoin.setOnClickListener(this);
        randomSymbol.setOnClickListener(this);
        randomDate.setOnClickListener(this);
        randomCountry.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.randomText:
                Intent intent1 = new Intent(MainActivity.this, ContentActivity.class);
                intent1.putExtra("Fragment", "frag1");
                startActivity(intent1);
                break;
            case R.id.randomNum:
                Intent intent2 = new Intent(MainActivity.this, ContentActivity.class);
                intent2.putExtra("Fragment", "frag2");
                startActivity(intent2);
                break;
            case R.id.randomCasino:
                Intent intent3 = new Intent(MainActivity.this, ContentActivity.class);
                intent3.putExtra("Fragment", "frag3");
                startActivity(intent3);
                break;
            case R.id.randomCard:
                Intent intent4 = new Intent(MainActivity.this, ContentActivity.class);
                intent4.putExtra("Fragment", "frag4");
                startActivity(intent4);
                break;
            case R.id.randomYesOrNot:
                Intent intent5 = new Intent(MainActivity.this, ContentActivity.class);
                intent5.putExtra("Fragment", "frag5");
                startActivity(intent5);
                break;
            case R.id.randomCoin:
                Intent intent6 = new Intent(MainActivity.this, ContentActivity.class);
                intent6.putExtra("Fragment", "frag6");
                startActivity(intent6);
                break;
            case R.id.randomSymbol:
                Intent intent7 = new Intent(MainActivity.this, ContentActivity.class);
                intent7.putExtra("Fragment", "frag7");
                startActivity(intent7);
                break;
            case R.id.randomDate:
                Intent intent8 = new Intent(MainActivity.this, ContentActivity.class);
                intent8.putExtra("Fragment", "frag8");
                startActivity(intent8);
                break;
            case R.id.randomCountry:
                Intent intent9 = new Intent(MainActivity.this, ContentActivity.class);
                intent9.putExtra("Fragment", "frag9");
                startActivity(intent9);
                break;
        }
    }
}