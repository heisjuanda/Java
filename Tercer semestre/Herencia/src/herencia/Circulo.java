/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author JuanDavid
 */
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI*radio*radio;
    }
    
    public double getPerimetro(){
        return Math.PI*radio*2;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
