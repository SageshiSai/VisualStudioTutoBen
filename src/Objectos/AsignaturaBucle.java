package Objectos;

import java.util.Scanner;

public class AsignaturaBucle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Pruebo la clase Asignatura
            Asignatura a1 = new Asignatura();
            
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce los datos de Asignatura");
            a1.leer(teclado);
            
            while (a1.getNota()>=0.0) {
                //mientras que NO se introduzca nota negativa
                System.out.println(a1);
                //leo otra
                System.out.println("Introduce los datos de Asignatura");
                a1.leer(teclado);
            }
            System.out.println("Fin del Programa.");
            teclado.close();
    }

}
