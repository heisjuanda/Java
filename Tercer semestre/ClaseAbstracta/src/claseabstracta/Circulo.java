/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author JuanDavid
 */
public class Circulo extends Figura{
    
    double rad=0;
    @Override
    public double getArea(){
        area=rad*Math.PI*rad;
        return area;
    }
    
}
