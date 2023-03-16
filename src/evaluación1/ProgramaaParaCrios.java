package evaluación1;

import java.util.Scanner;

public class ProgramaaParaCrios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String user, pass, salir;
		int edad, election;
		System.out.println("Introduce el nombre");
		user = teclado.next();
		System.out.println("Introduce la contraseña");
		pass = teclado.next();
		
		while (pass.equals("program")==false) { //!pass = lo contrario a contraseña
			System.out.println("ERROR, introduce los datos de nuevo");
			System.out.println("Introduce el nombre");
			user = teclado.next();
			System.out.println("Introduce la contraseña");
			pass = teclado.next();
		}
		System.out.println("Introduce la edad:");
		edad = teclado.nextInt();
		if (edad<18) {
			System.out.println("No tienes acceso al sistema");
			System.exit(0);
		}
		else {
		do {
			System.out.println("Bienvenido "+user+" al programa");
			System.out.println("1. Sumar numero");
			System.out.println("2. Comprobar si existe la letra A");
			System.out.println("3. Salir");
			System.out.println("¿Que quieres hacer?");
			election = teclado.nextInt();
			
		switch (election) {
			
		
		case (1):
			int first, second, total;
		System.out.println("**Sumar numeros**");
		do {
			System.out.println("Inserta el primer numero");
			first = teclado.nextInt();
			System.out.println("Inserta el segundo numero");
			second = teclado.nextInt();
			total = first + second;
			System.out.println("TOTAL: "+total+ " Euros");
			} while (total<0);
			break;
		case (2):
			String word; 
			System.out.println("**Comprobar si existe la letra A");
			System.out.println("Introduce una palabra:");
			word = teclado.next();
			
			if (word.toUpperCase().indexOf('A')!=-1) {
				System.out.println("Contiene la lerta A");
				for (int num = 5; num >=1; num--) {
					System.out.print(word+" /");
				}
				System.out.println("");
			}
			else {
				System.out.println("No contiene la letra A");
			}
			break;
		case (3):
			System.out.println("**SALIR**");
			System.out.println("Hasta luego "+user);
			System.exit(0);		
			}
		System.out.println("¿Quieres salir del programa? Si/No");
		salir= teclado.next();
		salir = salir.toLowerCase();
		}while(salir.equals("no"));
		System.out.println("Hasta luego " +user);
		}
		teclado.close();
	}

}
