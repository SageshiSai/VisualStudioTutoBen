package Objectos;

import java.util.Scanner;

public class AsignaturaArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Asignatura [] array = new Asignatura[10];
    Asignatura f1 = new Asignatura();
    int contador = 0;
    Scanner teclado = new Scanner(System.in);
    f1.leer(teclado);
    
    
    /*f1.equals(fin)*/
    while(f1.getNota()>=0.0 && contador < array.length) {
        array[contador]=new Asignatura(f1);
        contador++;
        System.out.println("Introduzca otra Asignatura");
        f1.leer(teclado);
    }
    teclado.close();
    
    for(int posicion=0;posicion<contador;posicion++) {
        System.out.println(array[posicion]);
    }
    System.out.println("Fin del programa");
    }
    
}
