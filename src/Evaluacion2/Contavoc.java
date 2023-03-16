package Evaluacion2;

import java.util.Scanner;

public class Contavoc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
String palabra;
int tamaño, posicion=0;
int[] contador = new int[5];
char caracter;
System.out.println("Introduce una palabra");
palabra = teclado.nextLine();
palabra = palabra.toLowerCase();
tamaño = palabra.length();
while(posicion<tamaño) {
    caracter = palabra.charAt(posicion);
    switch(caracter) {
        case 'a':
            contador[0]++;
            break;
        case 'e':
            contador[1]++;
            break;
        case 'i':
            contador[2]++;
            break;
        case 'o':
            contador[3]++;
            break;
        case 'u':
            contador[4]++;
            break;
    }
      posicion++;  
}
teclado.close();
   
        System.out.println("Aes: "+contador[0]);
        System.out.println("Es: "+contador[1]);
        System.out.println("Ies: "+contador[2]);
        System.out.println("Oes: "+contador[3]);
        System.out.println("Ues: "+contador[4]);
        
    
}
    }


