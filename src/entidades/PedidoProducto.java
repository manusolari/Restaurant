package entidades;


import java.time.LocalDate;

public class PedidoProducto {

    private int idPedidoProducto;
    private Producto producto;
    private Pedido pedido;
    private int cantidad;

    public PedidoProducto() {
    }

    public PedidoProducto(int idPedidoProducto, Producto producto, Pedido pedido, int cantidad) {
        this.idPedidoProducto = idPedidoProducto;
        this.producto = producto;
        this.pedido = pedido;
        this.cantidad = cantidad;
    }

    public PedidoProducto(Producto producto, Pedido pedido, int cantidad) {
        this.producto = producto;
        this.pedido = pedido;
        this.cantidad = cantidad;
    }

    public int getIdPedidoProducto() {
        return idPedidoProducto;
    }

    public void setIdPedidoProducto(int idPedidoProducto) {
        this.idPedidoProducto = idPedidoProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PedidoProducto{" + "idPedidoProducto=" + idPedidoProducto + ", producto=" + producto + ", pedido=" + pedido + ", cantidad=" + cantidad + '}';
    }

    
    
}
