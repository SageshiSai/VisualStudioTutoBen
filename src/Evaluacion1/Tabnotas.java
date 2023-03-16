package Evaluacion1;

import java.util.Scanner;

public class Tabnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Escribe la nota del 0 al 10");
		n =teclado.nextInt();
		teclado.close();
		
		if (n>=9) {
			System.out.println("SOBRE");
			}
		else if (n>=7){
				System.out.println("NOT");
			}
		else if (n>=6){
			System.out.println("BIEN");
		}
		else if (n>=5){
			System.out.println("SUF");
		}
		else if (n>=3){
			System.out.println("INS");
		}
		else {
				System.out.println("MD");
			}
	
	}

}
