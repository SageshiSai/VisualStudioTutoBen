package preparacionBucles;

import java.util.Scanner;

public class CuantosDijitos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        int i, b=10, c=0;
        System.out.println("introduzca un numero");
        i = teclado.nextInt();
        teclado.close();
        
        for (int a=0; i>a;i=i/b) {
            c++;
        }
        System.out.println("El numero introducido tiene "+c+ " digitos");
        
    }

}
