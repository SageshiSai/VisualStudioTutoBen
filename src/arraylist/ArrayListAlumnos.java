package arraylist;
import java.util.ArrayList;

import Objectos.*;

public class ArrayListAlumnos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        ArrayList<Alumno> arrayList = new ArrayList<Alumno>();
        
        arrayList.add(new Alumno("d2","n2","a2",new FechaT5(),"2Dw3"));
        arrayList.add(new Alumno("d1","n1","a1",new FechaT5(),"2Dw4"));
        arrayList.add(new Alumno("d3","n3","a3",new FechaT5(),"2Dw5"));
        arrayList.add(new Alumno("d4","n5","a5",new FechaT5(),"1Dw3"));
        arrayList.add(new Alumno("d5","n5","a5",new FechaT5(),"1Dw3"));
        
        for(Alumno a : arrayList) {
            System.out.println("Alumno: "+a);
        }
        
        
        
    }

}
