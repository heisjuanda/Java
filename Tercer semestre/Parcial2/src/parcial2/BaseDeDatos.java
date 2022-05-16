/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Player;

/**
 *
 * @author JuanDavid
 */
public class BaseDeDatos {

    Connection conexion;

    public void conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Ganador", "postgres", "Uncinco");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se encontro la ruta");
        }
    }

    public void cerrar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertar(String p) {
        conectar();
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "INSERT INTO public.ganadores(\n" +
"	ganador)\n" +
"	VALUES ('"+p+"');";

            stmt.executeUpdate(consulta);

        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();
    }

    public void eliminar(String v) {
        conectar();
        try {
            Statement stmt = conexion.createStatement();

            String consulta = "DELETE FROM public.\"Ubicación\"\n"
                    + "	WHERE \"Ubicación\"='" +v+ "';";

            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrar();
    }

}
