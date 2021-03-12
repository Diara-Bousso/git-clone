package sn.diarrabousso.service.web;

import sn.diarrabousso.domain.TypeRecolte;

public interface DisplayServiceAgritech {
    void messageAccueil();

    void affichageMenuPrincipal();

    void afficherListeTypeRecote(TypeRecolte[] typeRecoltes);

    void AjouterRecolte();

    void afficherChoixInconnue();

    void ListeDeMesRecoltes();

    void RechercherUneDeMesRecoltes();

    void ACtivationDesactivationRecolte();
}
