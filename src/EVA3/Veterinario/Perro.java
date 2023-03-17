package EVA3.Veterinario;

import java.io.Serializable;
import java.util.Scanner;

public class Perro extends Animal implements Serializable {

    protected String raza;
    
    public Perro(){
        super();
        this.raza = "";
    }
    public Perro(String r, String c, String n){
        super(c,n);
        this.raza = r;
    }
    public Perro(Perro p){
        super(p);
        this.raza = p.raza;
    }

    @Override
    public void print() {
            System.out.println("codigo: "+this.cod);
            System.out.println("Nombre: "+this.nombre);
            System.out.println("raza: "+ this.raza);
            System.out.println("********************");  
    }

    @Override
    public void leer(Scanner teclado) {
        //Leo raza
        super.leer(teclado);
        System.out.println("Tipo de raza");
        this.raza = teclado.nextLine();
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
