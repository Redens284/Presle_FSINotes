package com.example.presle_fsinotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class modifInfo extends AppCompatActivity {
    Button retour;
    Button buttondeco;
    Button valide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_info);
        retour=(Button) findViewById(R.id.buttonretour2);
        buttondeco=(Button)findViewById(R.id.buttondeco);
        valide=(Button)findViewById(R.id.buttonvalide);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Informations.class);
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
        //valide.setOnClickListener(new View.OnClickListener() {
        // @Override
        // public void onClick(View v) {
        //       Intent intent = new Intent(getApplicationContext(),.class);
        //       startActivity(intent);

        // });


    }
}