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
public class Animal {

    public Animal(int edad, int numeroPatas, String zonaHabitad) {
        this.edad = edad;
        this.numeroPatas = numeroPatas;
        this.zonaHabitad = zonaHabitad;
    }
    
    
    
    
    private int edad;
    private int numeroPatas;
    private String zonaHabitad;

    public int getEdad() {
        return edad;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getZonaHabitad() {
        return zonaHabitad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setZonaHabitad(String zonaHabitad) {
        this.zonaHabitad = zonaHabitad;
    }
    
    protected void reproducen(){
        System.out.println(";)");
    }
    
}
