package Evaluacion2;

import java.util.Scanner;

public class numveces {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n, posicion;
    int [] arrayenteros = new int [10];
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un valor");
    n= teclado.nextInt();
    while (n>=0 && n <=9) {
    arrayenteros[n] = arrayenteros[n]+1;
    System.out.println("Introduce un valor: ");
    n = teclado.nextInt();
    }
    teclado.close();
    posicion=0;
    while(posicion <10) {
        System.out.println(posicion + ": "+arrayenteros[posicion]+"veces");
        posicion = posicion + 1;
    }
    }
   
}