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
public class RegistroCuidadores extends javax.swing.JPanel {

    /**
     * Creates new form RegistroCuidadores
     */
    public RegistroCuidadores() {
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

        pnlTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txt2doNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtApellidoMaterno = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuidadores = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(212, 255, 204));
        setPreferredSize(new java.awt.Dimension(850, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitulo.setBackground(new java.awt.Color(0, 179, 61));
        pnlTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control de Cuidadores ");
        pnlTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        pnlOpciones.setBackground(new java.awt.Color(0, 179, 61));
        pnlOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(0, 179, 61));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setFocusable(false);
        btnGuardar.setOpaque(true);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saveOn.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlOpciones.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        btnLimpiar.setBackground(new java.awt.Color(0, 179, 61));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFocusable(false);
        btnLimpiar.setOpaque(true);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiarOn.png"))); // NOI18N
        btnLimpiar.setRequestFocusEnabled(false);
        btnLimpiar.setRolloverEnabled(false);
        pnlOpciones.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 40));

        add(pnlOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 850, 40));

        pnlPrincipal.setOpaque(false);
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("2do Nombre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 25));

        jSeparator1.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 173, 15));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Nombre ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, -1));

        txt2doNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txt2doNombre.setForeground(new java.awt.Color(255, 255, 255));
        txt2doNombre.setBorder(null);
        txt2doNombre.setOpaque(false);
        txt2doNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2doNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt2doNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, 25));

        jSeparator2.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 173, 15));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Apellido Paterno");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, -1));

        txtApellidoPaterno.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtApellidoPaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoPaterno.setBorder(null);
        txtApellidoPaterno.setOpaque(false);
        txtApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, 25));

        jSeparator3.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 173, 15));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Sueldo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, -1));

        txtSueldo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtSueldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSueldo.setBorder(null);
        txtSueldo.setOpaque(false);
        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 170, 25));

        jSeparator5.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 173, 15));

        txtApellidoMaterno.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoMaterno.setBorder(null);
        txtApellidoMaterno.setOpaque(false);
        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 170, 25));

        jSeparator6.setBackground(new java.awt.Color(0, 179, 61));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 173, 15));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Apellido Materno");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 150, -1));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("   Registro");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        pnlPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 810, 180));

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCuidadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCuidadores);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 770, 240));

        btnEditar.setBackground(new java.awt.Color(0, 51, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lazo.png"))); // NOI18N
        btnEditar.setText("Actualizar ");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.setFocusable(false);
        btnEditar.setOpaque(true);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lazo (1).png"))); // NOI18N
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 0, 120, 40));

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("   Cuidadores");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        pnlPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 810, 320));

        add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txt2doNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2doNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2doNombreActionPerformed

    private void txtApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPaternoActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel pnlOpciones;
    public javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    public javax.swing.JTable tblCuidadores;
    public javax.swing.JTextField txt2doNombre;
    public javax.swing.JTextField txtApellidoMaterno;
    public javax.swing.JTextField txtApellidoPaterno;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
