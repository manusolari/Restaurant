package entidades;

public class Mesero {

    private String nombre;

    private int idMesero;

    private String contrasenia;

    public Mesero() {
    }

    public Mesero(String nombre, int idMesero, String contrasenia) {
        this.nombre = nombre;
        this.idMesero = idMesero;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Mesero{" + "nombre=" + nombre + ", idMesero=" + idMesero + ", contrasenia=" + contrasenia + '}';
    }
    
    
}
