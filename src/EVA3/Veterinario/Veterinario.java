package EVA3.Veterinario;


import java.util.Scanner;

public class Veterinario {
    protected String dni;
    protected String nombre;
    protected String direccion;
    
        
        public Veterinario() {
            this.dni = "";
            this.nombre = "";
            this.direccion = "";
        }
        public Veterinario(String d, String n, String di) {
            this.dni = d;
            this.nombre = n;
            this.direccion = di;
        }
        public Veterinario(Veterinario v) {
            this.dni = v.dni;
            this.nombre = v.nombre;
            this.direccion = v.direccion;
        }
        
    public void print() {
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Direccion: "+ this.direccion);
        System.out.println("********************");
    };
    public void leer(Scanner teclado) {
        System.out.println("DNI: ");
        this.dni = teclado.nextLine();
        // leo Nombre
        System.out.println("Nombre: ");
        this.nombre = teclado.nextLine();
        System.out.println("Direccion: ");
        this.direccion = teclado.nextLine();
        
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    };
    
}

