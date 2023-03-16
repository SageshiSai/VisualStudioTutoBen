package Evaluacion1;

import java.util.Scanner;

public class MENUDIAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  lee por teclado un carácter y
		 *  muestra el día de la semana que le corresponde según la siguiente tabla
		 */
		Scanner teclado = new Scanner(System.in);
		char n;
		System.out.println("L. Lunes");
		System.out.println("M. Martes");
		System.out.println("X. Miercoles");
		System.out.println("J. Jueves");
		System.out.println("V. Viernes");
		System.out.println("S. Sabador");
		System.out.println("D. Domingo");
		
		n=teclado.next().charAt(0);
		teclado.close();
		
		switch (n) {
		case 'L':
		case 'l':
			System.out.println("Has elegido Lunes");
			break;
		case 'M':
		case 'm':
			System.out.println("Has elegido Martes");
			break;
		case 'X':
		case 'x':
			System.out.println("Has elegido Miercoles");
			break;
		case 'J':
		case 'j':
			System.out.println("Has elegido Jueves");
			break;
		case 'V':
		case 'v':
			System.out.println("Has elegido Viernes");
			break;
		case 'S':
		case 's':
			System.out.println("Has elegido Sabado");
			break;
		case 'D':
		case 'd':
			System.out.println("Has elegido Domingo");
			break;
		default:
			System.out.println("No es un caracter valido");
			
		}
		
	}

}
