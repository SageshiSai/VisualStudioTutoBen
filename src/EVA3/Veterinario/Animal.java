package EVA3.Veterinario;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Animal implements Serializable {
        
    protected String cod;
    protected String nombre;
        
        public Animal() {
            this.cod = "";
            this.nombre = "";
        }
        public Animal(String c, String n) {
            this.cod = c;
            this.nombre = n;
        }
        public Animal(Animal a) {
            this.cod = a.cod;
            this.nombre = a.nombre;
        }
        
    public abstract void print();
    public void leer(Scanner teclado) {
        System.out.println("Codigo: ");
        this.cod = teclado.nextLine();
        // leo Nombre
        System.out.println("Nombre: ");
        this.nombre = teclado.nextLine();
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    };
    
}
