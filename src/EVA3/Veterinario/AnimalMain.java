package EVA3.Veterinario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Perro> arrayPerro = new ArrayList<Perro>();
        ArrayList<Veterinario> arrayVeterinario = new ArrayList<Veterinario>();
        Perro p;
        Veterinario v;
        boolean Modificado = false;
        Scanner teclado = new Scanner(System.in);
        FileInputStream fis;
        ObjectInputStream ois;
        int opcion = 0;
        try {
            fis = new FileInputStream("perros.dat");
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                p = (Perro) ois.readObject();
                arrayPerro.add(p);
            }

            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdveterinario", "root", "");
            // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM veterinario;");
            String dni = "";
            String nombre = "";
            String direccion = "";
            while (rs.next()) {
                dni = (String) rs.getObject("DNI");
                nombre = (String) rs.getObject("nombre");
                direccion = (String) rs.getObject("Direccion");
                arrayVeterinario.add(new Veterinario(dni, nombre, direccion));
            }

            // cierro la conexion

            rs.close();

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        do {
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1- Añadir Perro");
            System.out.println("2- Añadir Veterinario");
            System.out.println("3- Listar Perros");
            System.out.println("4- Listar veterinario");
            System.out.println("0- Salir");
            System.out.println("Opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    p = new Perro();
                    teclado.nextLine();
                    System.out.println("Añada un Perro: ");
                    p.leer(teclado);

                    if (arrayPerro.contains(p))
                        System.out.println("El Perro ya existe");
                    else {
                        arrayPerro.add(new Perro(p));
                        System.out.println("El Perro a sido añadido correctamente");
                        Modificado = true;
                    }
                    break;

                case 2:
                    teclado.nextLine();
                    v = new Veterinario();
                    System.out.println("Añada un alumno: ");
                    v.leer(teclado);

                    if (arrayVeterinario.contains(v))
                        System.out.println("El Veterinario ya existe");
                    else {
                        arrayVeterinario.add(new Veterinario(v));
                        System.out.println("El Veterinario a sido añadido correctamente");
                        Modificado = true;
                    }
                    break;
                case 3:

                    for (Perro al : arrayPerro) {
                        al.print();
                    }
                    break;

                case 4:

                    for (Veterinario al : arrayVeterinario) {
                        al.print();
                    }
                    break;
                case 0:
                    teclado.close();
                    System.out.println("Fin del programa");
                    if (Modificado) {
                        try {
                            FileOutputStream fos = new FileOutputStream("perros.dat");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);

                            for (Perro cc : arrayPerro) {
                                oos.writeObject(cc);
                            }
                            oos.close();
                            fos.close();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdveterinario",
                                "root", "");
                        // si se ha conectado correctamente
                        System.out.println("Conexión Correcta.");
                        Statement st = conexion.createStatement();
                        st.executeUpdate("DELETE FROM bdveterinario.veterinario;");
                        String dni = "";
                        String nombre = "";
                        String direccion = "";

                        for (Veterinario vet : arrayVeterinario) {
                            dni = vet.getDni();
                            nombre = vet.getNombre();
                            direccion = vet.getDireccion();
                            st.executeUpdate("INSERT INTO bdveterinario.veterinario VALUES ('" + dni + "','" + nombre
                                    + "','" + direccion + "');");
                        }
                        st.close();
                        // cierro los recursos abiertos
                        conexion.close();
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        System.out.println("Error de Conexion");
                    }
                    System.exit(0);
            }
        } while (opcion != 0);
        teclado.close();

    }
}
