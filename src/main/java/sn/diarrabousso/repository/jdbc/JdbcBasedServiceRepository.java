package sn.diarrabousso.repository.jdbc;

import sn.diarrabousso.domain.Service;
import sn.diarrabousso.repository.ServiceRepository;

public class JdbcBasedServiceRepository implements ServiceRepository {
    public Service[] getAll(){
        return new Service[0];
    }

    @Override
    public Service getByCode(String code) {
        return null;
    }

}
