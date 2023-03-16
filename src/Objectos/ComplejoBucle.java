package Objectos;

import java.util.Scanner;

public class ComplejoBucle {

    public static void main(String[] args) {
        // Pruebo la clase Complejo 
        Complejo c = new Complejo();
        Complejo fin = new Complejo(-1,-1);
        
        Scanner teclado = new Scanner(System.in);
        //Leo c
        System.out.println("Introduce los datos del complejo c");
        c.leer(teclado);
        while (!c.equals(fin)) {
            //Mientras que NO se introduzcan el numero complejo -1-1i
            System.out.println(c);
            //leo otro c
            System.out.println("Introduce los datos del complejo c");
            c.leer(teclado);
        }
        System.out.println("fin del programa.");
        teclado.close();

    }

}
