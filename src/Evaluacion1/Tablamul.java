package Evaluacion1;

import java.util.Scanner;

public class Tablamul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Agrega un numero");
		n=teclado.nextInt();
		System.out.println("la tabla del " +n);
		for (int i = 1; i<=10; i++) {
			System.out.println(n + " * "+i +" = " +n*i );
		}
		
		teclado.close();
	}

}
