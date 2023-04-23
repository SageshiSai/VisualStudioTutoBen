package EVA3.BaseDatosProg;

import java.sql.*;
import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/agenciadeviajes", "root", "");
           // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado;");
            String DNI = "";
            String nombre = "";
            String apellido = "";
            String email = "";
            String telefono = "";
            String contrasena = "";
            String departamento = "";
            String rol = "";

                while (rs.next()){
                DNI = (String) rs.getObject("DNI");
                nombre = (String) rs.getObject("nombre");
                apellido = (String) rs.getObject("apellido");
                email = (String) rs.getObject("email");
                telefono = (String) rs.getObject("telefono");
                contrasena = (String) rs.getObject("contrasena");
                departamento = (String) rs.getObject("departamento");
                rol = (String) rs.getObject("rol");
                ArrayList<empleado> empleadosArray = new ArrayList<>();
                empleadosArray.add(new empleado(DNI, nombre, apellido, email, telefono, contrasena, departamento, rol));
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
