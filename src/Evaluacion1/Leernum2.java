package Evaluacion1;

import java.util.Scanner;

public class Leernum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  lee un número entero por teclado, le suma 1, y lo muestra por pantalla
		 */
		
	int n,r;
	Scanner teclado;
	teclado = new Scanner(System.in);
	System.out.println("introduce un numero entero");
	n = teclado.nextInt();
	r = n+1;
	System.out.println("El valor del numero entero introducido es: "+n);
	System.out.println("y sumado +1 es:" +r);
	teclado.close();

	}

}
