package Evaluacion1;

import java.util.Scanner;

public class CUBO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  lee un número por teclado, calcula el cubo de ese número, y muestra por
		 *  pantalla el resultado.
		 */
		Scanner teclado = new Scanner(System.in);
		double n;
		System.out.println("escribe un numero");
		n = teclado.nextDouble();
		teclado.close();
		double r;
		r = Math.pow(n, 3);
		System.out.println("El valor de la variable escrita es "+ n + " y el cubo de esta es " +r);
			
		
	}

}
