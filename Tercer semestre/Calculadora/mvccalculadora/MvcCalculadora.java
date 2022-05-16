/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccalculadora;

import controlador.ControladorCalculadora;
import modelo.Calculadora;
import vista.CalculadoraVista;
import vista.CalculadoraVistaConsola;
import vista.CalculadoraVistaGUISuma;

/**
 *
 * @author User
 */
public class MvcCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tipoVistas tipo = tipoVistas.GUI;
        CalculadoraVista vista = null;
        switch(tipo){
            case CONSOLA:
                vista = new CalculadoraVistaConsola();
            case GUI:
                vista = new CalculadoraVistaGUISuma();
        }
        Calculadora calculadora = new Calculadora();
        ControladorCalculadora controlador = new ControladorCalculadora(calculadora, vista);
        controlador.iniciar();
    }
    
}
