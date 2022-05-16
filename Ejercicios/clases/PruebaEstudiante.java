/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PruebaEstudiante {
    
    public static void main(String[] args) {
        
        Estudiante objAna = new Estudiante();
        objAna.setApe();
        objAna.setNom();
        objAna.setCodEstudiantil();
        objAna.setCodPlan();
        objAna.setNotas();
        objAna.calcDef();
        objAna.setDir();
        //System.out.println(objAna.getApe() + ", " + objAna.getNom() + " " + objAna.getDef());
        System.out.println(objAna);
        JOptionPane.showMessageDialog(null, objAna);
        JOptionPane.showMessageDialog(null, objAna.getDir());
        
        Estudiante objLuis = new Estudiante();
        objLuis.setCodEstudiantil();        
        objLuis.setNom();
        objLuis.setApe();
        objLuis.setCodPlan();
        objLuis.setNotas();
        objLuis.calcDef();
        objLuis.setDir();
        JOptionPane.showMessageDialog(null, objLuis);
        
        if(objAna.getDef() > objLuis.getDef()){
            JOptionPane.showMessageDialog(null, "Ha ana le quedo mas alta");
        }else{
            if(objLuis.getDef() > objAna.getDef()){
                JOptionPane.showMessageDialog(null, "Ha luis  le quedo mas alta");
            }else{
                JOptionPane.showMessageDialog(null, "les quedo igual");
            }
        }
        
        Docente docAdrian = new Docente();
        docAdrian.setApe();
        docAdrian.setNom();
        docAdrian.setId();
        docAdrian.setDir();
        JOptionPane.showMessageDialog(null, docAdrian);
    }
}
