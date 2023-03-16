package Evaluacion1;

import java.util.Scanner;

public class Nxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n, r, i;
		System.out.println("escribe un numero entero");
		n= teclado.nextInt();
		teclado.close();
		r = n*n;
		if (r>100) {
			i = r-100;
			System.out.println("El resultado es " + i);
		}
		else {
			i = 100-r;
			System.out.println("EL resultado le falta " + i + " para llegar a 100");
		}

	}

}
