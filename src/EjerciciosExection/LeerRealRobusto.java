package EjerciciosExection;

import java.util.Scanner;

public class LeerRealRobusto {
    public static void main(String[] args) {
        System.out.println("Agrega algo");
        double numDouble = 0.0;
        String numString;
        String valorCorregido = "";
        char caracter;
        Scanner teclado = new Scanner(System.in);
        numString = teclado.nextLine();
        boolean puntoComa = false;

        try {
            numDouble = Double.parseDouble(numString);
            System.out.println("El valor de la variable es de " + numDouble);

        } catch (NumberFormatException e) {
            System.out.println("No has agregado correctamente los digitos validos. Se corregira automaticamente");

            for (int i = 0; i < numString.length(); i++) {
                caracter = numString.charAt(i);

                if (Character.isDigit(caracter)) {
                    valorCorregido += caracter;
                } else if ((caracter == '.' || caracter == ',') && !puntoComa) {
                    valorCorregido += '.';
                    puntoComa = true;
                }

            }
            if (valorCorregido.length() > 0) {
                numDouble = Double.parseDouble(valorCorregido);
            }

        }
        System.out.println("El valor de la variable es de " + numDouble);
        teclado.close();
    }
}
