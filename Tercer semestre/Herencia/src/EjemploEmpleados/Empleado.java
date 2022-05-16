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
public class Empleado {
    
    private String nombre;
    private String cedula;
    private Facultad dependencia;

    public Empleado(String nombre, String cedula, Facultad dependencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.dependencia = dependencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDependencia(Facultad dependencia) {
        this.dependencia = dependencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Facultad getDependencia() {
        return dependencia;
    }
    
    
    
}
