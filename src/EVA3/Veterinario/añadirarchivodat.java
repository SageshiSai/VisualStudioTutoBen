package EVA3.Veterinario;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class añadirarchivodat {

    public static void main(String[] args) {
        Perro p = new Perro("1","Luna","BullDog");
        try {
            FileOutputStream fos=new FileOutputStream("perros.dat");
            ObjectOutputStream oos = new ObjectOutputStream (fos);
    
            
                oos.writeObject(p);
            
        oos.close();
        fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

