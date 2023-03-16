package Evaluacion1;

import java.util.Scanner;

public class Romanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee por teclado un número entero entre 1 y 99 y lo muestra en
		 * números romanos. Si se introduce un número incorrecto muestra el mensaje “Número incorrecto”.
		 */
		Scanner teclado = new Scanner(System.in);
		int n, unidades, decenas;
		System.out.println("inserte un numero entre el 1 y el 99");
		n=teclado.nextInt();
		teclado.close();
		
		
		if (n>1 && n<99) {
			
			unidades= n % 10;
			decenas= n / 10;
		
		switch(decenas) {
		case 1:
			System.out.print("X");
			break;
		case 2:
			System.out.print("XX");
			break;
		case 3:
			System.out.print("XXX");
			break;
		case 4:
			System.out.print("XL");
			break;
		case 5:
			System.out.print("L");
			break;
		case 6:
			System.out.print("LX");
			break;
		case 7:
			System.out.print("LXX");
			break;
		case 8:
			System.out.print("LXXX");
			break;
		case 9:
			System.out.print("XC");
			break;
		}
		switch (unidades) {
		case 1: 
			System.out.print("I");
			break;
		case 2: 
			System.out.print("II");
			break;
		case 3: 
			System.out.print("III");
			break;
		case 4: 
			System.out.print("IV");
			break;
		case 5: 
			System.out.print("V");
			break;
		case 6: 
			System.out.print("VI");
			break;
		case 7: 
			System.out.print("VII");
			break;
		case 8: 
			System.out.print("VIII");
			break;
		case 9: 
			System.out.print("IX");
	}
		}
		else {
			System.out.println("Numero incorrecto");
		}
	}
}



