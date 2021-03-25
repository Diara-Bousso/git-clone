package sn.diarrabousso.repository.jdbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sn.diarrabousso.domain.TypeRecolte;

import javax.sql.DataSource;
import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyString;

public class JdbcBasedTypeRecolteTest {
    private  JdbcBasedTypeRecolteRepository jdbcBasedTypeRecolteRepository;

    @BeforeEach
    void setUp() throws SQLException {
        System.out.println("Dans la méthode setup");
        //Arrange
        DataSource dataSource = (DataSource) new MockDatasource();
        jdbcBasedTypeRecolteRepository = new JdbcBasedTypeRecolteRepository((DatabaseHelper) dataSource);
    }
    @Test
    void getPrestations(){
        System.out.println("Dans la méthode get prestations");
        TypeRecolte[] typeRecoltes = jdbcBasedTypeRecolteRepository .getAll();
        assertEquals(5, typeRecoltes.length, "nombre type de recolte = 5");
    }

    @Test
    void getTypesRecolteWhenExceptionOccured() throws SQLException {
        System.out.println("Exception occured");
        DataSource dataSource = mock(DataSource.class);
        when(dataSource.getConnection()).thenThrow(new RuntimeException("BD indisponible"));
        jdbcBasedTypeRecolteRepository = new JdbcBasedTypeRecolteRepository((DatabaseHelper) dataSource);
        TypeRecolte[] typeRecoltes = jdbcBasedTypeRecolteRepository .getAll();
        assertEquals(0, typeRecoltes.length, "Aucune type de recolte attendu ");
    }

    @Test
    void getByIdShouldReturnPrestationWhenAvailable(){
        TypeRecolte typeRecolte = jdbcBasedTypeRecolteRepository.getByCode("CODE-TR01");
        assertNotNull( typeRecolte );
        assertEquals(1,  typeRecolte .getCodeTyperecolte());
        assertEquals("",  typeRecolte .getNomTyperecolte());
        assertEquals("",  typeRecolte .getDescriptionTyperecolte());
    }

    @Test
    void getByIdShouldReturnTypesRecolteWhenAvailableNotTrivial() throws SQLException {
        DataSource dataSource = mock(DataSource.class);
        Connection connection = mock(Connection.class);

        when(dataSource.getConnection()).thenReturn(connection);
        Statement statement = mock(Statement.class);
        when(connection.createStatement()).thenReturn(statement);
        PreparedStatement preparedStatement = mock(PreparedStatement.class);
        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
        ResultSet resultSet2 = mock(ResultSet.class);
        when(preparedStatement.executeQuery()).thenReturn(resultSet2);
        when(resultSet2.getInt(anyString())).thenReturn(5);
        when(resultSet2.getString(anyString())).thenReturn("aaaaa");

        jdbcBasedTypeRecolteRepository = new JdbcBasedTypeRecolteRepository((DatabaseHelper) dataSource);

        TypeRecolte typeRecolte = jdbcBasedTypeRecolteRepository.getByCode("CODE-TR01");
        assertNotNull(typeRecolte);
        assertEquals(5, typeRecolte.getCodeTyperecolte());
        assertEquals("Recolte ", typeRecolte.getNomTyperecolte());
    }

}

