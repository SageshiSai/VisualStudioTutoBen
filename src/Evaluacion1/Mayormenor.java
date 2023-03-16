package Evaluacion1;

import java.util.Scanner;

public class Mayormenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n, r ;
		System.out.println("Agrega un numero entero");
		n = teclado.nextInt();
		System.out.println("Agrega otro numero entero");
		r = teclado.nextInt();
		teclado.close();
		if (n>r) {
		System.out.println("El primero es mayor");
		}
		else if (n<r){
			System.out.println("El segundo es mayor");
		}
		else {
			System.out.println("los dos son iguales");
		}
	}
}
