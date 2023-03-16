package Evaluacion1;

import java.util.Scanner;

public class Valorabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	double n;
	int r;
	System.out.println("Escribe un numero real");
	n = teclado.nextDouble();
	teclado.close();
	if (n>=0) {
	 r = (int) n;
	}
	else {
		r = (int) -n;
	}
	System.out.println("El valor absoluto de " + n + " es " + r);

	}

}
