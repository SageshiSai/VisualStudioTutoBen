package Evaluacion2;

import java.util.Scanner;

public class Mediatem {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int elementos = 0;
        double n;
        double[] Arraytemp = new double[10];
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una temperatura");
        n = teclado.nextDouble();

        while ((elementos < 10) && (n != -999)) {
            Arraytemp[elementos] = n;
            elementos++;
            if (elementos < 10) {
                System.out.println("Introduce una temperatura");
                n = teclado.nextInt();
            }
        }
        teclado.close();
        if (elementos > 0) {
            media = 0.0;
            int posicion = 0;
            while (posicion < elementos) {
                media = media + Arraytemp[posicion];
                posicion++;
            }
            System.out.println("La media de la temperatura es de: " + media);
            int mayores = 0, iguales = 0, menores = 0;
            posicion = 0;
            while (posicion < elementos) {
                if (Arraytemp[posicion] > media) {
                    mayores = mayores + 1;
                } else if (Arraytemp[posicion] == media) {
                    iguales = iguales + 1;
                } else {
                    menores = menores + 1;
                }
                posicion = posicion + 1;
            }
            System.out.println("hay " + mayores + " temperaturas mayores de la media");
            System.out.println("hay " + iguales + " temperaturas iguales de la media");
            System.out.println("hay " + menores + " temperaturas menores de la media");

        } else {
            System.out.println("Error. No se ha introducido ningun numeor valido");
        }
    }

}
