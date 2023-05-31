package com.example.presle_fsinotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class accueil extends AppCompatActivity {
    Button buttonNote ;
    Button buttonInfo;
    Button buttondeco;
    int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        buttonNote=(Button)findViewById(R.id.buttonNotes);
        buttonInfo=(Button)findViewById(R.id.buttonInfo);
        buttondeco=(Button)findViewById(R.id.buttondeco);

        if(getIntent().hasExtra("id_log")){

            id = (int) getIntent().getIntExtra("id_log",0);
            System.out.println(id);
        }

        buttonNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),select_bilan.class);
                intent.putExtra("id_log",id);
                startActivity(intent);
            }

        });

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Informations.class);
                intent.putExtra("id_log",id);
                startActivity(intent);
            }
        });
        buttondeco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("id_log",id);
                startActivity(intent);
            }
        });
    }
}