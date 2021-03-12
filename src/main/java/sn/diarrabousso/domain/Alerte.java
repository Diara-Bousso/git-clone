package sn.diarrabousso.domain;

public class Alerte {
    private int id_alerte;
    private String code_alerte;
    private Agriculteur agriculteur;
    private Acheteur acheteur;
    private String titre_alerte;
    private String description_alerte;
    private String type_alerte;
    private int etat_alerte=0;
    private Recolte recolte;

    public Alerte(int id_alerte, String code_alerte, Agriculteur agriculteur, Acheteur acheteur, String titre_alerte, String description_alerte, String type_alerte, int etat_alerte, Recolte recolte) {
        this.id_alerte = id_alerte;
        this.code_alerte = code_alerte;
        this.agriculteur = agriculteur;
        this.acheteur = acheteur;
        this.titre_alerte = titre_alerte;
        this.description_alerte = description_alerte;
        this.type_alerte = type_alerte;
        this.etat_alerte = etat_alerte;
        this.recolte = recolte;
    }

    public int getId_alerte() {
        return id_alerte;
    }

    public void setId_alerte(int id_alerte) {
        this.id_alerte = id_alerte;
    }

    public String getCode_alerte() {
        return code_alerte;
    }

    public void setCode_alerte(String code_alerte) {
        this.code_alerte = code_alerte;
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

    public String getTitre_alerte() {
        return titre_alerte;
    }

    public void setTitre_alerte(String titre_alerte) {
        this.titre_alerte = titre_alerte;
    }

    public String getDescription_alerte() {
        return description_alerte;
    }

    public void setDescription_alerte(String description_alerte) {
        this.description_alerte = description_alerte;
    }

    public String getType_alerte() {
        return type_alerte;
    }

    public void setType_alerte(String type_alerte) {
        this.type_alerte = type_alerte;
    }

    public int getEtat_alerte() {
        return etat_alerte;
    }

    public void setEtat_alerte(int etat_alerte) {
        this.etat_alerte = etat_alerte;
    }

    public Recolte getRecolte() {
        return recolte;
    }

    public void setRecolte(Recolte recolte) {
        this.recolte = recolte;
    }
}
