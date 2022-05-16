/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class AccesoBD {
    
    Connection conexion;
    private int[] puntajes;

    public AccesoBD() {
        puntajes = new int[3];
    }
    
    public void abrirConexion(){
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Interactiva","postgres","univalle");
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarPuntaje(String nombre, int puntaje){
        abrirConexion();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "INSERT INTO public.\"Jugador\"(\n" +
"	\"Nombre\", \"Puntaje\")\n" +
"	VALUES ('"+nombre+"', '"+puntaje+"');";
            stmt.executeUpdate(consulta);            
        } 
        catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrarConexion();
    }
    
    public void consultarPuntajes(){
        abrirConexion();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "SELECT \"Nombre\", \"Puntaje\"\n" +
"	FROM public.\"Jugador\";";
            ResultSet resultado = stmt.executeQuery(consulta);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Puntaje");  

            while(resultado.next()){
               
                Object fila [] = new Object [2];
                for(int i = 0 ; i < fila.length ; i++){
                    fila[i] = resultado.getObject(i+1);
                }
                modelo.addRow(fila);
               
            }
            JTable tabla = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrarConexion();
    }
    
    public int consultarPorNombre(String nombre){
        abrirConexion();
        int puntaje = 0;
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "SELECT \"Nombre\", \"Puntaje\"\n" +
"	FROM public.\"Jugador\" WHERE \"Nombre\" = '"+nombre+"';";
            ResultSet resultado = stmt.executeQuery(consulta);
            while(resultado.next()){
                Object fila [] = new Object [2];
                for(int i = 0 ; i < fila.length ; i++){
                    fila[i] = resultado.getObject(i+1);
                    puntaje = resultado.getInt(2);
                }  
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrarConexion();
        return puntaje;
    }
    
    public boolean existe(String nombre){
        abrirConexion();
        boolean existe = false;
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "SELECT \"Nombre\", \"Puntaje\"\n" +
"	FROM public.\"Jugador\" WHERE \"Nombre\" = '"+nombre+"';";
            ResultSet resultado = stmt.executeQuery(consulta);
            if(resultado.next()){
                existe = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrarConexion();
        return existe;
    }
    
    public void validarIngreso(String nombre, int puntaje){
        if(existe(nombre)){
            if( puntaje > consultarPorNombre(nombre)){
                modificarPuntaje(nombre, puntaje);
            } 
        }else{
            guardarPuntaje(nombre, puntaje);
        }
        
    }
    
    public void modificarPuntaje(String nombre, int puntaje){
        abrirConexion();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "UPDATE public.\"Jugador\"\n" +
"	SET \"Puntaje\"='"+puntaje+"'\n" +
"	WHERE \"Nombre\" = '"+nombre+"';";
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrarConexion();
    }
}
