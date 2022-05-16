/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaholamundo;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.math.MathContext;
import java.text.DecimalFormat;
/**
 *
 * @author JuanDavid
 */


public class JavaHolaMundo {
Scanner lee=new Scanner(System.in);
int a=0,b=0;
    /**
     * @param args the command line arguments
     */
    
    public void leerNum(){//metodo
        System.out.println("MAXIMO");
        System.out.println("digite un numero para maximo");
        a=lee.nextInt();
        System.out.println("digite otro numero para maximo");
        b=lee.nextInt();
        int max= Math.max(a, 10);
        System.out.println("el maximo entre " + a + " y el 10 es: "+max);
        int max2=Math.max(Math.max(a, 100), b);
        System.out.println("el maximo entre "+a+", el 100 y el "+b+" es"+max2);        

}
    public void leeOtro(){
        int a,b;
        System.out.println("MINIMO");
        System.out.println("digite un número para minimo");
        a=lee.nextInt();
        System.out.println("digite otro numero para minimo");
        b=lee.nextInt();
        int c=Math.min(Math.min(a, b), 452);
        System.out.println("el minimo entre "+a+", "+b+" y 452 es "+c);
        
        
    }
    
    public void suma(){
        System.out.println("SUMA");
        double a,b;
        System.out.println("digite un numero para a");
        a=lee.nextDouble();
        System.out.println("digite un numero para b");
        b=lee.nextDouble();
        int c;
    c = (int) (a+b);
        System.out.println("el resultado de "+a+'+'+b+'='+c);
        
    }
    
    public void calArea(){
        System.out.println("CALCULAR AREA");
        double radio,area;
        System.out.println("digite el valor del radio");
        radio=lee.nextDouble();
        area=Math.PI*Math.pow(radio,2); 
        System.out.println("el area es "+area);
    DecimalFormat formato = new DecimalFormat("#######.##");//cantidad decimal 
        String area_formato= formato.format(area);
         System.out.println("el area es "+area_formato);
         area_formato=area_formato.replace(',','.');
         double area2=Double.parseDouble(area_formato);
         double m=Math.sqrt(area2);
         System.out.println("la raiz del área es: "+ m);
         
         
    }
    
    public void raiz(){
        System.out.println("RAICES 2,3 Y 4");
        double num,cuadrada,cubica,cuarta;
        System.out.println("digite un número");
        num=lee.nextDouble();
         cuadrada=Math.sqrt(num);
         System.out.println("cuadrada "+cuadrada);
         cubica=Math.cbrt(num);
         System.out.println("cubica "+cubica);
         cuarta=Math.pow(num,(double)1/4);
        System.out.println("cuarta "+cuarta);
    }
   
    public void aleatorio(){
        System.out.println("RANDOM");
        double dato=Math.random();
        System.out.println(dato);
        int num=1+(int)(Math.random()*100);
        //                 dato
        System.out.println(num);
    }
    
    public void cadena(){
        System.out.println("CADENA");
        String cadena;
        System.out.println("ingres su nombre");
        cadena=lee.nextLine();
        System.out.println(cadena);
        String mayus=cadena.toUpperCase();
        //           variable.metodo a usar en la variable
        String minus=cadena.toLowerCase();
        int longitud=cadena.length();
        System.out.println(mayus);
        System.out.println(minus);
        System.out.println(longitud);
        
        }
        
        
    
    
    
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       
        JavaHolaMundo obj=new JavaHolaMundo();//creado para llamar la clase
        obj.leerNum();  //llamando la función
        obj.leeOtro();  //llamando laotra función
        obj.suma();
        obj.calArea();
        System.out.println(Math.E);  //variables valor
        System.out.println(Math.PI); //variables valor
        obj.raiz();
        obj.aleatorio();
        obj.cadena();
        
        
        
        
        /*
        System.out.println("Hola pa'");
        JOptionPane.showMessageDialog(null,"hola andrés\nsoy juan david");
        JOptionPane.showMessageDialog(null,"error","Error", JOptionPane.ERROR_MESSAGE);
         */
  
    }
    
}
