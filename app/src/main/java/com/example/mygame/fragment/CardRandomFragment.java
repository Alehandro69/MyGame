package com.example.mygame.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mygame.R;

import java.util.Random;


public class CardRandomFragment extends Fragment {
    public static final Random random = new Random();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_card_random, null);


        ImageView card = (ImageView) v.findViewById(R.id.card);
        Button randomBt = (Button) v.findViewById(R.id.randomBt);

        randomBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = randomDiceValue();

                int res = getResources().getIdentifier("card_sprite__" + value + "_", "drawable", "com.example.mygame");

                card.setImageResource(res);
            }
        });
        return v;
    }

    public static int randomDiceValue(){
        return random.nextInt(52 ) + 1;
    }

}