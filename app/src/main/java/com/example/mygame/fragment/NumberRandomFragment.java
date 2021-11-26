package com.example.mygame.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mygame.R;

import java.util.Random;

public class NumberRandomFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_number, null);

        TextView resultV = (TextView) v.findViewById(R.id.resultV);
        EditText minNum = (EditText) v.findViewById(R.id.minNum);
        EditText maxNum = (EditText) v.findViewById(R.id.maxNum);
        Button randomBt = (Button) v.findViewById(R.id.randomBt);

        randomBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minR=Integer.parseInt(minNum.getText().toString());
                int maxR=Integer.parseInt(maxNum.getText().toString());
                if(minR >= maxR){
                    resultV.setText("Наоборот)");
                }else{
                    int diff = maxR - minR;
                    Random random = new Random();
                    int i = random.nextInt(diff + 1);
                    i += minR;
                    String res = String.valueOf(i);
                    resultV.setText(res);
                }
            }
        });

        return v;
    }
}