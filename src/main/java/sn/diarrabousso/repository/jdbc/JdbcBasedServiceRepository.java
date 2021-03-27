package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Service;
import sn.diarrabousso.repository.ServiceRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcBasedServiceRepository implements ServiceRepository {
    private  final Datasource datasource;

    public JdbcBasedServiceRepository(Datasource datasource) {
        this.datasource = datasource;
    }

    public Service[] getAll(){
        //requête sql pour récupèrer les infos
        String query = "SELECT codeserv,nomserv,descriptionserv FROM service";
        //mapper le résultat
        List<Service> services=new ArrayList<Service>();

        try {
            Connection connection = datasource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                String codeserv = rs.getString("Code service");
                String nomserv = rs.getString("Nom service");
                String descriptionserv = rs.getString("Description service");
                //mapping retour db (relationnel) avec objet Prestation
                Service service=new Service(codeserv,nomserv,descriptionserv);
                services.add(service);
            }
            return services.toArray(new Service[0]);

        }
        catch (SQLException e) {
            return new Service[0];
        }
        catch (Exception ex){
            return new Service[0];
        }
    }

    @Override
    public Service getByCode(String code) {
        String query = "SELECT codeserv, nomserv, descriptionserv from service where codeserv = ?";
        try {
            Connection connection = datasource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,code);
            ResultSet rs = statement.executeQuery();
            String recupCodeserv= rs.getString("Code du service");
            String recupNomserv= rs.getString("Nom du service");
            String recupDescriptionserv= rs.getString("Description du service");
            Service service =new Service(recupCodeserv,recupNomserv,recupDescriptionserv);
            return service;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
