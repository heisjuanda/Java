/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Punto5 {
//                                 , int cantidadDelimitadores

    public int suma5(String numeros) {

        char n[] = new char[numeros.length()];
        numeros.getChars(0, numeros.length(), n, 0);
        int resultado = 0;
        String a = "";

        for (int i = 0; i < numeros.length(); i++) {

            if (n[i] == '1' || n[i] == '2' || n[i] == '3' || n[i] == '4' || n[i] == '5' || n[i] == '6' || n[i] == '7' || n[i] == '8' || n[i] == '9' || n[i] == '0') {
                //JOptionPane.showMessageDialog(null, n[i]);
                a = n[i] + "";
                resultado += Integer.parseInt(a);
                //JOptionPane.showMessageDialog(null, a);
            } else {
                // JOptionPane.showMessageDialog(null, n[i]);
            }

        }
        return resultado;
    }

}
