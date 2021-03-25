package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.repository.AgriculteurRepository;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class JdbcBasedAgriculteurRepository implements AgriculteurRepository {
    private final Datasource datasource;

    public JdbcBasedAgriculteurRepository(Datasource datasource) {
        this.datasource = datasource;
    }

    public Agriculteur[] getAll() {
        //requête sql pour récupèrer les infos
        String query = "SELECT codeagri,nomagri,prenomagri,datenaiss,adresseagri,telagri,emailagri,speciaagri FROM agriculteur";
        //mapper le résultat
        List<Agriculteur> agriculteurs=new ArrayList<Agriculteur>();

        try {
            Connection connection = datasource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                String codeagriculteur = rs.getString("Code de l'agriculteur");
                String nomagri = rs.getString("Nom de l'agriculteur");
                String prenomagri = rs.getString("Prenom de l'agriculteur");
                String datenaiss = rs.getString("Date de naissance de l'agriculteur");
                String adresse = rs.getString("Adresse de l'agriculteur");
                String telephone = rs.getString("Telephone de l'agriculteur");
                String email = rs.getString("Email de l'agriculteur");
                String specialiteagriculteur = rs.getString("Specialite de l'agriculteur");

                Agriculteur agriculteur=new Agriculteur(codeagriculteur,nomagri,prenomagri,datenaiss,adresse,telephone,email,specialiteagriculteur);
                agriculteurs.add(agriculteur);
            }
            return agriculteurs.toArray(new Agriculteur[0]);

        }
        catch (SQLException e) {
            return new Agriculteur[0];
        }
        catch (Exception ex){
            return new Agriculteur[0];
        }
    }

    public Agriculteur getBYCodeAgriculteur(String codeagriculteur) {
        String query = "SELECT codeagri,nomagri,prenomagri,datenaiss,adresseagri,telagri,emailagri,speciaagri from agriculteur where codeagri = ?";
        try {
            Connection connection = datasource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,codeagriculteur);
            ResultSet rs = statement.executeQuery();
            String recupcodeagriculteur = rs.getString("Code de l'agriculteur");
            String recupnomagri = rs.getString("Nom de l'agriculteur");
            String recupprenomagri = rs.getString("Prenom de l'agriculteur");
            String recupdatenaiss = rs.getString("Date de naissance de l'agriculteur");
            String recupadresse = rs.getString("Adresse de l'agriculteur");
            String recuptelephone = rs.getString("Telephone de l'agriculteur");
            String recupemail = rs.getString("Email de l'agriculteur");
            String recupspecialiteagriculteur = rs.getString("Specialite de l'agriculteur");

            Agriculteur agriculteur =new Agriculteur(recupcodeagriculteur,recupnomagri,recupprenomagri,recupdatenaiss,recupadresse,recuptelephone,recupemail,recupspecialiteagriculteur);
            return agriculteur;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
