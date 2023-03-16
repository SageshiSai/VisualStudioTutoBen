package Objectos;

import java.util.Scanner;

public class ComplejoArray {

    public static void main(String[] args) {
        //Pruebo la clase Complejo y creamos como array
        Complejo [] a1 = new Complejo[10];
        Complejo fin = new Complejo(-1-1);
        Complejo a2 = new Complejo();
        int contador=0;
        
        Scanner teclado = new Scanner(System.in);
        a2.leer(teclado);
        
        while (!(a2.compareTo(fin)==0) && contador<a1.length) {
            //Mientras que a2 NO sea igual a 0 y contador no sea mayor a 10 
            //uso el constructor copia para crear un nuevo objecto
            a1[contador]= new Complejo(a2);
            //Añadimos el contenido de a2 en la array
            //incrementamos el contador
            contador++;
            System.out.println("Introduce otro complejo");
            a2.leer(teclado);
        }
        //CIerre del teclado
        teclado.close();
        //sacamos toda la array
        for(int posicion=0;posicion<contador;posicion++) {
            System.out.println(a1[posicion]);
        }
        System.out.println("Fin del programa");
    }

}
