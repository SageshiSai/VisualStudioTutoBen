package EjerciciosExection;

import java.util.Scanner;

public class LeerEnteroStringException {

    public static void main(String[] args) {
        System.out.println("Agrega algo");
            int numInt;
            String numString;
            Scanner teclado = new Scanner(System.in);
            numString = teclado.nextLine();
        try {
            numInt = Integer.parseInt(numString);
            System.out.println("El valor de la variable es de "+numInt);
            
        } catch (NumberFormatException e) {
            System.out.println("No has añadido un numero");
        }
        teclado.close();
    }
    
}