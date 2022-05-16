/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Metodos {

    
    public void menu(){
        int op;
        do {            
            op=Integer.parseInt(JOptionPane.showInputDialog("1.leer"));
            
            switch(op){
                case 0: break;
                case 1:  break;
            }
            
        } while (op != 0);
        
    }
    
   
    
    public static void main(String[] args) {
       Metodos obj = new Metodos();
       
    }
    
}
