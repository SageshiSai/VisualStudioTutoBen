package EVA3.ALMACENAMIENTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Objectos.Complejo;

public class ComplejoMainSerializableArrayList {
    public static void main(String[] args) {
        Complejo c1 = new Complejo(1,2);
        Complejo c2 = new Complejo(3,4);
        Complejo c3 = new Complejo(5,6);
        Complejo c4 = new Complejo(7,8);
        Complejo c5 = new Complejo(9,0);
        
        ArrayList<Complejo> arrayList = new ArrayList<Complejo>();
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        arrayList.add(c4);
        arrayList.add(c5);
        ArrayList<Complejo> arrayList2 = new ArrayList<Complejo>();

        try {
            FileOutputStream fos=new FileOutputStream("alcomplejos.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);

            for (Complejo cc : arrayList) {
                oos.writeObject(cc);
            }
        oos.close();
        fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Complejo c;
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream("alcomplejos.dat");
            ois = new ObjectInputStream(fis);
        

            while (fis.available()>0) {
                c = (Complejo)ois.readObject();
                arrayList2.add(c);
            }
            
            for (Complejo Ha : arrayList2) {
                System.out.println(Ha);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        
    }

}
