package Evaluacion1;

import java.util.Scanner;

public class Retesuel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double sueldo, resultado, retencion;
		System.out.println("Escribe la cantidad de sueldo");
		sueldo= teclado.nextDouble();
		teclado.close();
		if (sueldo<1000) {
			retencion = 10;
		}
		else if (sueldo == 1000) {
			retencion = 12;
		}
		else if (sueldo < 2000){
			retencion = 14 ;
		}
		else if (sueldo == 2000){
			retencion = 16 ;
		}
		else {
			retencion = 18 ;
		}
		resultado = sueldo*retencion/100;
		System.out.printf("El sueldo es de " + sueldo + " con una retencion de %.2f",resultado);
	}

}
