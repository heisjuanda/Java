/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaholamundo;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author JuanDavid
 */
public class NewClass {
    double p1,p2,talleres,tf,def,ap1,ap2,atalleres,atf;
    Scanner lee=new Scanner(System.in);
   
public void leerNotas(){
    System.out.println("digite la nota del primer parcial");
    p1=lee.nextDouble();
    System.out.println("digite la nota del segundo parcial");
    p2=lee.nextDouble();
    System.out.println("ingrese la nota de talleres");
    talleres=lee.nextDouble();
    System.out.println("ingrese la nota del trabajo final");
    tf=lee.nextDouble();
    
    
}    

public void calcularDefinitiva(){
    ap1=p1*0.25;
    ap2=p2*0.25;
    atalleres=talleres*0.20;
    atf=tf*0.30;
    def=ap1+ap2+atalleres+atf;
    System.out.println("su nota final es "+def);
    
    
    
    
    
}
public void calMensaje(){
    String mensaje;
    
    if(def>3.0){
        mensaje="aprobo";
        System.out.println(mensaje);
    }else{
        if(def>=2.0){
            mensaje="habilita";
            System.out.println(mensaje);
        }else{
            mensaje="desaprobo";
            System.out.println(mensaje);
        }
    }
    
    
}

public void salida(){
    DecimalFormat f=new DecimalFormat("#.##");
    
    System.out.println("primer parcial fue de "+f.format(ap1));
    System.out.println("segundo parcial fue de "+f.format(ap2));
    System.out.println("talleres fueron de "+f.format(atalleres));
    System.out.println("trabajo final fue de "+f.format(atf));
    System.out.println("y tu nota final fue de "+f.format(def));
    
}
    
    public static void main(String[] args) {
        System.out.println("SU NOTA FINAL\n");
        NewClass obj=new NewClass();
        
        obj.leerNotas();
        obj.calcularDefinitiva();
        obj.calMensaje();
        obj.salida();
    }
}
