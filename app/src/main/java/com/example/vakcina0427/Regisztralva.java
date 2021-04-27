package com.example.vakcina0427;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Regisztralva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisztralva);

        TextView t1 = findViewById(R.id.t1);
        Bundle extras = getIntent().getExtras();

        if (extras!=null){
            t1.setText("Neved: "+extras.getString("nev")+", Születési dátumod:  "+extras.getString("szulDatum")+", Szigszámod: "+extras.getString("szigSzam"));
        }
    }
}