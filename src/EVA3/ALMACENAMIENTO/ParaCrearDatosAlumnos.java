package EVA3.ALMACENAMIENTO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Objectos.Alumno;
import Objectos.FechaT5;

public class ParaCrearDatosAlumnos {
    public static void main(String[] args) {
        ArrayList<Alumno> arrayList = new ArrayList<>();
        Alumno a1 = new Alumno("d1","n1","a1",new FechaT5(1,3,2020),"2Dw3");
        Alumno a2 = new Alumno("d2","n2","a2",new FechaT5(2,6,2021),"2Dw3");
        Alumno a3 = new Alumno("d3","n3","a3",new FechaT5(3,9,2022),"2Dw3");
        Alumno a4 = new Alumno("d4","n4","a4",new FechaT5(4,12,2023),"2Dw3");
        Alumno a5 = new Alumno("d5","n5","a5",new FechaT5(5,1,2024),"2Dw3");
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        arrayList.add(a4);
        arrayList.add(a5);
        try {
            FileOutputStream fos = new FileOutputStream("arraalumno.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Alumno a : arrayList) {
                oos.writeObject(a);
            }

            fos.close();
            oos.close();
        }   catch (FileNotFoundException e) {
            e.printStackTrace();
        }   catch (IOException e){
            e.printStackTrace();
        }
    }
}
