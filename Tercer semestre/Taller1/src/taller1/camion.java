/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author JuanDavid
 */
public class camion {
    private String placa;
    private int peso;
    private String destino;
    private int dia;
    private int mes;
    private int año;
    
    
    public camion(String plac,int pes, String destin,int di,int me,int ano){
        placa=plac;
        peso=pes;
        destino=destin;
        dia=di;
        mes=me;
        año=ano;
        
    }
    
    @Override
    public String toString(){
        
        return  placa+", "+peso+", "+destino+", "+dia+", "+mes+", "+año;
    }
    
}

