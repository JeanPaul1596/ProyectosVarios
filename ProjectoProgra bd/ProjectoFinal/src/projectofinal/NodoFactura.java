package projectofinal;

/**
 * @author Pamela
 */

public class NodoFactura {

    private ListaRegistro dato;
    private NodoFactura next;
    private NodoFactura back;

    public NodoFactura getBack() {
        return back;
    }

    public void setBack(NodoFactura back) {
        this.back = back;
    }

    public String toString() {
        return "" + dato;
    }

    public NodoFactura(ListaRegistro dato) {
        this.dato = dato;
    }

    public ListaRegistro getDato() {
        return dato;
    }

    public void setDato(ListaRegistro dato) {
        this.dato = dato;
    }

    public NodoFactura getNext() {
        return next;
    }

    public void setNext(NodoFactura next) {
        this.next = next;
    }

}
