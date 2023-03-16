package Evaluacion1;

import java.util.Scanner;

public class Triafifa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n, fila, columna;
		int filas;
		System.out.println("Escribe un numero ");
		n = teclado.nextInt();
		teclado.close();
		filas = n;

for(fila=1;fila<=filas;fila++) {
	for (columna=1;columna<=filas;columna++) {
		System.out.print(fila);
		System.out.print("\t");
	}
	System.out.print("\n");
}
	}

}