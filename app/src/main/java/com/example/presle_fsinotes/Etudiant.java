package com.example.presle_fsinotes;

public class Etudiant {

    private Integer id_etu;
    private String nom_etu;
    private String pre_etu;
    private String mai_etu;
    private String adr_etu;
    private Integer cp_etu;
    private String vil_etu;
    private String tel_etu;
    private String lib_clas;
    private String lib_spe;
    private Integer id_res;
    private Integer id_ent;
    private String log_etu;
    private String mdp_etu;

    public Etudiant(Integer id_etu, String nom_etu, String pre_etu, String mai_etu, String adr_etu, Integer cp_etu, String vil_etu, String tel_etu, String lib_clas, String lib_spe, Integer id_res, Integer id_ent, String log_etu, String mdp_etu) {
        this.id_etu = id_etu;
        this.nom_etu = nom_etu;
        this.pre_etu = pre_etu;
        this.mai_etu = mai_etu;
        this.adr_etu = adr_etu;
        this.cp_etu = cp_etu;
        this.vil_etu = vil_etu;
        this.tel_etu = tel_etu;
        this.lib_clas = lib_clas;
        this.lib_spe = lib_spe;
        this.id_res = id_res;
        this.id_ent = id_ent;
        this.log_etu = log_etu;
        this.mdp_etu = mdp_etu;
    }

    public Etudiant() {

    }


    public Integer getId_etu() {
        return id_etu;
    }

    public void setId_etu(Integer id_etu) {
        this.id_etu = id_etu;
    }

    public String getNom_etu() {
        return nom_etu;
    }

    public void setNom_etu(String nom_etu) {
        this.nom_etu = nom_etu;
    }

    public String getPre_etu() {
        return pre_etu;
    }

    public void setPre_etu(String pre_etu) {
        this.pre_etu = pre_etu;
    }

    public String getMai_etu() {
        return mai_etu;
    }

    public void setMai_etu(String mai_etu) {
        this.mai_etu = mai_etu;
    }

    public String getAdr_etu() {
        return adr_etu;
    }

    public void setAdr_etu(String adr_etu) {
        this.adr_etu = adr_etu;
    }

    public Integer getCp_etu() {
        return cp_etu;
    }

    public void setCp_etu(Integer cp_etu) {
        this.cp_etu = cp_etu;
    }

    public String getVil_etu() {
        return vil_etu;
    }

    public void setVil_etu(String vil_etu) {
        this.vil_etu = vil_etu;
    }

    public String getTel_etu() {
        return tel_etu;
    }

    public void setTel_etu(String tel_etu) {
        this.tel_etu = tel_etu;
    }

    public String getLib_clas() {
        return lib_clas;
    }

    public void setLib_clas(String lib_clas) {
        this.lib_clas = lib_clas;
    }

    public String getLib_spe() {
        return lib_spe;
    }

    public void setLib_spe(String lib_spe) {
        this.lib_spe = lib_spe;
    }

    public Integer getId_res() {
        return id_res;
    }

    public void setId_res(Integer id_res) {
        this.id_res = id_res;
    }

    public Integer getId_ent() {
        return id_ent;
    }

    public void setId_ent(Integer id_ent) {
        this.id_ent = id_ent;
    }

    public String getLog_etu() {
        return log_etu;
    }

    public void setLog_etu(String log_etu) {
        this.log_etu = log_etu;
    }

    public String getMdp_etu() {
        return mdp_etu;
    }

    public void setMdp_etu(String mdp_etu) {
        this.mdp_etu = mdp_etu;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id_etu=" + id_etu +
                ", nom_etu='" + nom_etu + '\'' +
                ", pre_etu='" + pre_etu + '\'' +
                ", mai_etu='" + mai_etu + '\'' +
                ", adr_etu='" + adr_etu + '\'' +
                ", cp_etu=" + cp_etu +
                ", vil_etu='" + vil_etu + '\'' +
                ", tel_etu='" + tel_etu + '\'' +
                ", lib_clas='" + lib_clas + '\'' +
                ", lib_spe='" + lib_spe + '\'' +
                ", id_res=" + id_res +
                ", id_ent=" + id_ent +
                ", log_etu='" + log_etu + '\'' +
                ", mdp_etu='" + mdp_etu + '\'' +
                '}';
    }
}
