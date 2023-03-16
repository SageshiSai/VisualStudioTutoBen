package Evaluacion1;

import java.util.Scanner;

public class CentimosEuro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee una cantidad en euros por teclado y muestra por separado el
		 * número de euros y el número de céntimos de euro
		 */
		Scanner teclado = new Scanner(System.in);
		double r;
		int euros;
		int centimos;
		System.out.println("Escribe la cantidad de euros" );
		r = teclado.nextDouble();
		teclado.close();
		euros = (int)r;
		centimos =(int)(( r - euros)*100); 
		System.out.println("el numero de euros que hay son " +euros + " y de centimos " + centimos);
		
		

	}

}
