/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderiabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class BD {

    Connection conexion;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tienda", "postgres", "Uncinco");
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertar(Producticos productos) {

        try {
            Statement stmt = conexion.createStatement();
            String consulta = "INSERT INTO public.\"Productos\"(\n"
                    + "	\"ID\", \"Nombre\", \"Precio\", \"Descrpción\", \"Cantidad\")\n"
                    + "	VALUES ('" + productos.getId() + "', '" + productos.getNombre() + "', '" + productos.getPrecio()
                    + "', '" + productos.getDescripcion() + "', '" + productos.getCantidad() + "');";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Producticos productos) {

        try {
            Statement stmt = conexion.createStatement();
            String consulta = "DELETE FROM public.\"Productos\"\n"
                    + "	WHERE \"ID\"='" + productos.getId()+ "';";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void actualizar(Producticos productos) {

        try {
            Statement stmt = conexion.createStatement();
            String consulta = "UPDATE public.\"Productos\"\n" +
"	SET \"ID\"='"+productos.getId()+"', \"Nombre\"='"+productos.getNombre()+"', \"Precio\"='"+productos.getPrecio()+"', \"Descrpción\"='"+productos.getDescripcion()+"', \"Cantidad\"='"+productos.getCantidad()+"'\n" +
"	WHERE \"ID\"='"+productos.getId()+"';";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public void consultar() {

        try {
            Statement stmt = conexion.createStatement();
            String consulta = "SELECT \"ID\", \"Nombre\", \"Precio\", \"Descrpción\", \"Cantidad\"\n" +
"	FROM public.\"Productos\";";
            ResultSet resultado = stmt.executeQuery(consulta);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Descripción");
            modelo.addColumn("Cantidad");
            
            while (resultado.next()) {                
                Object fila[] = new Object[5];
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
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
