package com.platinum;

import org.junit.jupiter.api.Test;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testConnectionSuccess() throws Exception {
        DatabaseConfig config = new DatabaseConfig(
                "jdbc:mysql://localhost:3306/cuentas_clientes", 
                "root", 
                "root"
        );
        try (Connection connection = config.connect()) {
            assertNotNull(connection, "La conexión debería ser exitosa y no nula.");
        }
    }

    @Test
    void testConnectionFailure() {
        DatabaseConfig config = new DatabaseConfig(
                "jdbc:mysql://localhost:3306/BD_NO_EXISTE", 
                "usuario_invalido", 
                "contraseña_invalida"
        );
        Exception exception = assertThrows(Exception.class, config::connect);
        assertTrue(exception.getMessage().contains("Access denied"), 
                "El mensaje de error debería contener 'Access denied'");
    }
}
