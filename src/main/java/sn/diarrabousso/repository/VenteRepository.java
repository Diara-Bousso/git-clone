package sn.diarrabousso.repository;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.DetailVente;
import sn.diarrabousso.domain.Vente;

public interface VenteRepository {
    Vente[] getAllByDetailVenteAcheteur(DetailVente detailVente, Acheteur acheteur);
    Vente findByVente(int id);
}
