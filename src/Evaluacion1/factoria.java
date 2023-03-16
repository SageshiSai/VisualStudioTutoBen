package Evaluacion1;

import java.util.Scanner;

public class factoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		int factorial;
		int posicion;
		System.out.println("añade un numero entero ");
		n=teclado.nextInt();
		teclado.close();
		factorial=1;
		posicion=2;
		while (posicion<=n) {
			factorial= factorial*posicion;
			posicion=posicion+1;
		}
		System.out.println("Factorial "+factorial);
	}

}
