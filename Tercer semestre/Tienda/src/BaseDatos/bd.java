/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import Modelo.Producctos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanDavid
 */
public class bd {

    Connection conexion;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tienda", "postgres", "Uncinco");
        } catch (SQLException ex) {
            Logger.getLogger(bd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(bd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardar(Producctos prducto) {
        conectar();
        try {
            Statement stml = conexion.createStatement();
            String consulta = "";
            stml.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();

    }

 

}
