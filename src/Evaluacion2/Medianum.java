package Evaluacion2;

import java.util.Scanner;

public class Medianum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
int n, posicion=0, elementos=0;
double m;
int[] arrayenteros = new int[5];
Scanner teclado = new Scanner(System.in);
System.out.println("Introduzca un valor");
n = teclado.nextInt();
while(elementos <5 && n>=0) {
    arrayenteros[elementos]=n;
    elementos++;
    if (elementos < 5) {
        System.out.println("Introduce un valor");
        n=teclado.nextInt();
    }
}
teclado.close();
posicion = 0;
m=0.0;
while(posicion < elementos) {
    m = m+ arrayenteros[posicion];
    posicion++;
}
m = m/elementos;
System.out.println("La media es "+m);
    }
}
