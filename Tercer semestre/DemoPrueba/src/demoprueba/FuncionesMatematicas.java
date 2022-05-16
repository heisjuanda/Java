/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoprueba;

import java.util.StringTokenizer;

/**
 *
 * @author JuanDavid
 */
public class FuncionesMatematicas {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int buscarMax(int lista1[]) {
        int maxnumero = lista1[0];
        for (int i = 0; i < lista1.length; i++) {
            if (maxnumero < lista1[i]) {
                maxnumero = lista1[i];
            }
        }
        return maxnumero;
    }

    public String edadPerson(int edad) {
        if (edad > 0 && edad < 120) {

            if (edad < 7) {
                return "niño";
            }
            if (edad >= 7 && edad < 18) {
                return "adolescente";

            }
            if (edad >= 18 && edad <= 21) {
                return "joven";
            }
            if (edad > 21) {
                return "cucho";
            }
        } else {
            return "no se pueda";
        }
        return null;

    }

    public String inversoPalabra(String cadena) {
        StringTokenizer tokens = new StringTokenizer(cadena, " ");
        String resultado = "";
        while (tokens.hasMoreTokens()) {
            String palabra = tokens.nextToken();
            StringBuilder b = new StringBuilder();
            b.append(palabra);
            b.reverse();
            if (tokens.hasMoreTokens()) {
                resultado += b + " ";
            } else {
                resultado += b;
            }

        }
        return resultado;
    }

    public boolean validadContraseña(String contraseña) {
        if (contraseña.length() >= 6 && contraseña.length() <= 10) {
            String listaNumeros[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            boolean validacionNumero = false;
            for (String letra : listaNumeros) {
                if (contraseña.contains(letra)) {
                    validacionNumero = true;
                }
            }
            if (validacionNumero) {
                return true;
            } else {
                return false;
            }
            
        } else {
            return false;
        }

    }

}
