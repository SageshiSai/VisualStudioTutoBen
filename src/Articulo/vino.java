package Articulo;

public class vino extends articulo{
    protected String color;
    protected String origen;
    protected int año;
    protected String uva;
    
    //constructor por defecto
    public vino() {
        super();
    }
    //constructor copia
    public vino( vino a) {
        super(a);
        this.color = a.color;
        this.origen = a.origen;
        this.año = a.año;
        this.uva = a.uva;
    }
    
    //Constructor por defecto
    public vino(String cc, String n, String m, double p, int s, String c, String o, int a, String u) {
        super(cc,n,m,p,s);
        this.color = c;
        this.origen = o;
        this.año = a;
        this.uva = u;
    }
    @Override
    public String printCaracteristicas() {
        return (super.toString() + "Color: " + color + "\n" +  "Origen: " + origen + "\n" + "Año: " + año + "\n" +"Uva: " + uva);
		
    }
    @Override
    public boolean sano() {
        if(uva == "riojano") {
        return true;
        }   
        return false;
    }
    
    
    
}
