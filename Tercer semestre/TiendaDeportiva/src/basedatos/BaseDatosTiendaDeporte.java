/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

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
import modelo.Productos;
import org.postgresql.util.PSQLException;
import vista.GuiTiendaDeportes;

/**
 *
 * @author JuanDavid
 */
public class BaseDatosTiendaDeporte {

    Connection conexion;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TiendaDeportiva", "postgres", "Uncinco");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosTiendaDeporte.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se encontro la ruta");
        }
    }

    public void cerrar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosTiendaDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertar(Productos productos) {
        conectar();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "INSERT INTO public.\"Productos\"(\n"
                    + "	\"ID\", \"Nombre\", \"Precio\", \"Deporte\")\n"
                    + "	VALUES ('" + productos.getId() + "', '" + productos.getNombre() + "',   " + productos.getPrecio() + " , '" + productos.getTipoDeporte() + "');";

            stmt.executeUpdate(consulta);

        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosTiendaDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();
    }

    public void eliminar(Productos productos) {
        conectar();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "DELETE FROM public.\"Productos\"\n"
                    + "	WHERE \"ID\"='" + productos.getId() + "';";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosTiendaDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();
    }

    public void actualizar(Productos productos) {
        conectar();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "UPDATE public.\"Productos\"\n"
                    + "	SET \"ID\"='" + productos.getId() + "', \"Nombre\"='" + productos.getNombre() + "', \"Precio\"=" + productos.getPrecio() + ", \"Deporte\"='" + productos.getTipoDeporte() + "'\n"
                    + "	WHERE \"ID\"='" + productos.getId() + "';";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosTiendaDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();
    }

    public void consultar() {
        conectar();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "SELECT \"ID\", \"Nombre\", \"Precio\", \"Deporte\"\n"
                    + "	FROM public.\"Productos\";";
            ResultSet resultado = stmt.executeQuery(consulta);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Deporte");

            while (resultado.next()) {
                Object fila[] = new Object[4];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = resultado.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

            JTable tabla = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosTiendaDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();
    }

}
