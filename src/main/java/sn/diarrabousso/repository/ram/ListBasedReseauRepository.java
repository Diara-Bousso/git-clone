package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Reseau;
import sn.diarrabousso.repository.ReseauRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedReseauRepository implements ReseauRepository {
    private final List<Reseau> reseaus;

    public ListBasedReseauRepository(){
        this.reseaus=new ArrayList<Reseau>();
    }

    @Override
    public Reseau[] getAllByAgriculteurAcheteur(Agriculteur agriculteur, Acheteur acheteur) {
        reseaus.add(new Reseau(1,agriculteur,acheteur));
        return reseaus.toArray(new Reseau[0]);
    }

    @Override
    public Reseau findByID_Reseau(int id_reseau) {
        return null;
    }
}
