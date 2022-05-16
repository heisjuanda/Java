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
public class NewClass1 {
    Scanner lee=new Scanner(System.in);
    String mes,temporada;
    
    
    public void leerMes(){
        System.out.println("intruduce un mes");
        mes=lee.nextLine();
        mes=mes.toLowerCase();
        
    }
    
    public void calcularTemporada(){
        if(mes.equals("enero")|| mes.equals("febrero")||mes.equals("diciembre")){
            temporada="invierno";
            
        }else{
             if(mes.equals("marzo")|| mes.equals("abril")||mes.equals("mayo")){
            temporada="primavera";
                 
        }else{
                  if(mes.equals("junio")|| mes.equals("julio")||mes.equals("agosto")){
            temporada="verano";
                      
             }else{
                       if(mes.equals("septiembre")|| mes.equals("octubre")||mes.equals("noviembre")){
            temporada="otoño";
                           
                  }else{
                           System.out.println("indeterminado");
                       }
                  }
             }
        }
    }
                       
public void salida(){
    
    System.out.println("segun el mes es de "+mes+" es temporada de "+temporada);
    
    
}
       
        
    
    
    
    
    
    public static void main(String[] args) {
        NewClass1 obj=new NewClass1();
        obj.leerMes();
        obj.calcularTemporada();
        obj.salida();
    }
    
}
