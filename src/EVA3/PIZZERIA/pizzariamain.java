package EVA3.PIZZERIA;

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

public class pizzariamain {
    public static void main(String[] args) {
        ArrayList<usuario> arrayUsuario = new ArrayList<usuario>();
        ArrayList<pizza> arrayPizza = new ArrayList<pizza>();
        ArrayList<pedido> arrayPedido = new ArrayList<pedido>();
        ArrayList<oferta> arrayOferta = new ArrayList<oferta>();
        usuario p;
        pizza v;
        pedido pe;
        oferta o;
        boolean Modificado = false;
        Scanner teclado = new Scanner(System.in);
        FileInputStream fis;
        ObjectInputStream ois;
        int opcion = 0;
        try {
            fis = new FileInputStream("oferta.dat");
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                o = (oferta) ois.readObject();
                arrayOferta.add(o);
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
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/pizzaria", "root", "");
            // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario;");
            int id = 0;
            String nombre = "";
            String apellido = "";
            while (rs.next()) {
                id = (int) rs.getObject("ID");
                nombre = (String) rs.getObject("nombre");
                apellido = (String) rs.getObject("apellido");
                arrayUsuario.add(new usuario(id, nombre, apellido));
            }

            // cierro la conexion

            rs.close();

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/pizzaria", "root", "");
            // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pizza;");
            int id = 0;
            String nombre = "";
            String ingredientes = "";
            int Precio = 0;
            while (rs.next()) {
                id = (int) rs.getObject("ID");
                nombre = (String) rs.getObject("nombre");
                ingredientes = (String) rs.getObject("ingredientes");
                Precio = (int) rs.getObject("precio");
                arrayPizza.add(new pizza(id, nombre, ingredientes, Precio));
            }

            // cierro la conexion

            rs.close();

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/pizzaria", "root", "");
            // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pedido;");
            int idpizza = 0;
            int idusuario = 0;
            int idpedido = 0;
            int cantidad = 0;

            while (rs.next()) {
                idpizza = (int) rs.getObject("IDPizza");
                idusuario = (int) rs.getObject("IDUsuaruo");
                idpedido = (int) rs.getObject("IDPedido");
                cantidad = (int) rs.getObject("Cantidad");
                arrayPedido.add(new pedido(idpizza, idusuario, idpedido, cantidad));
            }

            // cierro la conexion

            rs.close();

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        do {
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("0- Salir");
            System.out.println("1- Listar Pizzas");
            System.out.println("2- Listar Usuarios");
            System.out.println("3- Listar Pedidos");
            System.out.println("4- añadir una nueva  pizza");
            System.out.println("5- añadir un nuevo  usuario");
            System.out.println("6- añadir un nuevo  pedido");
            System.out.println("7- Listar Ofertas");
            System.out.println("8- Añadir Oferta");
            System.out.println("9- Visualizar ofertas de una pizza");
            System.out.println("Opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    for (pizza pi : arrayPizza) {
                        pi.print();
                    }

                    break;

                case 2:
                    for (usuario u : arrayUsuario) {
                        u.print();
                    }
                    break;
                case 3:
                    for (pedido pedido : arrayPedido) {
                        pedido.print();
                    }
                    break;

                case 4:

                    v = new pizza();
                    teclado.nextLine();
                    System.out.println("Añada una Pizza: ");
                    v.leer(teclado);
                    if (arrayPizza.contains(v))
                        System.out.println("La pizza ya existe");
                    else {
                        arrayPizza.add(new pizza(v));
                        System.out.println("La Pizza a sido añadido correctamente");
                        Modificado = true;
                    }

                    break;
                case 5:
                    p = new usuario();
                    teclado.nextLine();
                    System.out.println("Añada un usuario: ");
                    p.leer(teclado);
                    if (arrayUsuario.contains(p))
                        System.out.println("El usuario ya existe");
                    else {
                        arrayUsuario.add(new usuario(p));
                        System.out.println("El usuario a sido añadido correctamente");
                        Modificado = true;
                    }
                    break;
                case 6:
                    pe = new pedido();
                    teclado.nextLine();
                    System.out.println("Añada un pedido: ");
                    pe.leer(teclado);
                    if (arrayPedido.contains(pe))
                        System.out.println("El pedido ya existe");
                    else {
                        arrayPedido.add(new pedido(pe));
                        System.out.println("El pedido a sido añadido correctamente");
                        Modificado = true;
                    }
                    break;
                case 7:
                    for (oferta Oferta : arrayOferta) {
                        Oferta.print();
                    }
                    break;
                case 8:
                    o = new oferta();
                    teclado.nextLine();
                    System.out.println("Añada una Oferta: ");
                    o.leer(teclado);
                    if (arrayOferta.contains(o))
                        System.out.println("La oferta ya existe");
                    else {
                        arrayOferta.add(new oferta(o));
                        System.out.println("La oferta a sido añadido correctamente");
                        Modificado = true;
                    }
                    break;

                case 9:
                    teclado.nextLine();
                    System.out.println("Cual es el nombre de la pizza");
                    String nombre = teclado.nextLine().toLowerCase();
                    int codigo = 0;
                    boolean ofertas = false;
                    for (pizza a : arrayPizza) {
                    if (a.nombre.equals(nombre) ) {
                            codigo = a.getId();
                        }
                    }
                    for (oferta ofer : arrayOferta) {
                        if (ofer.idpizza == codigo) {
                            ofer.print();
                            ofertas = true;
                        }
                    }
                    if (!ofertas) {
                        System.out.println("No hay ofertas para esta pizza");
                    }
                    break;
                case 0:
                    teclado.close();
                    System.out.println("Fin del programa");
                    if (Modificado) {
                        try {
                            FileOutputStream fos = new FileOutputStream("oferta.dat");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);

                            for (oferta cc : arrayOferta) {
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
                        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/pizzaria",
                                "root", "");
                        // si se ha conectado correctamente
                        System.out.println("Conexión Correcta.");
                        Statement st = conexion.createStatement();
                        st.executeUpdate("DELETE FROM usuario;");
                        int id = 0;
                        String nombres = "";
                        String apellido = "";

                        for (usuario usu : arrayUsuario) {
                            id = usu.getId();
                            nombres = usu.getNombre();
                            apellido = usu.getApellido();
                            st.executeUpdate("INSERT INTO usuario VALUES ('" + id +
                                    "','" + nombres
                                    + "','" + apellido + "');");
                        }
                        st.close();
                        // cierro los recursos abiertos
                        conexion.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        System.out.println("Error de Conexion");
                    }
                    try {
                        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/pizzaria",
                                "root", "");
                        // si se ha conectado correctamente
                        System.out.println("Conexión Correcta.");
                        Statement st = conexion.createStatement();
                        st.executeUpdate("DELETE FROM pizza;");
                        int id = 0;
                        String nombres = "";
                        String ingredientes = "";
                        int Precio = 0;

                        for (pizza usu : arrayPizza) {
                            id = usu.getId();
                            nombres = usu.getNombre();
                            ingredientes = usu.getIngredientes();
                            Precio = usu.getPrecio();
                            st.executeUpdate("INSERT INTO pizza VALUES ('" + id +
                                    "','" + nombres
                                    + "','" + ingredientes
                                    + "','" + Precio + "');");
                        }
                        st.close();
                        // cierro los recursos abiertos
                        conexion.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        System.out.println("Error de Conexion");
                    }
                    try {
                        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/pizzaria",
                                "root", "");
                        // si se ha conectado correctamente
                        System.out.println("Conexión Correcta.");
                        Statement st = conexion.createStatement();
                        st.executeUpdate("DELETE FROM pedido;");
                        int idpizza = 0;
                        int idusuario = 0;
                        int idpedido = 0;
                        int cantidad = 0;

                        for (pedido usu : arrayPedido) {
                            idpizza = usu.getIdpizza();
                            idusuario = usu.getIdusuario();
                            idpedido = usu.getIdpedido();
                            cantidad = usu.getCantidad();
                            st.executeUpdate("INSERT INTO pizza VALUES ('" + idpizza +
                                    "','" + idusuario
                                    + "','" + idpedido
                                    + "','" + cantidad + "');");
                        }
                        st.close();
                        // cierro los recursos abiertos
                        conexion.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        System.out.println("Error de Conexion");
                    }
            }
        } while (opcion != 0);
        teclado.close();
        System.exit(0);

        
    }
}
