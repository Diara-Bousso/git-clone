package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.DetailVente;
import sn.diarrabousso.domain.Vente;
import sn.diarrabousso.repository.VenteRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedVenteRepository implements VenteRepository {
    private final List<Vente> ventes;

    public ListBasedVenteRepository(){
        this.ventes=new ArrayList<Vente>();
    }

    @Override
    public Vente[] getAllByDetailVenteAcheteur(DetailVente detailVente, Acheteur acheteur) {
        //ventes.add(new Vente(1,"CDE-A001","Achat de 875 Kg de tomate",8));
        //ventes.add(new Vente(1,"CDE-A009","Achat de 875 Kg de tomate","12/03/2021","Test",acheteur));
        return ventes.toArray(new Vente[0]);
    }

    @Override
    public Vente findByVente(int id) {
        return null;
    }
}
