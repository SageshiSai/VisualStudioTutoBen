package Evaluacion1;

import java.util.Scanner;

public class EnteroReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee un número real por teclado y muestra por separado su parte
		 * entera y su parte real.
		 */
		Scanner teclado = new Scanner(System.in);
		double r;
		int parteentera;
		double partereal;
		System.out.println("Introduce un numero real ");
		r = teclado.nextDouble();
		teclado.close();
		parteentera = (int)r;
		partereal = r - parteentera ; 
		
		System.out.println("Parte entera " + parteentera + " y parte real " + partereal);
	}

}
