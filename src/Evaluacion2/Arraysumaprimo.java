package Evaluacion2;

import java.util.Scanner;
public class Arraysumaprimo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, elementos=0;
        int[] Arrayenteros = new int[10];
        System.out.println("Introduce un numero entero");
        n = teclado.nextInt();
        while ((n>0)&&(elementos<10)){
            Arrayenteros[elementos]=n;
            elementos++;
            if (elementos<10){
                System.out.println("Introduce un numero entero");
                n = teclado.nextInt();
            }
        }
        int suma=0, resultado;
        int posicion=0;
        while (posicion<elementos){
            suma = suma + Arrayenteros[posicion];
            posicion++;
        }
        resultado = suma;
        
        boolean seaprimo =true ;
        posicion=2;
        while ((posicion<resultado)&&(seaprimo)){
            suma = suma%posicion;
            if(suma == 0){
                seaprimo = false;
            }
            posicion++;
        }
        if(seaprimo) {
            System.out.println("El resultado es "+resultado+" y es un numero primo");
        }
        else{
            System.out.println("El resultado es "+resultado+" y no es primo");
        }
        teclado.close();
    }
}