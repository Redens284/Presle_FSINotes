package com.example.presle_fsinotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_bilan extends AppCompatActivity {
   Button buttonBilan1;
   Button buttonBilan2;
   Button retour;
    Button buttondeco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bilan);

        buttonBilan1=(Button)findViewById(R.id.buttonbilan1);
        buttonBilan2=(Button)findViewById(R.id.buttonbilan2);
        buttondeco=(Button)findViewById(R.id.buttondeco);
        retour=(Button)findViewById(R.id.buttonretour2) ;


        buttonBilan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),bilan1.class);
                startActivity(intent);
            }
        });

        buttonBilan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),bilan2.class);
                startActivity(intent);
            }
        });

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),accueil.class);
                startActivity(intent);

            }
        });
        buttondeco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });




    }
}