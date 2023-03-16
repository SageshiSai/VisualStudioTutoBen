package Evaluacion2;

import java.util.Scanner;

public class ArrayAriketak4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        String [] Alumnos = new String[6];
        Alumnos[0] = "Jon";
        Alumnos[1] = "Sara";
        Alumnos[2] = "Ander";
        Alumnos[3] = "Marta";
        Alumnos[4] = "Jone";
        Alumnos[5] = "Mikel";
        int [] Edad = new int[6];
        Edad[0] = 18;
        Edad[1] = 20;
        Edad[2] = 26;
        Edad[3] = 21;
        Edad[4] = 17;
        Edad[5] = 24;
        int p, posicion=0, num=1, EdadMin=Edad[0], EdadMax=Edad[0];
        System.out.println("1. El nombre y edad del más joven.");
        System.out.println("2. El nombre y edad del mayor.");
        p = teclado.nextInt();
        switch(p) {
            case (1):
                    while( num<Edad.length) {
                        if(Edad[num]<EdadMin) {
                            EdadMin = Edad[num];
                            posicion = num;
                        }
                        num++;
                    }
                    System.out.println("**** EL NOMBRE Y EDAD DEL MÁS JOVEN ****");
                    System.out.println("El alumno más Joven es: " + Alumnos[posicion]+"");
                break;
            case (2):
                while( num<Edad.length) {
                    if(Edad[num]>EdadMax) {
                        EdadMax = Edad[num];
                        posicion = num;
                    }
                    num++;
                }
                System.out.println("**** EL NOMBRE Y EDAD DEL MÁS JOVEN ****");
                System.out.println("El alumno más Joven es: " + Alumnos[posicion]+"");
                break;
        }
        teclado.close();
    }

}
