package Objectos;

import java.util.Objects;
import java.util.Scanner;

public class Racional implements Comparable<Racional>{
    //defino la clase Racional
    //propiedades
    private int numerador;
    private int denominador;
    
    //constructores
    //constructor por defecto
    public Racional(){
    }
    
    //constructor copia
    public Racional(Racional r) {
    this.numerador = r.numerador;
    this.denominador = r.denominador;
}
    //constructor personalizado
    public Racional (int n){
    this.numerador = n;
    this.denominador= 1;
}
    //constructor personalizado pero si se añade un 0 que añada 1 para que no se haga infinito
    public Racional(int n, int d) {
        this.numerador = n;
        //si No es 0
        if (denominador != 0) {
            this.denominador = d;
        }
        //si es 0 lo cambiamos a 1 comomensaje de error
        else {
            System.out.println("El denominador no puede ser 0, el donominador ahora es 1");
            this.denominador = 1;
        }
    }
    // ahora solo escribimos
    public void escribir() {
        System.out.println(numerador +"/"+ denominador);
    }
    // destruimos el Racional
    public void finalize(){
        System.out.print("Racional destruido");
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominador, numerador);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Racional other = (Racional) obj;
        return denominador == other.denominador && numerador == other.numerador;
    }

    @Override
    public int compareTo(Racional o) {
        int n1 = this.numerador  * o.denominador;
        int n2 = this.denominador  * o.numerador;
        if(n1 == n2) {
            //si son el mismo  Racional´
            //intento simplificar
            if  (this.numerador >  o.denominador) {
                //simplifico
                this.numerador = o.numerador;
                this.denominador = o.denominador;
            }
            return (0);
        }
        else if(n1> n2) {
            // si this es mayor que other
            return (1);
        }
        //si  this es menor que other
        return(-1);
    }
  //leer
    public void leer(Scanner teclado) {
        System.out.println("Numerador: ");
        this.numerador = teclado.nextInt();

        System.out.print("Denominador: ");
        int denomi= teclado.nextInt();
        while (denomi == 0) {
            System.out.println("El denominador no puede ser 0");
            System.out.println("Denomiandor");
            denomi = teclado.nextInt();
        }
        this.denominador = denomi;
    }
    
   
}



