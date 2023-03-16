package EjerciciosExection;

import java.util.Scanner;

public class LeerEnteroRobusto {
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
                } else if(caracter == 'O' || caracter == 'o') {
                    valorCorregido += 0;
                } else if(caracter == 'l'){
                    valorCorregido += 1;
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
