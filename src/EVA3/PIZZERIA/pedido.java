package EVA3.PIZZERIA;

public class pedido {
    protected int idpizza;
    protected int idusuario;
    protected int idpedido;
    protected int cantidad;

    public pedido() {
        this.idpizza = 0;
        this.idusuario = 0;
        this.idpedido = 0;
        this.cantidad = 0;
    }

    public pedido(pedido p) {
        this.idpizza = p.idpizza;
        this.idusuario = p.idusuario;
        this.idpedido = p.idpedido;
        this.cantidad = p.cantidad;
    }

    public pedido(int pi, int u, int p, int c) {
        this.idpizza = pi;
        this.idusuario = u;
        this.idpedido = p;
        this.cantidad = c;
    }

    public int getIdpizza() {
        return this.idpizza;
    }
    public void setIdpizza(int idpizza) {
        this.idpizza = idpizza;
    }

    public int getIdusuario() {
        return this.idusuario;
    }
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdpedido() {
        return this.idpedido;
    }
    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getCantidad() {
        return this.cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void print() {
        System.out.println("IDPizza: "+this.idpizza);
        System.out.println("IDUsuario: "+this.idusuario);
        System.out.println("IDPedido: "+this.idpedido);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("*************************");
    }
}
