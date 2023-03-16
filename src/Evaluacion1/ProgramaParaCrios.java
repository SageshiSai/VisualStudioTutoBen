package Evaluacion1;

import java.util.Scanner;

public class ProgramaParaCrios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String name, pass;
		int edad;
		System.out.println("Introduce el nombre");
		name = teclado.next();
		System.out.println("Introduce la contraseña");
		pass = teclado.next();
		
		while (pass.equals("program")==false) {
			System.out.println("ERROR, introduce los datos de nuevo");
			System.out.println("Introduce el nombre");
			name = teclado.next();
			System.out.println("Introduce la contraseña");
			pass = teclado.next();
		}
		System.out.println("Introduce la edad:");
		edad = teclado.nextInt();
		if (edad<18)
		System.out.println("Bienvenido "+name);
		teclado.close();
	}

}
