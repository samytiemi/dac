package Classes;

import java.util.Date;

public class Pessoa {
    private int idPessoa;
    private Date datanasc;
    private String cpf;
    private String endereco;
    private int numendereco;
    private Date dataadmissao;
    private String nome;
    private String login;
    private String senha;
    private boolean coordenador;
    
    public Pessoa (){
    
    }
    
    public int getIdPessoa(){
        return idPessoa;
    }
    
    public void setIdPessoa(){
        this.idPessoa = idPessoa;
    }
    
    public Date getDatanasc(){
        return datanasc;
    }
    
    public void setDatanasc(){
        this.datanasc = datanasc;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(){
        this.cpf = cpf;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(){
        this.endereco = endereco;
    }
    
    public int getNumendereco(){
        return numendereco;
    }
    
    public void setNumendereco(){
        this.numendereco = numendereco;
    }
    
    public Date getDataadmissao(){
        return dataadmissao;
    }
    
    public void setDataadmissao(){
        this.dataadmissao = dataadmissao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(){
        this.nome = nome;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(){
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(){
        this.senha = senha;
    }
    
    public boolean getCoordenador(){
        return coordenador;
    }
    
    public void setCoordenador(){
        this.coordenador = coordenador;
    }
}