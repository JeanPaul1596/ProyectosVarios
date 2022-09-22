package projectofinal;

import javax.swing.JOptionPane;
/**
 * @author Pamela
 */
public class DatosRegistro {

    private NodoFactura cabeza;
    private NodoFactura ultimo;
    


    public void inserta(ListaRegistro p) {
        if (cabeza == null) {
            cabeza = new NodoFactura(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(ultimo);
        } else if (p.getCedula() < cabeza.getDato().getCedula()) {
            NodoFactura aux = new NodoFactura(p);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else if (ultimo.getDato().getCedula() <= p.getCedula()) {
            NodoFactura aux = new NodoFactura(p);
            ultimo.setNext(aux);
            aux.setBack(ultimo);
            ultimo.setNext(new NodoFactura(p));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else {
            NodoFactura aux = cabeza;
            while (aux.getNext().getDato().getCedula() < p.getCedula()) {
                aux = aux.getNext();
            }
            NodoFactura temp = new NodoFactura(p);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
    }

    public String toString() {
        NodoFactura aux = cabeza;
        String s = "Asientos en uso:\n ";
        if (aux != null) {
            s += aux + ",\n ";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + ",\n ";
                aux = aux.getNext();
            }
        } else {
            s += "Vacío";
        }
        return s;
    }
}
