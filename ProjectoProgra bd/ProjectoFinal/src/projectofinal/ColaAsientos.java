package projectofinal;

public class ColaAsientos {

    private NodoAsiento Frente;
    private NodoAsiento Ultimo;

    public void EnCola(NodoAsiento D) {
        if (Frente == null) {
            Frente = D;
            Ultimo = D;

        } else {
            Ultimo.setAtras(D);
            Ultimo = D;
        }
    }

    public NodoAsiento atiende() {
        NodoAsiento aux = Frente;
        if (Frente != null) {
            Frente = Frente.getAtras();
            aux.setAtras(null);

        }
        return aux;
    }

    public boolean Buscar(String Buscarlo, boolean existe) {

        NodoAsiento Comparar = Frente;
        existe = false;

        while (existe != true && Comparar != null) {

            if (Buscarlo == Comparar.getDato()) {
                System.out.println("El elemento existe");
            } else {
                existe = true;
                Comparar = Comparar.getAtras();
                System.out.println("El elemento no existe");
            }
        }
        return existe;
    }

    public String toString() {
        String s = "El(Los) Asientos En Uso Son =\n";
        NodoAsiento aux = Frente;
        while (aux != null) {
            s += "Asiento #"+aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }
}
