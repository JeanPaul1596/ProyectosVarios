package projectofinal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JeanP ~ Jose Javier
 */
public class Equipaje extends javax.swing.JFrame {

    public Equipaje() {
        ImageIcon icon;
        icon = new ImageIcon("src\\Recursos\\Logo.png");
        setTitle("Bienvenido a FlyHigh");
        setIconImage(icon.getImage());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEquip = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        Peso = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Siguiente = new javax.swing.JButton();
        ComprobarEq = new javax.swing.JButton();
        PesoN = new javax.swing.JTextField();
        PesoTxt = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        PesoTxt1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        PanelEquip.setkEndColor(new java.awt.Color(13, 137, 149));
        PanelEquip.setkStartColor(new java.awt.Color(255, 204, 0));
        PanelEquip.setMaximumSize(null);
        PanelEquip.setPreferredSize(new java.awt.Dimension(1308, 755));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 69, 73));
        jLabel3.setText("<html> Registro de equpaje<br> FlyHigh </html>");

        Peso.setMinimum(1);
        Peso.setValue(0);
        Peso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PesoStateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mochila.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/viaje.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/viaje (1).png"))); // NOI18N

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        ComprobarEq.setText("Comprobar");
        ComprobarEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarEqActionPerformed(evt);
            }
        });

        PesoN.setText("1");
        PesoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoNActionPerformed(evt);
            }
        });

        PesoTxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        PesoTxt.setLabelFor(PesoN);
        PesoTxt.setText("Peso Del Equipaje :");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo.png"))); // NOI18N

        PesoTxt1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        PesoTxt1.setLabelFor(PesoN);
        PesoTxt1.setText("Kg");

        javax.swing.GroupLayout PanelEquipLayout = new javax.swing.GroupLayout(PanelEquip);
        PanelEquip.setLayout(PanelEquipLayout);
        PanelEquipLayout.setHorizontalGroup(
            PanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEquipLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ComprobarEq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Siguiente)
                .addGap(22, 22, 22))
            .addGroup(PanelEquipLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(PanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipLayout.createSequentialGroup()
                        .addComponent(PesoTxt)
                        .addGap(18, 18, 18)
                        .addComponent(PesoN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PesoTxt1)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipLayout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(145, 145, 145))))
        );
        PanelEquipLayout.setVerticalGroup(
            PanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEquipLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipLayout.createSequentialGroup()
                        .addGroup(PanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(PanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipLayout.createSequentialGroup()
                        .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PesoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PesoTxt)
                            .addComponent(PesoTxt1))
                        .addGap(101, 101, 101)
                        .addComponent(ComprobarEq))
                    .addComponent(Siguiente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
        );

        getContentPane().add(PanelEquip);
        PanelEquip.setBounds(80, 140, 420, 530);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Equipaje-de-mano (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 760);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComprobarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarEqActionPerformed
        int Eextra = 0;
        if (Peso.getValue() <= 25) {
            Eextra = (int) (Math.random() * 170) + 17;
        } else if (Peso.getValue() <= 50) {
            Eextra = (int) (Math.random() * 270) + 27;
        } else if (Peso.getValue() <= 75) {
            Eextra = (int) (Math.random() * 350) + 35;
        } else if (Peso.getValue() <= 100) {
            Eextra = (int) (Math.random() * 900) + 90;
        }
        JOptionPane.showMessageDialog(null, "El Precio Para La Maleta Seria: $" + Eextra);
    }//GEN-LAST:event_ComprobarEqActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        new FacturaFinal().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_SiguienteActionPerformed

    private void PesoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PesoStateChanged
        PesoN.setText("" + Peso.getValue());

    }//GEN-LAST:event_PesoStateChanged

    private void PesoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Equipaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComprobarEq;
    private javax.swing.JLabel Logo;
    private keeptoo.KGradientPanel PanelEquip;
    private javax.swing.JSlider Peso;
    private javax.swing.JTextField PesoN;
    private javax.swing.JLabel PesoTxt;
    private javax.swing.JLabel PesoTxt1;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
