package com.example.presle_fsinotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Listeeleve extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Etudiant>etudiants;

    public Listeeleve(Context context, ArrayList<Etudiant> etudiant) {
        this.context = context;
        this.etudiants = etudiant;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.eleve_item, parent, false);
        return new EleveItem(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EleveItem vh = (EleveItem) holder;
        Etudiant etudiant = etudiants.get(position);
        vh.id.setText(String.valueOf(etudiant.getId_etu()));
        vh.nom.setText(etudiant.getNom_etu());
        vh.pre.setText(etudiant.getPre_etu());
    }

    @Override
    public int getItemCount() {
        return this.etudiants.size();


    }
    public class EleveItem  extends RecyclerView.ViewHolder {

        TextView id,nom,pre;


        public EleveItem(@NonNull View itemView) {
            super(itemView);
            id =(TextView) itemView.findViewById(R.id.ideleve);
            nom =(TextView) itemView.findViewById(R.id.elevenom);
            pre =(TextView) itemView.findViewById(R.id.elevepre);
        }
    }

}
