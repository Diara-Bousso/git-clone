package sn.diarrabousso.repository.ram;

import sn.diarrabousso.domain.Agriculteur;
import sn.diarrabousso.repository.AgriculteurRepository;

public class ArrayBasedAgriculteurRepository implements AgriculteurRepository {

    public static final Agriculteur[] AGRICULTEURS= {
            new Agriculteur("CDE-AGRI100","DIA","Mamadou"," 1978-07-12","Matam","+(221)77-878-45-23","mamadou@gmail.com","hdhdhh"),
            //new Agriculteur(),
            //new Agriculteur(),
            //new Agriculteur(),
    };
    @Override
    public Agriculteur[] getAll() {
        return AGRICULTEURS;
    }

    @Override
    public Agriculteur getBYCodeAgriculteur(String codeagriculteur) {
        return null;
    }
}
