package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Recolte;
import sn.diarrabousso.domain.TypeRecolte;
import sn.diarrabousso.repository.RecolteReository;

public class JdbcBasedRecolteRepository implements RecolteReository {
    public Recolte[] getAllByTypeRecolteAgriculteur(TypeRecolte typeRecolte, Agriculteur agriculteur) {
        return new Recolte[0];
    }

    public Recolte findByCode(String code) {
        return null;
    }
}
