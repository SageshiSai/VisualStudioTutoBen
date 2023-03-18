package EVA3.PIZZERIA;

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
}
