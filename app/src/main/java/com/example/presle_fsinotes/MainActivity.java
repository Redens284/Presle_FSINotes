package com.example.presle_fsinotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button boutonco;
    EditText login, mdp;
    Etudiant etudiant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boutonco = (Button) findViewById(R.id.buttonConnexion);
        login = (EditText) findViewById(R.id.username1);
        mdp = (EditText) findViewById(R.id.password1);


        boutonco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!login.getText().toString().equals("")&&!mdp.getText().toString().equals("")){
                    processData();

                }




            }
        });

    }
    private void processData() {
        Call<Etudiant> call = Controllerapi
                .getInstance()
                .getapietu().connexion(login.getText().toString(),mdp.getText().toString());

        call.enqueue(new Callback<Etudiant>() {

            public void onResponse(Call<Etudiant> call, Response<Etudiant> response) {
                etudiant = response.body();
                if (etudiant.getId_etu()!=null){


                    Intent intent = new Intent(getApplicationContext(),accueil.class);
                    intent.putExtra("id_log",etudiant.getId_etu());

                    startActivity(intent);

                }


            }

            @Override
            public void onFailure(Call<Etudiant> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
                System.out.println(t.toString());
            }

        });
    }

}
