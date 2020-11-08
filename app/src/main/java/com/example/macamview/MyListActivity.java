package com.example.macamview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyListActivity extends AppCompatActivity implements View.OnClickListener{

    private ListView ltView;
    private String[] PlayerName =new String[]{
            "JimiTaufik", "Rofik Asadullah", "Rojul Raka Rai Rangga",
            "Paras Septiani Putri", "Agung Nugroho", "Anas Maulidan",
            "Zulfa Nur Afifah", "Ari Sofyani", "Ari Bake", "Ari Blok"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        Button btBack = findViewById(R.id.btnBack);
        btBack.setOnClickListener(this);

        ltView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String >(MyListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, PlayerName);

        ltView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        Intent backTo = new Intent(MyListActivity.this, MainActivity.class);
        startActivity(backTo);
    }
}