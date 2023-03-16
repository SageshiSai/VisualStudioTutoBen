package Articulo;

public class LineaFactura {

	public String Codigo;
	public int Cantidad;
	public double totalLinea;
	
	public LineaFactura(String Codigo, int Cantidad, double totalLinea) {
		this.Codigo = Codigo;
		this.Cantidad = Cantidad;
		this.totalLinea = totalLinea;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public double getTotalLinea() {
		return totalLinea;
	}

	public void setTotalLinea(double totalLinea) {
		this.totalLinea = totalLinea;
	}

	@Override
	public String toString() {
		return "LineaFactura [Codigo=" + Codigo + ", Cantidad=" + Cantidad + ", totalLinea=" + totalLinea + "]";
	}
}
