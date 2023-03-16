package Evaluacion1;

import java.util.Scanner;

public class Calcuiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	double euros, IVA, resultado;
	System.out.println("Escribe la cantidad de euros");
	euros = teclado.nextDouble();
	teclado.close();
	if (euros<20000) {
		IVA = 7;
	}
	else {
		IVA=16;
	}
	resultado = euros*IVA/100;
	System.out.printf("La cantidad de euros ingresada es de " + euros + " Y su IVA es de %.2f",resultado);

	}

}
