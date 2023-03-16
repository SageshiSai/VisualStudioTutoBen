package Objectos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ComplejoMain {

    public static void main(String[] args) {
        // Clase para probar la clase Complejo
        Complejo c1 = new Complejo();
        System.out.println(c1);
        Complejo c2 = new Complejo(2.0,3.0);
        System.out.println(c2);
        Complejo c3 = new Complejo(3.0);
        System.out.println(c3);
        Complejo c4 = new Complejo(c2);
        System.out.println(c4);
        // Getters and Setters
        double r;
        r = c2.getReal(); // r = 2.0;
        System.out.println("Real: "+ r);
        c4.setReal(2.0); // 4.0 + 3.0i
        double i;
        i = c2.getImaginaria(); // i = 3.0;
        System.out.println("Imaginaria: "+ i);
        c4.setImaginaria(3.0); // 4.0 + 44.0i
        System.out.println(c4);
        // hashCode and equals
        if(c4.equals(c2)) {
            // si son Iguales
            System.out.println(c4 + " y " + c2 + " son Iguales");
        }
        else {
            System.out.println(c4 + " y " + c2 + " NO son Iguales");
        }
        // compareTo
        if(c4.compareTo(c2) > 0) {
            System.out.println(c4 + " es MAYOR que " + c2);
        }
        else if(c4.compareTo(c2) < 0) {
            System.out.println(c4 + " es MENOR que " + c2);
        }
        else {
            System.out.println(c4 + " es IGUAL que " + c2);
        }
        // leer
        Scanner teclado = new Scanner(System.in);
        
        // leo c1
        System.out.println("Complejo:");
        c1.leer(teclado);
        System.out.println("Complejo Leido: "+c1);

        
        Complejo c;
        try {
            FileOutputStream fos = new FileOutputStream("complejo.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);
            c = new Complejo(5,7);
            oos.writeObject(c);
            
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream("complejo.dat");
            ois = new ObjectInputStream(fis);
            
            c = (Complejo) ois.readObject();
            
            System.out.println(c);
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        
        
        
        
        // cierro teclado
        
        teclado.close();
    }
}