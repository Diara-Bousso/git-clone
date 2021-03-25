package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.TypeRecolte;
import sn.diarrabousso.repository.TypeRecolteRepository;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class JdbcBasedTypeRecolteRepository implements TypeRecolteRepository {
    private final Datasource datasource;

    public JdbcBasedTypeRecolteRepository(Datasource datasource) {
        this.datasource= datasource;
    }
    public TypeRecolte[] getAll() {

        //requête sql pour récupèrer les infos
        String query = "SELECT codetr,nomtr,descriptiontr FROM typerecolte";
        //mapper le résultat
        List<TypeRecolte> typeRecoltes=new ArrayList<TypeRecolte>();

        try {
            Connection connection = datasource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                String code = rs.getString("Code type de recolte");
                String nom = rs.getString("Type de recolte");
                String description = rs.getString("Description du type de recolte");
                //mapping retour db (relationnel) avec objet Prestation
                TypeRecolte typeRecolte=new TypeRecolte(code,nom,description);
                typeRecoltes.add(typeRecolte);
            }
            return typeRecoltes.toArray(new TypeRecolte[0]);

        }
        catch (SQLException e) {
            return new TypeRecolte[0];
        }
        catch (Exception ex){
            return new TypeRecolte[0];
        }
    }

    public TypeRecolte getByCode(String code) {
        String query = "SELECT codetr, nomtr, descriptiontr from typerecolte where codetr = ?";
        try {
            Connection connection = datasource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,code);
            ResultSet rs = statement.executeQuery();
            String recupCode= rs.getString("Code type recolte");
            String recupNom= rs.getString("Type de recolte");
            String recupDescription= rs.getString("Description type recolte");
            TypeRecolte typeRecolte =new TypeRecolte(recupCode,recupNom,recupDescription);
            return typeRecolte;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
