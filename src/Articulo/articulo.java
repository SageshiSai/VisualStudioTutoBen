package Articulo;

public abstract class articulo {
    //Declaramos las variables necesarias 
    protected String Codigo;
    protected String Nombre;
    protected String Marca;
    protected double precio;
    protected int stock;
        //Creamos el constructor por defecto
        public articulo() {
            
        }
        //Constructor copia
        public articulo ( articulo a) {
            this.Codigo = a.Codigo;
            this.Nombre = a.Nombre;
            this.Marca = a.Marca;
            this.precio = a.precio;
            this.stock = a.stock;
        }
        //Constructor personalizado
        public articulo( String c, String n, String m, double p, int s) {
            this.Codigo= c;
            this.Nombre = n;
            this.Marca = m;
            this.precio = p;
            this.stock = s;
        }
    
    public int sumarStock(int stockNum) {
        this.stock += stockNum;
		return stock;
    }
    public int quitarStock(int stockNum) {
        this.stock -= stockNum;
		return stock;
    }
    public abstract boolean sano();
    public abstract String printCaracteristicas();
    @Override
    public String toString() {
        return ("*****************"+"\n"+"Codigo=" + Codigo +"\n"+ "Nombre=" + Nombre +"\n"+ "Marca=" + Marca +"\n"+ "precio=" + precio
                +"\n"+ "Stock=" + stock+"\n");
    }
    //GettersSetters
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
