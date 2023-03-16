package Articulo;

import java.util.ArrayList;

public class factura implements facturacion{
    int numeros;
    String nombre;
    String apellido;
    ArrayList<LineaFactura> lineasFactura = new ArrayList<LineaFactura>();
    double Total;
    

    //Constructor por defecto
    public factura(int numero, String nombre, String apellido, ArrayList<LineaFactura> array ) {
		this.numeros = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.lineasFactura = array;
	
		
	}
    public void añadirLinea(String Codigo, int Cantidad, double Total) {
        lineasFactura.add(new LineaFactura(Codigo, Cantidad, Total));
    }
    public void print() {
        System.out.println();
		System.out.println("**********************************************************");
		System.out.println("Numero: " + numeros);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		
		for(LineaFactura l : lineasFactura) {
			System.out.println(l);
		}
		System.out.println(calcularTotal());
		System.out.println("**********************************************************");
    }
    
    

    @Override
    public double calcularTotal() {
        double totalLinea = 0;
		for(int i = 0; i<lineasFactura.size(); i++) {
			
				totalLinea =+ lineasFactura.get(i).totalLinea;
				
			}
		
		double total = totalLinea + (totalLinea*IVA);
		return total;
    }

}
