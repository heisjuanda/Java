/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

/**
 *
 * @author JuanDavid
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Metodos integrar = new Metodos();
        
        //se clonan los arrays para evitar direcciones de memoria 
        double [] f1 =integrar.funcion1.clone();
        double [] f2 =integrar.funcion2.clone();
        double [] f3 =integrar.funcion3.clone();
        double [] f4 =integrar.funcion4.clone();
        double [] f5 =integrar.funcion5.clone(); 
        
       
        //se visualizan las funciones establecidas
        System.out.println("f1 "+integrar.VerFuncion(f1));
        System.out.println("f2 "+integrar.VerFuncion(f2));
        System.out.println("f3 "+integrar.VerFuncion(f3));
        System.out.println("f4 "+integrar.VerFuncion(f4));
        System.out.println("f5 "+integrar.VerFuncion(f5));
        
        //metodo 1 INTEGRACION
        System.out.println("integral1 Integral: "+integrar.MetodoIntegral(1, 0, f1));
        System.out.println("integral2 Integral: "+integrar.MetodoIntegral(1, 0, f2));
        System.out.println("integral3 Integral: "+integrar.MetodoIntegral(1, 0, f3));
        System.out.println("integral4 Integral: "+integrar.MetodoIntegral(1, 0, f4));
        System.out.println("integral5 Integral: "+integrar.MetodoIntegral(1, 0, f5));
        
        //metodo 2 SIMPSON
        System.out.println("integral1 Simpson: "+integrar.MetodoDeSimpson(1, 0, 1000, f1));
        System.out.println("integral2 Simpson: "+integrar.MetodoDeSimpson(1, 0, 1000, f2));
        System.out.println("integral3 Simpson: "+integrar.MetodoDeSimpson(1, 0, 1000, f3));
        System.out.println("integral4 Simpson: "+integrar.MetodoDeSimpson(1, 0, 1000, f4));
        System.out.println("integral5 Simpson: "+integrar.MetodoDeSimpson(1, 0, 1000, f5));
        
        //metodo 3 TRAPECIO SIMPLE
        System.out.println("integral1 TrapecioSimple: "+integrar.MetodoDelTrapecioSimple(1, 0, f1));
        System.out.println("integral2 TrapecioSimple: "+integrar.MetodoDelTrapecioSimple(1, 0, f2));
        System.out.println("integral3 TrapecioSimple: "+integrar.MetodoDelTrapecioSimple(1, 0, f3));
        System.out.println("integral4 TrapecioSimple: "+integrar.MetodoDelTrapecioSimple(1, 0, f4));
        System.out.println("integral5 TrapecioSimple: "+integrar.MetodoDelTrapecioSimple(1, 0, f5));
        
        //metodo 4 TRAPECIO MULTIPLE
        System.out.println("integral1 TrapecioMultiple: "+integrar.MetodoDelTrapecioMultiple(1, 0, 1000, f1));
        System.out.println("integral2 TrapecioMultiple: "+integrar.MetodoDelTrapecioMultiple(1, 0, 1000, f2));
        System.out.println("integral3 TrapecioMultiple: "+integrar.MetodoDelTrapecioMultiple(1, 0, 1000, f3));
        System.out.println("integral4 TrapecioMultiple: "+integrar.MetodoDelTrapecioMultiple(1, 0, 1000, f4));
        System.out.println("integral5 TrapecioMultiple: "+integrar.MetodoDelTrapecioMultiple(1, 0, 1000, f5));
    }
    
}
