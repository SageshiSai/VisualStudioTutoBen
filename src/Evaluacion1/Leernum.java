package Evaluacion1;

import java.util.Scanner;

public class Leernum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  lee un número entero por teclado y lo muestra por pantalla
		 */
		
	int n;
	Scanner teclado;
	teclado = new Scanner(System.in);
	System.out.println("introduce un numero entero");
	n = teclado.nextInt();
	System.out.println("El valor del numero entero es: "+n);
	teclado.close();

	}

}
