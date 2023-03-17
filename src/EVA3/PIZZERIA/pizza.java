package EVA3.PIZZERIA;

public class pizza {
    protected int id;
    protected String nombre;
    protected String ingredientes;
    protected int precio;

    public pizza() {
        this.id = 0;
        this.nombre = "";
        this.ingredientes = "";
        this.precio = 0;
    }

    public pizza(pizza a) {
        this.id = a.id;
        this.nombre = a.nombre;
        this.ingredientes = a.ingredientes;
        this.precio = a.precio;
    }

    public pizza(int i, String n, String in, int p) {
        this.id = i;
        this.nombre = n;
        this.ingredientes = in;
        this.precio = p;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
