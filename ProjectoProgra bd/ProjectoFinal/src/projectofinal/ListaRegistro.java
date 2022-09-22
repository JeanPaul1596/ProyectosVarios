package projectofinal;

/**
 * @author Pamela
 */

public class ListaRegistro {

    private int cedula;
    private String nombre;
    private String notas;
    private int preciototal;
    private String correo;
    private int asiento;

    public ListaRegistro(int cedula, String nombre, String correo, String notas, int asiento, int preciototal) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.notas = notas;
        this.asiento = asiento;
        this.preciototal = preciototal;

    }

    public ListaRegistro() {

    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(int preciototal) {
        this.preciototal = preciototal;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Datos{" + "cedula=" + cedula + ", nombre=" + nombre + ", notas=" + notas + ", preciototal=" + preciototal + ", correo=" + correo + ", asiento=" + asiento + '}';
    }
}
