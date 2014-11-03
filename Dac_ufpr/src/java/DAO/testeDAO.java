package DAO;

import Classes.Teste;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testeDAO {
    
    private Connection connection;
    private PreparedStatement stmtInserir,stmtExcluir, stmtPesquisar;
    private ResultSet rs = null;

    
    public testeDAO() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserirTeste (Teste teste) throws SQLException{ 
        try {
            try {
                connection = ConnectionFactory.getConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(testeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            stmtInserir = connection.prepareStatement("insert into teste (login, senha, data) values(?,?,?)");
            
            stmtInserir.setString(1, teste.getLogin());
            stmtInserir.setString(2, teste.getSenha());
            stmtInserir.setDate(3, (Date)teste.getData());
   
            stmtInserir.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar pessoa. Origem="+e.getMessage());
        } finally{
            stmtInserir.close();
            connection.close();
        }
    }
}

            
        
 
    
    
