/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanDavid
 */
public class TallerArchivos {

    String paraMostrar2 = "";

    public String primerPunto() {
        String paraMostrar = "";

        try {//  CAMBIE LA RUTA DEL ARCHIVO PROFE PA QUE LE SIRVA 
            FileReader f = new FileReader("C:\\Users\\USUARIO\\Desktop\\yo\\univalle\\Programación\\java\\proyectos\\TallerArchivos\\src\\tallerarchivos\\nombre.txt");
            BufferedReader b = new BufferedReader(f);
            String lineaActual = "";

            while ((lineaActual = b.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(lineaActual, " ");
                //System.out.println(tokens.nextToken() + "" + tokens.nextToken());
                while (tokens.hasMoreTokens()) {
                    paraMostrar += tokens.nextToken() + "" + tokens.nextToken() + "\n";
                    System.out.println("hola");
                }

                System.out.println("llegue");
            }
            System.out.println("a ver que tal salió to \n" + paraMostrar);

        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        } catch (NoSuchElementException ex) {
            System.out.println("Error " + ex);
        }

        return paraMostrar;
    }//PRIMER PUNTO

    public String segundoPuntos(String dirección) {

        try {
            FileReader f = new FileReader(dirección);
            BufferedReader b = new BufferedReader(f);
            String lineaActual = "";

            while ((lineaActual = b.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(lineaActual, " ");
                while (tokens.hasMoreTokens()) {
                    paraMostrar2 += tokens.nextToken() + " " + tokens.nextToken() + "\n";

                }
            }

            p2();

        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex);
            JOptionPane.showMessageDialog(null, "Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
            JOptionPane.showMessageDialog(null, "Error " + ex);
        } catch (NoSuchElementException ex) {
            System.out.println("Error " + ex);
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }

        return paraMostrar2;
    }//PRIMRA PARTE DEL 2DO PUNTO

    public void p2() {
        char arreglo1[] = new char[paraMostrar2.length()];
        try {
            String cadenaNueva = "";
            paraMostrar2.getChars(0, paraMostrar2.length(), arreglo1, 0);
            for (int i = 0; i < arreglo1.length; i++) {

                if ((i % 2) == 0) {
                    String a = "";
                    a += arreglo1[i];
                    cadenaNueva += a.toUpperCase();
                    cadenaNueva.toUpperCase();
                } else {
                    String a = "";
                    a += arreglo1[i];
                    cadenaNueva += a.toLowerCase();
                    cadenaNueva.toLowerCase();
                }

                //System.out.print(arreglo1[i]);
            }
            System.out.println(cadenaNueva);
            paraMostrar2 = cadenaNueva;

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }

    }//MAYUSCULA MINUSCULA LETRAS ARCHIVOS

    public String p22(String y) {
        char arreglo1[] = new char[y.length()];
        try {
            String cadenaNueva = "";
            y.getChars(0, y.length(), arreglo1, 0);
            for (int i = 0; i < arreglo1.length; i++) {

                if ((i % 2) == 0) {
                    String a = "";
                    a += arreglo1[i];
                    cadenaNueva += a.toUpperCase();
                    cadenaNueva.toUpperCase();
                } else {
                    String a = "";
                    a += arreglo1[i];
                    cadenaNueva += a.toLowerCase();
                    cadenaNueva.toLowerCase();
                }

                //System.out.print(arreglo1[i]);
            }
            System.out.println(cadenaNueva);
            y = cadenaNueva;

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return y;
    }//LO MISMO PERO CON EL OTRO BOTON XD

    public String puntoTres(String direccion1, String direccion2, String separador1, String separador2) {

        paraMostrar2 = " ";
        try {
            FileReader f = new FileReader(direccion1);
            FileReader fr = new FileReader(direccion2);

            BufferedReader b = new BufferedReader(f);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual1 = " ", lineaActual2 = " ";

            while ((lineaActual1 = b.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(lineaActual1, separador1);
                while (tokens.hasMoreTokens()) {
                    paraMostrar2 += tokens.nextToken() + "" + tokens.nextToken();
                }
            }
            f.close();
            b.close();
            while ((lineaActual2 = br.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(lineaActual2, separador2);
                while (tokens.hasMoreTokens()) {
                    paraMostrar2 += tokens.nextToken() + "" + tokens.nextToken();
                }
            }
            fr.close();
            br.close();
            
            p3();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error1 " + ex);
            JOptionPane.showMessageDialog(null, "Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error2 " + ex);
            JOptionPane.showMessageDialog(null, "Error " + ex);
        } catch (NoSuchElementException ex) {
            System.out.println("Error3 " + ex);
            JOptionPane.showMessageDialog(null, "Error:\n debes colocar un separador, si son espacios en blanco pon un enter :) " + ex);
        }

        System.out.println(paraMostrar2);
        return paraMostrar2;
    }

    public void p3() {
        try {//     PONER UNA RUTA DE ALGUN ARCHIVO PARA QUE SE GUARDE AHÍ BIEN MELITO
            RandomAccessFile archivo = new RandomAccessFile("C:\\Users\\USUARIO\\Desktop\\yo\\univalle\\Programación\\java\\proyectos\\TallerArchivos\\src\\tallerarchivos\\A_B.txt", "rw");
            archivo.seek(archivo.length());
            archivo.writeBytes(paraMostrar2+"\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TallerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TallerArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        TallerArchivos a = new TallerArchivos();
        a.primerPunto();
        a.segundoPuntos("C:\\Users\\USUARIO\\Desktop\\yo\\univalle\\Programación\\java\\proyectos\\TallerArchivos\\src\\tallerarchivos\\nombre.txt");
        a.p2();
        a.segundoPuntos("C:\\Users\\USUARIO\\Desktop\\yo\\univalle\\Programación\\java\\proyectos\\TallerArchivos\\src\\tallerarchivos\\A.txt");
        a.segundoPuntos("C:\\Users\\USUARIO\\Desktop\\yo\\univalle\\Programación\\java\\proyectos\\TallerArchivos\\src\\tallerarchivos\\B.txt");
        System.out.println("punto3");
        a.puntoTres("C:\\Users\\USUARIO\\Desktop\\yo\\univalle\\Programación\\java\\proyectos\\TallerArchivos\\src\\tallerarchivos\\A.txt", "C:\\Users\\USUARIO\\Desktop\\yo\\univalle\\Programación\\java\\proyectos\\TallerArchivos\\src\\tallerarchivos\\B.txt", " ", " ");
    }

}
