package sn.diarrabousso.repository;

import sn.diarrabousso.domain.Agriculteur;

public interface AgriculteurRepository {
    Agriculteur[] getAll();
    Agriculteur getBYCodeAgriculteur(String codeagriculteur);
}
