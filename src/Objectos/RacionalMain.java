package Objectos;



public class RacionalMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //Creamos los objectos con los tipos de constructores que hemos creado
        Racional r1 = new Racional();
        Racional r2 = new Racional(r1);
        Racional r3 = new Racional(3);
        Racional r4 = new Racional(3,4);
        
        // escribimos lo que tenemos
        r1.escribir();
        r2.escribir();
        r3.escribir();
        r4.escribir();
    }

}
