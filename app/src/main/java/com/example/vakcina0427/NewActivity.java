package com.example.vakcina0427;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        EditText nev = findViewById(R.id.nev);
        EditText szulDatum = findViewById(R.id.szulDatum);
        EditText szigSzam = findViewById(R.id.szigSzam);

        Button regisztral = findViewById(R.id.regisztral);

        regisztral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(NewActivity.this, Regisztralva.class);

                i.putExtra("nev", nev.getText().toString());
                i.putExtra("szulDatum", szulDatum.getText().toString());
                i.putExtra("szigSzam", szigSzam.getText().toString());

                startActivity(i);
            }
        });

    }
}