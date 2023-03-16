package EVA3.ALMACENAMIENTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Objectos.FechaT5;

public class FechaMainSerealizable {
    public static void main(String[] args) {
        
        FechaT5 f = new FechaT5(19,3,2018);

        try {
            FileOutputStream fos = new FileOutputStream("fecha.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(f);

            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    FileInputStream fis;
    ObjectInputStream ios;
    FechaT5 a;
        try {
            fis = new FileInputStream("fecha.dat");
            ios = new ObjectInputStream(fis);

            a = (FechaT5) ios.readObject();
            System.out.println(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
