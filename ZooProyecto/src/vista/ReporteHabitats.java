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
public class ReporteHabitats extends javax.swing.JPanel {

    /**
     * Creates new form ReporteHabitats
     */
    public ReporteHabitats() {
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
        pnlRegistroHabitat = new javax.swing.JPanel();
        pnlBarraOpciones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        pnlFormaularioRegistro = new javax.swing.JPanel();
        cmbClima = new javax.swing.JComboBox<>();
        cmbResponsable = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pnlVistaHabitats = new javax.swing.JPanel();
        pnlTituloHistorial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlFormularioReportes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitats = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlReporte = new javax.swing.JPanel();
        pnlTituloReporte = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlFormularioReporte = new javax.swing.JPanel();
        btnLimpiar1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtTemperatura = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cmbHabitats = new javax.swing.JComboBox<>();
        txtHumedad = new javax.swing.JTextField();

        setBackground(new java.awt.Color(212, 255, 204));
        setPreferredSize(new java.awt.Dimension(850, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 179, 61));
        pnlBarraTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlBarraTitulo.setPreferredSize(new java.awt.Dimension(850, 40));
        pnlBarraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de Habitats");
        jLabel1.setMaximumSize(new java.awt.Dimension(282, 33));
        jLabel1.setMinimumSize(new java.awt.Dimension(282, 33));
        jLabel1.setPreferredSize(new java.awt.Dimension(282, 33));
        pnlBarraTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 850, 40));

        add(pnlBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        pnlRegistroHabitat.setBackground(new java.awt.Color(0, 153, 102));
        pnlRegistroHabitat.setForeground(new java.awt.Color(0, 153, 102));
        pnlRegistroHabitat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraOpciones.setBackground(new java.awt.Color(0, 51, 51));
        pnlBarraOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("   Registro");
        jLabel4.setOpaque(true);
        pnlBarraOpciones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        btnGuardar.setBackground(new java.awt.Color(0, 51, 51));
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
        btnGuardar.setOpaque(true);
        btnGuardar.setPreferredSize(new java.awt.Dimension(86, 32));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saveOn.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlBarraOpciones.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 100, 40));

        btnLimpiar.setBackground(new java.awt.Color(0, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setDefaultCapable(false);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setFocusable(false);
        btnLimpiar.setOpaque(true);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarOn.png"))); // NOI18N
        pnlBarraOpciones.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 100, 40));

        pnlRegistroHabitat.add(pnlBarraOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        pnlFormaularioRegistro.setBackground(new java.awt.Color(0, 153, 102));
        pnlFormaularioRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbClima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlFormaularioRegistro.add(cmbClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 65, 200, -1));

        cmbResponsable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlFormaularioRegistro.add(cmbResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 25, 200, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Responsable");
        pnlFormaularioRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 140, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Nombre ");
        pnlFormaularioRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlFormaularioRegistro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 15));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlFormaularioRegistro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, 25));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Clima");
        pnlFormaularioRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));

        pnlRegistroHabitat.add(pnlFormaularioRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 810, 110));

        add(pnlRegistroHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 810, 150));

        pnlVistaHabitats.setBackground(new java.awt.Color(0, 153, 102));
        pnlVistaHabitats.setOpaque(false);
        pnlVistaHabitats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTituloHistorial.setBackground(new java.awt.Color(0, 51, 51));
        pnlTituloHistorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Historial");
        jLabel2.setOpaque(true);
        pnlTituloHistorial.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 90, 40));

        pnlVistaHabitats.add(pnlTituloHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        pnlFormularioReportes.setBackground(new java.awt.Color(0, 153, 102));
        pnlFormularioReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHabitats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblHabitats);

        pnlFormularioReportes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 260));

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblReporte);

        pnlFormularioReportes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 250, 260));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione un Habitat para Ver Historial de Reportes de Temperatura y Humedad");
        pnlFormularioReportes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        pnlFormularioReportes.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 570, 40));

        pnlVistaHabitats.add(pnlFormularioReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 570, 350));

        add(pnlVistaHabitats, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 570, 390));

        pnlReporte.setBackground(new java.awt.Color(0, 153, 102));
        pnlReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTituloReporte.setBackground(new java.awt.Color(0, 51, 51));
        pnlTituloReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Reporte");
        jLabel6.setOpaque(true);
        pnlTituloReporte.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 90, 40));

        pnlReporte.add(pnlTituloReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        pnlFormularioReporte.setBackground(new java.awt.Color(0, 153, 102));
        pnlFormularioReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar1.setBackground(new java.awt.Color(0, 51, 51));
        btnLimpiar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.setBorder(null);
        btnLimpiar1.setBorderPainted(false);
        btnLimpiar1.setContentAreaFilled(false);
        btnLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar1.setDefaultCapable(false);
        btnLimpiar1.setFocusPainted(false);
        btnLimpiar1.setFocusable(false);
        btnLimpiar1.setOpaque(true);
        btnLimpiar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarOn.png"))); // NOI18N
        pnlFormularioReporte.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 110, 40));

        btnGuardar1.setBackground(new java.awt.Color(0, 51, 51));
        btnGuardar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.setBorder(null);
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.setContentAreaFilled(false);
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.setDefaultCapable(false);
        btnGuardar1.setFocusable(false);
        btnGuardar1.setMaximumSize(new java.awt.Dimension(86, 32));
        btnGuardar1.setMinimumSize(new java.awt.Dimension(86, 32));
        btnGuardar1.setOpaque(true);
        btnGuardar1.setPreferredSize(new java.awt.Dimension(86, 32));
        btnGuardar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saveOn.png"))); // NOI18N
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        pnlFormularioReporte.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 110, 40));
        pnlFormularioReporte.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 20));

        txtTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTemperatura.setForeground(new java.awt.Color(255, 255, 255));
        txtTemperatura.setText("Temperatura");
        txtTemperatura.setBorder(null);
        txtTemperatura.setOpaque(false);
        pnlFormularioReporte.add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, 25));
        pnlFormularioReporte.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Generar Reporte ");
        pnlFormularioReporte.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cmbHabitats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlFormularioReporte.add(cmbHabitats, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, -1));

        txtHumedad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtHumedad.setForeground(new java.awt.Color(255, 255, 255));
        txtHumedad.setText("Humedad");
        txtHumedad.setBorder(null);
        txtHumedad.setOpaque(false);
        pnlFormularioReporte.add(txtHumedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 25));

        pnlReporte.add(pnlFormularioReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 350));

        add(pnlReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 220, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnGuardar1;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnLimpiar1;
    public javax.swing.JComboBox<String> cmbClima;
    public javax.swing.JComboBox<String> cmbHabitats;
    public javax.swing.JComboBox<String> cmbResponsable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pnlBarraOpciones;
    private javax.swing.JPanel pnlBarraTitulo;
    private javax.swing.JPanel pnlFormaularioRegistro;
    private javax.swing.JPanel pnlFormularioReporte;
    private javax.swing.JPanel pnlFormularioReportes;
    private javax.swing.JPanel pnlRegistroHabitat;
    private javax.swing.JPanel pnlReporte;
    private javax.swing.JPanel pnlTituloHistorial;
    private javax.swing.JPanel pnlTituloReporte;
    private javax.swing.JPanel pnlVistaHabitats;
    public javax.swing.JTable tblHabitats;
    public javax.swing.JTable tblReporte;
    public javax.swing.JTextField txtHumedad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
