package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.domain.Recolte;
import sn.diarrabousso.domain.TypeRecolte;
import sn.diarrabousso.repository.RecolteReository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedRecolteRepository implements RecolteReository {
    private final List<Recolte> recoltes;
 public ListBasedRecolteRepository(){
     this.recoltes=new ArrayList<Recolte>();
 }

    @Override
    public Recolte[] getAllByTypeRecolteAgriculteur(TypeRecolte typeRecolte, Agriculteur agriculteur) {
        recoltes.add(new Recolte("CDE-REC0016","Tomate","21/01/2021",1500,25, typeRecolte,agriculteur));
        recoltes.add(new Recolte("CDE-REC0010","Myrtille","12/02/2021",1535,125, typeRecolte,agriculteur));
        return recoltes.toArray(new Recolte[0]);
    }

    @Override
    public Recolte findByCode(String code) {
        return null;
    }
}
