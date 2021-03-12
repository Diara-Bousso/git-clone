package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.repository.AcheteurRepository;

public class JdbcBasedAcheteurRepository implements AcheteurRepository {
    public Acheteur[] getAll() {
        return new Acheteur[0];
    }

    public Acheteur getById(int id) {
        return null;
    }

}
