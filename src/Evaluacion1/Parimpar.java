package Evaluacion1;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	int n;
	System.out.println("Escribe un nuemro entero");
	n = teclado.nextInt();
	teclado.close();
	
	if ((n%2) == 0) {
		
		System.out.println("El " + n + " es par");
	}
	else {
		System.out.println("El " + n + " es impar");
	}

}
}
