package sn.diarrabousso.domain;

public class TypeRecolte {
    private String codeTyperecolte;
    private String nomTyperecolte;
    private String descriptionTyperecolte;

    public TypeRecolte(String codeTyperecolte, String nomTyperecolte, String descriptionTyperecolte) {
        this.codeTyperecolte = codeTyperecolte;
        this.nomTyperecolte = nomTyperecolte;
        this.descriptionTyperecolte = descriptionTyperecolte;
    }

    public String getCodeTyperecolte() {
        return codeTyperecolte;
    }

    public void setCodeTyperecolte(String codeTyperecolte) {
        this.codeTyperecolte = codeTyperecolte;
    }

    public String getNomTyperecolte() {
        return nomTyperecolte;
    }

    public void setNomTyperecolte(String nomTyperecolte) {
        this.nomTyperecolte = nomTyperecolte;
    }

    public String getDescriptionTyperecolte() {
        return descriptionTyperecolte;
    }

    public void setDescriptionTyperecolte(String descriptionTyperecolte) {
        this.descriptionTyperecolte = descriptionTyperecolte;
    }
}
