package DAO;

import Classes.Pessoa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDAO {
    
    private Connection connection;
    private PreparedStatement stmtInserir,stmtExcluir, stmtPesquisar;
    private String generatedColumns[] = { "idPessoa" };
    private ResultSet rs = null;

    
    public PessoaDAO() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserirPessoa (Pessoa pessoa) throws SQLException{ 
        try {
            try {
                connection = ConnectionFactory.getConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            stmtInserir = connection.prepareStatement("insert into pessoa (dataNasc ,cpf, endereco, numEndereco, "
                    + "dataAdmissao, nome, login, senha, coordenador ) values (?, ?, ?, ?, ?, ?, ?, ?, ?)", generatedColumns);
            
            
            stmtInserir.setDate(1,(Date) pessoa.getDatanasc());
            stmtInserir.setString(2, pessoa.getCpf());
            stmtInserir.setString(3, pessoa.getEndereco());
            stmtInserir.setInt(4, pessoa.getNumendereco());
            stmtInserir.setDate(5,(Date) pessoa.getDataadmissao());
            stmtInserir.setString(6, pessoa.getNome());
            stmtInserir.setString(7, pessoa.getLogin());
            stmtInserir.setString(8, pessoa.getSenha());
            stmtInserir.setBoolean(9, pessoa.getCoordenador());
   
            stmtInserir.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar pessoa. Origem="+e.getMessage());
        } finally{
            stmtInserir.close();
            connection.close();
        }
    }
    
 
    
    public void excluirPaciente (Pessoa pessoa) throws SQLException{
        try{
            try {
                connection = ConnectionFactory.getConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            stmtExcluir = connection.prepareStatement("delete from pessoa where idPessoa = ?");
            stmtExcluir.setInt(1, pessoa.getIdPessoa());
            
            stmtExcluir.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir pessoa. Origem="+e.getMessage());
        } finally{
            stmtExcluir.close();
            connection.close();
        }
    }
    
    
    public Pessoa pesquisarPessoa (int idPessoa) throws SQLException {
        Pessoa pessoaLida;
        try{
            try{
                connection = ConnectionFactory.getConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            stmtPesquisar = connection.prepareStatement("select * from pessoa where idPessoa = ?");
            stmtPesquisar.setInt (1, idPessoa);
            rs = stmtPesquisar.executeQuery();
            if(rs.next()){
                pessoaLida = new Pessoa();
                pessoaLida.setIdPessoa(rs.getInt("idPessoa"));
                pessoaLida.setDatanasc((Date) rs.getDate("dataNasc"));
                pessoaLida.setCpf(rs.getString("cpf"));
                pessoaLida.setEndereco(rs.getString("endereco"));
                pessoaLida.setNumendereco(rs.getInt("numEndereco"));
                pessoaLida.setDataadmissao((Date) rs.getDate("dataAdmssao"));
                pessoaLida.setNome(rs.getString("nome"));
                pessoaLida.setLogin(rs.getString("login"));
                pessoaLida.setSenha(rs.getString("senha"));
                pessoaLida.setCoordenador(rs.getBoolean("coordenador"));
                return pessoaLida;
            }else{
                throw new RuntimeException("Não existe pessoa com este ID: "+idPessoa);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao consultar pessoa. Origem"+e.getMessage());
        } finally{
            rs.close();
            stmtPesquisar.close();
            connection.close();
            
        }
    }
}

            
        
 
    
    
