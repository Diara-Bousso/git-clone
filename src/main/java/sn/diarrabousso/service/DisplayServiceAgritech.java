package sn.diarrabousso.service;

import sn.diarrabousso.domain.Service;
import sn.diarrabousso.domain.TypeRecolte;

public interface DisplayServiceAgritech {
    void messageAccueil();

    void affichageMenuPrincipal();

    void afficherListeTypeRecote(TypeRecolte[] typeRecoltes);

    void afficherChoixInconnue();

    void afficherListeService(Service[] services);

    void afficherListeVente();
}
