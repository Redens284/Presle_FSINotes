package com.example.presle_fsinotes;

import java.sql.Date;   

public class Bilan {

    private Integer id_bil;
    private String dat_bil;
    private Double  not_ent;
    private Double  not_dos;
    private Double  not_ora;
    private String  rem_bil;
    private String dat_bil_2;
    private Integer id_etu;
    private Double   not_ent_2;
    private Double   not_bil_2;
    private Double  not_dos_2;
    private Double  not_ora_2;
    private String rem_bil_2;

    public Bilan(Integer id_bil, String dat_bil, Double not_ent, Double not_dos, Double not_ora, String rem_bil, String dat_bil_2, Integer id_etu, Double not_ent_2, Double not_bil_2, Double not_dos_2, Double not_ora_2, String rem_bil_2) {
        this.id_bil = id_bil;
        this.dat_bil = dat_bil;
        this.not_ent = not_ent;
        this.not_dos = not_dos;
        this.not_ora = not_ora;
        this.rem_bil = rem_bil;
        this.dat_bil_2 = dat_bil_2;
        this.id_etu = id_etu;
        this.not_ent_2 = not_ent_2;
        this.not_bil_2 = not_bil_2;
        this.not_dos_2 = not_dos_2;
        this.not_ora_2 = not_ora_2;
        this.rem_bil_2 = rem_bil_2;
    }

    public Integer getId_bil() {
        return id_bil;
    }

    public void setId_bil(Integer id_bil) {
        this.id_bil = id_bil;
    }

    public String getDat_bil() {
        return dat_bil;
    }

    public void setDat_bil(String dat_bil) {
        this.dat_bil = dat_bil;
    }

    public Double getNot_ent() {
        return not_ent;
    }

    public void setNot_ent(Double not_ent) {
        this.not_ent = not_ent;
    }

    public Double getNot_dos() {
        return not_dos;
    }

    public void setNot_dos(Double not_dos) {
        this.not_dos = not_dos;
    }

    public Double getNot_ora() {
        return not_ora;
    }

    public void setNot_ora(Double not_ora) {
        this.not_ora = not_ora;
    }

    public String getRem_bil() {
        return rem_bil;
    }

    public void setRem_bil(String rem_bil) {
        this.rem_bil = rem_bil;
    }

    public String getDat_bil_2() {
        return dat_bil_2;
    }

    public void setDat_bil_2(String dat_bil_2) {
        this.dat_bil_2 = dat_bil_2;
    }

    public Integer getId_etu() {
        return id_etu;
    }

    public void setId_etu(Integer id_etu) {
        this.id_etu = id_etu;
    }

    public Double getNot_ent_2() {
        return not_ent_2;
    }

    public void setNot_ent_2(Double not_ent_2) {
        this.not_ent_2 = not_ent_2;
    }

    public Double getNot_bil_2() {
        return not_bil_2;
    }

    public void setNot_bil_2(Double not_bil_2) {
        this.not_bil_2 = not_bil_2;
    }

    public Double getNot_dos_2() {
        return not_dos_2;
    }

    public void setNot_dos_2(Double not_dos_2) {
        this.not_dos_2 = not_dos_2;
    }

    public Double getNot_ora_2() {
        return not_ora_2;
    }

    public void setNot_ora_2(Double not_ora_2) {
        this.not_ora_2 = not_ora_2;
    }

    public String getRem_bil_2() {
        return rem_bil_2;
    }

    public void setRem_bil_2(String rem_bil_2) {
        this.rem_bil_2 = rem_bil_2;
    }

    @Override
    public String toString() {
        return "Bilan{" +
                "id_bil=" + id_bil +
                ", dat_bil='" + dat_bil + '\'' +
                ", not_ent=" + not_ent +
                ", not_dos=" + not_dos +
                ", not_ora=" + not_ora +
                ", rem_bil='" + rem_bil + '\'' +
                ", dat_bil_2='" + dat_bil_2 + '\'' +
                ", id_etu=" + id_etu +
                ", not_ent_2=" + not_ent_2 +
                ", not_bil_2=" + not_bil_2 +
                ", not_dos_2=" + not_dos_2 +
                ", not_ora_2=" + not_ora_2 +
                ", rem_bil_2='" + rem_bil_2 + '\'' +
                '}';
    }
}
