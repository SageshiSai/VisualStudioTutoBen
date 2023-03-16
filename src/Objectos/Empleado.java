package Objectos;

import java.util.Objects;
import java.util.Scanner;

public class Empleado extends PersonaT5{

    private String departamento;
    private String puesto;
    private Double salario;
    
    public Empleado() {
        super();
        this.departamento = "";
        this.puesto = "";
        this.salario = 0.0;
    }   
    
    public Empleado(String d, String p, Double s) {
        super();
        this.departamento = d;
        this.puesto = p;
        this.salario = s;
    }
    
    public Empleado(String d, String n, String a, FechaT5 f, String de, String p, Double s) {
        super(d,n,a,f);
        this.departamento = de;
        this.puesto = p;
        this.salario = s;
    }
    
    public Empleado(Empleado e) {
        super(e);
        this.departamento = e.departamento;
        this.puesto = e.puesto;
        this.salario = e.salario;
    }  
    //GetterSetters

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    //ToString

    @Override
    public String toString() {
        return (super.toString() + " " + departamento + " " + puesto + " "+ salario);
    }
    //HashEquals

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(departamento, puesto, salario);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        return Objects.equals(departamento, other.departamento) && Objects.equals(puesto, other.puesto)
                && Objects.equals(salario, other.salario);
    }
    //CompareTo 
    public int compareTo(Empleado other) {
        return super.compareTo(other);
    }
    //leer
    public void leer(Scanner teclado) {
        //leo propiedades de persona
        super.leer(teclado);
        teclado.nextLine();
        System.out.println("Departamento: ");
        this.departamento = teclado.nextLine();
        
        System.out.println("puesto: ");
        this.puesto = teclado.nextLine();
        
        System.out.println("Salario: ");
        double salari = teclado.nextDouble();
        while (salario < 0) {
            System.out.println("El salario no puede ser negativo0");
            System.out.println("Salario: ");
            salari = teclado.nextDouble();
        }
        this.salario= salari;
    }
    
    
}
