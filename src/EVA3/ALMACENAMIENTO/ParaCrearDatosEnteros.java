package EVA3.ALMACENAMIENTO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ParaCrearDatosEnteros {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(21);
        arrayList.add(45);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(112);
        arrayList.add(12);
        try {
            FileOutputStream fos=new FileOutputStream("alEnteros.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);

            for (Integer cc : arrayList) {
                oos.writeObject(cc);
            }
        oos.close();
        fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
