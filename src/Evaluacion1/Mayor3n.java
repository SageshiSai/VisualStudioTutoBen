package Evaluacion1;

import java.util.Scanner;

public class Mayor3n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a, b, c;
Scanner teclado = new Scanner(System.in);
System.out.println("añade un numero");
a=teclado.nextInt();
System.out.println("añade otro numero");
b=teclado.nextInt();
System.out.println("añade otro numero");
c=teclado.nextInt();
teclado.close();
if (a>b) {
	if (a>c) {
		System.out.println("El numero 1 es mayor");
	}
	else {
		if (a==c) {
			System.out.println("el numero 1 y el 3 son mayores");
		}
		else {
			System.out.println("El numero 3 es mayor");
		}
	}
}
else {
	if (b>a) {
		if (b>c) {
			System.out.println("El numero 2 es mayor");
		}
		else {
			if (b==c) {
				System.out.println("el numero 2 y el 3 son mayores");
			}
			else {
				System.out.println("El numero 3 es mayor");
			}
		}
	}
	else if (b==a){
		System.out.println("El numero 1 y 2 son guales");
	}
	else {
		if (c>a) {
			
				System.out.println("El numero 3 es mayor");
		}
		else {
			System.out.println("el numero 1 y 3 son iguales");
		}
		
		}
	
	}

	}

}
