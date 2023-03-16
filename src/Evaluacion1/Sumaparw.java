package Evaluacion1;

import java.util.Scanner;

public class Sumaparw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee un numero entero por teclado y muestra la suma de todos los 
		 * números pares desde 0 hasta n. Con While.
		 */
		Scanner teclado = new Scanner(System.in);
		int n;
		int suma;
		int posicion;
		
		System.out.println("Añade un numero entero");
		n=teclado.nextInt();
		teclado.close();
		
		suma=0;
		posicion=2;
		
		while(posicion<=n) {
			suma= suma+posicion;
			posicion=posicion + 2;
		}
		System.out.println("Suma " + suma);
	}

}
