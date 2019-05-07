/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Filme {
    private Data dataLancamento;
    private Diretor diretor;
    private String genero;
    
    public Data getDataLancamento(){
        return this.dataLancamento;
    }
    public Diretor getDiretor(){
        return this.diretor;
    }
    public String getGenero(){
        return this.genero;
    }
     
    public void getMostrarFil(){
        System.out.println("Data de Lançamento:" + getDataLancamento() +  "Diretor:" + getDiretor() + "Genero:" + getGenero());
    }
    
    public boolean setInfoGenero(String g){
        
    }
    
}
