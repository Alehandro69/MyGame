package com.example.mygame;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;


public class TextRandomFragment extends Fragment {


    private String text1, text2, text3, text4, text5, text6, text7, text8, text9, text10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_text_random, null);

/*

       TextInputLayout textInputLayout1 = (TextInputLayout) v.findViewById(R.id.textInputLayout1);
        TextInputLayout textInputLayout2 = (TextInputLayout) v.findViewById(R.id.textInputLayout2);
        TextInputLayout textInputLayout3 = (TextInputLayout) v.findViewById(R.id.textInputLayout3);
        TextInputLayout textInputLayout4 = (TextInputLayout) v.findViewById(R.id.textInputLayout4);
        TextInputLayout textInputLayout5 = (TextInputLayout) v.findViewById(R.id.textInputLayout5);
        TextInputLayout textInputLayout6 = (TextInputLayout) v.findViewById(R.id.textInputLayout6);
        TextInputLayout textInputLayout7 = (TextInputLayout) v.findViewById(R.id.textInputLayout7);
        TextInputLayout textInputLayout8 = (TextInputLayout) v.findViewById(R.id.textInputLayout8);
        TextInputLayout textInputLayout9 = (TextInputLayout) v.findViewById(R.id.textInputLayout9);
        TextInputLayout textInputLayout10 = (TextInputLayout) v.findViewById(R.id.textInputLayout10);
        TextView resulTv = (TextView) v.findViewById(R.id.resulTv);
        EditText textEt1 = (EditText) v.findViewById(R.id.textEt1);
        EditText textEt2 = (EditText) v.findViewById(R.id.textEt2);
        EditText textEt3 = (EditText) v.findViewById(R.id.textEt3);
        EditText textEt4 = (EditText) v.findViewById(R.id.textEt4);
        EditText textEt5 = (EditText) v.findViewById(R.id.textEt5);
        EditText textEt6 = (EditText) v.findViewById(R.id.textEt6);
        EditText textEt7 = (EditText) v.findViewById(R.id.textEt7);
        EditText textEt8 = (EditText) v.findViewById(R.id.textEt8);
        EditText textEt9 = (EditText) v.findViewById(R.id.textEt9);
        EditText textEt10 = (EditText) v.findViewById(R.id.textEt10);
        Button button2 = (Button) v.findViewById(R.id.button2);
        Button button3 = (Button) v.findViewById(R.id.button3);
        Button button4 = (Button) v.findViewById(R.id.button4);
        Button button5 = (Button) v.findViewById(R.id.button5);
        Button button6 = (Button) v.findViewById(R.id.button6);
        Button button7 = (Button) v.findViewById(R.id.button7);
        Button button8 = (Button) v.findViewById(R.id.button8);
        Button button9 = (Button) v.findViewById(R.id.button9);
        Button button10 = (Button) v.findViewById(R.id.button10);
        Button quantity2 = (Button) v.findViewById(R.id.quantity2);
        Button quantity3 = (Button) v.findViewById(R.id.quantity3);
        Button quantity4 = (Button) v.findViewById(R.id.quantity4);
        Button quantity5 = (Button) v.findViewById(R.id.quantity5);
        Button quantity6 = (Button) v.findViewById(R.id.quantity6);
        Button quantity7 = (Button) v.findViewById(R.id.quantity7);
        Button quantity8 = (Button) v.findViewById(R.id.quantity8);
        Button quantity9 = (Button) v.findViewById(R.id.quantity9);
        Button quantity10 = (Button) v.findViewById(R.id.quantity10);
        ScrollView quantity = (ScrollView) v.findViewById(R.id.quantity);
        ScrollView scrollView = (ScrollView) v.findViewById(R.id.scrollView);

        quantity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });
        quantity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                textInputLayout3.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });
        quantity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                textInputLayout3.setVisibility(View.VISIBLE);
                textInputLayout4.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });
        quantity5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                textInputLayout3.setVisibility(View.VISIBLE);
                textInputLayout4.setVisibility(View.VISIBLE);
                textInputLayout5.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });
        quantity6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                textInputLayout3.setVisibility(View.VISIBLE);
                textInputLayout4.setVisibility(View.VISIBLE);
                textInputLayout5.setVisibility(View.VISIBLE);
                textInputLayout6.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });
        quantity7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                textInputLayout3.setVisibility(View.VISIBLE);
                textInputLayout4.setVisibility(View.VISIBLE);
                textInputLayout5.setVisibility(View.VISIBLE);
                textInputLayout6.setVisibility(View.VISIBLE);
                textInputLayout7.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });
        quantity8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                textInputLayout3.setVisibility(View.VISIBLE);
                textInputLayout4.setVisibility(View.VISIBLE);
                textInputLayout5.setVisibility(View.VISIBLE);
                textInputLayout6.setVisibility(View.VISIBLE);
                textInputLayout7.setVisibility(View.VISIBLE);
                textInputLayout8.setVisibility(View.VISIBLE);
                button8.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });
        quantity9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                textInputLayout3.setVisibility(View.VISIBLE);
                textInputLayout4.setVisibility(View.VISIBLE);
                textInputLayout5.setVisibility(View.VISIBLE);
                textInputLayout6.setVisibility(View.VISIBLE);
                textInputLayout7.setVisibility(View.VISIBLE);
                textInputLayout8.setVisibility(View.VISIBLE);
                textInputLayout9.setVisibility(View.VISIBLE);
                button9.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });
        quantity10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInputLayout1.setVisibility(View.VISIBLE);
                textInputLayout2.setVisibility(View.VISIBLE);
                textInputLayout3.setVisibility(View.VISIBLE);
                textInputLayout4.setVisibility(View.VISIBLE);
                textInputLayout5.setVisibility(View.VISIBLE);
                textInputLayout6.setVisibility(View.VISIBLE);
                textInputLayout7.setVisibility(View.VISIBLE);
                textInputLayout8.setVisibility(View.VISIBLE);
                textInputLayout9.setVisibility(View.VISIBLE);
                textInputLayout10.setVisibility(View.VISIBLE);
                button10.setVisibility(View.VISIBLE);
                quantity.setVisibility(View.GONE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button2.setText("Ещё раз");
                String[] myString = new String[]{text1, text2};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button3.setText("Ещё раз");
                String[] myString = new String[]{text1, text2, text3};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();
                text4 = textEt4.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button3.setText("Ещё раз");
                String[] myString = new String[]{text1, text2, text3, text4};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();
                text4 = textEt4.getText().toString().trim();
                text5 = textEt5.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button3.setText("Ещё раз");
                String[] myString = new String[]{text1, text2, text3, text4, text5};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();
                text4 = textEt4.getText().toString().trim();
                text5 = textEt5.getText().toString().trim();
                text6 = textEt6.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button3.setText("Ещё раз");
                String[] myString = new String[]{text1, text2, text3, text4, text5, text6};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();
                text4 = textEt4.getText().toString().trim();
                text5 = textEt5.getText().toString().trim();
                text6 = textEt6.getText().toString().trim();
                text7 = textEt7.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button3.setText("Ещё раз");
                String[] myString = new String[]{text1, text2, text3, text4, text5, text6, text7};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();
                text4 = textEt4.getText().toString().trim();
                text5 = textEt5.getText().toString().trim();
                text6 = textEt6.getText().toString().trim();
                text7 = textEt7.getText().toString().trim();
                text8 = textEt8.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button3.setText("Ещё раз");
                String[] myString = new String[]{text1, text2, text3, text4, text5, text6, text7, text8};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();
                text4 = textEt4.getText().toString().trim();
                text5 = textEt5.getText().toString().trim();
                text6 = textEt6.getText().toString().trim();
                text7 = textEt7.getText().toString().trim();
                text8 = textEt8.getText().toString().trim();
                text9 = textEt9.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button3.setText("Ещё раз");
                String[] myString = new String[]{text1, text2, text3, text4, text5, text6, text7, text8, text9};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = textEt1.getText().toString().trim();
                text2 = textEt2.getText().toString().trim();
                text3 = textEt3.getText().toString().trim();
                text4 = textEt4.getText().toString().trim();
                text5 = textEt5.getText().toString().trim();
                text6 = textEt6.getText().toString().trim();
                text7 = textEt7.getText().toString().trim();
                text8 = textEt8.getText().toString().trim();
                text9 = textEt9.getText().toString().trim();
                text10 = textEt10.getText().toString().trim();
                resulTv.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                button3.setText("Ещё раз");
                String[] myString = new String[]{text1, text2, text3, text4, text5, text6, text7, text8, text9, text10};
                int n = (int)Math.floor(Math.random() * myString.length);
                resulTv.setText(myString[n]);
            }
        });
*/


        return v;
    }
}