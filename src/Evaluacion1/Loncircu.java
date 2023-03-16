package Evaluacion1;

import java.util.Scanner;

public class Loncircu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee el valor del radio por teclado, calcula el valor de la circunferencia 
		 * de ese radio, y muestra por pantalla el resultado. Para el cálculo podemos 
		 * usar la constante Java Math.PI.
		 */
double n;
Scanner teclado;
teclado = new Scanner(System.in);
System.out.println("introduce el tamaño del radio");
n = teclado.nextDouble();
n = Math.PI*n*2;
System.out.println("El valor de la circuferencia es: "+n);
teclado.close();
	}

}
