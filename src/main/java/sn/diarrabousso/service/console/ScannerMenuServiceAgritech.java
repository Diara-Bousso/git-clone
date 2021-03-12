package sn.diarrabousso.service.console;

import sn.diarrabousso.domain.Recolte;
import sn.diarrabousso.domain.TypeRecolte;
import sn.diarrabousso.repository.*;
import sn.diarrabousso.service.web.DisplayServiceAgritech;
import sn.diarrabousso.service.web.MenuServiceAgritech;

import java.util.Scanner;

public class ScannerMenuServiceAgritech implements MenuServiceAgritech {
    private final DisplayServiceAgritech displayServiceAgritech;
    private final Scanner scanner;
    private final RecolteReository recolteReository;
    private final TypeRecolteRepository typeRecolteRepository;



    public ScannerMenuServiceAgritech(DisplayServiceAgritech displayServiceAgritech, Scanner scanner, RecolteReository recolteReository, TypeRecolteRepository typeRecolteRepository) {
        this.displayServiceAgritech = displayServiceAgritech;
        this.scanner = new Scanner(System.in);
        this.recolteReository = recolteReository;
        this.typeRecolteRepository = typeRecolteRepository;

    }
    private String lireChoix(){ return scanner.next(); }


    public void affichageMenuPrincipal(String choix) {
        TypeRecolte [] typeRecoltes= typeRecolteRepository.getAll();
        if("tr".equalsIgnoreCase(choix))
        {
            displayServiceAgritech.afficherListeTypeRecote(typeRecoltes);
            String codeTypeRecolte = scanner.next();
            Recolte recolte = recolteReository.findByCode(codeTypeRecolte);
            if ("CODE-TR" == codeTypeRecolte)
            {
                System.out.println("Nouvelle récolte");
                System.out.println(">>> 1 Ajouter une récolte");
                System.out.println(">>> 2 Liste des récoltes");
                System.out.println(">>> 3 Rechercher une récolte");
                System.out.println(">>> 3 Activation/Desactivation ");
                String nvllerecolte = scanner.next();
                if ("1".equalsIgnoreCase(nvllerecolte)) {
                    System.out.println("Nouvelle récolte");
                    displayServiceAgritech.AjouterRecolte();
                }
                if ("2".equalsIgnoreCase(nvllerecolte)) {
                    System.out.println("Liste de mes récolte");
                    displayServiceAgritech.ListeDeMesRecoltes();
                }
                if ("3".equalsIgnoreCase(nvllerecolte)) {
                    System.out.println("Rechercher une récolte");
                    displayServiceAgritech.RechercherUneDeMesRecoltes();
                }
                if ("4".equalsIgnoreCase(nvllerecolte)) {
                    System.out.println("Activation/Desactivation récolte");
                    displayServiceAgritech.ACtivationDesactivationRecolte();
                }
            }

        }
        else {
            displayServiceAgritech.afficherChoixInconnue();
        }
    }

    @Override
    public void affichageMenuPrincipal() {
        String choix = lireChoix();
        affichageMenuPrincipal(choix);

    }

    //private final

}
