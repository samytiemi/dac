/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    private static ConnectionFactory connectionFactory = null;
    
    public static Connection getConnection() throws ClassNotFoundException {
        
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/DAC", "postgres", "padraoum");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ConnectionFactory getInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
    
    
}

