package Evaluacion1;

public class Mostrarformato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * coge el valor de una variable de tipo String y el valor de una 
		 * variable de tipo real y muestra por pantalla la cadena y la variable real con 2 decimales.
		 */
		String n;
		Double r;
		n= "hola mundo";
		r= Math.PI;
		System.out.printf("El valor de la variable es %.2f",r);
		System.out.println("\nEl valor de la variable es " +n );
		

	}

}
