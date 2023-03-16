package Evaluacion1;

import java.util.Scanner;

public class Segundoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee una hora con sus minutos y segundos por teclado, la incrementa
		 * un segundo y la muestra por pantalla. Por ejemplo, si recibe 54h 55m 59s devolverá 54h 56m 0s.
		 */
		Scanner teclado = new Scanner(System.in);
		int hora, minutos, segundos;
		System.out.println("añade la hora");
		hora=teclado.nextInt();
		System.out.println("añade los minutos");
		minutos=teclado.nextInt();
		System.out.println("Añade los segundos");
		segundos=teclado.nextInt();
		teclado.close();
		if (segundos>=0 && segundos<59) {
		segundos = segundos+1;
		}
		else if (segundos==59 && minutos<59) {
			segundos=0;
			minutos=minutos+1;
		}
		else if(hora==23 && segundos==59 && minutos==59){
			 segundos=0;
			 minutos=0;
			 hora=0;
		}
			 else {
				 System.out.println("Esto ya no es una hora normal");
			 }
		/* 
		 * if ( segundos > 59 ) {
		 *  segundos = 0;
		 *  minutos = minutos + 1;
		 *  	if ( minutos > 59 {
		 *  			minutos = 0;
		 *  			hora = hora +1;
		 *  				if (hora>23) {
		 *  				hora=0;
		 *   }				
		 * 	}
		 * }
		 */
			 
		System.out.println("la hora ahora es " + hora +"h "+minutos+"min "+segundos+"s");
		}
		
	}


