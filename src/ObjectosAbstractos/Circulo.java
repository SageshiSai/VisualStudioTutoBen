package ObjectosAbstractos;

import java.util.Objects;

public class Circulo extends Figura{
    protected double radio;
    
    
    public Circulo() {
        super();
        this.radio=1.0;
    }
    public Circulo(Circulo c) {
        super(c);
        this.radio=c.radio;
    }
    public Circulo(int x, int y, double radio) {
        super(x,y);
        this.radio=radio;
    }
    public double area() {
        return Math.PI*radio*radio;
    }
    public double perimetro(){
        return (2*Math.PI*radio);
    }
    @Override
    public String toString() {
        return (super.toString() +" Radio: "+radio);
    }
    @Override
    public int hashCode() {
        return Objects.hash(radio);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circulo other = (Circulo) obj;
        return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
    }
    //CompareTo
    public int CompareTo(Circulo other) {
        Double r1 = this.radio;
        Double r2 = other.radio;
        int comparacion = r1.compareTo(r2);
        return (comparacion);
    }
}
