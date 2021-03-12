package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Reseau;
import sn.diarrabousso.repository.ReseauRepository;

public class JdbcBasedReseauRepository implements ReseauRepository {
    public Reseau[] getAllByAgriculteurAcheteur(Agriculteur agriculteur, Acheteur acheteur) {
        return new Reseau[0];
    }

    public Reseau findByID_Reseau(int id_reseau) {
        return null;
    }
}
