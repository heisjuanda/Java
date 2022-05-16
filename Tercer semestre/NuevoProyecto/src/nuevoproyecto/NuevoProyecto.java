/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoproyecto;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author JuanDavid
 */


public class NuevoProyecto {

    
    public static void main(String[] args) {
       /* Scanner imprime=new Scanner(System.in);
        int year=0;
        String numero="123456789";
        char letra='1';
        char letraa=1;
        int si=letra;
        int jo=letraa;
        
        
        System.out.println(letra);
        System.out.println(si);
        System.out.println(letraa);
        System.out.println(jo);
        System.out.println("digita tu edad");
        year=imprime.nextInt();
        if(10>=(numero.charAt(3) - '0')){
            System.out.println("hola");
        }
        
        if(year<18){
            System.out.println("menor de edad");
        }else{
            if(year>18){
                System.out.println("mayor de edad");
            }else{
                if(year>=60 || year<80){
                    System.out.println("viejito");
                }
            }
        }
     //esta cumpliendo algo
        boolean estado=true;
        System.out.println(estado);
        if(estado){
            System.out.println("es verdad");
        }else{
            System.out.println("es falso");
        }
        */
      /* Scanner imprime=new Scanner(System.in);
       int a=0;
       char vocal='a';
        System.out.println("digite un entero");
        a=imprime.nextInt();
        
       switch(vocal){
           case 'a':
               System.out.println("es la a pa'");
               break;
           case 'e':
               System.out.println("es la e pa'");
               break;
           case 'i':
               System.out.println("es la i pa'");
               break;
           case 'o':
               System.out.println("es la o pa'");
               break;
           case 'u':
               System.out.println("es la u pa'");
               break;
               default:
                   System.out.println("no sé");
       }
       */
      Scanner sc=new Scanner(System.in);
      char a=' ';
      double x=0,y=0,resultado=0;
      int salir=0;
      
        do {            
            JOptionPane.showMessageDialog(null,"Bienvenido\n" 
            + "suma\n"
            + "resta\n"
            +  "multiplicación\n"
            +  "división\n");
        System.out.println("digite un operador");
        a=sc.nextLine().charAt(0);
        
        switch(a){
            case '+':
                System.out.println("digite un número x");
                x=sc.nextDouble();
                System.out.println("digite un numero y");
                y=sc.nextDouble();
                resultado=(x+y);
                System.out.println("el resultado es " + (int)resultado);
                System.out.println("salir?");
                salir=sc.nextInt();
                a='+';
                break;
            case '-':
                System.out.println("digite un número x");
                x=sc.nextDouble();
                System.out.println("digite un numero y");
                y=sc.nextDouble();
                resultado=(x-y);
                System.out.println("el resultado es " + (int)resultado);
                System.out.println("salir?");
                salir=sc.nextInt();
                
                break;
            case '*':
                System.out.println("digite un número x");
                x=sc.nextDouble();
                System.out.println("digite un numero y");
                y=sc.nextDouble();
                resultado=(x*y);
                System.out.println("el resultado es " + (int)resultado);
                System.out.println("salir?");
                salir=sc.nextInt();
                
                break;
            case '/':
               
                System.out.println("digite un número x");
                x=sc.nextDouble();
                System.out.println("digite un numero y");
                y=sc.nextDouble();
                if(y==0){
                    JOptionPane.showMessageDialog(null,"Error");
                    System.out.println("Error");
                }
                resultado=(x/y);
                System.out.println("el resultado es " + resultado);
                System.out.println("salir?");
                salir=sc.nextInt();
                
                break;
                default:
                    System.out.println("no puedo hacer eso");
        }
        
         } while(salir<5);
      
      
      
      
    }
    
}
