package Objectos;

import java.util.Scanner;

public class AlumnoMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        Alumno alumno1 = new Alumno();
        System.out.println(alumno1);//ToString
        Alumno alumno2 = new Alumno(alumno1);
        System.out.println(alumno2);
        Alumno alumno3 = new Alumno("d2","n2","a2",new FechaT5(),"2Dw3");
        System.out.println(alumno3);
        //GS
        alumno1.setDni("d1");
        alumno1.setGrupo("1AS3");
        System.out.println(alumno1);
        //equals
        Alumno alumno4 = new Alumno(alumno1);
        if (alumno4.equals(alumno1)) {
            System.out.println(alumno4 + " Es igual a "+ alumno1);
        }
        else {
            System.out.println(alumno4 + " No es igual a "+ alumno1);
        }
        //compereTo
        int comparacion;
        comparacion = alumno1.compareTo(alumno4);
        if(comparacion > 0) {
            System.out.println(alumno4 + " Es mayor que "+ alumno1);
        }
        else if(comparacion < 0) {
            System.out.println(alumno4 + " Es menor que "+ alumno1);
        }
        else {
            System.out.println(alumno4 + " Es igual que "+ alumno1);
        }
        //leer
        Scanner teclado = new Scanner(System.in);
        System.out.println("Alumno: ");
        alumno1.leer(teclado);
        System.out.println(alumno1);
        
        //tecladoclose
        teclado.close();
    }

}
