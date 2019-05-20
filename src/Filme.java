/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class Filme {
     private Diretor NDiretor;
    private Data DataLancamento;
    private String Genero;
    
    public Diretor getNDiretor(){
        return this.NDiretor;
    }
    public void setNDiretor(Diretor n){
        this.NDiretor = n;
    }
    
    public Data getDataLancamento(){
        return this.DataLancamento;
    }
    public void setDataLancamento(Data d,Data m,Data a){
        this.DataLancamento = d;
        this.DataLancamento = m;
        this.DataLancamento = a;
    }
    
    public String getGenero(){
        return this.Genero;
    }
    public void setGenero(String g){
        this.Genero = g;
    }
    
    public void Mostrar(){
        System.out.println("Diretor: " + this.getNDiretor());
        System.out.println("Lançamento: " + this.getDataLancamento());
        System.out.println("Genêro: " + this.getGenero());
    }
        
    public boolean InformaGenero(String G){
        if((G == "Terror")||(G == "Romance")||(G == "Ação")){
            this.Genero = G;
            return true;
        }
        else{
            return false;
        }
    }
    
}

