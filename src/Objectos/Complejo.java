package Objectos;

import java.util.Scanner;
import java.io.Serializable;;

public class Complejo implements Comparable<Complejo>, Serializable{
    // defino la clase Complejo
    // propiedades
    private double real;
    private double imaginaria;
    
    // metodos
    // constructor por defecto
    public Complejo() {
        
    }
    // constructores personalizados
    public Complejo(double r, double i) {
        this.real = r;
        this.imaginaria = i;
    }
    public Complejo(double r) {
        this.real = r;
    }
    // constructor copia
    public Complejo(Complejo c) {
        this.real = c.real;
        this.imaginaria = c.imaginaria;
    }
    // toString
    @Override
    public String toString() {
        return (real + " + " + imaginaria + "i");
    }
    // Getters and Setters
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginaria() {
        return imaginaria;
    }
    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }
    
    // hashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(imaginaria);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(real);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            // si es el mismo objeto
            return true;
        if (obj == null)
            // si el objeto que recibo NO existe
            return false;
        if (getClass() != obj.getClass())
            // si los objetos NO son de la misma clase
            return false;
        // comparo las propiedades de los objetos
        // convierto el objeto a la clase a comparar
        Complejo other = (Complejo) obj;
        if(this.real == other.real && this.imaginaria == other.imaginaria) {
            // si los valores de las propiedades son iguales
            return true;
        }
        return false;
    }
    // compareTo
    @Override
    public int compareTo(Complejo other) {
        if(this.real > other.real) {
            return 1;
        }
        else if(this.real < other.real) {
            return -1;
        }
        else {
            // si la parte real es igual
            if(this.imaginaria > other.imaginaria) {
                return 1;
            }
            else if(this.imaginaria < other.imaginaria) {
                return -1;
            }
        }
        return 0;
    }
    // leer
    public void leer(Scanner teclado){
        // lee por teclado las propiedades
        // leo real
        System.out.println("Real: ");
        this.real = teclado.nextDouble();
        // leo imaginaria
        System.out.println("Imaginaria: ");
        this.imaginaria = teclado.nextDouble();
    }
}