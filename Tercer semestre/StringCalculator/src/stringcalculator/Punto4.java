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
public class Punto4 {

    public int suma4(String numeros) {
        //                                              1\n2,3
        StringTokenizer tokens = new StringTokenizer(numeros, ",");

        String resultado = "";
        int fina = 0;
        String palabra = tokens.nextToken();
        //resultado = palabra;

        StringTokenizer token = new StringTokenizer(palabra, "\\n");
        while (token.hasMoreTokens()) {
            palabra = token.nextToken();
            fina += Integer.parseInt(palabra);
        }

        fina += Integer.parseInt(tokens.nextToken());
        return fina;
    }

}
