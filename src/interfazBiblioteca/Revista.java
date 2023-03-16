package interfazBiblioteca;

public class Revista extends Publicacion {
	
	private int numero;
	
	public Revista(String codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		this.numero = numero;
		}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + "Revista [numero=" + numero + " ]";
	}




}
