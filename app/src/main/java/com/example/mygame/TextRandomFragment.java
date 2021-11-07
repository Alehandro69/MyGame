package com.example.mygame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TextRandomFragment extends Fragment {


    private String text1, text2, text3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_text_random, null);

        TextView resulTv = (TextView) v.findViewById(R.id.resulTv);
        EditText textEt1 = (EditText) v.findViewById(R.id.textEt1);
        EditText textEt2 = (EditText) v.findViewById(R.id.textEt2);
        EditText textEt3 = (EditText) v.findViewById(R.id.textEt3);
        Button button = (Button) v.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();

                String[] myString = new String[]{text1, text2, text3};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });



        return v;
    }
}