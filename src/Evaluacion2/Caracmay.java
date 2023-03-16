package Evaluacion2;

import java.util.Scanner;

public class Caracmay {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner te = new Scanner(System.in);
        String caracter; 
        int h,posicion=0;
        char mayor=0;
        String letra="", letra1;
        
        System.out.println("Introduzca un palabra");
        caracter = te.next();
        h = caracter.length();
        while ((posicion<h)) {
        if ((caracter.charAt(posicion))>mayor) {
            mayor = caracter.charAt(posicion);
            letra = String.valueOf(caracter.charAt(posicion));
        }
                posicion++;
        }
        System.out.println("La palabra más grande es: "+letra);
        posicion=0;
        te.close();
        while(posicion<h) {
            letra1 = String.valueOf(caracter.charAt(posicion));
            if (letra1.equals(letra)) {
                System.out.println("En la posicion: "+posicion);
            }
            posicion++;
        }
    }

}
