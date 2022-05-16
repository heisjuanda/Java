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
public class Punto6 {

    public int suma6(String numeros, String delimitadores) {
        char n[] = new char[delimitadores.length()];

        if (delimitadores.contains("//\\n")) {
            JOptionPane.showMessageDialog(null, "entro1");
            delimitadores.getChars(0, delimitadores.length(), n, 0);
            String deli = " ";
            for (int i = 0; i < n.length; i++) {
                if (n[i] != '/' || n[i] != '\\' || n[i] != '\n' || n[i] != 'n') {
                    deli = n[i] + "";
                }
            }
            StringTokenizer tokens = new StringTokenizer(numeros, deli);
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
        } else {
            JOptionPane.showMessageDialog(null, "entro2");
            
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

}
