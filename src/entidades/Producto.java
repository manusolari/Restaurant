package entidades;

public class Producto {

    private int idProducto;

    private String nombre;

    private int cantidad;

    private double precio;

    private boolean estado;
    
    public Producto() {
    }

    public Producto(String nombre, int cantidad, double precio, boolean estado) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    
    public Producto(int idProducto, String nombre, int cantidad, double precio, boolean estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", estado=" + estado + '}';
    }

    
    
    
}
