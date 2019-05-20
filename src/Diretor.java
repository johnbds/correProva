/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Diretor {
    private String nome;
    private Data dataDeNascimento;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
     public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
     public void setDataNascimento(Data d,Data m,Data a){
         this.dataDeNascimento = d;
         this.dataDeNascimento = m;
         this.dataDeNascimento = a;
         
     }
     public void getMostrarDir(){
         System.out.println("Nome:" + getNome() + "Data de Nascimento" + getDataDeNascimento());
     }
    
}
