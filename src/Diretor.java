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
     public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
     public void getMostrarDir(){
         System.out.println("Nome:" + getNome() + "Data de Nascimento" + getDataDeNascimento());
     }
    
}
