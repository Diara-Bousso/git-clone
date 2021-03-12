package sn.diarrabousso.repository;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Reseau;

public interface ReseauRepository {
    Reseau[] getAllByAgriculteurAcheteur(Agriculteur agriculteur, Acheteur acheteur);
    Reseau findByID_Reseau(int id_reseau);
}
