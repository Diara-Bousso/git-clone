package sn.diarrabousso.repository;

import sn.diarrabousso.domain.TypeRecolte;

public interface TypeRecolteRepository {
    TypeRecolte[] getAll();
    TypeRecolte getByCode(String code);

}
