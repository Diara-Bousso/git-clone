package sn.diarrabousso.repository;

import sn.diarrabousso.domain.Service;

public interface ServiceRepository {
    Service[] getAll();
    Service getByCode(String code);
}
