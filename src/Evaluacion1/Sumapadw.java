package Evaluacion1;

import java.util.Scanner;

public class Sumapadw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * w lee un numero entero por teclado y muestra la suma de todos los
		 * números pares desde n hasta 0 (en orden descendente). Con While.
		 */
		Scanner teclado = new Scanner(System.in);
		int n;
		int suma;
		int posicion;
		
		System.out.println("Añade un numero entero");
		n=teclado.nextInt();
		teclado.close();
		
		suma=0;
		posicion = n - (n % 2);
		while (posicion >=2) {
			suma = suma + posicion;
			posicion = posicion - 2;
		}
	System.out.println("La suma de los pares " + n + " hasta 0 es " + suma);
	}

}
