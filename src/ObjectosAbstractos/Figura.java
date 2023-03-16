package ObjectosAbstractos;

public abstract class Figura {
    protected int x;
    protected int y;
        public Figura(int x, int y) {
            this.x=x;
            this.y=y;
        }
        public Figura() {
            this.x= 0;
            this.y= 0;
        }
        public Figura(Figura f) {
            this.x= f.x;
            this.y= f.y;
        }
    public abstract double area();
    public abstract double perimetro();
    @Override
    public String toString() {
        return ("X: "+ x+" Y: "+y);
    }
    
    
}
