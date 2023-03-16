package Evaluacion1;

import java.util.Scanner;

public class Leerreal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee un número real por teclado y muestra por pantalla el mensaje "El 
		 * valor de la variable introducida es ".
		 */
double n;
Scanner teclado;
teclado = new Scanner(System.in);
System.out.println("Introduce un numero real: ");
n = teclado.nextDouble();
System.out.println("El valor de la variable introducida es: "+n);
teclado.close();
	}

}
