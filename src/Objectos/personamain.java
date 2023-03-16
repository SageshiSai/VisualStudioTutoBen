package Objectos;
public class personamain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Persona p1 = new Persona("jon","1111111Y",  "H", 24,  55.5,  1.70);

    System.out.println(p1);

    int imc  =p1.calcularIMC();
    System.out.println("");
    switch (imc) {
        case 0:
            System.out.println();
            break;
        case 1:
            System.out.println();
            break;
        case -1:
            System.out.println();
            break;

    }

    }
}
