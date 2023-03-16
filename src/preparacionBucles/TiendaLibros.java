package preparacionBucles;

import java.util.Scanner;

public class TiendaLibros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String a, b, c;
        int d, e;
        System.out.println("Inserte su DNI");
        a = teclado.next();
        System.out.println("Inserte su Nombre");
        b = teclado.next();
        System.out.println("Incerte su Apellido");
        c = teclado.next();
        System.out.println("Inserte se edad");
        d = teclado.nextInt();

        if (d < 18) {
            System.out.println("Debes de tener más de 18 años para poder acceder");
            System.exit(0);
        } else {
            System.out.println(" Bienvenido " + b + " " + c + " ¿Que deceas hacer?");
            System.out.println("1.- Comprar libro");
            System.out.println("2.- Comprobar si hay stock");
            System.out.println("3.- Salir del Programa");
            System.out.println("Elija una opción");
            e = teclado.nextInt();

            switch (e) {
                case (1):
                    int f, g;

                    System.out.println("Introduzca el precio del primer libro");
                    f = teclado.nextInt();
                    while (f < 0) {
                        System.out.println("ERROR, no puedes introducir numeros negativos");
                        System.out.println("Introduzca el precio del primer libro");
                        f = teclado.nextInt();
                    }
                    System.out.println("Introduzca el precio del segundo libro");
                    g = teclado.nextInt();
                    while (g < 0) {
                        System.out.println("ERROR, no puedes introducir numeros negativos");
                        System.out.println("Introduzca el precio del segundo libro");
                        g = teclado.nextInt();
                    }
                    System.out.println("Total: " + (f + g) + " Euros");
                    System.out.println(a);
                    break;
            }

        }
        teclado.close();

    }

}
