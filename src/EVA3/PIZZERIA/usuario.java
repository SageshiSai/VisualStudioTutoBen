package EVA3.PIZZERIA;

public class usuario {

    protected int id;
    protected String nombre;
    protected String apellido;

    public usuario() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
    }

    public usuario(usuario a) {
        this.id = a.id;
        this.nombre = a.nombre;
        this.apellido = a.apellido;
    }

    public usuario(int i, String n, String a) {
        this.id = i;
        this.nombre = n;
        this.apellido = a;
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

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
