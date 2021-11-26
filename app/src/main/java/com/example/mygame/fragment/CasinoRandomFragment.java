package com.example.mygame.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mygame.R;

import java.util.Random;


public class CasinoRandomFragment extends Fragment {

    public static final Random random = new Random();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_casino_random, null);

        ImageView dice = (ImageView) v.findViewById(R.id.dice);
        Button randomBt = (Button) v.findViewById(R.id.randomBt);

        randomBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = randomDiceValue();

                int res = getResources().getIdentifier("dice_six_faces_" + value, "drawable", "com.example.mygame");

                dice.setImageResource(res);
            }
        });
        return v;
    }

    public static int randomDiceValue(){
        return random.nextInt(6 ) + 1;
    }

}