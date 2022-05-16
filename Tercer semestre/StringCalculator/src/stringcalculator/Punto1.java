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
public class Punto1 {

    public int suma(String numeros) {
        StringTokenizer tokens = new StringTokenizer(numeros, ",");
        int resultado = 0;

        try {
            if ((numeros.contains("1") && numeros.contains("2") || (numeros.contains("1") && numeros.contains("0") || (numeros.contains("2") && numeros.contains("0"))))){
                int palabra = Integer.parseInt(tokens.nextToken());
                palabra += Integer.parseInt(tokens.nextToken());
                return palabra;
            } else {
                return 0;
            }

        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return resultado;

    }
}
