package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    FloatingActionButton fabMain, randomText, randomNum, randomCasino;
    Float translationY = -100f;

    OvershootInterpolator interpolator = new OvershootInterpolator();

    TextRandomFragment frag1;
    NumberRandomFragment frag2;
    CasinoRandomFragment frag3;
    FragmentTransaction fTrans;

    Boolean isMenuOpen = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = new TextRandomFragment();
        frag2 = new NumberRandomFragment();
        frag3 = new CasinoRandomFragment();

        fabMain = findViewById(R.id.fabMain);
        randomText = findViewById(R.id.randomText);
        randomNum = findViewById(R.id.randomNum);
        randomCasino = findViewById(R.id.randomCasino);

        randomText.setAlpha(0f);
        randomNum.setAlpha(0f);
        randomCasino.setAlpha(0f);

        randomText.setTranslationY(translationY);
        randomNum.setTranslationY(translationY);
        randomCasino.setTranslationY(translationY);



        fabMain.setOnClickListener(this);
        randomText.setOnClickListener(this);
        randomNum.setOnClickListener(this);
        randomCasino.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        fTrans = getSupportFragmentManager().beginTransaction();
        randomText.setVisibility(View.VISIBLE);
        randomNum.setVisibility(View.VISIBLE);
        randomCasino.setVisibility(View.VISIBLE);
        switch (view.getId()) {
            case R.id.fabMain:
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
                break;
            case R.id.randomText:
                fTrans.replace(R.id.frgmCont, frag1);
                    closeMenu();
                randomText.setVisibility(View.GONE);
                randomNum.setVisibility(View.GONE);
                randomCasino.setVisibility(View.GONE);
                break;
            case R.id.randomNum:
                fTrans.replace(R.id.frgmCont, frag2);
                    closeMenu();
                randomText.setVisibility(View.GONE);
                randomNum.setVisibility(View.GONE);
                randomCasino.setVisibility(View.GONE);
                break;
            case R.id.randomCasino:
                fTrans.replace(R.id.frgmCont, frag3);
                    closeMenu();
                randomText.setVisibility(View.GONE);
                randomNum.setVisibility(View.GONE);
                randomCasino.setVisibility(View.GONE);
                break;
        }
        fTrans.commit();

    }

    private void openMenu() {
        isMenuOpen = !isMenuOpen;

        fabMain.animate().setInterpolator(interpolator).rotation(90f).setDuration(300).start();

        randomText.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        randomNum.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        randomCasino.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();


    }

    private void closeMenu() {
        isMenuOpen = !isMenuOpen;

        fabMain.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();

        randomText.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        randomNum.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        randomCasino.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();

    }
}