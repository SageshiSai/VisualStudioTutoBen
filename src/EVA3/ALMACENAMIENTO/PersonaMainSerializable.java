package EVA3.ALMACENAMIENTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Objectos.FechaT5;
import Objectos.PersonaT5;

public class PersonaMainSerializable {
    public static void main(String[] args) {
        
        PersonaT5 p = new PersonaT5("456238484","antonio","rodelgo",new FechaT5(8,1,2019));

        try {
            FileOutputStream fos = new FileOutputStream("persona.dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeObject(p);

            fos.close();
            ous.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        PersonaT5 p1;
        try {
            FileInputStream fis = new FileInputStream("persona.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            p1 = (PersonaT5) ois.readObject();
            System.out.println(p1);

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
