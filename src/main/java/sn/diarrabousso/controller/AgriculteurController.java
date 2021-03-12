package sn.diarrabousso.controller;

import sn.diarrabousso.repository.RecolteReository;
import sn.diarrabousso.repository.TypeRecolteRepository;
import sn.diarrabousso.repository.jdbc.JdbcBasedTypeRecolteRepository;
import sn.diarrabousso.repository.ram.ArrayBasedTypeRecolteRepository;
import sn.diarrabousso.repository.ram.ListBasedRecolteRepository;
import sn.diarrabousso.service.console.ConsoleDislayServiceAgritech;
import sn.diarrabousso.service.console.ScannerMenuServiceAgritech;
import sn.diarrabousso.service.web.DisplayServiceAgritech;
import sn.diarrabousso.service.web.MenuServiceAgritech;
import sn.diarrabousso.utils.DatabaseHelper;

public class AgriculteurController {
    private static DatabaseHelper db;
    private final DisplayServiceAgritech displayServiceAgritech ;
    private final MenuServiceAgritech scannerMenuServiceAgritech ;



    public AgriculteurController(DisplayServiceAgritech displayServiceAgritech, MenuServiceAgritech scannerMenuServiceAgritech) {
        this.displayServiceAgritech = displayServiceAgritech;

        this.scannerMenuServiceAgritech = scannerMenuServiceAgritech;
        TypeRecolteRepository typeRecolteRepository = new ArrayBasedTypeRecolteRepository();
        RecolteReository recolteReository= new ListBasedRecolteRepository();
        db = DatabaseHelper.getInstance();
        displayServiceAgritech= new ConsoleDislayServiceAgritech(typeRecolteRepository, recolteReository);
        TypeRecolteRepository typeRecolteRepository1 = new JdbcBasedTypeRecolteRepository(db);
        //RecolteReository recolteReository1= new ListBasedRecolteRepository(db);
        //scannerMenuServiceAgritech = new ScannerMenuServiceAgritech(displayServiceAgritech,typeRecolteRepository,recolteReository);
    }

    public void process()
    {
        displayServiceAgritech.messageAccueil();
        displayServiceAgritech.affichageMenuPrincipal();
        displayServiceAgritech.affichageMenuPrincipal();
    }

}
