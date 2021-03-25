package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.repository.AcheteurRepository;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class JdbcBasedAcheteurRepository implements AcheteurRepository {
    private final Datasource datasource;

    public JdbcBasedAcheteurRepository(Datasource datasource) {
        this.datasource = datasource;
    }

    public Acheteur[] getAll() {
        //requête sql pour récupèrer les infos
        String query = "SELECT idacheteur,codeacheteur,nomacheteur,prenomacheteur,adresseacheteur,telacheteur,emailacheteur,typeentreprise,nomentreprise FROM acheteur";
        //mapper le résultat
        List<Acheteur> acheteurs=new ArrayList<Acheteur>();

        try {
            Connection connection = datasource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                int idacheteur= rs.getInt("Id de l'acheteur");
                String code = rs.getString("Code de l'acheteur");
                String nom = rs.getString("Nom de l'acheteur");
                String prenom = rs.getString("Prenom de l'acheteur");
                String adresse = rs.getString("Adresse de l'acheteir");
                String telephone = rs.getString("Telephone de l'acheteur");
                String email = rs.getString("Email de l'acheteur");
                String typeentreprise = rs.getString("Specialite de l'entreprise");
                String nomentreprise = rs.getString("Entreprise");

                Acheteur acheteur=new Acheteur(idacheteur,code,nom,prenom,adresse,telephone,email,typeentreprise,nomentreprise);
                acheteurs.add(acheteur);
            }
            return acheteurs.toArray(new Acheteur[0]);

        }
        catch (SQLException e) {
            return new Acheteur[0];
        }
        catch (Exception ex){
            return new Acheteur[0];
        }
    }

    public Acheteur getById(int id) {
        String query = "SELECT idacheteur,codeacheteur,nomacheteur,prenomacheteur,adresseacheteur,telacheteur,emailacheteur,typeentreprise,nomentreprise from agriculteur where idacheteur = ?";
        try {
            Connection connection = datasource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            int recupidacheteur= rs.getInt("Id de l'acheteur");
            String recupcode = rs.getString("Code de l'acheteur");
            String recupnom = rs.getString("Nom de l'acheteur");
            String recupprenom = rs.getString("Prenom de l'acheteur");
            String recupadresse = rs.getString("Adresse de l'acheteir");
            String recuptelephone = rs.getString("Telephone de l'acheteur");
            String recupemail = rs.getString("Email de l'acheteur");
            String recuptypeentreprise = rs.getString("Specialite de l'entreprise");
            String recupnomentreprise = rs.getString("Entreprise");

            Acheteur acheteur=new Acheteur(recupidacheteur,recupcode,recupnom,recupprenom,recupadresse,recuptelephone,recupemail,recuptypeentreprise,recupnomentreprise);
            return acheteur;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}

