package Evaluacion1;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee por teclado una cantidad en euros, un tipo de interés (ej: 5,5%), y un
		 * período de tiempo expresado en días por pantalla y calcula el 
		 * interés producido en ese tiempo en base a
		 * la fórmula Interes=(Cantidad*TipoInteres*Tiempo)/(360*100) 
		 * Nota: Para mostrar el carácter ‘%’ dentro
		 * de printf debemos escribir ‘%%’. Sino mostrará una excepción.
		 */
		Scanner teclado =new Scanner(System.in);
		double capital, tipointeres, interes;
		int tiempo;
		System.out.println("Escribe la cantdad de euros ");
		capital = teclado.nextDouble();
		System.out.println("Escribe la el tipo de interes (3,5%)");
		tipointeres = teclado.nextDouble();
		System.out.println("escribe el tiempo en dias");
		tiempo = teclado.nextInt();
		teclado.close();
		interes=(capital*tipointeres*tiempo)/(360*100);
		System.out.println("El interes producido en ese tiempo es de " +interes);
	
		

	}

}
