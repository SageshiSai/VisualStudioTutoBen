package Evaluacion2;

import java.util.Scanner;

public class Contrase {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        String contraseña, usuario;
        int intentos=3;
        boolean fallo = true;
        do {
        System.out.println("Introduzca su Usuario");
        usuario = teclado.next();
        System.out.println("Introduzca su Contraseña");
        contraseña = teclado.next();
        if (((usuario.compareTo("Kevin")) !=0 || (contraseña.compareTo("Patiño")) !=0)) {
            System.out.println("El usuario o la contraseña son incorrectos, vuelva a intentarlo");
            intentos--;
            System.out.println("Le quedan "+intentos+" intentos");
            if (intentos==0) {
                fallo=false;
            }
        }
        }while(intentos>0 && fallo);
        if (!fallo) {
            System.exit(0);
        }
        System.out.println("Bienvenido "+usuario);
        teclado.close();
    }

}
