package sn.diarrabousso.service.console;

//import sn.diarrabousso.domain.DetailVente;
import sn.diarrabousso.domain.Service;
import sn.diarrabousso.domain.TypeRecolte;
import sn.diarrabousso.repository.DetailVenteRepository;
import sn.diarrabousso.repository.RecolteReository;
import sn.diarrabousso.repository.TypeRecolteRepository;
import sn.diarrabousso.service.web.DisplayServiceAgritech;

public class ConsoleDislayServiceAgritech implements DisplayServiceAgritech {


    private  final RecolteReository recolteReository;
    private final TypeRecolteRepository typeRecolteRepository;

    public ConsoleDislayServiceAgritech( TypeRecolteRepository typeRecolteRepository,RecolteReository recolteReository){

        this.recolteReository = recolteReository;
        this.typeRecolteRepository = typeRecolteRepository;
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
    public void AjouterRecolte() {

    }

    @Override
    public void afficherChoixInconnue() {

    }

    @Override
    public void ListeDeMesRecoltes() {

    }

    @Override
    public void RechercherUneDeMesRecoltes() {

    }

    @Override
    public void ACtivationDesactivationRecolte() {

    }
}
