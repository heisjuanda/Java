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
public class DocenteTiempoCompleto extends Docente{
    
    private int horasInvestigacion;
    private NivelDeEstudios nivelEstudios;

    public DocenteTiempoCompleto(int horasInvestigacion, String nombre, String cedula, Facultad dependencia, int salario, double calificacion,NivelDeEstudios nivelEstudios) {
        super(nombre, cedula, dependencia, salario, calificacion);
        this.horasInvestigacion = horasInvestigacion;
        this.nivelEstudios=nivelEstudios;
    }

    
    
    private int CalcularSalario(){
        //ouble salarioBase = getCalificacion()<4.5;
        int salarioBase=0;
        if(getCalificacion()>4.5){
            salarioBase=2000000;
            
        }else{
            salarioBase=0;
        }
        
        if(nivelEstudios.equals(NivelDeEstudios.Pregrado)){
             return 1600000;
        }else if(nivelEstudios.equals(NivelDeEstudios.Pregrado)){
            return 2000000;
        }else{
            return 4000000;
        }
       
        /*switch(nivelEstudios){
            case Doctorado:
                return salarioBase+1600000;
                break;
        }*/
        
    }
    
    
}
