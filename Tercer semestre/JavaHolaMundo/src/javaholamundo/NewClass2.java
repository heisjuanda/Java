/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaholamundo;
import java.util.Scanner;

/**
 *
 * @author JuanDavid
 */
public class NewClass2 {
    Scanner lee=new Scanner(System.in);
    String mes,temporada;
    
   public void leerMes(){
        System.out.println("intruduce un mes");
        mes=lee.nextLine();
        mes=mes.toLowerCase();
        
    }
   
   public void calcularMes(){
       switch(mes){
           case "enero":case "febrero":case"diciembre": temporada="invierno";
           break;
           case "marzo":case "abril":case"mayo": temporada="primavera";
           break;
           case "junio":case "julio":case"agosto": temporada="verano";
           break;
           case "septiembre":case "octubre":case"noviembre": temporada="otoño";
           break;
           default:System.out.println("indeterminado");
           
       }
       
       
   }
   
   public void salida(){
    
    System.out.println("segun el mes es de "+mes+" es temporada de "+temporada);
    
        
    }
    
    public static void main(String[] args) {
        NewClass2 obj=new NewClass2();
        obj.leerMes();
        obj.calcularMes();
        obj.salida();
    }
}
