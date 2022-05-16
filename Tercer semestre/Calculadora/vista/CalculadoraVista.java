/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCalculadora;

/**
 *
 * @author User
 */
public interface CalculadoraVista {
    
    public String getNumero1();
    public String getNumero2();
    public void setResultado(String resultado);
    public void iniciar(ControladorCalculadora controlador);
}
