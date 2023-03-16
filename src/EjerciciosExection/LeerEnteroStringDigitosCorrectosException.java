package EjerciciosExection;

import java.util.Scanner;

public class LeerEnteroStringDigitosCorrectosException {
    public static void main(String[] args) {
        System.out.println("Agrega algo");
        int numInt = 0;
        String numString;
        String valorCorregido = "";
        char caracter;
        Scanner teclado = new Scanner(System.in);
        numString = teclado.nextLine();
        
        try {
            numInt = Integer.parseInt(numString);
            System.out.println("El valor de la variable es de "+ numInt);
            
        } catch (NumberFormatException e) {
            System.out.println("No has agregado correctamente los digitos validos. Se corregira automaticamente");
            
            for (int i = 0; i < numString.length(); i++) {
                caracter = numString.charAt(i);

                if (Character.isDigit(caracter)) {
                    valorCorregido += caracter;
                }
            }
            if (valorCorregido.length()>0) {
            numInt = Integer.parseInt(valorCorregido);
        }
        }
        System.out.println("El valor de la variable es de "+ numInt);
        teclado.close();
    }
}
