/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import objetos.Direccion;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
class Utilerias {
    public static int leerEntero(String mensaje){
        String ent=JOptionPane.showInputDialog(mensaje);
        int valor=Integer.parseInt(ent);
        return valor;
    }
    public static double LeerDouble(String mensaje){
        double valor=Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return valor;
    }
    public static int setEstrato(){//botones
        String datos[]={"1","2","3","4","5","6"};
        int estrato=JOptionPane.showOptionDialog(null,"Seleccione el estrato", "Estrato",
                0, JOptionPane.QUESTION_MESSAGE, null, datos , datos[0]);
        return estrato+1;
    }
    public static int setEstrato2(){
        String datos[]={"1","2","3","4","5","6"};
        int estrato=Integer.parseInt((String)JOptionPane.showInternalInputDialog(null, "seleciones el estrato",
                "Estrato", 1, null, datos, datos[0] ));
        
        return estrato+1;
    }
   
}
