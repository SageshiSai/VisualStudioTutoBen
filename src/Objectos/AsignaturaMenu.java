package Objectos;

import java.util.Scanner;

public class AsignaturaMenu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Asignatura [] array = new Asignatura[10];
        Asignatura valor = new Asignatura();
        int elementos=0;
        int posicion;   
        boolean encontrado;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1- Añadir Fecha de manera ordenada");
            System.out.println("2- Buscar Fecha");
            System.out.println("3- Borrar Fecha(Compactando)");
            System.out.println("4- Listar Array");
            System.out.println("0- Salir");
            System.out.println("Opcion: ");
            opcion = teclado.nextInt();
        
        switch(opcion) {
            case 1:
                
                if(elementos<array.length){
                    System.out.println("introduzca la Asignatura que desea añadir");
                    valor.leer(teclado);
                    
                    posicion=0;
                    encontrado= false;
                    
                    while(posicion<elementos && !encontrado) {
                            if (valor.compareTo(array[posicion])>0) {
                                encontrado=true;
                            }
                            else {
                                posicion++;
                            }
                    }
                    for(int posicionmover = elementos;posicionmover>posicion;posicionmover--){
                        array[posicionmover]=array[posicionmover+1];
                        
                        array[posicion] = new Asignatura(valor);  
                        elementos++;
                    
                    }
                }
                else {
                    System.out.println("El array esta lleno, borra alguno para poder añadir otra fecha");
                }
                break;
                
            case 2:
                encontrado=false;
                posicion =0;
                System.out.println("Cual fecha desea borrar?");
                valor.leer(teclado);
                
                while( encontrado==false && posicion<elementos) {
                    if(array[posicion].compareTo(valor)==0) {
                        encontrado=true;
                    }
                    else {
                        posicion++;
                    }
                }
                if (encontrado) {
                        System.out.println("*** Elemento "+ valor+ " Encontrado en la posicion "+ posicion);
                        
                    }
                break;
            case 3:
                encontrado=false;
                for(posicion=0;posicion<elementos;posicion++) {
                    System.out.println(array[posicion]);
                }
                System.out.println("Cual fecha desea borrar?");
                valor.leer(teclado);
                
                posicion=0;
                
                while( encontrado==false && posicion<elementos) {
                    if(array[posicion].compareTo(valor)==0) {
                        encontrado=true;
                    }
                    else {
                        posicion++;
                    }
                }
                if (!encontrado) {
                        System.out.println("No se encuentra la fecha");
                        break;
                    }
                else {
                for(int contadormover=elementos;contadormover<(contadormover-1);contadormover--){
                array[contadormover]=array[contadormover+1];
                }
                
                
                System.out.println("La fecha ha sido eliminada");
                }
                break;
                
                
            case 4:
                for(posicion=0;posicion<elementos;posicion++) {
                    System.out.println(array[posicion]);
                }
                break;
            case 0:
                teclado.close();
                System.out.println("Fin del programa");
                System.exit(0);
        }
        
        
        }
        while(opcion != 0);
        teclado.close();

    }

}
