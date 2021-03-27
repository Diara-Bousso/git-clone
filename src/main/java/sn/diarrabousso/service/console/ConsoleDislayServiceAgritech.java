package sn.diarrabousso.service.console;

//import sn.diarrabousso.domain.DetailVente;
import sn.diarrabousso.domain.Service;
import sn.diarrabousso.domain.TypeRecolte;
import sn.diarrabousso.repository.*;
import sn.diarrabousso.service.DisplayServiceAgritech;

public class ConsoleDislayServiceAgritech implements DisplayServiceAgritech {


    private  final RecolteReository recolteReository;
    private final TypeRecolteRepository typeRecolteRepository;
    private  final VenteRepository venteRepository;
    private final DetailVenteRepository detailVenteRepository;
    private final ReseauRepository reseauRepository;
    private final InvitationRepository invitationRepository;
    private final AlerteRepository alerteRepository;

    public ConsoleDislayServiceAgritech(TypeRecolteRepository typeRecolteRepository, RecolteReository recolteReository, VenteRepository venteRepository, DetailVenteRepository detailVenteRepository, ReseauRepository reseauRepository, InvitationRepository invitationRepository, AlerteRepository alerteRepository){

        this.recolteReository = recolteReository;
        this.typeRecolteRepository = typeRecolteRepository;
        this.venteRepository = venteRepository;
        this.detailVenteRepository = detailVenteRepository;
        this.reseauRepository = reseauRepository;
        this.invitationRepository = invitationRepository;
        this.alerteRepository = alerteRepository;
    }


    public void messageAccueil(){
        System.out.println("Bienvenue sur votre plateforme Agri-Tech");
    }

    public void affichageMenuPrincipal(){
        System.out.println("> M pour le menu principal ");
    }

    public void afficherListeServices(Service [] services)
    {
        System.out.println("Les services disponibles sont:");
        for (int i = 0; i < services.length; i++) {
            Service service = services[i];
            System.out.println(String.format("> %s %s", service.getCode(), service.getNom()));
        }
    }

    @Override
    public void afficherListeTypeRecote(TypeRecolte[] typeRecoltes) {
        System.out.println("Les types de récolte disponibles sont:");
        for (int i = 0; i < typeRecoltes.length; i++) {
            TypeRecolte typeRecolte = typeRecoltes[i];
            System.out.println(String.format("> %s %s", typeRecolte.getCodeTyperecolte(), typeRecolte.getNomTyperecolte(),typeRecolte.getDescriptionTyperecolte()));
        }
    }

    @Override
    public void afficherChoixInconnue() {

    }

    @Override
    public void afficherListeService(Service[] services) {

    }

    @Override
    public void afficherListeVente() {

    }
}
