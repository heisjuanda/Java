/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Calculadora;
import vista.CalculadoraVista;

/**
 *
 * @author User
 */
public class ControladorCalculadora implements ActionListener{

    /**
     * @return the operacion
     */
    public Operaciones getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(Operaciones operacion) {
        this.operacion = operacion;
    }
    
    Calculadora calculadora;
    CalculadoraVista vista;
    private Operaciones operacion;

    public ControladorCalculadora(Calculadora calculadora, CalculadoraVista vista) {
        this.calculadora = calculadora;
        this.vista = vista;
        this.operacion = Operaciones.SUMA;
    }
    
    public void iniciar(){
        vista.iniciar(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        calculadora.setNumero1(Integer.parseInt(vista.getNumero1()));
        calculadora.setNumero2(Integer.parseInt(vista.getNumero2()));
        switch(operacion){
            case SUMA:
                calculadora.sumar();
                break;
            case RESTA:
                calculadora.restar();
                break;
        }
        vista.setResultado(calculadora.getResultado()+"");
    }
}
