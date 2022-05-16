/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraclase.Modelo;

/**
 *
 * @author JuanDavid
 */
public class Perro {
    
    public Perro(String name2,String raza2,int age2){
        name=name;
        raza=raza2;
        age=age2;
        contador++;
        
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        contador--;
    }
    
    
    
    public static void ladrar(){//para no crear objetos
        System.out.println("woff");
    }
    
    private String name;
    private String raza;
    private int age;
    public static int contador;//todos los objetos comparten esta variable
    public final boolean esMamifero = true;
    //final no se puede cambiar nunca
    public static final boolean TIENECOLA= true;














    
    public String getName() {
        return name;
    }

    public String getRaza() {
        return raza;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
   
    
}
