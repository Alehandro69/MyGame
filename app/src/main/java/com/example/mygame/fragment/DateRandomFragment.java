package com.example.mygame.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mygame.R;

import java.util.Random;


public class DateRandomFragment extends Fragment {

    public static final Random random = new Random();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_date_random, null);

        TextView resultTv = (TextView) v.findViewById(R.id.resultTv);
        TextView dayBt = (TextView) v.findViewById(R.id.dayBt);
        TextView timeBt = (TextView) v.findViewById(R.id.timeBt);
        TextView dateBt = (TextView) v.findViewById(R.id.dateBt);
        TextView monthBt = (TextView) v.findViewById(R.id.monthBt);

        dateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = random.nextInt(31 ) + 1;
                resultTv.setText(""+randomNumber);
            }
        });
        timeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hors = random.nextInt(24 ) + 1;
                int min = random.nextInt(60 ) + 1;
                resultTv.setText(hors + ":" + min);
            }
        });
        dayBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] myString = new String[]{"Понедельник", "Вторник", "Среда", "Четверг",
                        "Пятница", "Суббота", "Воскресенье"};
                int n = (int) Math.floor(Math.random() * myString.length);
                resultTv.setText(myString[n]);
            }
        });
        monthBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] myString = new String[]{"Январь", "Февраль", "Март", "Апрель",
                        "Май", "Июнь", "Июль", "Август", "Сентябрь",
                        "Октябрь", "Ноябрь", "Декабрь"};
                int n = (int) Math.floor(Math.random() * myString.length);
                resultTv.setText(myString[n]);
            }
        });

        return v;
    }
}