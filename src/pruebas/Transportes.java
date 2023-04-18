package pruebas;

import java.util.ArrayList;

public class Transportes {
    
    int idTransportes;
    ArrayList<String> tipo;
    public Transportes(){
        this.idTransportes = 0;
        this.tipo = new ArrayList<String>();
    }
    public Transportes(Transportes a){
        this.idTransportes = a.idTransportes;
        this.tipo = new ArrayList<String>();
    }
    public Transportes(int i, ArrayList<String> t){
        this.idTransportes = i;
        this.tipo = t;
    }
}
