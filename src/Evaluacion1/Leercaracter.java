package Evaluacion1;

import java.util.Scanner;

public class Leercaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee un caracter por teclado y muestra por pantalla el mensaje "El 
		 * valor de la variable introducida es ".
		 */
		char n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce  una cadena de palabras: ");
		n = teclado.nextLine().charAt(0);
		System.out.println("El valor de la variable introducida es: "+n);
		teclado.close();

	}

}
