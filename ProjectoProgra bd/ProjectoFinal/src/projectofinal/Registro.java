package projectofinal;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Jose Javier
 */
public class Registro extends javax.swing.JFrame {

    ColaAsientos Encolar = new ColaAsientos();

    DatosRegistro A = new DatosRegistro();
    ListaRegistro Aux = new ListaRegistro();
    private String prefix, s = "";
    private boolean numeric = true;
    private int PrecioA,PrecioB;

    public Registro() {
        ImageIcon icon;
        icon = new ImageIcon("src\\Recursos\\Logo.png");
        setTitle("Bienvenido a FlyHigh");
        setIconImage(icon.getImage());
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionunica = new javax.swing.ButtonGroup();
        PanelReg = new keeptoo.KGradientPanel();
        cedula = new javax.swing.JTextField();
        nombretxt = new javax.swing.JLabel();
        cedulatxt = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        trattxt = new javax.swing.JLabel();
        emailtxt = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        peticiontxt = new javax.swing.JLabel();
        radsr = new javax.swing.JRadioButton();
        radsra = new javax.swing.JRadioButton();
        terminado = new javax.swing.JButton();
        nAsiento = new javax.swing.JTextField();
        Asientotxt = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        monto = new javax.swing.JLabel();
        NOborrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Notas = new javax.swing.JTextArea();
        Gprecio = new javax.swing.JButton();
        VerAsientos = new javax.swing.JButton();
        Desde = new javax.swing.JComboBox<>();
        Hacia = new javax.swing.JComboBox<>();
        Clases = new javax.swing.JComboBox<>();
        HaciaTxt = new javax.swing.JLabel();
        DesdeTxt = new javax.swing.JLabel();
        ClaseTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        anadir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        PanelReg.setkEndColor(new java.awt.Color(13, 137, 149));
        PanelReg.setkStartColor(new java.awt.Color(255, 204, 0));
        PanelReg.setMaximumSize(null);
        PanelReg.setPreferredSize(new java.awt.Dimension(1308, 755));

        cedula.setForeground(new java.awt.Color(41, 9, 252));
        cedula.setText("183506428");
        cedula.setToolTipText("");
        cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaFocusGained(evt);
            }
        });

        nombretxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        nombretxt.setText("Nombre Del Cliente");

        cedulatxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cedulatxt.setText("Cedula");

        nom.setForeground(new java.awt.Color(41, 9, 252));
        nom.setText("Nombre");
        nom.setToolTipText("");
        nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomFocusGained(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(156, 97, 139));
        titulo.setText("<html> Registarse  <br> En FlyHigh </html>");

        trattxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        trattxt.setText("Tratamiento");

        emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        emailtxt.setText("Email");

        Correo.setForeground(new java.awt.Color(41, 9, 252));
        Correo.setText("Correo");
        Correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CorreoFocusGained(evt);
            }
        });

        peticiontxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        peticiontxt.setText("Notas Para El Vuelo");

        seleccionunica.add(radsr);
        radsr.setText("Sr.");
        radsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radsrActionPerformed(evt);
            }
        });

        seleccionunica.add(radsra);
        radsra.setSelected(true);
        radsra.setText("Sra.");
        radsra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radsraActionPerformed(evt);
            }
        });

        terminado.setText("Siguiente");
        terminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminadoActionPerformed(evt);
            }
        });

        nAsiento.setForeground(new java.awt.Color(41, 9, 252));
        nAsiento.setText("99");
        nAsiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nAsientoFocusGained(evt);
            }
        });

        Asientotxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Asientotxt.setText("Asiento");

        Precio.setEditable(false);
        Precio.setForeground(new java.awt.Color(41, 9, 252));
        Precio.setText("0");
        Precio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        monto.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        monto.setText("Monto A Pagar");

        NOborrar.setEditable(false);

        Notas.setColumns(20);
        Notas.setForeground(new java.awt.Color(204, 204, 0));
        Notas.setRows(5);
        jScrollPane1.setViewportView(Notas);

        Gprecio.setText("Generar precio");
        Gprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GprecioActionPerformed(evt);
            }
        });

        VerAsientos.setText("Comprobar Asientos");
        VerAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerAsientosActionPerformed(evt);
            }
        });

        Desde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSP", "ITA", "PRS", "SJO" }));
        Desde.setToolTipText("Seleccion Del Aeropuerto");

        Hacia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSP", "ITA", "PRS", "SJO" }));
        Hacia.setToolTipText("Seleccion Del Aeropuerto");

        Clases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Premium", "Ejecutiva", "Economico" }));
        Clases.setToolTipText("Clase Para El Vuelo");

        HaciaTxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        HaciaTxt.setLabelFor(Hacia);
        HaciaTxt.setText("Hacia");

        DesdeTxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        DesdeTxt.setLabelFor(Desde);
        DesdeTxt.setText("Desde");

        ClaseTxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ClaseTxt.setLabelFor(Clases);
        ClaseTxt.setText("Clase");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo_Xs.png"))); // NOI18N

        anadir.setText("Añadir");
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRegLayout = new javax.swing.GroupLayout(PanelReg);
        PanelReg.setLayout(PanelRegLayout);
        PanelRegLayout.setHorizontalGroup(
            PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegLayout.createSequentialGroup()
                        .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(PanelRegLayout.createSequentialGroup()
                                .addComponent(VerAsientos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(anadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(terminado)))
                        .addGap(11, 11, 11))
                    .addGroup(PanelRegLayout.createSequentialGroup()
                        .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cedula)
                            .addComponent(emailtxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedulatxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trattxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelRegLayout.createSequentialGroup()
                                .addComponent(radsra)
                                .addGap(18, 18, 18)
                                .addComponent(radsr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Correo)
                            .addComponent(nAsiento)
                            .addComponent(nombretxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Precio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Asientotxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelRegLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelRegLayout.createSequentialGroup()
                                        .addComponent(DesdeTxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Hacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(79, 79, 79))
                                    .addGroup(PanelRegLayout.createSequentialGroup()
                                        .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(HaciaTxt)
                                            .addComponent(ClaseTxt))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(Clases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(PanelRegLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(Gprecio)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelRegLayout.createSequentialGroup()
                        .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monto)
                            .addComponent(peticiontxt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PanelRegLayout.createSequentialGroup()
                .addComponent(NOborrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelRegLayout.setVerticalGroup(
            PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegLayout.createSequentialGroup()
                .addComponent(NOborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombretxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DesdeTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trattxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radsra)
                    .addComponent(radsr)
                    .addComponent(Hacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HaciaTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cedulatxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClaseTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailtxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelRegLayout.createSequentialGroup()
                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(Asientotxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gprecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(peticiontxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terminado)
                    .addComponent(VerAsientos)
                    .addComponent(anadir))
                .addGap(11, 11, 11))
        );

        getContentPane().add(PanelReg);
        PanelReg.setBounds(100, 70, 400, 600);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/background.jpg"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(600, 750));
        Fondo.setMinimumSize(new java.awt.Dimension(600, 750));
        getContentPane().add(Fondo);
        Fondo.setBounds(-1860, -70, 2510, 1150);

        setSize(new java.awt.Dimension(641, 839));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VerAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAsientosActionPerformed
        JOptionPane.showMessageDialog(null, A);
    }//GEN-LAST:event_VerAsientosActionPerformed

    private void GprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GprecioActionPerformed
        Precio.setForeground(Color.black);
        if (Clases.getSelectedItem() == "Premium") {
            PrecioA = (int) (Math.random() * 9000) + 720;
        } else if (Clases.getSelectedItem() == "Ejecutiva") {
            PrecioA = (int) (Math.random() * 3500) + 360;
        } else if (Clases.getSelectedItem() == "Economico") {
            PrecioA = (int) (Math.random() * 1700) + 180;
        }
        Precio.setText("" + PrecioA);
        
        
       

    }//GEN-LAST:event_GprecioActionPerformed

    private void nAsientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nAsientoFocusGained
        nAsiento.setText("");
        nAsiento.setForeground(Color.black);
    }//GEN-LAST:event_nAsientoFocusGained

    private void terminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminadoActionPerformed
        this.dispose();
        new Equipaje().setVisible(true);

    }//GEN-LAST:event_terminadoActionPerformed

    private void radsraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radsraActionPerformed
        prefix = "Sra.";
    }//GEN-LAST:event_radsraActionPerformed

    private void radsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radsrActionPerformed
        prefix = "Sr.";
    }//GEN-LAST:event_radsrActionPerformed

    private void CorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoFocusGained
        Correo.setText("");
        Correo.setForeground(Color.black);
    }//GEN-LAST:event_CorreoFocusGained

    private void nomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusGained
        nom.setText("");
        nom.setForeground(Color.black);
    }//GEN-LAST:event_nomFocusGained

    private void cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusGained
        cedula.setText("");
        cedula.setForeground(Color.black);
    }//GEN-LAST:event_cedulaFocusGained

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        s = nAsiento.getText();
        numeric = s.matches("-?\\d+(\\.\\d+)?");
        if (!"Nombre".equals(nom.getText())) {
            if (Integer.parseInt(cedula.getText()) != 183506428) {
                if (!"Correo".equals(Correo.getText())) {
                    if (numeric) {
                        if (Integer.parseInt(Precio.getText()) != 0) {
                            Encolar.EnCola(new NodoAsiento(nAsiento.getText()));
                            A.inserta(new ListaRegistro(Integer.parseInt(cedula.getText()), prefix + nom.getText(), Correo.getText(), Notas.getText(), Integer.parseInt(nAsiento.getText()), Integer.parseInt(Precio.getText())));
                            JOptionPane.showMessageDialog(null, Encolar);
                            this.setPrecioB(PrecioA);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Insertar Solo Numeros En El Campo De Asiento", "Error Fatal !", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Correo Indefinido", "Error Fatal !", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cedula Indefinida", "Error Fatal !", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre Indefinido", "Error Fatal !", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_anadirActionPerformed
        
    
    public int total(){
        return this.getPrecioB();
        }

    public int getPrecioB() {
        return PrecioB;
    }

    public void setPrecioB(int PrecioB) {
        this.PrecioB = PrecioB;
    }
        
        
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Asientotxt;
    private javax.swing.JLabel ClaseTxt;
    private javax.swing.JComboBox<String> Clases;
    private javax.swing.JTextField Correo;
    private javax.swing.JComboBox<String> Desde;
    private javax.swing.JLabel DesdeTxt;
    private javax.swing.JLabel Fondo;
    public javax.swing.JButton Gprecio;
    private javax.swing.JComboBox<String> Hacia;
    private javax.swing.JLabel HaciaTxt;
    private javax.swing.JTextField NOborrar;
    private javax.swing.JTextArea Notas;
    private keeptoo.KGradientPanel PanelReg;
    public javax.swing.JTextField Precio;
    private javax.swing.JButton VerAsientos;
    private javax.swing.JButton anadir;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel cedulatxt;
    private javax.swing.JLabel emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel monto;
    private javax.swing.JTextField nAsiento;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nombretxt;
    private javax.swing.JLabel peticiontxt;
    private javax.swing.JRadioButton radsr;
    private javax.swing.JRadioButton radsra;
    private javax.swing.ButtonGroup seleccionunica;
    private javax.swing.JButton terminado;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel trattxt;
    // End of variables declaration//GEN-END:variables
}
