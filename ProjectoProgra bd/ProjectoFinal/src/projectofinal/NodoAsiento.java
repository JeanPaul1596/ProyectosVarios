package projectofinal;


public class NodoAsiento 
{
   private String Dato;
   private NodoAsiento Atras;

    public NodoAsiento(String Dato)
    {
        this.Dato = Dato;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public NodoAsiento getAtras() {
        return Atras;
    }

    public void setAtras(NodoAsiento Atras) {
        this.Atras = Atras;
    }

    @Override
    public String toString() {
        return Dato;
    }
   
   
}
