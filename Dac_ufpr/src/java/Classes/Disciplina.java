package Classes;

public class Disciplina {
    private int cod;
    private String nome;
    private int cargahoraria;

    public Disciplina(){
        
    }
    
    public int getCod(){
        return cod;
    }
    
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCargahoraria(){
        return cargahoraria;
    }
    
    public void setCargahoraria(int cargahoraria){
        this.cargahoraria = cargahoraria;
    }
    
}
