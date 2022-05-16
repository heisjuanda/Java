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
public class manejoArchivos {
    
    public void ejemplo1(){
        File archivo = new File("C:\\Users\\User\\Desktop\\apellidos.txt");
        //File archivo = new File("estudiantes");
        if (archivo.exists()){            
            if(archivo.isFile()){
                try {
                    /*System.out.println(archivo.canRead());
                    System.out.println(archivo.canWrite());
                    System.out.println(archivo.getAbsolutePath());
                    System.out.println(archivo.getName());
                    System.out.println(archivo.length());*/
                    
                    /*FileReader lector = new FileReader(archivo);
                    BufferedReader entrada = new BufferedReader(lector);*/
                    BufferedReader entrada = new BufferedReader(new FileReader(archivo));
                    String lineaActual = "";
                    while((lineaActual = entrada.readLine())!= null){
                        System.out.println(lineaActual);
                    }
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(archivo.isDirectory()){
                String listaArchivos [] = archivo.list();
                for(String nombreArchivo : listaArchivos){
                    System.out.println(nombreArchivo);
                }
            }
            
        }                
    }
    
    public String mostrarInfoArchivo(){
        File archivo = new File("nombres.txt");
        String resultado = "La información del archivo es: \n"; 
        resultado += "El nombre es " + archivo.getName() + "\n";
        resultado += "Pesa " + archivo.length() + " bytes\n";
        resultado += "El contenido del archivo es: \n";
        try {
            if(archivo.exists()){
                BufferedReader entrada = new BufferedReader(new FileReader(archivo));
                String lineaActual = "";
                while((lineaActual=entrada.readLine())!=null){
                    resultado += lineaActual + "\n";
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public String mostrarInfoArchivo2(){
        String resultado = "";
        try {
            // r read, w write, rw read and write
            RandomAccessFile entrada = new RandomAccessFile("nombres.txt", "r");
            resultado += "La información del archivo es: \n"; 
            resultado += "El nombre es nombres.txt\n";            
            resultado += "El contenido del archivo es: \n";            
               
            String lineaActual = "";
            while((lineaActual=entrada.readLine())!=null){
                resultado += lineaActual + "\n";
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public String buscarPalabra(String palabra, String idioma, String diccionario){
        String palabraTraducida = "No se encontró la palabra";
        try {
            RandomAccessFile archivo = new RandomAccessFile(diccionario, "r");
            String lineaActual = "";
            while((lineaActual = archivo.readLine())!=null){
                StringTokenizer tokens = new StringTokenizer(lineaActual,",");
                while(tokens.hasMoreTokens()){
                    if(tokens.nextToken().equals(palabra)){
                        if(idioma.equals("ingles")){
                            palabraTraducida = tokens.nextToken();
                        }else if(idioma.equals("tulueño")){                            
                            for(int i = 0 ; i < tokens.countTokens() - 2 ; i++){
                                tokens.nextToken();
                            }                            
                            palabraTraducida = tokens.nextToken();
                        }else if(idioma.equals("triana")){                                                          
                            for(int i = 0 ; i < tokens.countTokens() ; i++){                                
                                tokens.nextToken();
                            }                            
                            palabraTraducida = tokens.nextToken();
                        }
                        
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return palabraTraducida;
    }
    
    public void guardarEnAchivo(){
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("ejemplo.txt"));
            String lineaActual = "";
            String contenidoArchivo = "";
            while((lineaActual=entrada.readLine())!=null){
                contenidoArchivo += lineaActual + "\n";
            }
            entrada.close();
            
            PrintStream salida = new PrintStream(new FileOutputStream(new File("ejemplo.txt")));
            salida.print(contenidoArchivo);
            salida.println("Octubre 29 de 2021");            
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarArchivoRandom(){
        try {
            RandomAccessFile archivo = new RandomAccessFile("ejemplo.txt", "rw");
            archivo.seek(archivo.length());
            archivo.writeBytes("Ya casi es navidad");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
