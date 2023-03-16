package Objectos;

import java.util.Objects;
import java.util.Scanner;

public class Fecha implements Comparable<Fecha> {
    // defino la clase Fecha
    // propiedades
    private int dia;
    private int mes;
    private int año;

    // constructores
    // constructor por defecto
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 2021;
    }

    // constructor copia
    public Fecha(Fecha f) {
        this.dia = f.dia;
        this.mes = f.mes;
        this.año = f.año;
    }

    // constructor personalizado
    public Fecha(int d, int m, int a) {
        if (d >= 1 && d <= 31) {
            // Si es valido
            this.dia = d;
        } else {
            // Si NO es un dia valido
            // muestro un mensaje de Error
            System.out.println("El valor de dia NO es valido. Se ha puesto 1 como dia");
            // Pongo 1 como dia
            this.dia = 1;
        }
        if (m >= 1 && m <= 12) {
            // Si es un mes valido
            this.mes = m;
        } else {
            // Si NO es un mes valido
            // muestro un mensaje de Error
            System.out.println("El valor de mes NO es valido. Se ha puesto 1 como mes");
            // Pongo 1 como mes
            this.mes = 1;
        }
        if (a != 0) {
            // Si el año es valido
            this.año = a;
        } else {
            // Si No es valido
            // Muestro un mensaje de Error
            System.out.println("El valor de año NO es valido. Se ha puesto 2021 como año");
            this.año = 2021;
        }
    }

    // Generamos los getters y setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        // Comprobamos que sea valido
        if (dia >= 1 && dia <= 31) {
            // Si es valido
            this.dia = dia;
        } else {
            // Si NO es valido, sacamos un mensaje de Error
            System.out.println("No se ha modificado el dia");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        // Comprobamos que sea valido
        if (mes >= 1 && mes <= 12) {
            // Si es un mes valido
            this.mes = mes;
        } else {
            // Si NO es valido, sacamos un mensaje de Error
            System.out.println("No se ha modificado el mes");
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    /*
     * Tambien se puede hacer de otra manera, que seria creando un void leer para
     * asignar para todos con solo 1 setter,
     */
    // Generamos el to String
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, año);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fecha other = (Fecha) obj;
        return año == other.año && dia == other.dia && mes == other.mes;
    }

    // CompareTo
    @Override
    public int compareTo(Fecha other) {
        if (this.año > other.año) {
            return (1);

        } else if (this.año < other.año) {
            return (-1);
        } else {
            if (this.mes > other.mes) {
                return (1);
            } else if (this.mes < other.mes) {
                return (-1);
            } else {
                if (this.dia > other.dia) {
                    return (1);
                } else if (this.dia < other.dia) {
                    return (-1);
                }
            }
        }
        return 0;
    }

    public void leer(Scanner sc) {
        System.out.println("Agrega dia: ");
        this.dia = sc.nextInt();
        while ((this.dia < 1) || (this.dia > 31)) {
            System.out.println("Error");
            System.out.println("Vuelve a añadir el dia");
            this.dia = sc.nextInt();
        }
        System.out.println("Agrega mes: ");
        this.mes = sc.nextInt();
        while ((this.mes < 1) || (this.mes > 12)) {
            System.out.println("Error");
            System.out.println("Vuelve a añadir el mes");
            this.mes = sc.nextInt();
        }
        System.out.println("Agrega año: ");
        this.dia = sc.nextInt();
    }
}
