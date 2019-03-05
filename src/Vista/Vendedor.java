/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Vendedor extends javax.swing.JFrame {
    String usuario;
    /**
     * Creates new form Vendedor
     */
    public Vendedor(String usuario) {
        this.usuario = usuario;
        initComponents();
        setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AgregarFacturacion = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ConsultarFacturacion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ModificarFacturacion = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        EliminarFacturacion = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        AgregarCotizacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ConsultarCotizacion = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ModificarCotizacion = new javax.swing.JButton();
        EliminarCotizacion = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(38, 39, 38));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoXYZ.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(250, 250, 250));
        jLabel11.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vendedor");

        jLabel12.setFont(new java.awt.Font("Decker", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cerrar Sesion");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(174, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel15)
                .addGap(74, 74, 74))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 110));

        AgregarFacturacion.setBackground(new java.awt.Color(250, 250, 250));
        AgregarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AgregarFactura.png"))); // NOI18N
        AgregarFacturacion.setBorder(null);
        AgregarFacturacion.setPreferredSize(new java.awt.Dimension(90, 90));
        AgregarFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarFacturacionActionPerformed(evt);
            }
        });
        jPanel4.add(AgregarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 90, 90));

        jLabel13.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(128, 49, 145));
        jLabel13.setText("Facturacion:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 49, 145));
        jLabel7.setText("Agregar");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        ConsultarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ConsultarFacturacion.png"))); // NOI18N
        ConsultarFacturacion.setBorder(null);
        ConsultarFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarFacturacionActionPerformed(evt);
            }
        });
        jPanel4.add(ConsultarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, 90));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(128, 49, 145));
        jLabel8.setText("Consultar");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        ModificarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModificarFacturacion.png"))); // NOI18N
        ModificarFacturacion.setBorder(null);
        jPanel4.add(ModificarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 90, 90));

        jLabel9.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(128, 49, 145));
        jLabel9.setText("Modificar");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        EliminarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EliminarPlantilla.png"))); // NOI18N
        EliminarFacturacion.setBorder(null);
        jPanel4.add(EliminarFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 90, 90));

        jLabel10.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(128, 49, 145));
        jLabel10.setText("Eliminar");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(128, 49, 145));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 530, 20));

        jLabel14.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(128, 49, 145));
        jLabel14.setText("Cotizacion:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        AgregarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AgregarFactura.png"))); // NOI18N
        AgregarCotizacion.setBorder(null);
        AgregarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCotizacionActionPerformed(evt);
            }
        });
        jPanel4.add(AgregarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 90, 90));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 49, 145));
        jLabel1.setText("Agregar");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        ConsultarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ConsultarFacturacion.png"))); // NOI18N
        ConsultarCotizacion.setBorder(null);
        ConsultarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarCotizacionActionPerformed(evt);
            }
        });
        jPanel4.add(ConsultarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 90, 90));

        jLabel16.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(128, 49, 145));
        jLabel16.setText("Consultar");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        ModificarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ConsultarFacturacion.png"))); // NOI18N
        ModificarCotizacion.setBorder(null);
        jPanel4.add(ModificarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 90, 90));

        EliminarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EliminarPlantilla.png"))); // NOI18N
        EliminarCotizacion.setBorder(null);
        jPanel4.add(EliminarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 90, 90));

        jLabel17.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(128, 49, 145));
        jLabel17.setText("Modificar");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel18.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(128, 49, 145));
        jLabel18.setText("Eliminar");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarCotizacionActionPerformed
        consultarCotizacion u = new consultarCotizacion(usuario);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ConsultarCotizacionActionPerformed

    private void AgregarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCotizacionActionPerformed
        agregarCotizacion agregarCotizacion = new agregarCotizacion(usuario);
        agregarCotizacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarCotizacionActionPerformed

    private void AgregarFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarFacturacionActionPerformed
        // TODO add your handling code here:
        agregarVenta agregarVenta = new agregarVenta(usuario);
        agregarVenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarFacturacionActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        login U = new login();
        U.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void ConsultarFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarFacturacionActionPerformed
        consultarVenta u = new consultarVenta(usuario);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ConsultarFacturacionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCotizacion;
    private javax.swing.JButton AgregarFacturacion;
    private javax.swing.JButton ConsultarCotizacion;
    private javax.swing.JButton ConsultarFacturacion;
    private javax.swing.JButton EliminarCotizacion;
    private javax.swing.JButton EliminarFacturacion;
    private javax.swing.JButton ModificarCotizacion;
    private javax.swing.JButton ModificarFacturacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
