package interfazBiblioteca;

public class Libro extends Publicacion implements Prestable  {
	
private boolean prestado;
    
    public Libro(String codigo, String titulo, int año) {
        super(codigo, titulo, año);
        prestado = false;
    }
    
    @Override
    public void prestar() {
    prestado = true;
    }
    
    @Override
    public void devolver() {
    prestado = false;
    }
    
    @Override
    public boolean prestado() {
        return prestado;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Libro [prestado= " + prestado + " ]";
    }



}
