package Evaluacion1;

import java.util.Scanner;

public class Articulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lee por teclado un código de artículo, la cantidad comprada de ese
		 * artículo y el precio unitario de ese artículo, calcula el descuento
		 * en función de la siguiente tabla y muestra los datos anteriores junto 
		 * con el descuento y el precio total por pantalla. Tabla
		 */
		Scanner teclado =new Scanner(System.in);
		int cd, cantidad;
		double descuento, precio, preciototal, totalneto;
		System.out.println("ingrese el codigo del articulo");
		cd=teclado.nextInt();
		System.out.println("ingrese la cantidad comprada del articulo");
		cantidad=teclado.nextInt();
		System.out.println("ingrese el precio del articulo");
		precio=teclado.nextDouble();
		teclado.close();
		
		preciototal=precio*cantidad;
		if (cantidad>100) {
			descuento= preciototal*0.40;
		}
		else if (cantidad>25 && cantidad<= 100) {
			descuento=preciototal*0.20;
		}
		else if (cantidad>10 && cantidad <= 25) {
			descuento=preciototal*0.10;
		}
		else {
			descuento=preciototal*0;
		}
		totalneto = preciototal-descuento;
		System.out.println(cd+totalneto);
	}

}
