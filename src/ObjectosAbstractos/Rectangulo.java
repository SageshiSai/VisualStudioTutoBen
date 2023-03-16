package ObjectosAbstractos;

import java.util.Objects;

public class Rectangulo extends Figura{
    protected double ancho;
    protected double alto;
    public Rectangulo() {
        super();
        this.ancho=1.0;
        this.alto=1.0;
    }
    public Rectangulo(Rectangulo r) {
        super(r);
        this.ancho=r.ancho;
        this.alto=r.alto;
    }
    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x,y);
        this.ancho=ancho;
        this.alto=alto;
    }
    public double area() {
        return ancho*alto;
    }
    public double perimetro() {
        return (2*(ancho+alto));
    }
    public String toString() {
        return (super.toString() +" Ancho: "+ancho+" Alto: "+alto);
    }
    @Override
    public int hashCode() {
        return Objects.hash(alto, ancho);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangulo other = (Rectangulo) obj;
        return Double.doubleToLongBits(alto) == Double.doubleToLongBits(other.alto)
                && Double.doubleToLongBits(ancho) == Double.doubleToLongBits(other.ancho);
    }
    //CompareTo
    public int compareTo(Rectangulo other) {
          Double a1 = this.area();
          Double a2 = other.area();
          int comparacion = a1.compareTo(a2);
          return (comparacion);
    }
}
