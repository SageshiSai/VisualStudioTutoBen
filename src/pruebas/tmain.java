package pruebas;

import java.sql.*;
import java.util.ArrayList;

public class tmain {
    public static void main(String[] args) {
        
        ArrayList<Transportes> transportesArray = new ArrayList<Transportes>();
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/agenciadeviajes", "root", "");
            // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM agenciadeviajes.transporte;");
            int idTransporte = 0;
            ArrayList<String> tipo = new ArrayList<String>();
            if (rs.first()) {  
                // si hay registros
                // vuelvo al primero
                rs.beforeFirst();
                // recorro registro a registro el ResultSet
                while (rs.next()) {
                    idTransporte = (int) rs.getObject("DNI");
                    tipo = (ArrayList<String>) rs.getObject("tipo");
                    transportesArray.add(new Transportes(idTransporte, tipo));
                }
            } else {
                // si no hay registros
                System.out.println("La tabla no tiene Registros");
            }
            // cierro la conexion
            rs.close();
            conexion.close();
        } catch (SQLException e) {
            // si NO se ha conectado correctamente
            e.printStackTrace();
            System.out.println("Error de Conexión");
        }
    }
}
