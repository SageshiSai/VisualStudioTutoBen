package examen3EV;

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
import java.util.InputMismatchException;
import java.util.Scanner;

public class tiendamain {
    public static void main(String[] args) {
        String user = "";
        String password;
        int tipo = 0;
        boolean login = false;
        boolean ModificadoUsers = false;
        Scanner teclado = new Scanner(System.in);
        ArrayList<users> usersArrayList = new ArrayList<users>();
        ArrayList<cliente> clientesArrayList = new ArrayList<cliente>();
        ArrayList<ordenador> ordenadoresArrayList = new ArrayList<ordenador>();
        ArrayList<compra> comprasArrayList = new ArrayList<compra>();
        FileInputStream fis;
        ObjectInputStream ois;
        boolean CompraGuardada = false;
        ordenador or;
        boolean ModificadoOrdenador = false;
        users u = new users();
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
            // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cliente;");
            String dni = "";
            String nombre = "";
            String apellido = "";
            while (rs.next()) {
                dni = (String) rs.getObject("dni");
                nombre = (String) rs.getObject("nombre");
                apellido = (String) rs.getObject("apellido");
                clientesArrayList.add(new cliente(dni, nombre, apellido));
            }

            // cierro la conexion

            rs.close();

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
            // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM compra;");
            int idCompra = 0;
            int idOrdenador = 0;
            String dni = "";
            int cantidad = 0;
            while (rs.next()) {
                idCompra = (int) rs.getObject("idCompra");
                idOrdenador = (int) rs.getObject("idOrdenador");
                dni = (String) rs.getObject("dni");
                cantidad = (int) rs.getObject("cantidad");
                comprasArrayList.add(new compra(idCompra, idOrdenador, dni, cantidad));
            }

            // cierro la conexion

            rs.close();

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
            // si se ha conectado correctamente
            System.out.println("Conexión Correcta.");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ordenador;");
            int id = 0;
            String nombre = "";
            String caracteristicas = "";
            int precio = 0;
            int stock = 0;
            while (rs.next()) {
                id = (int) rs.getObject("id");
                nombre = (String) rs.getObject("nombre");
                caracteristicas = (String) rs.getObject("caracteristicas");
                precio = (int) rs.getObject("precio");
                stock = (int) rs.getObject("stock");
                ordenadoresArrayList.add(new ordenador(id, nombre, caracteristicas, precio, stock));
            }

            // cierro la conexion

            rs.close();

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            fis = new FileInputStream("users.dat");
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                u = (users) ois.readObject();
                usersArrayList.add(u);
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

        while (!login) {

            System.out.println("Bienvenido!");
            System.out.println("Inserta tu usuario/contraseña");
            System.out.println("User: ");
            user = teclado.next();
            System.out.println("Password: ");
            password = teclado.next();
            try {
                System.out.println("Tipo: ");
                tipo = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Tienes que insertar un numero");
            }

            for (users a : usersArrayList) {
                if (a.getUser().equals(user)) {
                    if (a.getPassword().equals(password)) {
                        login = true;
                    }
                }
            }

            if (!login) {
                System.out.println("El usuario / contraseña no existen en nuestro sistema");
                System.out.println("Vuelve a introducirlos");
            }
            teclado.nextLine();
        }
        int opcion = 0;
        do {
            System.out.println("Bienvenido " + user);
            System.out.println("Que quieres hacer?");
            System.out.println("0- Salir");
            System.out.println("1- Añadir un nuevo usuario");
            System.out.println("2- Listar clientes-");
            System.out.println("3- Listar Ordenadores");
            System.out.println("4- Listar Las Compras");
            System.out.println("5- Añadir un nuevo ordenador");
            System.out.println("6- Realizar una compra");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    if (tipo == 1) {
                        u.añadirUsuarios(teclado);
                        usersArrayList.add(u);
                    } else {
                        System.out.println("No tienes permisos ");
                    }
                    break;
                case 2:
                    for (cliente c : clientesArrayList) {
                        c.print(c);
                    }
                    break;
                case 3:
                    for (ordenador o : ordenadoresArrayList) {
                        o.print(o);
                    }
                    break;
                case 4:
                    for (compra c : comprasArrayList) {
                        c.print(c);
                    }
                    break;
                case 5:
                    or = new ordenador();
                    int id = ordenadoresArrayList.size();
                    id += 1;
                    or.añadirOrdenadores(teclado, id);
                    ordenadoresArrayList.add(or);
                    System.out.println("Se ha añadido el ordenador correctamente.");
                    ModificadoOrdenador = true;
                    break;
                case 6:
                    or = new ordenador();
                    int Cantidad = 0;
                    boolean existe = false;
                    int Id = 0;
                    String DNI = "";
                    int Cantidad2 = 0;
                    boolean stock0 = false;
                    System.out.println("Realizar una compra");
                    System.out.println("-------------------");
                    for (ordenador o : ordenadoresArrayList) {
                        o.printhorizontal(o);
                    }
                    while (!existe) {
                        System.out.println("Que ordenador quieres?");
                        System.out.println("Introduce el id");
                        Id = teclado.nextInt();
                        for (ordenador orde : ordenadoresArrayList) {
                            if (Id == orde.getId()) {
                                existe = true;
                                if (orde.getStock() == 0) {
                                    System.out.println("No se puede realizar este pedido, el stock es 0");
                                    stock0 = true;
                                } else {
                                    Cantidad = orde.getStock();
                                }
                            }
                        }
                    }
                    if(!stock0){
                    for (cliente c : clientesArrayList) {
                        c.printhorizontal(c);
                    }
                    cliente cliente = new cliente();
                    existe = false;
                    while (!existe) {
                        System.out.println("Quien es el cliente?");
                        System.out.println("Introduce el DNI");
                        DNI = teclado.next();
                        for (cliente c : clientesArrayList) {
                            if (c.getDni().equals(DNI)) {
                                cliente = c;
                            }
                        }
                        if (clientesArrayList.contains(cliente)) {
                            existe = true;
                            while (!CompraGuardada) {
                                for (ordenador ord : ordenadoresArrayList) {
                                    if (Id == ord.getId()) {
                                        System.out.println("Cuantos ordenadores quieres?");
                                        Cantidad2 = teclado.nextInt();
                                        if (Cantidad2 <= Cantidad) {
                                            ord.quitarStock(Cantidad2);
                                            System.out.println("Se ha modificando el stock");
                                            CompraGuardada = true;
                                        } else {
                                            System.out.println("No se puede realizar este pedido, tenemos " + Cantidad
                                                    + " Ordenadores");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Cantidad = comprasArrayList.size();
                    Cantidad += 1;
                    compra com = new compra(Cantidad, Id, DNI, Cantidad2);
                    comprasArrayList.add(com);
                    System.out.println("La compra ha sido guardada");
                }
                    break;
            }
        } while (opcion != 0);

        teclado.close();
        if (CompraGuardada) {
            try {
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda",
                "root", "");
                // si se ha conectado correctamente
                System.out.println("Conexión Correcta.");
                Statement st = conexion.createStatement();
                st.executeUpdate("DELETE FROM tienda.compra;");
                int idCompra = 0;
                int idOrdenador = 0;
                String dni = "";
                int cantidad = 0;
                
                for (compra com : comprasArrayList) {
                    idCompra = com.getIdCompra();
                    idOrdenador = com.getIdOrdenador();
                    dni = com.getDni();
                    cantidad = com.getCantidad();
                    st.executeUpdate("INSERT INTO tienda.compra VALUES (" + idCompra + "," + idOrdenador
                    + ",'" + dni + "'," + cantidad +");");
                }
                st.close();
                // cierro los recursos abiertos
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error de Conexion");
            }
            if (ModificadoUsers) {
                try {
                    FileOutputStream fos = new FileOutputStream("users.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
    
                    for (users cc : usersArrayList) {
                        
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
            if (ModificadoOrdenador) {
                try {
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda",
                            "root", "");
                    // si se ha conectado correctamente
                    System.out.println("Conexión Correcta.");
                    Statement st = conexion.createStatement();
                    st.executeUpdate("DELETE FROM tienda.ordenador;");
                    int id = 0;
                    String nombre = "";
                    String caracteristicas = "";
                    int precio = 0;
                    int stock = 0;
    
                    for (ordenador ord : ordenadoresArrayList) {
                        id = ord.getId();
                        nombre = ord.getNombre();
                        caracteristicas = ord.getCaracteristicas();
                        precio = ord.getPrecio();
                        stock = ord.getStock();
                        st.executeUpdate("INSERT INTO tienda.ordenador VALUES (" + id + ",'" + nombre
                                + "','" + caracteristicas + "'," + precio + "," + stock + ");");
                    }
                    st.close();
                    // cierro los recursos abiertos
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Error de Conexion");
                }
            }
        }
    }
}
