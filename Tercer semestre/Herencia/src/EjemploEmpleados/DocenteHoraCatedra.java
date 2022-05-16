/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploEmpleados;

/**
 *
 * @author JuanDavid
 */
public class DocenteHoraCatedra extends Docente{

    private int horasAsiganadas;
    
    
    public DocenteHoraCatedra(String nombre, String cedula, Facultad dependencia, int salario, double calificacion,int horasAsiganadas) {
        super(nombre, cedula, dependencia, salario, calificacion);
        this.horasAsiganadas=horasAsiganadas;
    }
    
    
    private int CalcularSalario(){
        return horasAsiganadas*150000;
    }
    
    
    
    
}
