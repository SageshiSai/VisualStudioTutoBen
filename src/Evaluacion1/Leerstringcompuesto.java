package Evaluacion1;

import java.util.Scanner;

public class Leerstringcompuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee un String por teclado y muestra por pantalla el mensaje "El valor 
		 * de la variable introducida es ".
		 */
String n;
Scanner teclado;
teclado = new Scanner(System.in);
System.out.println("introduce  una cadena de palabras: ");
n= teclado.nextLine();
System.out.println("El valor de la variable introducida es: "+n);
teclado.close();

	}

}
