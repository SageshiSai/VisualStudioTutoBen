package EVA3.PIZZERIA;

import java.util.Scanner;

public class pizza {
    protected int id;
    protected String nombre;
    protected String ingredientes;
    protected int precio;

    public pizza() {
        this.id = 0;
        this.nombre = "";
        this.ingredientes = "";
        this.precio = 0;
    }

    public pizza(pizza a) {
        this.id = a.id;
        this.nombre = a.nombre;
        this.ingredientes = a.ingredientes;
        this.precio = a.precio;
    }

    public pizza(int i, String n, String in, int p) {
        this.id = i;
        this.nombre = n;
        this.ingredientes = in;
        this.precio = p;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void print(){
        System.out.println("Id: "+ this.id);
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Ingredientes: "+ this.ingredientes);
        System.out.println("Precio: "+ this.precio);
        System.out.println("***********************");
    }
    public void leer(Scanner teclado){
        System.out.println("AÑADE ID DE LA PIZZA:");
        this.id = teclado.nextInt();
        teclado.nextLine();
        System.out.println("AÑADE NOMBRE DE LA PIZZA:");
        this.nombre = teclado.nextLine().toLowerCase();
        System.out.println("AÑADE LOS INGREDIENTES:");
        this.ingredientes = teclado.nextLine().toLowerCase();
        System.out.println("AÑADE EL PRECIO:");
        int precios = teclado.nextInt();
        if(precios < 0){
            while (precios<=0) {
                System.out.println("El precio no puede ser inferior a 0, Agregre un precio valido");
                System.out.println("AÑADE EL PRECIO:");
                precio = teclado.nextInt();
                this.precio = precios;
            }
        }else {
        this.precio = precios;
        }
    }

}
