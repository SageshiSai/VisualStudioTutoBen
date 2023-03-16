package Evaluacion1;

import java.util.Scanner;

public class Doblenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee un número entero por teclado, calcula su doble, y lo muestra por 
		 * pantalla.
		 */
	int n,r;
	Scanner teclado;
	teclado = new Scanner(System.in);
	System.out.println("Introduce un numero entero");
	n = teclado.nextInt();
	r= n*2;
	System.out.println("El numero introducido es: " +n);
	System.out.println("y el doble de este es: " +r);
	teclado.close();
	

	}

}
