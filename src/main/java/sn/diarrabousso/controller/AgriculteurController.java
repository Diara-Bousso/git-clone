package sn.diarrabousso.controller;

import sn.diarrabousso.repository.*;
import sn.diarrabousso.repository.jdbc.*;
import sn.diarrabousso.repository.ram.*;
import sn.diarrabousso.service.console.ConsoleDislayServiceAgritech;
import sn.diarrabousso.service.console.ScannerMenuServiceAgritech;
import sn.diarrabousso.service.DisplayServiceAgritech;
import sn.diarrabousso.service.MenuServiceAgritech;


import java.util.Scanner;

public class AgriculteurController {
    private DisplayServiceAgritech displayServiceAgritech;
    private MenuServiceAgritech scannerMenuServiceAgritech;

    public AgriculteurController() {
        TypeRecolteRepository typeRecolteRepository = new ArrayBasedTypeRecolteRepository();
        //ServiceRepository serviceRepository=new ArrayBasedServiceRepository();
        Datasource datasource = new MysqlDataSource();
        Scanner scanner = new Scanner(System.in);
       // RecolteReository recolteReository;
        //**//displayServiceAgritech = new ConsoleDislayServiceAgritech(typeRecolteRepository);
        ServiceRepository serviceRepository = new JdbcBasedServiceRepository(datasource);
        TypeRecolteRepository typeRecolteRepository1 = new JdbcBasedTypeRecolteRepository(datasource);
        AgriculteurRepository agriculteurRepository = new JdbcBasedAgriculteurRepository(datasource);
        AcheteurRepository acheteurRepository = new JdbcBasedAcheteurRepository(datasource);
        RecolteReository recolteReository = new ListBasedRecolteRepository();
        //VenteRepository venteRepository=new ListBasedVenteRepository();
        //DetailVenteRepository detailVenteRepository=new ListeBasedDetailVenteRepository();
        ReseauRepository reseauRepository = new ListBasedReseauRepository();
        //InvitationRepository invitationRepository=new ListBasedInvitationRepository();
        //AlerteRepository alerteRepository=new ListBasedAlerteRepository();
        scannerMenuServiceAgritech = new ScannerMenuServiceAgritech(displayServiceAgritech, scanner, recolteReository, typeRecolteRepository1, serviceRepository, agriculteurRepository, acheteurRepository, reseauRepository);
    }

    public void process() {
        displayServiceAgritech.messageAccueil();
        displayServiceAgritech.affichageMenuPrincipal();
        displayServiceAgritech.affichageMenuPrincipal();
    }
}
