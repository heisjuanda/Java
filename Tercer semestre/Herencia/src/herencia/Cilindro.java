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
public class Cilindro extends Circulo{

    private double altura;
    
    
    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura=altura;
    }
    
    @Override
    public double getArea(){
        return getPerimetro()*altura+2*super.getArea();
    }
    
    
    
}
