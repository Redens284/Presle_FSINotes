package com.example.presle_fsinotes;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {


    public static  final  String DBNAME ="Fsinotes.db";

    public DBHelper(Context context) {
        super(context,"Fsinotes.db",null,1);

    }


    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table Etudiant(id_etu INTEGER  primary key, nom_etu TEXT, pre_etu TEXT, mai_etu TEXT, lib_clas TEXT, lib_spe TEXT, log_etu TEXT, mdp_etu TEXT)");

        MyDB.execSQL("create Table Bilan( id_bil INTEGER primary key,not_ent DOUBLE,not_dos DOUBLE,not_ora DOUBLE,rem_bil TEXT,not_ent_2 DOUBLE,not_dos_2 DOUBLE,not_ora_2 DOUBLE,rem_bil_2 TEXT,id_etu INTEGER)");

    }
    public boolean insertEtudiant(String nom_etu, String pre_etu, String mai_etu,String lib_clas, String lib_spe,String log_etu, String mdp_etu ) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nom_etu", nom_etu);
        contentValues.put("pre_etu", pre_etu);
        contentValues.put("mai_etu", mai_etu);
        contentValues.put("log_etu", log_etu);
        contentValues.put("mdp_etu", mdp_etu);
        contentValues.put("lib_spe", lib_spe);
        contentValues.put("lib_clas", lib_clas);
        long result = MyDB.insert("Etudiant", null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertBilan(Double not_ent, Double not_dos, Double not_ora, Double not_ent_2, Double not_ora_2, Double not_dos_2, String rem_bil, String rem_bil_2, Integer id_etu) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("not_ent", not_ent);
        contentValues.put("not_dos", not_dos);
        contentValues.put("not_ora", not_ora);
        contentValues.put("not_ent_2", not_ent_2);
        contentValues.put("not_dos_2", not_dos_2);
        contentValues.put("not_ora_2", not_ora_2);
        contentValues.put("rem_bil", rem_bil);
        contentValues.put("rem_bil_2", rem_bil_2);
        contentValues.put("id_etu", id_etu);

        long result = MyDB.insert("Bilan", null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists users");

    }


    public boolean checkusername(String log_etu){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor= MyDB.rawQuery("Select * from Etudiant where log_etu=?",new String[]{log_etu} );
        if (cursor.getCount()>0)
            return  true;
        else
            return  false ;
    }

    public  boolean checkusernamepassword(String log_etu, String mdp_etu ){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor= MyDB.rawQuery("Select * from Etudiant where log_etu=? and mdp_etu= ? ",new String[]{log_etu,mdp_etu} );
        if (cursor.getCount()>0)
            return  true;
        else
            return  false ;
    }




}
