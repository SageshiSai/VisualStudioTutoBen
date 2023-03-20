package EVA3.PIZZERIA;

import java.util.Scanner;

public class oferta {
    protected int id;
    protected String nombre;
    protected int idpizza;


    public oferta(){
        this.id = 0;
        this.nombre = "";
        this.idpizza = 0;
    }
    public oferta(oferta o){
        this.id = o.id;
        this.nombre = o.nombre;
        this.idpizza = o.idpizza;
    }
    public oferta(int id, String nombre, int idPizza){
        this.id = id;
        this.nombre = nombre;
        this.idpizza = idPizza;
    }

    public void print() {
        System.out.println("IDOferta: "+this.id);
        System.out.println("Nombre Oferta: "+this.nombre);
        System.out.println("IDPizza: "+this.idpizza);
        System.out.println("*************************");
    }
    public void leer(Scanner teclado){
        System.out.println("AÑADE UN ID:");
        this.id = teclado.nextInt();
        System.out.println("AÑADE NOMBRE DE CLIENTE:");
        this.nombre = teclado.nextLine();
        System.out.println("AÑADE EL ID DE LA PIZZA:");
        this.idpizza = teclado.nextInt();
    }
}
