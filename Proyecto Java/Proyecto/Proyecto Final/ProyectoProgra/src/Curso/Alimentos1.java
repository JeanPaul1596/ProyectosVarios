package Curso;

public abstract class Alimentos1 extends Alimentos{

    public Alimentos1(){
      this.Bebidas="";
      this.ComidaSana="";
   }

    @Override
    public void setComidaSana() {
        this.ComidaSana = ComidaSana; }

    @Override
    public void setBebidas() {
         this.Bebidas = Bebidas;
    }
  
    public String getComidaSana() {
       return ComidaSana; 
    }
  
    public String getBebidas() {
        return Bebidas; 
    }

    @Override
    public void getComidaSana(int ComidaSana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getBebidas(int Bebidas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
