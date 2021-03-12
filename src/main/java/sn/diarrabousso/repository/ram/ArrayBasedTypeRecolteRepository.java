package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.TypeRecolte;
import sn.diarrabousso.repository.TypeRecolteRepository;

public class ArrayBasedTypeRecolteRepository implements TypeRecolteRepository {
    public static final TypeRecolte[] TYPE_RECOLTES={
            new TypeRecolte("CTR0001","Cueillette fruits","Récolte de fruits"),
            new TypeRecolte("CTR0002","Cueillette légumes","Récolte de légumes"),
            new TypeRecolte("CTR0003","Fenaison","Récolte de foin"),
            new TypeRecolte("CTR0004","Moisson","Récolte de céréales ou d'oléagineux"),
            new TypeRecolte("CTR0005","Roulaison","Récolte de la canne á sucre"),
            new TypeRecolte("CTR0006","Vendange","Récolte de raisin"),
    };

    public TypeRecolte[] getAll() {
        return  TYPE_RECOLTES;
    }

    public TypeRecolte getByCode(String code) {
        TypeRecolte typeRecolte;
        for (int i=0;i< TYPE_RECOLTES.length;i++)
        {
            if (code == TYPE_RECOLTES[i].getCodeTyperecolte())
            {
                return TYPE_RECOLTES[i];
            }
        }
        return null;
    }
}
