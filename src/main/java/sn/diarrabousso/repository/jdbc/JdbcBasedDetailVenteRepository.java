package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.DetailVente;
import sn.diarrabousso.domain.Recolte;
import sn.diarrabousso.repository.DetailVenteRepository;

public class JdbcBasedDetailVenteRepository implements DetailVenteRepository {
    @Override
    public DetailVente[] getAllByDetailVente(Recolte recolte) {
        return new DetailVente[0];
    }

    @Override
    public DetailVente findById(int id) {
        return null;
    }
}
