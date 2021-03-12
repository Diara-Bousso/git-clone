package sn.diarrabousso.domain;

import java.util.Date;

public class Invitation {
    private  int id_invitation;
    private  Reseau id_demandeur;
    private  Reseau id_demande;
    private  int etat=0;
    private String date_envois;
    private String date_reception;

    public Invitation(int id_invitation, Reseau id_demandeur, Reseau id_demande, int etat, String date_envois, String date_reception) {
        this.id_invitation = id_invitation;
        this.id_demandeur = id_demandeur;
        this.id_demande = id_demande;
        this.etat = etat;
        this.date_envois = date_envois;
        this.date_reception = date_reception;
    }

    public int getId_invitation() {
        return id_invitation;
    }

    public void setId_invitation(int id_invitation) {
        this.id_invitation = id_invitation;
    }

    public Reseau getId_demandeur() {
        return id_demandeur;
    }

    public void setId_demandeur(Reseau id_demandeur) {
        this.id_demandeur = id_demandeur;
    }

    public Reseau getId_demande() {
        return id_demande;
    }

    public void setId_demande(Reseau id_demande) {
        this.id_demande = id_demande;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public String getDate_envois() {
        return date_envois;
    }

    public void setDate_envois(String date_envois) {
        this.date_envois = date_envois;
    }

    public String getDate_reception() {
        return date_reception;
    }

    public void setDate_reception(String date_reception) {
        this.date_reception = date_reception;
    }
}
