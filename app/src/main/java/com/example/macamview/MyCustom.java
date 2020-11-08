package com.example.macamview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MyCustom extends AppCompatActivity {

    private ListView listView;
    private String[] pemain = new String[]{
            "Cristiano Ronaldo", "Paulo Dybala", "Mario Mandzukic",
            "Miralem Pjanic", "Sami Khadira", "Emre Can", "Claudio Marchisio",
            "Medhi Benatia", "Giorgio Chiellini", "Leonardo Bonuci",
            "Wojciech Szcesny"
    };

    private String [] posisi = new String[]{
            "Striker", "Striker", "Striker",
            "Midfilder", "Mildfilder", "Mildfilder",
            "Defender", "Defender", "Defender",
            "Goal Keeper"
    };

    private int[] number = new int[]{
            7,10,17,5,6,23,8,4,3,19,1
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_custom);

        listView = findViewById(R.id.tvCustom);
        customAdapter adapter = new customAdapter(this, pemain, posisi, number);
        listView.setAdapter(adapter);
    }
}