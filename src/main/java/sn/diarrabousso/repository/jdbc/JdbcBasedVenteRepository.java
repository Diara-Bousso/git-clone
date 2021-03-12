package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.DetailVente;
import sn.diarrabousso.domain.Vente;
import sn.diarrabousso.repository.VenteRepository;

public class JdbcBasedVenteRepository implements VenteRepository {
    public Vente[] getAllByDetailVenteAcheteur(DetailVente detailVente, Acheteur acheteur) {
        return new Vente[0];
    }

    public Vente findByVente(int id) {
        return null;
    }
}
