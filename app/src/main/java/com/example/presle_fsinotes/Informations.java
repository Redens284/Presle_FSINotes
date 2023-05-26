package com.example.presle_fsinotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Informations extends AppCompatActivity {
    Button retour;
    Button buttondeco;
    Button modif;
    TextView nometu,preetu,maietu,libspe,libclas,adretu,teletu;

    Etudiant etudiant;
    int id;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);
        retour=(Button) findViewById(R.id.buttonretour2);
        buttondeco=(Button)findViewById(R.id.buttondeco);
        modif=(Button)findViewById(R.id.buttonmodif);
        nometu=(TextView)findViewById(R.id.nometu);
        preetu=(TextView)findViewById(R.id.preetu);
        maietu=(TextView)findViewById(R.id.maietu);
        libspe=(TextView)findViewById(R.id.libspe);
        libclas=(TextView)findViewById(R.id.libclas);
        adretu=(TextView)findViewById(R.id.adretu);
        teletu=(TextView)findViewById(R.id.teletu);

        if(getIntent().hasExtra("id_log")){

            id = (int) getIntent().getIntExtra("id_log",0);
            System.out.println(id);

        }
        etudiant = new Etudiant();
        processData();


        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),accueil.class);
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


        modif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),modifInfo.class);
                intent.putExtra("id_log",id);
                startActivity(intent);
            }
        });

    }
    private void processData() {
        Call<Etudiant> call = Controllerapi
                .getInstance()
                .getapietu().getapi(1);

        call.enqueue(new Callback<Etudiant>() {

            public void onResponse(Call<Etudiant> call, Response<Etudiant> response) {
                etudiant = response.body();

                nometu.setText(String.valueOf(etudiant.getNom_etu()));
                preetu.setText(String.valueOf(etudiant.getPre_etu()));
                maietu.setText(String.valueOf(etudiant.getMai_etu()));
                libspe.setText(String.valueOf(etudiant.getLib_spe()));
                libclas.setText(String.valueOf(etudiant.getLib_clas()));
                adretu.setText(String.valueOf(etudiant.getAdr_etu()));
                teletu.setText(String.valueOf(etudiant.getTel_etu()));
            }

            @Override
            public void onFailure(Call<Etudiant> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
                System.out.println(t.toString());
            }

        });
    }
}
