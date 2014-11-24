package Classes;

public class Solicitacao {
    private Pessoa pessoa;
    private int pessoa_idpessoa;
    private int totalhorasprofessor;
    
    public Solicitacao(){
        
    }
    
    public Pessoa getPessoa(){
        return pessoa;
    }
    
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public int getPessoa_idpessoa(){
        return pessoa_idpessoa;
    }
    
    public void setPessoa_idpessoa(int pessoa_idpessoa){
        this.pessoa_idpessoa = pessoa_idpessoa;
    }
    
    public int getTotalhorasprofessor(){
        return totalhorasprofessor;
    }
    
    public void setTotalhorasprofessor(int totalhorasprofessor){
        this.totalhorasprofessor = totalhorasprofessor;
    }
    
    
}
