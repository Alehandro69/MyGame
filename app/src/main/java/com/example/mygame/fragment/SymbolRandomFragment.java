package com.example.mygame.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mygame.R;

import java.util.Random;

public class SymbolRandomFragment extends Fragment {
    public static final Random random = new Random();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_symbol_random, null);

        TextView resultTv = (TextView) v.findViewById(R.id.resultTv);

        TextView randomBt = (TextView) v.findViewById(R.id.randomBt);

        String[] myString = new String[]{"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н",
                "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
        int n = (int) Math.floor(Math.random() * myString.length);
        resultTv.setText(myString[n]);


        randomBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] myString = new String[]{"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н",
                        "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
                int n = (int) Math.floor(Math.random() * myString.length);
                resultTv.setText(myString[n]);
            }
        });

        return v;
    }
}