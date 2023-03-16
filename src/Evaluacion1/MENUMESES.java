package Evaluacion1;

import java.util.Scanner;

public class MENUMESES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee por teclado un String
		 * con el nombre del mes y muestra el número de mes que le corresponde.
		 */
		Scanner teclado = new Scanner(System.in);
		String n;
		System.out.println("Añade el nombre de un mes");
		n=teclado.nextLine();
		teclado.close();
		//n=.toUpperCase(); || toLowerCase(); Uno es para todo a mayusculas o todo minusculas 
		
		switch (n) {
		case "Enero":
		case "enero":
			System.out.println("1");
			break;
		case "Febrero":
		case "febrero":
			System.out.println("2");
			break;
		case "Marzo":
		case "marzo":
			System.out.println("3");
			break;
		case "Abril":
		case "abril":
			System.out.println("4");
			break;
		case "Mayo":
		case "mayo":
			System.out.println("5");
			break;
		case "Junio":
		case "junio":
			System.out.println("6");
			break;
		case "Julio":
		case "julio":
			System.out.println("7");
			break;
		case "Agosto":
		case "agosto":
			System.out.println("8");
			break;
		case "Septiembre":
		case "septiembre":
			System.out.println("9");
			break;
		case "Octubre":
		case "octubre":
			System.out.println("10");
			break;
		case "Noviembre":
		case "noviembre":
			System.out.println("11");
			break;
		case "Diciembre":
		case "diciembre":
			System.out.println("12");
			break;
		default:
			System.out.println("No es un mes");
		}

	}

}
