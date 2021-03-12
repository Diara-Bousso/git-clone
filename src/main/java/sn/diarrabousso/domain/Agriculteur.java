package sn.diarrabousso.domain;

import java.lang.String;
import java.util.Date;


public class Agriculteur {

    private  String codeagriculteur;
    private  String nomagri;
    private  String prenomagri;
    private String datenaiss;
    private  String adresse;
    private  String telephone;
    private  String email;
    private  String specialiteagriculteur;


    public Agriculteur(String codeagriculteur, String nomagri, String prenomagri, String datenaiss, String adresse, String telephone, String email, String specialiteagriculteur) {
        this.codeagriculteur = codeagriculteur;
        this.nomagri = nomagri;
        this.prenomagri = prenomagri;
        this.datenaiss = datenaiss;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.specialiteagriculteur = specialiteagriculteur;
    }

    public String getCodeagriculteur() {
        return codeagriculteur;
    }

    public void setCodeagriculteur(String codeagriculteur) {
        this.codeagriculteur = codeagriculteur;
    }

    public String getNomagri() {
        return nomagri;
    }

    public void setNomagri(String nomagri) {
        this.nomagri = nomagri;
    }

    public String getPrenomagri() {
        return prenomagri;
    }

    public void setPrenomagri(String prenomagri) {
        this.prenomagri = prenomagri;
    }

    public String getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(String datenaiss) {
        this.datenaiss = datenaiss;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialiteagriculteur() {
        return specialiteagriculteur;
    }

    public void setSpecialiteagriculteur(String specialiteagriculteur) {
        this.specialiteagriculteur = specialiteagriculteur;
    }
}
