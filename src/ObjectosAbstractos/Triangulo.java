package ObjectosAbstractos;

import java.util.Objects;

public class Triangulo extends Figura{
    protected double base;
    protected double altura;
        public Triangulo() {
        super();
        this.base=1.0;
        this.altura=1.0;
    }
        public Triangulo(Triangulo t) {
        super(t);
        this.base=t.base;
        this.altura=t.altura;
    }
        public Triangulo(int x, int y, double base, double altura) {
            super(x,y);
            this.base=base;
            this.altura=altura;
        }
        public double area() {
            return ((base*altura)/2);
        }
        public double perimetro() {
            return (base+base+base);
        }
        public String toString() {
            return (super.toString() +" Base: "+base+" Altura: "+altura );
        }
        @Override
        public int hashCode() {
            return Objects.hash(altura, base);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Triangulo other = (Triangulo) obj;
            return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
                    && Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base);
        }
        //CompareTo
        public int compareTo(Triangulo other) {
            Double t1 = this.base;
            Double t2 = other.base;
            int comparacion = t1.compareTo(t2);
            if (comparacion == 0) {
                Double a1 = this.altura;
                Double a2 = other.altura;
                comparacion = a1.compareTo(a2);
            }
            return (comparacion);
        }
}
