package Eliminar;

import java.util.Scanner;

public class ArrayAriketak3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        int p;
        String [] Meses = new String[5];
        Meses[0] = "Enero";
        Meses[1] = "Febrero";
        Meses[2] = "Marzo";
        Meses[3] = "Abril";
        Meses[4] = "Mayo";
        int [] Litros = new int[5];
        Litros[0] = 123;
        Litros[1] = 333;
        Litros[2] = 180;
        Litros[3] = 211;
        Litros[4] = 90;
        
        System.out.println("1. Mostrar en cada mes cuantos litros han llovido.");
        System.out.println("2. Mostrar en pantalla el mes y los litros del mes más lluvioso.");
        p = teclado.nextInt();
        switch(p) {
            case (1):
                System.out.println("**** MESES Y PRECIPITACIONES ****");
                for(int i=0;i<Meses.length;i++) {
                    System.out.println("Mes: "+Meses[i]+" Precipitación: "+Litros[i]);
                }
            break;
            case(2):
                int LitrosMax=0;
                boolean encontrado=false;
                System.out.println("**** EL MES MÁS LLUVIOSO ****");
                for(int i=0; i<Meses.length;i++) {
                    if(Litros[i]>LitrosMax) {
                        LitrosMax = Litros[i];
                    }
                }
                int i=0;
                while(!encontrado) {
                    
                    if(LitrosMax == Litros[i]) {
                        encontrado=true;
                    }
                    if (encontrado) {
                        System.out.println("El mes más lluvioso ha sido: " + Meses[i]+" con un maximo de "+Litros[i]+" Litros");
                    }
                    i++;
                }
                
                break;
        }
        
        teclado.close();
    }

}
