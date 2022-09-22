package Curso;
import Clases.Cargar;
import com.sun.awt.AWTUtilities;

public final class Inicio extends javax.swing.JFrame {
    double i=50,
    j=1;
    Cargar hilo;
    public Inicio() {
        initComponents();
        iniciar();
    }
    
    public void iniciar(){
        setLocationRelativeTo(null); 
        Progreso.setVisible(false);
        hilo=new Cargar(getProgreso());
        hilo.start();
        hilo=null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Progreso = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Progreso.setBackground(new java.awt.Color(131, 81, 150));
        Progreso.setForeground(new java.awt.Color(131, 81, 150));
        Progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProgresoStateChanged(evt);
            }
        });
        getContentPane().add(Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 820, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -30, 940, 540));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 237, 178));
        jLabel1.setText("Allison Zamora Amador - Jean Paul Porras Carvajal");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 820, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProgresoStateChanged
    if(Progreso.getValue()==i){
        if(j!=101){
            AWTUtilities.setWindowOpacity(this, Float.valueOf((100-j)/100+"f"));
            i++;
            j+=2;
        }
    }
    if(Progreso.getValue()==100){
        Registro v=new Registro();
        v.setVisible(true);
        this.dispose();
    }
}//GEN-LAST:event_ProgresoStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JProgressBar getProgreso() {
        return Progreso;
    }

    public void setProgreso(javax.swing.JProgressBar Progreso) {
        this.Progreso = Progreso;
    }
}
