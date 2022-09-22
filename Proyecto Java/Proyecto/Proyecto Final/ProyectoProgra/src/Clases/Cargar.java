package Clases;
import javax.swing.JProgressBar;

public class Cargar extends Thread{
    JProgressBar progreso;
    public Cargar(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            progreso.setValue(i);
            pausa(30);
        }
    }
    
    public void pausa(int mlSeg){
        try{
            Thread.sleep(mlSeg);
        }
        catch(Exception e){ 
        }
    }
}
