package Objectos;

public class CuentaCorriente {
private String titular; 
private double saldo;

    CuentaCorriente(){

    }
    CuentaCorriente(CuentaCorriente c){
        this.titular = c.titular;
        this.saldo = c.saldo;
    }


    CuentaCorriente(String t, double s){
        this.titular = t;
        this.saldo = s;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresarDinero(double cantidad) {                                                                                      
        if  (cantidad <= 0) {
            System.out.println("Operacion no valida");
        }
        else {
            this.saldo =cantidad + getSaldo();
            System.out.println("Su saldo actual es de  "+  saldo);
        }
    }
    @Override
    public String toString() {
        return "CuentaCorriente [titular=" + titular + ", saldo=" + saldo + "]";
    }
}
