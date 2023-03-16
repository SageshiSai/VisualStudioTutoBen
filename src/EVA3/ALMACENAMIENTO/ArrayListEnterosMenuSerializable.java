package EVA3.ALMACENAMIENTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEnterosMenuSerializable {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Integer a=0;
        FileInputStream fis;
        ObjectInputStream ois;
        boolean Modificado = false;
        try {
            fis = new FileInputStream("alEnteros.dat");
            ois = new ObjectInputStream(fis);
        

            while (fis.available()>0) {
                a = (int) ois.readObject();
                ArrayList.add(a);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 

    do {
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1- Añadir");
        System.out.println("2- Buscar");
        System.out.println("3- Borrar");
        System.out.println("4- Listar Array");
        System.out.println("0- Salir");
        System.out.println("Opcion: ");
        opcion = teclado.nextInt();


    
    switch(opcion) {
        case 1:
            
            System.out.println("Cadena: ");
            Integer cadena = teclado.nextInt();
            ArrayList.add(cadena);
            Modificado = true;
            break;
            
        case 2:
            
            
            System.out.println("Cadena: ");
            cadena = teclado.nextInt();
            int posicion = ArrayList.indexOf(cadena);
            
            if(posicion >=0) {
                System.out.println("El elemento "+cadena+" se encuentra en la posicion "+posicion);
            }
            else {
                System.out.println("El elemento "+cadena+" NO se encuentra en el ArrayList");
            }
            break;
        case 3:
            
            System.out.println("Cadena: ");
            cadena = teclado.nextInt();
            
            if(ArrayList.remove(cadena)) {
                System.out.println("El elemento "+cadena+" ha sido borrado");
            }
            else {
                System.out.println("El elemento "+cadena+" NO se ha encontrado");
            }
            Modificado = true;
            break;
            
        case 4:
            for(posicion = 0; posicion < ArrayList.size();posicion++) {
                System.out.println(ArrayList.get(posicion));
            }
            
            break;
        case 0:
            teclado.close();
            System.out.println("Fin del programa");
            if (Modificado) {
                try {
                FileOutputStream fos=new FileOutputStream("alEnteros.dat");
                ObjectOutputStream oos = new ObjectOutputStream (fos);
        
                for (Integer cc : ArrayList) {
                    oos.writeObject(cc);
                }
            oos.close();
            fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
            System.exit(0);
    }
    
    } while(opcion != 0);
    teclado.close();
    }
}
