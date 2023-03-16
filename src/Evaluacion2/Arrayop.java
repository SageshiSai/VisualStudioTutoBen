package Evaluacion2;

import java.util.Scanner;

public class Arrayop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        int n, elementos=0, posicion=0;
        int Array[] = new int[10];
        boolean encontrado;
        do {
        System.out.println("1. Inicializar array a -1");
        System.out.println("2. Insertar elemento");
        System.out.println("3. Borrar elemento (de su posicion compactando el array");
        System.out.println("4. Listar Array");
        System.out.println("0. Salir");
        n = teclado.nextInt();
        switch(n) {
            case(1):
                posicion=0;
                for(int m=-1;posicion<Array.length;posicion++) {
                    Array[posicion]=m;
                }
                break;
            case(2):
                System.out.println("un numero");
                n=teclado.nextInt();
                if(elementos==0) {
                    Array[0]=n;
                    elementos++;
                }
                else {
            posicion=0;
            encontrado=false;
            while(posicion<elementos && !encontrado) {
                if (Array[posicion]>n) {
                    encontrado=true;
                }
                else {
                    posicion++;
                }
            }
            for(int moverelementos=elementos;moverelementos>posicion && encontrado;moverelementos--) {
                Array[moverelementos]= Array[moverelementos-1];
            }
            Array[posicion]=n;
            elementos++;
            }
                break;
            case(3):
                encontrado=false;
                posicion=0;
                System.out.println("Que numero quiere eliminar?");
                n = teclado.nextInt();
                
                while(posicion<elementos && !encontrado) {
                    if (Array[posicion]==n) {
                        encontrado=true;
                    }
                    else {
                        posicion++;
                    }
                    if(encontrado) {
                        for(Array[posicion]=0;posicion<(elementos-1);posicion++) {
                            Array[posicion]= Array[posicion+1];
                        }
                        elementos--;
                    }
                    
                }
                if(encontrado=false){
                    System.out.println("El numero no se encuentra");
                }
                
                break;
            case(4):
                for(posicion=0;posicion<elementos;posicion++) {
                    System.out.println(Array[posicion]+", ");
                }
                break;
            case(0):
                System.out.println("Fin del Programa");
                System.exit(0);
                break;
        }
        }while(n!=0);
        teclado.close();
        
        
    }

}
