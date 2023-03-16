package ObjectosAbstractos;

public class Cuadrado extends Rectangulo{
    public Cuadrado() {
        super();
    }
    public Cuadrado(Cuadrado cu) {
        super(cu);
    }
    public Cuadrado(int x, int y, double lado) {
        super(x,y,lado,lado);
    }
    public String toString() {
        return (super.toString());
    }
    

}
