package Objectos;

import java.util.Scanner;

public class FechaMainT5 {

	public static void main(String[] args) {
		// Clase para probar la clase Fecha
		FechaT5 f1 = new FechaT5();
		System.out.println(f1);
		FechaT5 f2 = new FechaT5(7,1,2019);
		System.out.println(f2);
		FechaT5 f3 = new FechaT5(f2);
		System.out.println(f3);
		// Getters and Setters
		f1.setDia(23);
		f1.setMes(6);
		f1.setAño(2020);
		System.out.println(f1);
		// hashCode and equals
		if(f3.equals(f2)) {
			// si son Iguales
			System.out.println(f3 + " y " + f2 + " son Iguales");
		}
		else {
			System.out.println(f3 + " y " + f2 + " NO son Iguales");
		}
		// compareTo
		if(f3.compareTo(f2) > 0) {
			System.out.println(f3 + " es MAYOR que " + f2);
		}
		else if(f3.compareTo(f2) < 0) {
			System.out.println(f3 + " es MENOR que " + f2);
		}
		else {
			System.out.println(f3 + " es IGUAL que " + f2);
		}
		// leer
		Scanner teclado = new Scanner(System.in);
		// leo f1
		System.out.println("Fecha:");
		f1.leer(teclado);
		
		// saco el valor leido por pantalla
		System.out.println("Fecha Leida: "+f1);
		
		// cierro teclado
		teclado.close();		
	}

}
