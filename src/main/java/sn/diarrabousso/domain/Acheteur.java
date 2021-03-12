package sn.diarrabousso.domain;

public class Acheteur {
    private int id;
    private String code_acheteur;
    private String noma_cheteur;
    private String prenom_acheteur;
    private String adresse_acheteur;
    private String tel_acheteur;
    private String email;
    private String type_entreprise;
    private String nome_ntreprise;

    public Acheteur(int id, String code_acheteur, String noma_cheteur, String prenom_acheteur, String adresse_acheteur, String tel_acheteur, String email, String type_entreprise, String nome_ntreprise) {
        this.id = id;
        this.code_acheteur = code_acheteur;
        this.noma_cheteur = noma_cheteur;
        this.prenom_acheteur = prenom_acheteur;
        this.adresse_acheteur = adresse_acheteur;
        this.tel_acheteur = tel_acheteur;
        this.email = email;
        this.type_entreprise = type_entreprise;
        this.nome_ntreprise = nome_ntreprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode_acheteur() {
        return code_acheteur;
    }

    public void setCode_acheteur(String code_acheteur) {
        this.code_acheteur = code_acheteur;
    }

    public String getNoma_cheteur() {
        return noma_cheteur;
    }

    public void setNoma_cheteur(String noma_cheteur) {
        this.noma_cheteur = noma_cheteur;
    }

    public String getPrenom_acheteur() {
        return prenom_acheteur;
    }

    public void setPrenom_acheteur(String prenom_acheteur) {
        this.prenom_acheteur = prenom_acheteur;
    }

    public String getAdresse_acheteur() {
        return adresse_acheteur;
    }

    public void setAdresse_acheteur(String adresse_acheteur) {
        this.adresse_acheteur = adresse_acheteur;
    }

    public String getTel_acheteur() {
        return tel_acheteur;
    }

    public void setTel_acheteur(String tel_acheteur) {
        this.tel_acheteur = tel_acheteur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType_entreprise() {
        return type_entreprise;
    }

    public void setType_entreprise(String type_entreprise) {
        this.type_entreprise = type_entreprise;
    }

    public String getNome_ntreprise() {
        return nome_ntreprise;
    }

    public void setNome_ntreprise(String nome_ntreprise) {
        this.nome_ntreprise = nome_ntreprise;
    }
}
