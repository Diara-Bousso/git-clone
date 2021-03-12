package sn.diarrabousso.repository;

import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Recolte;
import sn.diarrabousso.domain.TypeRecolte;

public interface RecolteReository {
    Recolte[] getAllByTypeRecolteAgriculteur(TypeRecolte typeRecolte,Agriculteur agriculteur);
    Recolte findByCode(String code);
}
