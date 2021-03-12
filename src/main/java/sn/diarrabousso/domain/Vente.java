package sn.diarrabousso.domain;

import java.util.Date;

public class Vente {
    private int id;
    private String codevente;
    private String Titrevente;
    private String datevente;
    private DetailVente detailVente;
    private Acheteur acheteur;

    public Vente(int id, Acheteur acheteur) {
        this.id = id;
        this.acheteur = acheteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Acheteur getAcheteur() {
        return acheteur;
    }

    public void setAcheteur(Acheteur acheteur) {
        this.acheteur = acheteur;
    }

    public Vente(String codevente, String titrevente, String datevente, DetailVente detailVente) {
        this.codevente = codevente;
        Titrevente = titrevente;
        this.datevente = datevente;
        this.detailVente = detailVente;
    }

    public String getCodevente() {
        return codevente;
    }

    public void setCodevente(String codevente) {
        this.codevente = codevente;
    }

    public String getTitrevente() {
        return Titrevente;
    }

    public void setTitrevente(String titrevente) {
        Titrevente = titrevente;
    }

    public String getDatevente() {
        return datevente;
    }

    public void setDatevente(String datevente) {
        this.datevente = datevente;
    }

    public DetailVente getDetailVente() {
        return detailVente;
    }

    public void setDetailVente(DetailVente detailVente) {
        this.detailVente = detailVente;
    }
}
