package Objectos;
public class Recuento{
    
    private static int recuento=0;
    
    public Recuento(){
    recuento++;
    }
    public static int getRecuento() {
        return recuento;
    }

    public void setRecuento(int recuento) {
        Recuento.recuento = recuento;
    }
    public void escribirRecuento(){
    System.out.print("Hay "+recuento+" objetos de la clase.");
    }

}
