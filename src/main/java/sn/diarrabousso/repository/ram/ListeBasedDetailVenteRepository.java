package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.DetailVente;
import sn.diarrabousso.domain.Recolte;
import sn.diarrabousso.repository.DetailVenteRepository;

import java.util.ArrayList;
import java.util.List;

public class ListeBasedDetailVenteRepository implements DetailVenteRepository {
    private final List<DetailVente> detailVentes;

    public ListeBasedDetailVenteRepository() {
        this.detailVentes= new ArrayList<DetailVente>();
    }


    @Override
    public DetailVente[] getAllByDetailVente(Recolte recolte) {
        detailVentes.add(new DetailVente(1,"COD-123",recolte,13200,125));
        return detailVentes.toArray(new DetailVente[0]);
    }

    @Override
    public DetailVente findById(int id) {
        return null;
    }
}
