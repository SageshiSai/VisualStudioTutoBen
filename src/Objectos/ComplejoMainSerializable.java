package Objectos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ComplejoMainSerializable {
    public static void main(String[] args) {
    Complejo c;
    FileInputStream fis;
    ObjectInputStream ois;
    try {
        fis = new FileInputStream("complejo.dat");
        ois = new ObjectInputStream(fis);
        
        c = (Complejo)ois.readObject();
        
        System.out.println(c);
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

