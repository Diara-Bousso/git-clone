package sn.diarrabousso.repository;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Alerte;
import sn.diarrabousso.domain.Recolte;

public interface AlerteRepository {
    Alerte[] getAllByAgriculteurAcheteurRecolte(Agriculteur agriculteur, Acheteur acheteur, Recolte recolte);
    Alerte findById_Alerte(int id_alerte);
}
