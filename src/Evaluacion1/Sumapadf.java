package Evaluacion1;

import java.util.Scanner;

public class Sumapadf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		int suma;
		int posicion;
		
		System.out.println("Añade un numero entero");
		n=teclado.nextInt();
		teclado.close();
		
		for (suma=0,posicion= n - (n%2);posicion >=2; posicion = posicion - 2) {
			suma = suma + posicion;
		}
		System.out.println("numero entero añadido es " + n + " y suma es " + suma);
	}

}
