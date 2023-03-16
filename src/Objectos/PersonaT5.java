package Objectos;

import java.io.Serializable;
import java.util.Scanner;

public class PersonaT5 implements Comparable<PersonaT5>, Serializable{

    // defino la clase Persona
    // propiedades
    private String dni; 
    private String nombre; 
    private String apellidos; 
    private FechaT5 fechanacimiento;
    
    // constructor por defecto
    public PersonaT5(){
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
        this.fechanacimiento = new FechaT5();
    }
    
    // constructor copia
    public PersonaT5(PersonaT5 p){
        this.dni = p.dni;
        this.nombre = p.nombre;
        this.apellidos = p.apellidos;
        this.fechanacimiento = new FechaT5(p.fechanacimiento);
    }

    // constructores personalizados
    public PersonaT5(String d, String n, String a){
        this.dni = d;
        this.nombre = n;
        this.apellidos = a;
        this.fechanacimiento = new FechaT5();
    }
    public PersonaT5(String d, String n, String a, FechaT5 f){
        this.dni = d;
        this.nombre = n;
        this.apellidos = a;
        this.fechanacimiento = new FechaT5(f);
    }

    // Getters and Setters  
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public FechaT5 getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(FechaT5 fechanacimiento) {
        this.fechanacimiento = new FechaT5(fechanacimiento);
    }

    // toString
    @Override
    public String toString() {
        return (dni + " " + nombre + " " + apellidos + " " + fechanacimiento);
    }

    // hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        result = prime * result + ((fechanacimiento == null) ? 0 : fechanacimiento.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }
    
    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            // si es el mismo objeto
            return true;
        if (obj == null)
            // si obj no est� creado
            return false;
        if (getClass() != obj.getClass())
            // si los objetos NO son de la misma clase
            return false;
        // comparo el valor de las Propiedades
        PersonaT5 other = (PersonaT5) obj;
        return (this.dni.equals(other.dni));
    }

    // compareTo
    @Override
    public int compareTo(PersonaT5 other) {
        // comparo el valor de las Propiedades
        return (this.dni.compareTo(other.dni));
    }
    
    //metodo leer
    public void leer(Scanner teclado){
        // lee por teclado las propiedades
        // leo dni
        System.out.println("Dni: ");
        String d = teclado.nextLine();
        while (d.equals("0")) {
            System.out.println("El valor del dni no puede ser 0");
            System.out.println("Dni: ");
            d = teclado.nextLine();
        }
        this.dni = d;
        
        // leo nombre
        System.out.println("Nombre: ");
        this.nombre = teclado.nextLine();
        
        // leo nombre
        System.out.println("Apellidos: ");
        this.apellidos = teclado.nextLine();
        
        // leo fecha nacimiento
        this.fechanacimiento.leer(teclado);

    }

}