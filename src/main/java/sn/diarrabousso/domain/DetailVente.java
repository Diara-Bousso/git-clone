package sn.diarrabousso.domain;

public class DetailVente {
    private int id;
    private String codedetailvente;
    private Recolte recolte;
    private int quantitevendu;
    private int prixvente;

    public DetailVente(int id, String codedetailvente, Recolte recolte, int quantitevendu, int prixvente) {
        this.id = id;
        this.codedetailvente = codedetailvente;
        this.recolte = recolte;
        this.quantitevendu = quantitevendu;
        this.prixvente = prixvente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodedetailvente() {
        return codedetailvente;
    }

    public void setCodedetailvente(String codedetailvente) {
        this.codedetailvente = codedetailvente;
    }

    public Recolte getRecolte() {
        return recolte;
    }

    public void setRecolte(Recolte recolte) {
        this.recolte = recolte;
    }

    public int getQuantitevendu() {
        return quantitevendu;
    }

    public void setQuantitevendu(int quantitevendu) {
        this.quantitevendu = quantitevendu;
    }

    public int getPrixvente() {
        return prixvente;
    }

    public void setPrixvente(int prixvente) {
        this.prixvente = prixvente;
    }
}
