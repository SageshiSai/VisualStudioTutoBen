package Evaluacion1;

import java.util.Scanner;

public class Signonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee un número entero por teclado, lo cambia de signo, y lo muestra 
		 * por pantalla
		 */
		int n;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		n = teclado.nextInt();
		n=-n;
		System.out.println("El valor de la variable es: "+n);
		teclado.close();

	}

}
