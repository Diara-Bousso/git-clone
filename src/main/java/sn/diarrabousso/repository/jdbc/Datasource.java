package sn.diarrabousso.repository.jdbc;

import java.sql.Connection;

public interface Datasource {

    Connection createConnection();
}

