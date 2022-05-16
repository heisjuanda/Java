/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;

import java.util.StringTokenizer;

/**
 *
 * @author JuanDavid
 */
public class Punto3 {

    public int suma3(String numeros) {

        StringTokenizer tokens = new StringTokenizer(numeros, ",");
        int resultado = 0;

        while (tokens.hasMoreTokens()) {
            String palabra = tokens.nextToken();
            try {
                resultado += Integer.parseInt(palabra);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }

        }
        return resultado;
    }

}
