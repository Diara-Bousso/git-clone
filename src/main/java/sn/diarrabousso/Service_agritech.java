package sn.diarrabousso;

import sn.diarrabousso.controller.AgriculteurController;
import sn.diarrabousso.service.DisplayServiceAgritech;
import sn.diarrabousso.service.MenuServiceAgritech;

public class Service_agritech {
    public static void main(String[] args)
    {
        System.out.println("Démarrage de l'application ");
        //DisplayServiceAgritech displayServiceAgritech = null;
        //MenuServiceAgritech scannerMenuServiceAgritech = null;
        AgriculteurController agriculteurController=new AgriculteurController();
        agriculteurController.process();
    }
}
