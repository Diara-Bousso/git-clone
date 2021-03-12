package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.TypeRecolte;
import sn.diarrabousso.repository.TypeRecolteRepository;
import sn.diarrabousso.utils.DatabaseHelper;

public class JdbcBasedTypeRecolteRepository implements TypeRecolteRepository {
    public JdbcBasedTypeRecolteRepository(DatabaseHelper db) {
    }

    public TypeRecolte[] getAll() {
        return new TypeRecolte[0];
    }

    public TypeRecolte getByCode(String code) {
        return null;
    }
}
