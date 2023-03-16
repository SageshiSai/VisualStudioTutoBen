package Evaluacion1;

import java.util.Scanner;

public class MENUCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * muestra un menú y lee por
		 * teclado el valor de una opción. En función de la opción, muestra un mensaje indicando la opción
		 * seleccionada usando una estructura selectiva.
		 */
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("1. Opción 1");
		System.out.println("2. Opción 2");
		System.out.println("3. Opción 3");
		System.out.println("4. Opción 4");
		System.out.println("5. Opción 5");
		System.out.println("0. Salir");
		System.out.println("Elige una opción");
		
		n=teclado.nextInt();
		teclado.close();
		
		switch (n) {
		case 1:
			System.out.println("has elegido la opción 1");
			break;
		case 2:
			System.out.println("has elegido la opción 2");
			break;
		case 3:
			System.out.println("has elegido la opción 3");
			break;
		case 4:
			System.out.println("has elegido la opción 4");
			break;
		case 5:
			System.out.println("has elegido la opción 5");
			break;
		case 0:
			System.out.println("has elegido Salir");
			
		}
		
	}

}
