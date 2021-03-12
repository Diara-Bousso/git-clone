package sn.diarrabousso.repository;

import sn.diarrabousso.domain.Acheteur;

public interface AcheteurRepository {
    Acheteur[] getAll();
    Acheteur getById(int id);
}
