/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author beatl
 */
public class ReporteVisitaMedica extends javax.swing.JPanel {

    /**
     * Creates new form ReporteVisitaMedica
     */
    public ReporteVisitaMedica() {
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

        pnlBarraTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBarraOpciones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbVeterinario = new javax.swing.JComboBox<>();
        cmbAnimal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRevisionMedica = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cmbSeleccion = new javax.swing.JComboBox<>();
        cmbOpcion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(212, 255, 204));
        setPreferredSize(new java.awt.Dimension(850, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 179, 61));
        pnlBarraTitulo.setAlignmentX(0.0F);
        pnlBarraTitulo.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlBarraTitulo.setPreferredSize(new java.awt.Dimension(850, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control Visitas Médicas");
        jLabel1.setMaximumSize(new java.awt.Dimension(282, 33));
        jLabel1.setMinimumSize(new java.awt.Dimension(282, 33));
        jLabel1.setPreferredSize(new java.awt.Dimension(282, 33));

        javax.swing.GroupLayout pnlBarraTituloLayout = new javax.swing.GroupLayout(pnlBarraTitulo);
        pnlBarraTitulo.setLayout(pnlBarraTituloLayout);
        pnlBarraTituloLayout.setHorizontalGroup(
            pnlBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraTituloLayout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        pnlBarraTituloLayout.setVerticalGroup(
            pnlBarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraTituloLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(pnlBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        pnlBarraOpciones.setBackground(new java.awt.Color(0, 179, 61));
        pnlBarraOpciones.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlBarraOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(0, 179, 61));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setDefaultCapable(false);
        btnGuardar.setFocusable(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(86, 32));
        btnGuardar.setMinimumSize(new java.awt.Dimension(86, 32));
        btnGuardar.setPreferredSize(new java.awt.Dimension(86, 32));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saveOn.png"))); // NOI18N
        pnlBarraOpciones.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        btnLimpiar.setBackground(new java.awt.Color(0, 179, 61));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setFocusable(false);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarOn.png"))); // NOI18N
        pnlBarraOpciones.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 40));

        add(pnlBarraOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 850, 40));

        pnlPrincipal.setBackground(new java.awt.Color(212, 255, 204));
        pnlPrincipal.setAlignmentX(0.0F);
        pnlPrincipal.setAlignmentY(0.0F);
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(850, 850));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 102));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(693, 165));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Animal ");
        jLabel3.setMaximumSize(new java.awt.Dimension(39, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(39, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(39, 25));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 99, 109, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Veterinario");
        jLabel2.setMaximumSize(new java.awt.Dimension(39, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(39, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(39, 25));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 24, 109, 30));

        jPanel1.add(cmbVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 29, 220, 30));

        jPanel1.add(cmbAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 99, 220, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Observaciones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 140, -1));

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 307, -1));

        pnlPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 810, 150));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Visitas Médicas");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, -1, -1));

        pnlPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 810, 40));

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel3.setMinimumSize(new java.awt.Dimension(790, 220));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRevisionMedica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblRevisionMedica);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 758, 160));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Filtro");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel3.add(cmbSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 170, 30));

        cmbOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcionActionPerformed(evt);
            }
        });
        jPanel3.add(cmbOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 170, 30));

        pnlPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 810, 270));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(810, 60));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, -1, -1));

        pnlPrincipal.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 810, 40));

        add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 840, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOpcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JComboBox<String> cmbAnimal;
    public javax.swing.JComboBox<String> cmbOpcion;
    public javax.swing.JComboBox<String> cmbSeleccion;
    public javax.swing.JComboBox<String> cmbVeterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlBarraOpciones;
    private javax.swing.JPanel pnlBarraTitulo;
    private javax.swing.JPanel pnlPrincipal;
    public javax.swing.JTable tblRevisionMedica;
    public javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
