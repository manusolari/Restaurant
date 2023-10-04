package entidades;

import java.time.LocalDate;

public class Pedido {

    private int idPedido;
    
    private Mesa m;

    private String nombre_mesero;

   
    private double importe;
    
    private LocalDate fecha_hora;
    
    private boolean cobrada;

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa m, String nombre_mesero, double importe, LocalDate fecha_hora, boolean cobrada) {
        this.idPedido = idPedido;
        this.m = m;
        this.nombre_mesero = nombre_mesero;
        this.importe = importe;
        this.fecha_hora = fecha_hora;
        this.cobrada = cobrada;
    }

    public Pedido(Mesa m, String nombre_mesero, double importe, LocalDate fecha_hora, boolean cobrada) {
        this.m = m;
        this.nombre_mesero = nombre_mesero;
        this.importe = importe;
        this.fecha_hora = fecha_hora;
        this.cobrada = cobrada;
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

    public String getNombre_mesero() {
        return nombre_mesero;
    }

    public void setNombre_mesero(String nombre_mesero) {
        this.nombre_mesero = nombre_mesero;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", m=" + m + ", nombre_mesero=" + nombre_mesero + ", importe=" + importe + ", fecha_hora=" + fecha_hora + ", cobrada=" + cobrada + '}';
    }
    
     
}
