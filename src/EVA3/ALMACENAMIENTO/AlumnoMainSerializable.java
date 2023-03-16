package EVA3.ALMACENAMIENTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Objectos.Alumno;
import Objectos.FechaT5;

public class AlumnoMainSerializable {
    public static void main(String[] args) {
        Alumno a = new Alumno("d2","n2","a2",new FechaT5(1,3,2020),"2Dw3");

        try {
            FileOutputStream fos = new FileOutputStream("alumno.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(a);

            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


        Alumno a1;
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream("alumno.dat");
            ois = new ObjectInputStream(fis);

            a1 = (Alumno) ois.readObject();

            System.out.println(a1);

            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
