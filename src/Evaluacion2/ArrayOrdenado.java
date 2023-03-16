package Evaluacion2;

import java.util.Scanner;

public class ArrayOrdenado {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int[] numenteros = new int[5];
int n, elementos=0, posicion;
boolean encontrado, lleno=false;
System.out.println("Introduce un numero entero");
n = teclado.nextInt();
while (n>=0 && !lleno) {
    posicion=0;
    encontrado=false;
    while(posicion<elementos && !encontrado) {
        if (numenteros[posicion]>n) {
            encontrado=true;
        }
        else {
            posicion++;
        }
    }
    for(int moverelementos=elementos;moverelementos>posicion && encontrado;moverelementos--) {
        numenteros[moverelementos]= numenteros[moverelementos-1];
    }
    numenteros[posicion]=n;
    elementos++; 
    System.out.println("se ha añadido el numero en la posicion "+posicion);
    if(elementos<5) {
        System.out.println("Introduce un numero entero");
        n=teclado.nextInt();
    }
    else {
            lleno=true;
            teclado.close();
        }
    }
for(posicion=0;posicion<elementos;posicion++) {
    System.out.println(numenteros[posicion]+", ");
}
    }

}
