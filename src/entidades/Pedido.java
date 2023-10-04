package entidades;

public class Pedido {

    private int idPedido;
    private Mesa m;
    private Producto p;
    private double total;

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa m, Producto p, double total) {
        this.idPedido = idPedido;
        this.m = m;
        this.p = p;
        this.total = total;
    }

    public Pedido(Mesa m, Producto p, double total) {
        this.m = m;
        this.p = p;
        this.total = total;
    }

    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getM() {
        return m;
    }

    public void setM(Mesa m) {
        this.m = m;
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", m=" + m + ", p=" + p + ", total=" + total + '}';
    }
    
    
}
