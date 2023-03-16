package EjerciciosExection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerEntero {
public static void main(String[] args) {
    try {
    System.out.println("Agrega algo");
    Scanner teclado = new Scanner(System.in);
    int n = teclado.nextInt(); 
    System.out.println("El valor de la variable es de "+ n);

    teclado.close();
    } catch (InputMismatchException e) {
        System.out.println("No has introducido un numero");
    }

    }
    
}
