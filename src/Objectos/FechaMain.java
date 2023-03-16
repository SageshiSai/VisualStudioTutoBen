package Objectos;

import java.util.Scanner;

public class FechaMain {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Fecha f1 = new Fecha();
      System.out.println(f1);
      f1.leer(sc);
      System.out.println(f1);

    }
}
