package Objectos;

import java.util.Scanner;

public class FechaMenu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FechaT5 [] array = new FechaT5[10];
        FechaT5 f1 = new FechaT5();
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1- Añadir Fecha de manera ordenada");
        System.out.println("2- Buscar Fecha");
        System.out.println("3- Borrar Fecha(Compactando)");
        System.out.println("4- Listar Array");
        System.out.println("5- Salir");
        num = teclado.nextInt();
        
        switch(num) {
            case 1:
                
                int buscar =0;
                boolean encontrado=false;
                if(contador<array.length){
                System.out.println("introduzca la fecha que desea añadir");
                f1.leer(teclado);
                
                
                
                while(!encontrado) {
                if (f1.compareTo(array[buscar])>0) {
                    encontrado=true;
                }
                else {
                    buscar++;
                }
                }
                    for(int posicionmover = contador;posicionmover>buscar;posicionmover--){
                        array[posicionmover]=array[posicionmover+1];
                        
                        array[buscar] = new FechaT5(f1);  
                        contador++;
                    
                }
                
                }
                else {
                    System.out.println("El array esta lleno, borra alguno para poder añadir otra fecha");
                }
                break;
                
            case 2:
                encontrado=false;
                buscar =0;
                System.out.println("Cual fecha desea borrar?");
                f1.leer(teclado);
                
                while( encontrado==false && buscar<contador) {
                    if(array[buscar].compareTo(f1)==0) {
                        encontrado=true;
                    }
                    else {
                        buscar++;
                    }
                }
                if (encontrado) {
                        System.out.println("*** Elemento "+ f1+ " Encontrado en la posicion "+ buscar);
                        
                    }
                break;
            case 3:
                encontrado=false;
                buscar =0;
                for(int posicion=0;posicion<contador;posicion++) {
                    System.out.println(array[posicion]);
                }
                System.out.println("Cual fecha desea borrar?");
                f1.leer(teclado);
                
                while( encontrado==false && buscar<contador) {
                    if(array[buscar].compareTo(f1)==0) {
                        encontrado=true;
                    }
                    else {
                        buscar++;
                    }
                }
                if (!encontrado) {
                        System.out.println("No se encuentra la fecha");
                        break;
                    }
                else {
                for(int contadormover=buscar;contadormover<(contador-1);contadormover++){
                array[contadormover]=array[contadormover+1];
                }
                
                contador--;
                System.out.println("La fecha ha sido eliminada");
                }
                break;
                
                
            case 4:
                for(int posicion=0;posicion<contador;posicion++) {
                    System.out.println(array[posicion]);
                }
                break;
            case 5:
                teclado.close();
                System.out.println("Fin del programa");
                System.exit(0);
        }
        
        
        }
        while(num != 0);
        teclado.close();

    }

}
