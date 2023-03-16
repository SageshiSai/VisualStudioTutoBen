package Evaluacion2;



public class Fusionar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int posicion1,posicion2, posicion3;
        int elementos1,elementos2, elementos3;
        String[] arraystring = {"2","4","8","9"};
        String[] arraystring2 = {"1","3","5"};
        String[] arrayfusion = new String [5];
        elementos1 = arraystring.length;
        elementos2 = arraystring2.length;
        elementos3 = 0;
        for(posicion1=0;posicion1<elementos1;posicion1++) {
            System.out.println(arraystring[posicion1]+", ");
        }
        for(posicion2=0;posicion2<elementos2;posicion2++) {
            System.out.println(arraystring[posicion2]+", ");
        }
        posicion1=0;
        posicion2=0;
        while (posicion1<elementos1 && posicion2<elementos2) {
        if(arraystring[posicion1].compareTo(arraystring2[posicion2])<0){
            arrayfusion[elementos3] = arraystring[posicion1];
        }
        else {
            arrayfusion[elementos3] = arraystring2[posicion2];
        }
        elementos3++;
        }
        for(posicion3=0;posicion3<elementos3;posicion3++) {
            System.out.println(arraystring[posicion3]+", ");
        }
           
        
            }

        }
