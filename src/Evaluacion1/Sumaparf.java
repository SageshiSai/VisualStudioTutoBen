package Evaluacion1;

import java.util.Scanner;

public class Sumaparf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee un numero entero por teclado y muestra la suma de todos los
		 * números pares desde 0 hasta n. Con For
		 */
		Scanner teclado = new Scanner(System.in);
		int n;
		int suma;
		int posicion;
		
		System.out.println("Añade un numero entero");
		n=teclado.nextInt();
		teclado.close();
		
		
		for(suma=0, posicion=2;posicion <= n; posicion = posicion +2 ) {
			suma = suma + posicion;
		}
		System.out.println("Suma " + suma);
	}

}
