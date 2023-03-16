package Evaluacion2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayAriketak5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] temperatura = new int[7];
        temperatura[0]=21;
        temperatura[1]=32;
        temperatura[2]=12;
        temperatura[3]=1;
        temperatura[4]=3;
        temperatura[5]=4;
        temperatura[6]=25;
        String[] dias = new String[7];
        dias[0]="Lunes";
        dias[1]="Martes";
        dias[2]="Miercoles";
        dias[3]="Jueves";
        dias[4]="Viernes";
        dias[5]="Sabado";
        dias[6]="Domingo";
        Scanner teclado = new Scanner(System.in);
        double Media=0;
        int TM=temperatura[0], TMIN =0, TMAX=0, p1=0,p2=0;
        
        for (int posicion=0;posicion<temperatura.length;posicion++) {
            Media = Media + temperatura[posicion];
        }
        Media = Media/7;
        DecimalFormat formato = new DecimalFormat("#.00");
        System.out.println("**MEDIA DE LA SEMANA**");
        System.out.println("La temperatura media de esta semana es de:"+formato.format((Media* 9/5) + 32)+"ºF" );
        for (int posicion=0;posicion<temperatura.length;posicion++) {
            if(temperatura[posicion]<TM) {
                TM = temperatura[posicion];
                TMIN = TM;
                p1=posicion;
            }
        }
        System.out.println("**DIA MÁS FRIO**");
        System.out.println("La temperatura minima fue el: "+dias[p1]);
        for (int posicion=0;posicion<temperatura.length;posicion++){
            if(temperatura[posicion]>TM) {
                TM = temperatura[posicion];
                TMAX = TM;
                p2=posicion;
            }
        }
        System.out.println("**DIA MÁS CALUROSO**");
        System.out.println("La temperatura maxima fue el: "+dias[p2]);
        for (int i = 0; i < dias.length; i++) {
            if(temperatura[i]>Media){
                System.out.println("El "+dias[i]+" esta por encima de la media con una temperatura de: "+temperatura[i]);
            }
        }
        for (int i = 0; i < dias.length; i++) {
            if(temperatura[i]<Media){
                System.out.println("El "+dias[i]+" esta por debajo de la media con una temperatura de: "+temperatura[i]);
            }
        }
        //IRRELEVANTE
        System.out.println(TMAX);
        System.out.println(TMIN);
        teclado.close();
    }

}
