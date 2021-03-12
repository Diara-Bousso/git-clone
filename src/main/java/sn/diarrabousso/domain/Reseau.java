package sn.diarrabousso.domain;

public class Reseau {
    private int id_reseau;
    private Agriculteur agriculteur;
    private Acheteur acheteur;

    public Reseau(int id_reseau, Agriculteur agriculteur, Acheteur acheteur) {
        this.id_reseau = id_reseau;
        this.agriculteur = agriculteur;
        this.acheteur = acheteur;
    }

    public int getId_reseau() {
        return id_reseau;
    }

    public void setId_reseau(int id_reseau) {
        this.id_reseau = id_reseau;
    }

    public Agriculteur getAgriculteur() {
        return agriculteur;
    }

    public void setAgriculteur(Agriculteur agriculteur) {
        this.agriculteur = agriculteur;
    }

    public Acheteur getAcheteur() {
        return acheteur;
    }

    public void setAcheteur(Acheteur acheteur) {
        this.acheteur = acheteur;
    }
}
