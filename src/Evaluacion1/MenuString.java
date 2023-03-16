package Evaluacion1;

import java.util.Scanner;

public class MenuString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String user="";
		int n;
		
		System.out.println("Introduce tu usuario");
		user = teclado.nextLine();
		
		System.out.println("Bienvenido "+user+" ¿Que quieres hacer?");
		System.out.println("1. Dar la vuelta a la palabra");
		System.out.println("2. Comparar 2 palabras");
		System.out.println("3. Numero de letras");
		System.out.println("4. Repetir palabra");
		System.out.println("5. Repetir palabra (Mayusculas/Minusculas");
		System.out.println("6. Salir del programa");
		n=teclado.nextInt();
		switch (n) {
		case(1): 
			String palabra;
			System.out.println("Escriba una palabra");
			palabra=teclado.next();
			System.out.println("La palabra introoducida es " + palabra + " y invertida es " + InvertirPalabra(palabra)) ;
			break;
		case(2): 
			String palabra1;
			String palabra2;
			System.out.println("Esbriba 1 palabra");
			palabra1=teclado.next();
			System.out.println("Escriba otra palabra");
			palabra2=teclado.next();
			if (palabra1.equals(palabra2)){
				System.out.println("las 2 palabras son iguales");
			}
			else {
				System.out.println("No son iguales");
			}
			break;
		case(3):
			System.out.println("Añade una palabra");
			palabra=teclado.next();
			System.out.println("La palabra tiene: "+palabra.length()+ " letras");
			int p;
			p=palabra.length();
			if (p <=7) {
				System.out.println("El tamaño de la palabra es pequeño");
			}
			else {
				System.out.println("El tamaño de la palabra es grande");
			}
			break;
		case(4): 
			int veces;
			System.out.println("Inserte la palabra que quieras repetir");
			palabra=teclado.next();
			System.out.println("Inserte el numero de veces que quieras repetir la palabra");
			veces=teclado.nextInt();
			for (int v = veces;v>0;v--) {
				System.out.print(palabra+" ");
			}
			
			break;
		case(5):
			String visu;
		System.out.println("Inserte la palabra que quieras repetir");
		palabra=teclado.next();
		System.out.println("¿Como lo quieres visualizar? (mayusculas | minusculas");
		visu=teclado.next();
		visu = visu.toLowerCase();
		System.out.println("Inserte el numero de veces que quieras repetir la palabra");
		veces=teclado.nextInt();
		while (veces>6) {
			System.out.println("No se puede repetir más de 6 veces");
			System.out.println("ingrese un numero de repeticiones inferior");
			veces=teclado.nextInt();
			teclado.close();
		}
		switch (visu) {
		case("mayusculas"):
				for (int v = veces;v>0;v--) {
				System.out.print(palabra.toUpperCase()+" ");
				}
		break;
		case("minusculas"):
			for (int v = veces;v>0;v--) {
				System.out.print(palabra.toLowerCase()+" ");
				}
		
			}
		
			break;
		case(6):
			System.out.println("Muchas gracias y hasta pronto");
			System.exit(0);
		}
		
		
		
		
}
		static String InvertirPalabra(String palabra) {
		String palabrainvertida = "";
		for (int x = palabra.length() - 1; x >= 0; x--) {
		palabrainvertida = palabrainvertida + palabra.charAt(x);
}
		return palabrainvertida;
}
}
		
	


