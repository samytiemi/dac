package Classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    public static Connection getConnection() throws ClassNotFoundException {
        
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/DAC", "postgres", "padraoum");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}