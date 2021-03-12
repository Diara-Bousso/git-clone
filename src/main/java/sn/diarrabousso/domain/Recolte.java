package sn.diarrabousso.domain;

import java.util.Date;

public class Recolte {
    private String code;
    private String nomproduitrecolte;
    private String date;
    private int qterecolte;
    private int qteperdu;
    private boolean etat=false;
    private TypeRecolte typeRecolte;
    private  Agriculteur agriculteur;

    public Recolte(String code, String nomproduitrecolte, String date, int qterecolte, int qteperdu, TypeRecolte typeRecolte, Agriculteur agriculteur) {
        this.code = code;
        this.nomproduitrecolte = nomproduitrecolte;
        this.date = date;
        this.qterecolte = qterecolte;
        this.qteperdu = qteperdu;
        this.typeRecolte = typeRecolte;
        this.agriculteur = agriculteur;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNomproduitrecolte() {
        return nomproduitrecolte;
    }

    public void setNomproduitrecolte(String nomproduitrecolte) {
        this.nomproduitrecolte = nomproduitrecolte;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQterecolte() {
        return qterecolte;
    }

    public void setQterecolte(int qterecolte) {
        this.qterecolte = qterecolte;
    }

    public int getQteperdu() {
        return qteperdu;
    }

    public void setQteperdu(int qteperdu) {
        this.qteperdu = qteperdu;
    }

    public TypeRecolte getTypeRecolte() {
        return typeRecolte;
    }

    public void setTypeRecolte(TypeRecolte typeRecolte) {
        this.typeRecolte = typeRecolte;
    }

    public Agriculteur getAgriculteur() {
        return agriculteur;
    }

    public void setAgriculteur(Agriculteur agriculteur) {
        this.agriculteur = agriculteur;
    }
}
