/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ManejaEmpleado {
    
    public void insertarEmpleado(String nombre, String cargo, String salario){
        try {
            RandomAccessFile archivo = new RandomAccessFile("empleado.txt", "rw");
            archivo.seek(archivo.length());
            archivo.writeBytes(nombre + "@" + cargo + "@" + salario + "\n");
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String busquedaEmpleado(String nombre){
        String resultado = "";
        
        try {
            RandomAccessFile archivo = new RandomAccessFile("empleado.txt", "r");
            String lineaActual = "";
            while((lineaActual = archivo.readLine())!= null){
                StringTokenizer tokens = new StringTokenizer(lineaActual,"@");
                if(tokens.nextToken().equals(nombre)){
                    resultado = tokens.nextToken() + "-" + tokens.nextToken();
                    return resultado;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado;
    }
    
    public void actualizarEmpleado(String nombre, String cargo, String salario){
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(new File("empleado.txt")));
            String contenidoArchivo = "";
            String lineaActual = "";
            while((lineaActual = entrada.readLine())!=null){
                StringTokenizer tokens = new StringTokenizer(lineaActual, "@");
                if(tokens.nextToken().equals(nombre)){
                    contenidoArchivo += nombre + "@" + cargo + "@" + salario + "\n";
                }else{
                    contenidoArchivo += lineaActual + "\n";
                }
            }
            entrada.close();
            PrintStream salida = new PrintStream(new FileOutputStream(new File("empleado.txt")));
            salida.print(contenidoArchivo);
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarEmpleado(String nombre){
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(new File("empleado.txt")));
            String contenidoArchivo = "";
            String lineaActual = "";
            while((lineaActual = entrada.readLine())!=null){
                StringTokenizer tokens = new StringTokenizer(lineaActual, "@");
                if(!tokens.nextToken().equals(nombre)){
                    contenidoArchivo += lineaActual + "\n";
                }
            }
            entrada.close();
            PrintStream salida = new PrintStream(new FileOutputStream(new File("empleado.txt")));
            salida.print(contenidoArchivo);
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
