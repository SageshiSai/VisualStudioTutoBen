package preparacionBucles;

import java.util.Scanner;

public class EjercicioFactorial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
int o;
Scanner Teclado = new Scanner(System.in);
o = Teclado.nextInt();
for (int i=1, e=1;i<=o;i++) {
    e = i*e;
    System.out.println(e);
        
    }
Teclado.close();
}
    }


