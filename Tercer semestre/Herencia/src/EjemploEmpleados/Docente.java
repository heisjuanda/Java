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
public class Docente extends Empleado{

    private double calificacion;
    private int salario;
    
    
    public Docente(String nombre, String cedula, Facultad dependencia,int salario,double calificacion) {
        super(nombre, cedula, dependencia);
        this.calificacion=calificacion;
        this.salario=salario;
    }
    
    private int CalcularSalario(){
        
        return salario;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getSalario() {
        return salario;
    }
    
    
    
}
