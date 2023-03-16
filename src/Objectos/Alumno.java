package Objectos;

import java.util.Scanner;

public class Alumno extends PersonaT5{

private String grupo;

public Alumno() {
    super();
    this.grupo = "1DW3";
}
public Alumno(Alumno a) {
    super(a);
    this.grupo = a.grupo;
}
public Alumno(PersonaT5 p, String g) {
    super(p);
    this.grupo = g;
}
public Alumno(PersonaT5 p) {
    super(p);
    this.grupo = "1DW3";
}
public Alumno(String d, String n, String a, FechaT5 f, String g) {
    super(d,n,a,f);
    this.grupo = g;
}
//getter setters
public String getGrupo() {
    return grupo;
}
public void setGrupo(String grupo) {
    this.grupo = grupo;
}
//toString
@Override
public String toString() {
    return (super.toString() + " "+ grupo);
}
//metodo leer
public void leer(Scanner teclado) {
    //lee por teclado las propiedades de persona
    super.leer(teclado);
    teclado.nextLine();
    System.out.println("Grupo: ");
    String d = teclado.nextLine();
    while (d.isEmpty()) {
        System.out.println("El valor del grupo no puede ser vecio");
        System.out.println("Grupo: ");
        d = teclado.nextLine();
    }
    this.grupo = d;
    
}
}
