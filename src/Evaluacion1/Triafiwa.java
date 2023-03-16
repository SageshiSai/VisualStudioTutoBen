package Evaluacion1;

import java.util.Scanner;

public class Triafiwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n, i, columna;
		int o;
		System.out.println("Escribe un numero ");
		n = teclado.nextInt();
		teclado.close();
		o = n;
		i = 1;
		while (i<=o) {
			columna=1;
			while (columna<=i) {
				System.out.print(i);
				System.out.print("\t");
				columna++;
			}
			System.out.print("\n");
			i++;
		}
	}

}
