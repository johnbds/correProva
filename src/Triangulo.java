/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class Triangulo {
    private double base;
    private double altura;
    
    public double getbase(){
        return this.base;
    }
    public void setBase(double b){
        this.base = b;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double a){
        this.altura = a;
    }
    
    public double calcularArea(){
        double area;
        area = (base*altura)/2;
        return area;
      
    }
    
}
