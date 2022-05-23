/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class Metodos {

    //lIMITES SUPERIOR E INFERIOR
    double a;
    double b;
    //NÚMERO DIVISIÓN, MIENTRAS MÁS GRANDE ES EL NÚMERO, MÁS PEQUEÑOS SERÁN LOS INTERVALOS
    int n;
    //Estos arrays contienen los coeficientes de las X
    // función grado 4 5X^4+X^3+0X^2+4X^1+1
    double[] funcion1 = {5, 1, 0, 4, 1};
    // función grado 5 5X^5-6X^4+7X^3+2X^2+0X^1-34
    double[] funcion2 = {5, -6, 7, 2, 0, -34};
    // función grado 2 -4X^2+2X^1+4
    double[] funcion3 = {-4, 2, 4};
    // función grado 3 0X^3+3.2X^2+50X^1+1
    double[] funcion4 = {0, 3.2, 50, 1};
    // función grado 2 5X^2-2X^|+0
    double[] funcion5 = {5, -2, 0};

    public double MetodoDelTrapecioSimple(int a, int b, double[] funcion) {//porcentaje de error elevado
        double resultado1 = 0;//variables donde se pondrá el resultado de la primera y segunda evaluacion 
        double resultado2 = 0;
        double altura = 0;//Altura de la curva
        altura = a - b;
        for (int i = 0; i < funcion.length; i++) {
            resultado1 += (funcion[i] * (Math.pow(b, (funcion.length - 1 - i))));//sumatoria evaluada en el limite b
        }
        for (int i = 0; i < funcion.length; i++) {
            resultado2 += (funcion[i] * (Math.pow(a, (funcion.length - 1 - i))));//sumatoria evaluada en el limite a
        }
        return ((resultado1 + resultado2) / 2) * altura;//resultado final
    }

    public double MetodoDelTrapecioMultiple(int a, int b, int n, double[] funcion) {//menos margen de error
        double altura = 0;//varaible altura de la curva 
        double resultado1 = 0;//encargadas de almacenar los resultados 
        double resultado2 = 0;
        double resultado3 = 0;
        int contador = 0;//para poder extrar y alamacenar valores resultantes de la evaluacion
        altura = (a - b);
        altura = altura / n;
        double tamaño = (a / altura);
        double[] resultado = new double[(int) (Math.ceil(tamaño))];//donde se almacenan dichos valores

        for (double i = b; i <= a; i = i + altura) {//sumatoria desde los limites
            for (int j = 0; j < funcion.length; j++) {
                if (i == b) {
                    resultado1 += (funcion[j] * Math.pow(i, funcion.length - 1 - j));//evaluacion de la funcion con limite inferior
                }
                if ((i != b && i <= a - altura)) {
                    resultado2 += (funcion[j] * Math.pow(i, funcion.length - 1 - j));//evaluacion de la funcion con i+altura
                }
                if (i >= a) {
                    resultado3 = (funcion[j] * Math.pow(i, funcion.length - 1 - j));//evaluacion final 
                }
            }
            if (i != b) {//donde se alamcenan los valores de resultado para f(x1) hasta f(xn-1)
                resultado[contador] = resultado2;
                contador++;
                resultado2 = 0;//se reinicia el acumulador
            }
        }
        resultado2 = 0;
        for (contador = 0; contador < n; contador++) {
            resultado2 += resultado[contador];//sumatoria de los datos almacenados segun sea el n
        }
        return (altura) * (resultado1 + 2 * resultado2 + resultado3) / 2;//resultado final
    }

    public double MetodoIntegral(int a, int b, double[] funcion) {//exacto
        double valor1 = 0, valor2 = 0;
        //se definen 2 valores que nos ayudaran a almacenar los resultados de los dos límites 

        //se halla la integral sumando uno al exponente y dividiendo por el resultado
        for (int i = 0; i < funcion.length; i++) {//calculamos el primer límite
            if (funcion[i] != 0) {
                valor1 += (funcion[i] * (Math.pow(a, (funcion.length - i)))) / (funcion.length - i);
            }
        }
        for (int i = 0; i < funcion.length; i++) {//calculamos el segundo limite
            if (funcion[i] != 0) {
                valor2 += (funcion[i] * (Math.pow(b, (funcion.length - i)))) / (funcion.length - i);
                //(funcion[i]*(Math.pow(b,(i-1))))/(funcion.length-(i-1));
            }
        }
//se obtiene ya el área bajo la curva de dicha función al restar los limites 
        return (valor1 - valor2);
    }

    public double MetodoDeSimpson(int a, int b, int n, double[] funcion) {//margen de error bajo
        double delta = 0;//variables encargadas de almacenar los valores de las sumatorias
        double resultado1 = 0;
        double resultado2 = 0;
        double resultadoF = 0;
        int contador = 0;
        //delta es la diferencia entre los limites
        //resultado1 almacena los valores de F0 y Fn (su sumatoria)
        //resultado2 almacena los valores de F1 hasta Fn-1 (su sumatoria)
        //resultado total es la formula de Simpson para hallar el área bajo la curva
        if (n < 0) {//n debe de ser postivio siempre
            n = n * -1;
        }
        delta = a - b;//hallando delta 
        delta = delta / n;
        if (n % 2 != 0) {
            n = n + 1;//n siempre debe de ser par, por lo que se cambia a multiplo de 2 si no es par 
        }
        for (double i = b; i <= a; i += delta) {//for que nos permite hacer la sumataria 
            for (int j = 0; j < funcion.length; j++) {//for que nos recorre los coeficientes de la funcion

                if (i == b) {
                    resultado1 += (funcion[j] * Math.pow(b, funcion.length - 1 - j));//evalua la funcion en el primer i f(x0)
                }
                if (i >= a) {
                    resultado1 += (funcion[j] * Math.pow(a, funcion.length - 1 - j));//evalua la funcion en el ultimo i f(xn)
                }
                if (i != b) {//sirve para saber cuando va un 4 o un 2 en la evaluacion
                    if (contador % 2 == 0) {//evalua la funcion en f1
                        resultado2 += 2 * (funcion[j] * Math.pow(i, funcion.length - 1 - j));

                    } else {//evalua la funcion en f2
                        resultado2 += (funcion[j] * Math.pow(i, funcion.length - 1 - j));
                    }
                }
            }
            if ((i != a) && (i < a)) {
                contador++;//para poder evaluar segun el caso de f1 o f2  
            }

        }
        delta = delta / 3;
        resultadoF = delta * (resultado1 + 2 * (resultado2));//se aplico factor comun 2 a la formula creada

        return resultadoF;//resultado final 
    }

    public String VerFuncion(double[] f) {//mostrar la funcion guardada

        String res = " ";//guarda los valores
        for (int i = 0; i < f.length; i++) {//recorrer los coeficientes

            if (i == f.length - 1) {//ultimo coeficiente 
                res += f[i];
            } else {
                if (f[i + 1] >= 0) {//si el numero es positivo
                    res += f[i] + "X^" + (f.length - (i + 1)) + "+";
                } else {//si el numero es negativo
                    res += f[i] + "X^" + (f.length - (i + 1)) + "";
                }

            }

        }
        return res;//mostrar la funcion

    }

}
