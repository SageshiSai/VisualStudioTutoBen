package Evaluacion2;

import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        String[] arraystring = new String [5];
        String n;
        int elementos=0, posicion;
        boolean encontrado, lleno=false;
        System.out.println("Introduce una palabra");   
        n = teclado.next();
 
        while (!n.isEmpty() && !lleno) {
            posicion=0;
            encontrado=false;
            while(posicion<elementos && !encontrado) {
                if (arraystring[posicion].compareTo(n) > 0) {
                    encontrado=true;
                }
                else {
                    posicion++;
                }
            }
            for(int moverelementos=elementos;moverelementos>posicion && encontrado;moverelementos--) {
                arraystring[moverelementos]= arraystring[moverelementos-1];
            }
            arraystring[posicion]=n;
            elementos++; 
            System.out.println("se ha añadido la palabra en la posicion "+posicion);
            if(elementos<5) {
                System.out.println("Introduce una palabra");
                n=teclado.next();
            }
            else {
                    lleno=true;
                    teclado.close();
                }
            }
        for(posicion=0;posicion<elementos;posicion++) {
            System.out.println(arraystring[posicion]+", ");
        }
            }

        }