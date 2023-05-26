package com.example.presle_fsinotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class bilan1 extends AppCompatActivity {
    Etudiant etudiant;
    Bilan bilan ;
    Button retour;
    Button buttondeco;
    TextView notent1,notdos1,notora1,rembil1;
    int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilan1);
        retour=(Button) findViewById(R.id.buttonretour2);
        buttondeco=(Button)findViewById(R.id.buttondeco);
        notent1=(TextView)findViewById(R.id.notent1);
        notdos1=(TextView)findViewById(R.id.notdos1);
        notora1=(TextView)findViewById(R.id.notora1);
        rembil1=(TextView)findViewById(R.id.rembil1);

        if(getIntent().hasExtra("id_log")){

            id = (int) getIntent().getIntExtra("id_log",0);


        }
        processData();






        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),select_bilan.class);
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
    private void processData() {
        Call<Bilan> call = Controllerapi
                .getInstance()
                .bilan()
                .getbilan(1);

        call.enqueue(new Callback<Bilan>() {
            @Override
            public void onResponse(Call<Bilan> call, Response<Bilan> response) {
                bilan = response.body();

                notdos1.setText(String.valueOf(bilan.getNot_dos()));
                notent1.setText(String.valueOf(bilan.getNot_ent()));
                notora1.setText(String.valueOf(bilan.getNot_ora()));
                rembil1.setText(bilan.getRem_bil());


            }

            @Override
            public void onFailure(Call<Bilan> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
                System.out.println(t.toString());
            }


        });
    }
}