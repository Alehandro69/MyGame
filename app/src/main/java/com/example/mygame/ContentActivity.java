package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.mygame.fragment.CardRandomFragment;
import com.example.mygame.fragment.CasinoRandomFragment;
import com.example.mygame.fragment.CoinRandomFragment;
import com.example.mygame.fragment.CountryRandomFragment;
import com.example.mygame.fragment.DateRandomFragment;
import com.example.mygame.fragment.NumberRandomFragment;
import com.example.mygame.fragment.SymbolRandomFragment;
import com.example.mygame.fragment.TextRandomFragment;
import com.example.mygame.fragment.YesOrNotRandomFragment;

import java.sql.DatabaseMetaData;

public class ContentActivity extends AppCompatActivity {


    TextRandomFragment frag1;
    NumberRandomFragment frag2;
    CasinoRandomFragment frag3;
    CardRandomFragment frag4;
    YesOrNotRandomFragment frag5;
    CoinRandomFragment frag6;
    SymbolRandomFragment frag7;
    DateRandomFragment frag8;
    CountryRandomFragment frag9;
    /*YesOrNotRandomFragment frag10;
    YesOrNotRandomFragment frag11;
    YesOrNotRandomFragment frag12;*/
    FragmentTransaction fTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        fTrans = getSupportFragmentManager().beginTransaction();

        frag1 = new TextRandomFragment();
        frag2 = new NumberRandomFragment();
        frag3 = new CasinoRandomFragment();
        frag4 = new CardRandomFragment();
        frag5 = new YesOrNotRandomFragment();
        frag6 = new CoinRandomFragment();
        frag7 = new SymbolRandomFragment();
        frag8 = new DateRandomFragment();
        frag9 = new CountryRandomFragment();

        Bundle arguments = getIntent().getExtras();
        String fragment = arguments.get("Fragment").toString();

        if(fragment.equals("frag1")){
            fTrans.replace(R.id.frgmCont, frag1);
        }else if(fragment.equals("frag2")){
            fTrans.replace(R.id.frgmCont, frag2);
        }else if(fragment.equals("frag3")){
            fTrans.replace(R.id.frgmCont, frag3);
        }else if(fragment.equals("frag4")){
            fTrans.replace(R.id.frgmCont, frag4);
        }else if(fragment.equals("frag5")){
            fTrans.replace(R.id.frgmCont, frag5);
        }else if(fragment.equals("frag6")){
            fTrans.replace(R.id.frgmCont, frag6);
        }else if(fragment.equals("frag7")){
            fTrans.replace(R.id.frgmCont, frag7);
        }else if(fragment.equals("frag8")){
            fTrans.replace(R.id.frgmCont, frag8);
        }else if(fragment.equals("frag9")){
            fTrans.replace(R.id.frgmCont, frag9);
        }
        fTrans.commit();
    }
}