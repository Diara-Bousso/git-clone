package sn.diarrabousso.repository.jdbc;

import javafx.beans.value.ObservableBooleanValue;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

import java.sql.*;

import static javafx.beans.binding.Bindings.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Matchers.anyString;

public class MockDatasource implements Datasource{
    @Override
    public Connection createConnexion() {
        Connection connection = mock(Connection.class);
        Statement statement = mock(Statement.class);
        try {
            Mockito.when(connection.createStatement()).thenReturn(statement);
            PreparedStatement preparedStatement = mock(PreparedStatement.class);
            Mockito.when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
            ResultSet resultSet2 = mock(ResultSet.class);
            Mockito.when(preparedStatement.executeQuery()).thenReturn(resultSet2);
            Mockito.when(resultSet2.getInt(anyString())).thenReturn(1);
            Mockito.when(resultSet2.getString(anyString())).thenReturn("");

            ResultSet resultSet = mock(ResultSet.class);
            Mockito.when(statement.executeQuery(anyString())).thenReturn(resultSet);
            Mockito.when(resultSet.next()).thenReturn(true, true, true, true, false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
