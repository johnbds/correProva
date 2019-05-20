/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class Teste {
    public static void main(String[] args){
        Diretor d1 = new Diretor();
        d1.setNome("john");
        Data d = new Data();
        d.setDia(10);
        d.setMes(12);
        d.setAno(1997);
        
        Filme f = new Filme();
        f.setGenero("");
        f.setNDiretor(d1);
        Data d2 = new Data();
        d2.setDia(12);
        d2.setMes(8);
        d2.setAno(2022);
        
        d1.getMostrarDir();
        f.Mostrar();
        f.InformaGenero("Terror");
        
        
        
        
        
    }
    
}
