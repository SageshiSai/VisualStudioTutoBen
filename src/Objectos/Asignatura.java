package Objectos;

import java.util.Objects;
import java.util.Scanner;

public class Asignatura implements Comparable<Asignatura>{
    
    //defino clase Asignatura
    //propiedades
    private String codigo;
    private String descripcion;
    private double nota;
    
    //Constructor por defecto 
    public Asignatura() {
        this.codigo = "";
        this.descripcion = "";
        this.nota = 0.0;
    }
    
    //Constructor copia
    public Asignatura(Asignatura a) {
        this.codigo = a.codigo;
        this.descripcion = a.descripcion;
        this.nota = a.nota;
    }
    
    //Constructor personaizado
    public Asignatura(String c, String d, double n) {
        this.codigo = c;
        this.descripcion = d;
        this.nota = n;
    }
    
    //Getters And Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    //To String 
    @Override
    public String toString() {
        return (codigo + " - " + nota);
    }
    
    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, nota);
    }
    
    //Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Asignatura other = (Asignatura) obj;
        //Creo un objeto temporal de esta clase
        if(this.codigo.equals(other.codigo) && this.nota==other.nota) {
            return true;
        }
        return false;
    }
    
    //CompareTo
    @Override
    public int compareTo(Asignatura other) {
        //Comparo las propiedades de los objectos this y other
        int comparacion;
        comparacion = this.codigo.compareTo(other.codigo);
        if (comparacion == 0) {
            // si el codifo es igual
            Double n1 = this.nota;
            Double n2 = other.nota;
            comparacion=n1.compareTo(n2);
            /* double resultado = this.nota - other.nota;
             * comparacion = (int)resultado;
             */
        }
        return comparacion;
    }
    //leer
    public void leer(Scanner teclado) {
        //Lee por teclado las propiedades
        //Leo codigo
        System.out.println("Codigo: ");
        this.codigo= teclado.nextLine();
        System.out.println("Descripcion: ");
        this.descripcion=teclado.nextLine();
        System.out.println("Nota: ");
        this.nota=teclado.nextDouble();
        teclado.nextLine();//Limpia el buffer
    }
    
    
}
