package EVA3.BaseDatosProg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDSeleccionAlumno {
    public static void main(String[] args) {
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdalumnos", "root", "");
           // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM bdalumnos.alumnos;");
            if(rs.first()) {
                // si hay registros
                // vuelvo al primero
                rs.beforeFirst();
                // recorro registro a registro el ResultSet
                while (rs.next()){
                    System.out.println("DNI: " + rs.getObject("dni") + ", nombre: " + rs.getObject("nombre") + ", Apellidos: " +
                rs.getObject("apellidos") + ", Grupo: " + rs.getObject("grupo"));
                }
                }
                else {
                // si no hay registros
                System.out.println("La tabla no tiene Registros");
                }
           // cierro la conexion
            rs.close();
            conexion.close();
        }
        catch (SQLException e){
           // si NO se ha conectado correctamente
            e.printStackTrace();
            System.out.println("Error de Conexión");
        }
        
    }
}
