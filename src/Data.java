/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Data {
    private int dia,mes,ano;
    
    public int getDia(){
        return this.dia;
}
    public void setDia( int d){
        this.dia = d;
    }
    public int getMes(){
        return this.mes;
}
    public void setMes(int m){
        this.mes = m;
    }
    public int getAno(){
        return this.ano;
}
    public void setAno(int a){
        this.ano = a;
    }
    public void getMostrar (){
       System.out.println("Dia:" + getDia() + "Mes:" + getMes() + "Ano:" + getAno());
    }
}
