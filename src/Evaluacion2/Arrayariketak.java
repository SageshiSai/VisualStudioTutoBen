package Evaluacion2;

import java.util.Scanner;

public class Arrayariketak {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arrayenteros = new int[10];
        int suma = 0, mayor = 0, min = 100;
        
        for (int f = 0; f < 10; f++) {
            arrayenteros[f] = (int) Math.floor(Math.random() * 100 + 1);
        }
        System.out.println("1. Salir");
        System.out.println("2. Mostrar La Suma");
        System.out.println("3. Mostrar el Maximo");
        System.out.println("4. Mostrar el Minimo");
        System.out.println("5. Mostrar La Media");
        System.out.println("6. Rellenar de Nuevo con nuemros");
        int numero = teclado.nextInt();
        switch (numero) {
            case (1):
                System.exit(0);
                teclado.close();
                break;
            case (2):
                for (int f = 0; f < arrayenteros.length; f++) {
                    suma += arrayenteros[f];
                }
                System.out.println(suma);
                break;
            case (3):
                for (int f = 0; f < arrayenteros.length; f++) {
                    if (arrayenteros[f] > mayor) {
                        mayor = arrayenteros[f];
                    }
                }
                System.out.println(mayor);
                break;
            case (4):
                for (int f = 0; f < arrayenteros.length; f++) {
                    if (arrayenteros[f] < min) {
                        min = arrayenteros[f];
                    }
                }
                System.out.println(min);
                break;
            case (5):
                int media;
                for (int f = 0; f < arrayenteros.length; f++) {
                    suma += arrayenteros[f];
                }
                media = suma / arrayenteros.length;
                System.out.println(media);
                break;
            case (6):
                for (int f = 0; f < 10; f++) {
                    arrayenteros[f] = (int) Math.floor(Math.random() * 100 + 1);
                }
                break;
        }

    }

}
