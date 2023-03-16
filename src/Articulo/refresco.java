package Articulo;

public class refresco extends articulo {
    protected String sabor;
    protected boolean zumo;
    protected boolean gas;
    protected int azucar;
    //constructor por defecto
    public refresco() {
        super();
    }
    //constructor copia
    public refresco( refresco a) {
        super(a);
        this.sabor = a.sabor;
        this.zumo = a.zumo;
        this.gas = a.gas;
        this.azucar = a.azucar;
    }
    //Constructor presonalizado
    public refresco(String c, String n, String m, double p, int ss, String s, boolean z, boolean g, int a) {
        super(c,n,m,p,ss);
        this.sabor = s;
        this.zumo = z;
        this.gas = g;
        this.azucar = a;
    }
    @Override
    public String printCaracteristicas() {
        return (super.toString()+"Sabor=" + sabor +"\n"+ "Zumo=" + zumo + "\n"+"Gas=" + gas +"\n"+ "Azucar=" + azucar);
    }
    @Override
    public boolean sano() {
        if(azucar < 25) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
