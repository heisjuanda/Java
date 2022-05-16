/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasesDeDatos;

import Modelo.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class bdProducto {
    
    Connection conexion;
    
    public void abrirConexion(){
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Interactiva","postgres","root1234");
        } catch (SQLException ex) {
            Logger.getLogger(bdProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(bdProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarProducto(Producto producto){
        abrirConexion();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "INSERT INTO public.\"Producto\"(\n" +
"	nombre, precio, categoria)\n" +
"	VALUES ('"+producto.getNombre()+"', "+producto.getPrecio_por_unidad()+", '"+producto.getCategoria()+"');";
            stmt.executeUpdate(consulta);            
        } 
        catch (SQLException ex) {
            Logger.getLogger(bdProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrarConexion();
    }
}
