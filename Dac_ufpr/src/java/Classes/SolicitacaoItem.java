package Classes;

public class SolicitacaoItem {
    private Pessoa pessoa;
    private Solicitacao solicitacao;
    private Disciplina disciplina;
    private int cod;
    private String diaSemana;
    private String horario;
    private int status;
    
    public Pessoa getPessoa(){
        return pessoa;
    }
    
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public Solicitacao getSolicitacao(){
        return solicitacao;
    }
    
    public void setSolicitacao(Solicitacao solicitacao){
        this.solicitacao = solicitacao;
    }
    
    public Disciplina getDisciplina(){
        return disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    
    public int getCod(){
        return cod;
    }
    
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public String getDiaSemana(){
        return diaSemana;
    }
    
    public void setDiaSemana(String diaSemana){
        this.diaSemana = diaSemana;
    }
    
    public String getHorario(){
        return horario;
    }
    
    public void setHorario(String horario){
        this.horario = horario;
    }
    
    public int getStatus(){
        return status;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    
    
}
