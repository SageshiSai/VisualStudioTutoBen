package Evaluacion1;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * el valor del radio por teclado, calcula el área de un círculo de ese 
		 * radio, y muestra por pantalla el resultado. Para el cálculo podemos
		 * usar la constante Java Math.PI
		 */
	double n;
	Scanner teclado;
	teclado =new Scanner(System.in);
	System.out.println("Introduce el radio");
	n = teclado.nextDouble();
	teclado.close();
	double r;
	r = Math.PI*n*n;
	System.out.println("El area del radio "+ n + " es " + r);
	}

}
