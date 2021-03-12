package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Alerte;
import sn.diarrabousso.domain.Recolte;
import sn.diarrabousso.repository.AlerteRepository;

public class JdbcBasedAlerteRepository implements AlerteRepository {
    public Alerte[] getAllByAgriculteurAcheteurRecolte(Agriculteur agriculteur, Acheteur acheteur, Recolte recolte) {
        return new Alerte[0];
    }

    public Alerte findById_Alerte(int id_alerte) {
        return null;
    }
}
