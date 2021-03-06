package Classes;

import java.util.Date;

public class Pessoa {
    private int idPessoa;
    private String datanasc;
    private String cpf;
    private String cep;
    private String endereco;
    private String numendereco;
    private String dataadmissao;
    private String nome;
    private String login;
    private String senha;
    private boolean coordenador;
    
    public Pessoa (){
    
    }
    
    public int getIdPessoa(){
        return idPessoa;
    }
    
    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }
    
    public String getDatanasc(){
        return datanasc;
    }
    
    public void setDatanasc(String datanasc){
        this.datanasc = datanasc;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCep(){
        return cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;        
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getNumendereco(){
        return numendereco;
    }
    
    public void setNumendereco(String numendereco){
        this.numendereco = numendereco;
    }
    
    public String getDataadmissao(){
        return dataadmissao;
    }
    
    public void setDataadmissao(String dataadmissao){
        this.dataadmissao = dataadmissao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public boolean getCoordenador(){
        return coordenador;
    }
    
    public void setCoordenador(boolean coordenador){
        this.coordenador = coordenador;
    }
}