package Objectos;

import java.io.Serializable;

public class Persona implements Serializable {
private String nombre;
private int Edad;
private String dni;
private String Sexo;
private double Peso;
private double altura;

    Persona(String string, String string2, String string3, int i, double d, double e){
    }
    Persona(String n, int e, String s){
        this.nombre = n;
        this.Edad = e;
        this.Sexo = s;
    }
    Persona(String n, int e, String d, String s, double p, double a){
        this.nombre = n;
        this.Edad = e;
        this.dni = d;
        this.Sexo = s;
        this.Peso = p;
        this.altura =a;
    }
    Persona(Persona p){
        this.nombre = p.nombre;
        this.Edad = p.Edad;
        this.dni = p.dni;
        this.Sexo = p.Sexo;
        this.Peso = p.Peso;
        this.altura = p.altura;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double peso) {
        Peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
   
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", Edad=" + Edad + ", dni=" + dni + ", Sexo=" + Sexo + ", Peso=" + Peso
                + ", altura=" + altura + "]";
    }
    public int calcularIMC(){
        double m = this.Peso/(this.altura*this.altura);
        if (m<20) {
            return -1;
        }else if(m<=25) {
            return 1;
        }else {
            return 0;
        }
        
    }
    public boolean MayorEdad() {
        if(this.Edad >=18) {
            return true;
        }
        else  {
            return false;
        }
    }
}
