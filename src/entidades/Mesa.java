package entidades;

public class Mesa {

    private int idMesa;

    private int numeroMesa; 
    
    private int capacidad;

    private boolean estadoMesa;

    public Mesa(int idMesa,int numeroMesa, int capacidad, boolean estadoMesa) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.estadoMesa = estadoMesa;
        this.numeroMesa = numeroMesa;
    }

    public Mesa() {
    }

    public Mesa(int numeroMesa, int capacidad, boolean estadoMesa) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.estadoMesa = estadoMesa;
    }

    
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    
    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(boolean estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", capacidad=" + capacidad + ", estadoMesa=" + estadoMesa + '}';
    }
    
    
    
}
