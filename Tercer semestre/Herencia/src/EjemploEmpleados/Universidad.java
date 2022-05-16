/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploEmpleados;

import java.util.Arrays;

/**
 *
 * @author JuanDavid
 */
public class Universidad {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", "1234", Facultad.Ingenieria);
        System.out.println(empleado.getDependencia());
        System.out.println(Arrays.toString(Facultad.values()));
        
      
    }
}
