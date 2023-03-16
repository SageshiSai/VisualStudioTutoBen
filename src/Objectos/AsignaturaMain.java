package Objectos;

import java.util.Scanner;

public class AsignaturaMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //puebbo la clase Asignatura
        //Constructor por defecto
        Asignatura a1 = new Asignatura();
        System.out.println(a1);
        //Constructor copia
        Asignatura a2 = new Asignatura(a1);
        System.out.println(a2);
        //COnstructor personalizado
        Asignatura a3 = new Asignatura("ED","Entornos de Desarollo", 3.0);
        System.out.println(a3);
        //equals
        if (a1.equals(2)) {
            //Comparo si el contenido de a1 y a2 es igual
            System.out.println(a1+" y "+a2+" son iguales");
        }
        else {
            //Comparo si el contenido de a1 y a2 es igual
            System.out.println(a1+" y "+a2+" NO son iguales");
        }
        //CompareTo
        a2.setCodigo("ED");
        if(a2.compareTo(a3) > 0) {
            //Comparo si el contenido del a2 es mayro que el de a3
            System.out.println(a2+" es mayor que "+a3);
        }
        else if(a2.compareTo(a3)<0) {
          //Comparo si el contenido del a2 es mayor que el de a3
            System.out.println(a2+" es menor que "+a3);
        }
        else {
            //Si son iguales
            System.out.println(a2+" y "+a3+" son iguales");
        }
        //leer
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los datos de la Asignatura a2");
        a2.leer(teclado);
        
        System.out.println(a2);
        
        teclado.close();
    }

}
