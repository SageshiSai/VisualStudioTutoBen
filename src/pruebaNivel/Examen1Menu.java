package pruebaNivel;

import java.util.Scanner;

public class Examen1Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre, pass,s;
		System.out.println("Usuario:");
		nombre = teclado.next();
		System.out.println("Cotraseña:");
		pass = teclado.next();
		while ((!nombre.equals("LEIRE") || !pass.equals("ABCD"))&&(!nombre.equals("ANTONIO")||!pass.equals("EFGH"))) {
		    System.out.println("ERROR, usuario o contraseña incorrecta");
            System.out.println("Introduce de nuevo los datos");
            System.out.println("Usuario:");
            nombre = teclado.next();
            System.out.println("Cotraseña:");
            pass = teclado.next();
		}
			/*if((!nombre.equals("LEIRE") || !pass.equals("ABCD"))&&(!nombre.equals("ANTONIO")|| !pass.equals("EFGH"))) {
				System.out.println("ERROR, usuario o contraseña incorrecta");
				System.out.println("Introduce de nuevo los datos");
				
			}
			
		}while((!nombre.equals("LEIRE") || !pass.equals("ABCD"))&&(!nombre.equals("ANTONIO")&& !pass.equals("EFGH")));*/
		int a;
		do {
			
		do {
		System.out.println("Bienvenido "+nombre+" ¿Que quieres hacer?");
		System.out.println("1. Crear piramide");
		System.out.println("2. Visualizar la sucesión de Fibonacci");
		a = teclado.nextInt();
		if (a>2 || a<1) {
			System.out.println("ERROR! La opción seleccionada debe ser 1 o 2. Prueba de nuevo.");
		}
		}while(a>2 || a<1);
	switch (a) {
	case(1):
		int n=0;
		
	 	while ((n%2) == 0) {
	 	System.out.println("introduce el numero de filas( numero impar):");
	 	n = teclado.nextInt();
	 	}
	 	int i=1,columna;
	 	
		int o=n;
	 	while (i<=o/2) {
	 		
			columna=1;
			while (columna<=i) {
				System.out.print("*");
				columna++;
			}
			System.out.print("\n");
			i++;
		}
	 	while (i>=0) {
	 		
			columna=1;
			while (columna<=i) {
				System.out.print("*");
				columna++;
			}
			System.out.print("\n");
			i--;
		}
		break;
	case(2):
		int m=0;
		while(m<=1) {
		System.out.println("Introduce un numero mayor que uno:");
	 	m=teclado.nextInt();
	 	
	}
		System.out.println("Los "+m+" primeros términos de la serie de Fibonacci son:");
		for(int f=0,r=1,t=0,l;f<m;f++) {
			l=t+r;
			r=t;
			t=l;
			System.out.print(+t+" ");
		}
	 	
	}
	
	System.out.println("¿Quieres salir? (SI/NO)");
	s = teclado.next();
	if (!s.toUpperCase().equals("SI")) {
		System.out.println("Solo SI o NO");
	}
	while(!s.toUpperCase().equals("SI")&& s.toUpperCase().equals("NO")){
	    
	}
		
		if (s.toUpperCase().equals("SI")) {
			System.out.println("Muchas gracias ya hasta pronto.");
			teclado.close();
			System.exit(0);
		}
		
		
		}while(s.toUpperCase().equals("no"));
	}
	}
