package Evaluacion1;

import java.util.Scanner;

public class Notavali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la nota");
		nota=teclado.nextDouble();
		teclado.close();
		if ((nota>=0.0) && (nota<=10.0)) {
			System.out.println("Valida");
		}
		else {
			System.out.println("No Valida");
		}
	}

}
