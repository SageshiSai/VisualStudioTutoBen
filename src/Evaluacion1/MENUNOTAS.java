package Evaluacion1;

import java.util.Scanner;

public class MENUNOTAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * que modifica TABNOTAS para
		 * que el proceso se realiza usando una estructura selectiva.
		 */
		Scanner teclado = new Scanner(System.in);
		double nota;
		int  notaentero;
		System.out.println("Inserte una nota");
		nota=teclado.nextDouble();
		teclado.close();
		notaentero=(int)nota;
		switch (notaentero) {
		case 0:
		case 1:
		case 2:
			System.out.println("MD");
			break;
		case 3:
		case 4:
			System.out.println("INS");
			break;
		case 5:
			System.out.println("SUF");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 7:
		case 8:
			System.out.println("NOT");
			break;
		case 9:
		case 10:
			System.out.println("SOBRE");
			break;
		default:
			System.out.println("No es una nota");
		}
	}

}
