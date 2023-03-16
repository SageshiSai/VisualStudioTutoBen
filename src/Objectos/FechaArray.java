package Objectos;

import java.util.Scanner;

public class FechaArray {

    public static void main(String[] args) {
        //pruebo la clase Fecha cuando una array
        FechaT5 [] array = new FechaT5[10];
        FechaT5 f1 = new FechaT5();
        FechaT5 fin = new FechaT5(1,1,1);
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        f1.leer(teclado);
        /*f1.equals(fin)*/
        while((!(f1.compareTo(fin)==0)) && contador<10) {
            array[contador]=new FechaT5(f1);
            contador++;
            System.out.println("Introduzca otra fecha");
            f1.leer(teclado);
        }
        teclado.close();
        
        for(int posicion=0;posicion<contador;posicion++) {
            System.out.println(array[posicion]);
        }
        System.out.println("Fin del programa");
    }

}
