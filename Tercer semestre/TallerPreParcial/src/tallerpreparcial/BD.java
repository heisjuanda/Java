/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpreparcial;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Hueso;
import vista.GuiGame;

/**
 *
 * @author JuanDavid
 */
public class BD {

    Connection conexion;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Hueso", "postgres", "Uncinco");
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se encontro la ruta");
        }
    }

    public void cerrar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertar(Hueso v) {
        conectar();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "INSERT INTO public.\"Ubicación\"(\n"
                    + "	\"Ubicación\")\n"
                    + "	VALUES ('"+v.getUbicacion()+"');";
            
            stmt.executeUpdate(consulta);

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();
    }

    public void eliminar(String v) {
        conectar();
        try {
            Statement stmt = conexion.createStatement();

            String consulta = "DELETE FROM public.\"Ubicación\"\n"
                    + "	WHERE \"Ubicación\"='" + v + "';";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();
    }

    public boolean consultar(String boton) {
        conectar();
        String saber = "";
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "SELECT \"Ubicación\"\n"
                    + "	FROM public.\"Ubicación\";";

            ResultSet resultado = stmt.executeQuery(consulta);
            Object Location[] = new Object[1];
            while (resultado.next()) {
                for (int i = 0; i < Location.length; i++) {
                    Location[i] = resultado.getObject(i + 1);
                    //JOptionPane.showMessageDialog(null, Location[i] + "i: " + i);
                    saber += Location[i] + " ";
                }
            }
            //JOptionPane.showMessageDialog(null, saber);
            //JOptionPane.showMessageDialog(null, saber.contains(boton));

            if (saber.contains(boton)) {
                // JOptionPane.showMessageDialog(null, "entra");
                saber = boton;
                return true;
            }

            // eliminar(saber);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();

        return false;
    }

}
