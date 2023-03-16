package Evaluacion2;

import java.util.Scanner;

public class ArrayAriketak2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String [] array= {"jon","luis", "enrique", "luis","raquel"};
        int p;
        do {
        System.out.println("1. Salir");
        System.out.println("2. Mostrar Lista");
        System.out.println("3. Pedir un Nombre y contar las veces que aparece");
        System.out.println("4. Pedir un Nombre y decir si existe");
        System.out.println("5. Eliminar. Pedir un nombre y en el lugar de ese nombre introducir “null”");
        p = teclado.nextInt();
        switch(p) {
            case(1):
                System.exit(0);
                teclado.close();
                break;
            case(2):
                for(int i=0;i<array.length;i++) {
                    if(!array[i].equals("null"))
                    System.out.println(array[i]);
                }
                break;
            case(3):
                System.out.println("Escriba el nombre que busca");
                String nombre= teclado.next().toLowerCase();
                int veces=0;
                for(int i=0;i<array.length;i++) {
                    if(nombre.compareTo(array[i])==0) {
                        veces += +1;
                    }
                }
                System.out.println("Se repite " + veces+ " veces");
                break;
            case(4):
                System.out.println("Escriba el nombre que busca");
                nombre= teclado.next().toLowerCase();
                boolean existe = false;
                int f=0;
                while (f<array.length && !existe) {
                    if(nombre.compareTo(array[f])==0) {
                        existe = true;
                    }
                    f++;
                }
                if (existe) {
                    System.out.println("existe");
                }else {
                    System.out.println("no existe");
                }
                break;
            case(5):
                System.out.println("Escriba el nombre que busca");
            nombre= teclado.next().toLowerCase();
            existe = false;
            f=0;
            while (f<array.length && !existe) {
                if(nombre.compareTo(array[f])==0) {
                    existe = true;
                }
                f++;
            }
            if (existe) {
                
                for(int i=0;i<array.length;i++) {
                    if(nombre.compareTo(array[i])==0) {
                        array[i]= "null";
                    }
                    
                }
                
            }else {
                System.out.println("no existe");
            }
                break;
        }
        }while(p!=1);
        
        
        
    }

}
