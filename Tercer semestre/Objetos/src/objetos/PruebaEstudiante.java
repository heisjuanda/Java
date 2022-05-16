/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import objetos.Utilerias;
import objetos.Direccion;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class PruebaEstudiante {
    
    public static void main(String[] args) {
        Objetos objSofia = new Objetos();
        //Muestra formulario de sofia
        objSofia.setApellido();
        objSofia.setNombre();
        objSofia.setCodigo();
        objSofia.setCodigoPlan();
        objSofia.setNotas();
        
        objSofia.calcularDef();
        //System.out.println( objSofia.getDef());
        JOptionPane.showConfirmDialog(null,objSofia);
        System.out.println(objSofia);//busca el metodo toString 
       // System.out.println(""+objSofia.getCodigo()+","+objSofia.getNombre()+","+objSofia.getApellido());
       objSofia.setDireccion();
       
       
       
       
       //MUESTRA FORMULARIO DE JUAN y asi con los otros
       Objetos objJuan=new Objetos();
       objJuan.setApellido();
       objJuan.setNombre();
       objJuan.setCodigo();
       objJuan.setCodigoPlan();
       objJuan.setNotas();
       objJuan.calcularDef();
        System.out.println(objJuan);
        JOptionPane.showConfirmDialog(null, objJuan);
       
        
        //otras cosas con los datos
        if(objSofia.getDef() > objJuan.getDef()){
            System.out.println("Sofía tiene mejor nota");
            JOptionPane.showMessageDialog(null,"Sofía tiene mejor nota");
        }else{
            if(objSofia.getDef() > objJuan.getDef()){
                 System.out.println("Juan tiene mejor nota");
            JOptionPane.showMessageDialog(null,"Juan tiene mejor nota");
            }else{
                System.out.println("Son iguales");
                JOptionPane.showMessageDialog(null, "son iguales");
            }
        }
        //se modifican asi porque son public, para evitar los
        //se cambia a private para que solo se modifique en el metodo
        //objSofia.parcial1=4.0; la variable es privated, asi que es inmodificable
        //objSofia.calcularDef();
       objSofia.calcularDef();//no sale error. porque es un metodo
       Utilerias.setEstrato();
       Utilerias.setEstrato2();
        System.out.println("");
    }
}
