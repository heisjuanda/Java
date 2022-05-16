/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCalculadora;
import controlador.Operaciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CalculadoraVistaConsola implements CalculadoraVista{
    
    private ControladorCalculadora controlador;
    private String numero1;
    private String numero2;

    @Override
    public String getNumero1() {
        return numero1;
    }

    @Override
    public String getNumero2() {
        return numero2;
    }

    @Override
    public void setResultado(String resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    @Override
    public void iniciar(ControladorCalculadora controlador) {
        this.controlador = controlador;
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            boolean continuar = true;
            while(continuar){
                System.out.println("-----------------");
                System.out.println("---Bienvenido----");
                System.out.println("-----------------");
                System.out.println("Que deseas hacer?");
                System.out.println("+ : Suma");
                System.out.println("- : Resta");
                System.out.println(". : Salir");
                String opcion = buffer.readLine();
                switch(opcion){
                    case "+":
                        controlador.setOperacion(Operaciones.SUMA);
                        break;
                    case "-":
                        controlador.setOperacion(Operaciones.RESTA);
                        break;
                    case ".":
                        System.out.println("Hasta luego");
                        continuar = false;
                        continue;
                    default:
                        System.out.println("Ingresa una opción valida");
                        continue;
                }
                System.out.println("Ingresa el número 1");
                numero1 = buffer.readLine();
                System.out.println("Ingresa el número 2");
                numero2 = buffer.readLine();
                
                controlador.actionPerformed(null);
                System.out.println("Ingresa cualquier cosa para continuar...");
                buffer.readLine();
            }
        }
        catch (IOException ex) {
            Logger.getLogger(CalculadoraVistaConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
}
