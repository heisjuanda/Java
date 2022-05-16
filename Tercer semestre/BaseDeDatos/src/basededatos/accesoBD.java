/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JuanDavid
 */
public class accesoBD {

    Connection conexion;

    public void conectar() {
        try {//                                     "jdbc:postgresql://localhost:5432/Tienda", "postgres", "Uncinco"
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base1", "postgres", "Uncinco");
        } catch (SQLException ex) {
            Logger.getLogger(accesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertar(Estudiante estudiante) {

        try {
            Statement stmt = conexion.createStatement();
            String consulta = "INSERT INTO public.\"Estudiante\"(\n"
                    + "	\"Código\", \"Nombre\", \"Apellido\", \"Teléfono\")\n"
                    + "	VALUES ('" + estudiante.getCodigo() + "', '" + estudiante.getNombre() + "','" + estudiante.getApellido() + "', '" + estudiante.getTelefono() + "');";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(accesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Estudiante estudiante) {

        try {
            Statement stmt = conexion.createStatement();
            String consulta = "DELETE FROM public.\"Estudiante\"\n"
                    + "	WHERE \"Código\"='" + estudiante.getCodigo() + "';";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(accesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void actualizar(Estudiante estudiante) {

        try {
            Statement stmt = conexion.createStatement();
            String consulta = "UPDATE public.\"Estudiante\"\n"
                    + "	SET \"Código\"='" + estudiante.getCodigo() + "', \"Nombre\"='" + estudiante.getNombre() + "', \"Apellido\"='" + estudiante.getApellido() + "', \"Teléfono\"='" + estudiante.getTelefono() + "'\n"
                    + "	WHERE \"Código\"='" + estudiante.getCodigo() + "';";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(accesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultar() {

        try {
            Statement stmt = conexion.createStatement();
            String consulta = "SELECT \"Código\", \"Nombre\", \"Apellido\", \"Teléfono\"\n"
                    + "	FROM public.\"Estudiante\";";
            ResultSet resultado = stmt.executeQuery(consulta);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Teléfono");
            
            while (resultado.next()) {                
                Object fila[] = new Object[4];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = resultado.getObject(i+1);
                }
                //System.out.println(Arrays.toString(fila));
                modelo.addRow(fila);
            }
            
            JTable tabla = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
        } catch (SQLException ex) {
            Logger.getLogger(accesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
