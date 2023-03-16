package pruebaNivel;

import java.util.Scanner;

public class pruevaNivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String name, surname, fruta, pass;
		int edad, realizar, primer,segundo,tercero, total;
		System.out.println("Introduce el nombre");
		name = teclado.next();
		System.out.println("Introduce el apellido");
		surname = teclado.next();
		System.out.println("Introduce la edad");
		edad = teclado.nextInt();
		if (edad < 12) {
			System.out.println("No puedes introducirte en el sistema");
			System.exit(0);
		}
		else {
			System.out.println("Bienvenido "+name+" "+surname+" a la fruteria");
			System.out.println("1- Realizar una nueva compra");
			System.out.println("2- Comprobar si existe fruta");
			System.out.println("3- Introducir fruta");
			System.out.println("4- Salir");
			System.out.println("¿Que quieres realizar?");
			realizar = teclado.nextInt();
			switch (realizar) {
			case (1):
				System.out.println("**Realizar compra**");
				System.out.println("Introduce el precio del primer producto");
				primer = teclado.nextInt();
				while (primer < 0) {
					System.out.println("ERROR, introducelo de nuevo");
					System.out.println("Introduce el precio del primer producto");
					primer = teclado.nextInt();
				}
				System.out.println("Introduce el precio del segundo producto");
				segundo = teclado.nextInt();
				while (segundo < 0) {
					System.out.println("ERROR, introducelo de nuevo");
					System.out.println("Introduce el precio del segundo producto");
					segundo = teclado.nextInt();
				}
				System.out.println("Introduce el precio del tercer producto");
				tercero = teclado.nextInt();
				while (tercero < 0) {
					System.out.println("ERROR, introducelo de nuevo");
					System.out.println("Introduce el precio del tercer producto");
					tercero = teclado.nextInt();
				}
				
				total = primer + segundo + tercero ;
				System.out.println("Total: "+total+" Euro");
				break;
			case (2): 
				System.out.println("**Comprobar si existe fruta**");
				System.out.println("Introduce el nombre de la fruta");
				fruta = teclado.next();
				fruta = fruta.toLowerCase();
				switch (fruta) {
				case ("manzana"): 
					System.out.println("Si tenemos esa fruta");
				break;
				default:
					System.out.println("No tenemos esa fruta");
					
				}
				break;
			case (3): 
				String x;
				x = ("abc");
				do {
				System.out.println("**Introducir Fruta**");
				System.out.println("Para realizar esta accion necesitas ser administrador. Introduce la contraseña:");	
				pass = teclado.next();
				if (pass.equals(x)) {
					System.out.println("Eres administrador");
					System.out.println("Introduce el nombre de la fruta");
					fruta = teclado.next();
					teclado.close();
					for (int i = 1; i <= 3; i++) {
						System.out.println("La fruta " +fruta+ " se ha guardado");
					}
				}
				}while (pass.equals(x)==false);
				
			
					
				break;
			case (4): 
				System.out.println("**Salir**");
				System.out.println("Hasta luego "+name);
				System.exit(0);
			}
		}
	}

}
