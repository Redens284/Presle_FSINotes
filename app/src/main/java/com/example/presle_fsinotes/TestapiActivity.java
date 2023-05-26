package com.example.presle_fsinotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestapiActivity extends AppCompatActivity {
     private Api api;

     private RecyclerView recyclerView;

     private Listeeleve listeeleve;

     ArrayList<Etudiant>etudiants;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.rvapi);
        processData();
    }

    private void processData() {
        Call<ArrayList<Etudiant>> call = Controllerapi
                .getInstance()
                .getapietu().getData();


        call.enqueue(new Callback<ArrayList<Etudiant>>() {

            @Override
            public void onResponse(Call<ArrayList<Etudiant>> call, Response<ArrayList<Etudiant>> response) {
                etudiants = response.body();

                recyclerView.setHasFixedSize(true);
                LinearLayoutManager manager = new LinearLayoutManager(TestapiActivity.this);
                recyclerView.setLayoutManager(manager);
                listeeleve = new Listeeleve(TestapiActivity.this, etudiants);
                recyclerView.setAdapter(listeeleve);
                listeeleve.notifyDataSetChanged();

                for(Etudiant e:etudiants){
                    System.out.println(e.getNom_etu());
                }

            }

            @Override
            public void onFailure(Call<ArrayList<Etudiant>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
                System.out.println(t.toString());
            }
        });


    }
}
