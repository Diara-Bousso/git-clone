package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.repository.AgriculteurRepository;

public class JdbcBasedAgriculteurRepository implements AgriculteurRepository {
    public Agriculteur[] getAll() {
        return new Agriculteur[0];
    }

    public Agriculteur getBYCodeAgriculteur(String codeagriculteur) {
        return null;
    }
}
