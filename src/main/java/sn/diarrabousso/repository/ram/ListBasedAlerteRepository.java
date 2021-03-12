package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.Acheteur;
import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Alerte;
import sn.diarrabousso.domain.Recolte;
import sn.diarrabousso.repository.AlerteRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedAlerteRepository implements AlerteRepository {
    private final List<Alerte> alertes;

    public ListBasedAlerteRepository(){
        this.alertes=new ArrayList<Alerte>();
    }

    @Override
    public Alerte[] getAllByAgriculteurAcheteurRecolte(Agriculteur agriculteur, Acheteur acheteur, Recolte recolte) {
        alertes.add(new Alerte(1,"CDE-A001",agriculteur,acheteur,"Pensez á vendre votre récolte","Le prix moyen de votre récolte et égal au au prix sur le marché","Urgent",1,recolte));
        return alertes.toArray(new Alerte[0]);
    }

    @Override
    public Alerte findById_Alerte(int id_alerte) {
        return null;
    }
}
