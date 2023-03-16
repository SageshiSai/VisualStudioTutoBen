package Evaluacion1;

import java.util.Scanner;

public class Gestionarnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String user, pass;
		do {
		System.out.println("Introduce tu usuario");
		user = teclado.nextLine();
		System.out.println("Introduce tu contraseña");
		pass = teclado.nextLine();
		pass = pass.toUpperCase();
		
		
		int x = pass.indexOf('E');
		if (x >-1){
			System.out.println("ERROR, en la contraseña no puede parecer la e. Introduce otra vez");
		}
		}
		while (pass.indexOf('E') > -1); 
		
		int n;
		System.out.println("!Hola "+user+"!");
		System.out.println("elige una opción");
		System.out.println("1. Introducir notas");
		System.out.println("2. Salir del programa");
		n= teclado.nextInt();
		
		switch (n) {
		case (1):
			
			System.out.println("introduzca los datos del alumno");
		String nombre;
		String apellido;
		double nota1, nota2, nota3, nota4, nota5, mediaexam=0, media;
		System.out.println("Nombre del alumno: ");
		nombre = teclado.next();
		System.out.println("Apellido del alumno: ");
		apellido = teclado.next();
		
		
		System.out.println("Introduzca la nota del primer examen: ");
		nota1 = teclado.nextDouble();
		while (nota1<0 || nota1 >10) {
			System.out.println("ERROR! la nota introducida no puede ser negativa o mayor de 10");
			System.out.println("Introduzka la nota del primer examen");
			nota1=teclado.nextDouble();
		}
		do {
		System.out.println("Introduzca la nota del segundo examen: ");
		nota2 = teclado.nextDouble();
		if (nota2<0 || nota2>10) {
			System.out.println("ERROR! la nota introducida no puede ser negativa o mayor de 10");
		}
		}
		while (nota2<0 || nota2>10);
		
		System.out.println("Introduzca la nota del tercer examen: ");
			nota3 = teclado.nextDouble();
				
		while (nota3<0 || nota3 >10) {
			System.out.println("ERROR! la nota introducida no puede ser negativa o mayor de 10");
			System.out.println("Introduzka la nota del primer examen");
			nota3=teclado.nextDouble();
		}
		System.out.println("Introduzca la nota del ultimo examen: ");
			nota4 = teclado.nextDouble();
			
		while (nota4<0 || nota4>10) {
			System.out.println("ERROR! la nota introducida no puede ser negativa o mayor de 10");
			System.out.println("Introduzka la nota del primer examen");
			nota4=teclado.nextDouble();
		}
		System.out.println("Introduzca la nota del trabajo: ");
			nota5 = teclado.nextDouble();
		while (nota5<0 || nota5>10) {
				System.out.println("ERROR! la nota introducida no puede ser negativa o mayor de 10");
				System.out.println("Introduzka la nota del primer examen");
				nota5=teclado.nextDouble();
		}
		teclado.close();
		mediaexam = ((nota1 + nota2 + nota3)/3)*0.55;
		nota4 = nota4 * 0.3;
		nota5 = nota5 * 0.15;
		media = mediaexam + nota4 + nota5;
		
			if (media >= 0 && media <=4.9) {
				System.out.println("La nota media del alumno " + nombre +" "+ apellido + " es " + media +" SUSPENSO");
			} else if (media >= 5 && media <=5.9) {
				System.out.println("La nota media del alumno " + nombre +" "+ apellido+ " es " + media +" SUFICIENTE");
			} else if (media >= 6 && media <=6.9) {
				System.out.println("La nota media del alumno " + nombre +" "+ apellido+ " es " + media +" BIEN");
			} else if (media >= 7 && media <=8.9) {
				System.out.println("La nota media del alumno " + nombre +" "+ apellido+ " es " + media +" NOTABLE");
			} else if (media >= 9 && media <=10) {
				System.out.println("La nota media del alumno " + nombre +" "+ apellido+ " es " + media +" SOBRESALIENTE");
			}
				
			break;
		case (2):
			System.out.println("Muchas Gracias y Hasta Pronto");
			System.exit(0);
			break;
		default:
			System.out.println("Error");
			System.exit(0);
		}
		
	}
}
							
		

