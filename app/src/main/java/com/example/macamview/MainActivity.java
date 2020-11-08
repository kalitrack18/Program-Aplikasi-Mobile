package com.example.macamview;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button listView = findViewById(R.id.btnList);
        listView.setOnClickListener(this);

        Button customView = findViewById(R.id.btnCustom);
        customView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Class<?> tClass = null;
        if(view.getId() == R.id.btnList){
            tClass = MyListActivity.class;
        }else if(view.getId() == R.id.btnCustom){
            tClass = MyCustom.class;
        }

        Intent intent = new Intent(this,tClass);
        startActivity(intent);

    }
}