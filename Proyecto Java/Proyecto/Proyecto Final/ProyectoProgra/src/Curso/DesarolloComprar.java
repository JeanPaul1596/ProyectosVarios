package Curso;
import javax.swing.JOptionPane;
public class DesarolloComprar implements Operacion,Impresion{
     
    private int Resultado;
    private String Producto;
    private String Cantidad;
    
    
    public DesarolloComprar(){
       this.Cantidad="";
       this.Producto="";
    }
   
    @Override
    public int Opera(){
       return Resultado;
    }
    
    public void imprimir(){
       
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int Resultado) {
        this.Resultado = Resultado;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
