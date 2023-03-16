package ObjectosAbstractos;

import java.util.ArrayList;

public class ArrayFiguras {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        ArrayList<Figura> arrayfiguras = new ArrayList<Figura>();
        
        arrayfiguras.add(new Circulo(0,0,10));
        arrayfiguras.add(new Cuadrado(0,0,3));
        arrayfiguras.add(new Triangulo(0,0,2,4));
        arrayfiguras.add(new Rectangulo(0,0,3,5));
        
        for(int posicion = 0; posicion<arrayfiguras.size();posicion ++) {
            System.out.println("Área del objecto "+arrayfiguras.get(posicion).getClass().getSimpleName()+" es "+ arrayfiguras.get(posicion).area());
        }
        /*for(Figura posicion : arrayfiguras) {
            System.out.println("Área del objecto "+posicion.getClass().getSimpleName()+" es "+ posicion.area());
        }*/
        
        
        
    }

}
