package Evaluacion1;

import java.util.Scanner;

public class Leerentero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * e lee un número entero por teclado y muestra por pantalla el mensaje 
		 * "El valor de la variable introducida es ".
		 */
		int n;
Scanner teclado;
teclado = new Scanner(System.in);
System.out.println("Introduce un valor entero: ");
n = teclado.nextInt();
System.out.println("El valor de la variable introducido es: "+n);
teclado.close();
	}

}
