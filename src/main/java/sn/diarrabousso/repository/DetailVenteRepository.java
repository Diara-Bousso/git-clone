package sn.diarrabousso.repository;

import sn.diarrabousso.domain.DetailVente;
import sn.diarrabousso.domain.Recolte;

public interface DetailVenteRepository {
    DetailVente[] getAllByDetailVente(Recolte recolte);
    DetailVente findById(int id);
}
