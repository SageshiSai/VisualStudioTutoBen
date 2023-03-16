package Evaluacion1;

import java.util.Scanner;

public class Maximini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		int maximo;
		int minimo;
		System.out.println("agrege un numero");
		n=teclado.nextInt();
		if (n>=0) {
			maximo=n;
			minimo=n;
			while (n>=0) {
				if(n> maximo) {
					maximo=n;
				}
				if(n<minimo) {
					minimo =n;
				}
				System.out.print("Introduzca otro valor entero: ");
				n=teclado.nextInt();
			}
			System.out.println("Maximo "+maximo+ " Minimo " + minimo );
		teclado.close();	
		}
	}
	
	

}
