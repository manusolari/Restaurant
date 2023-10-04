package entidades;


import java.time.LocalDate;

public class Reserva {

    private String nombre;

    private int DNI;

    private LocalDate fecha;

    //private LocalDate hora;

    private boolean estadoReserva;

    private Mesa m;

    private int idReserva;

    public Reserva() {
    }

    public Reserva(String nombre, int DNI, LocalDate fecha, LocalDate hora, boolean estadoReserva, Mesa m) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fecha = fecha;
        
        this.estadoReserva = estadoReserva;
        this.m = m;
    }

    public Reserva(String nombre, int DNI, LocalDate fecha, LocalDate hora, boolean estadoReserva, Mesa m, int idReserva) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fecha = fecha;
       
        this.estadoReserva = estadoReserva;
        this.m = m;
        this.idReserva = idReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

   

    public boolean isEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(boolean estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Mesa getM() {
        return m;
    }

    public void setM(Mesa m) {
        this.m = m;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", DNI=" + DNI + ", fecha=" + fecha +  ", estadoReserva=" + estadoReserva + ", m=" + m + ", idReserva=" + idReserva + '}';
    }
    
    
}
