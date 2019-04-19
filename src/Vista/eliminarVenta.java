/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Natalia
 */
public class eliminarVenta extends javax.swing.JFrame {
    String usuario;
    DefaultTableModel tabla;
    ControlVenta controlVenta = new ControlVenta();
    ControlCarritoVen controlCarritoVen = new ControlCarritoVen();
    /**
     * Creates new form eliminarCotizacion
     */
    public eliminarVenta(String usuario) {
        this.usuario = usuario;
        initComponents();
        this.setLocationRelativeTo(null);
        cargarVentas("");
    }
    
    void cargarVentas(String busqueda){
        tabla = controlVenta.cargarInfoVentas(busqueda);
        this.ventas.setModel(tabla);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ventas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jLabelEliminarCotizacion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        ventas.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        ventas.setForeground(new java.awt.Color(102, 0, 102));
        ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° COTIZACION", "CEDULA VENDEDOR", "FECHA ", "TOTAL"
            }
        ));
        ventas.setPreferredSize(new java.awt.Dimension(400, 400));
        ventas.setSelectionBackground(new java.awt.Color(102, 0, 102));
        ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ventas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 510, 210));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR2.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 40));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setText("N° Venta:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, -1));

        busqueda.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        busqueda.setForeground(new java.awt.Color(102, 0, 102));
        busqueda.setBorder(null);
        busqueda.setOpaque(false);
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
        });
        jPanel1.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 120, -1));

        jLabelEliminarCotizacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEliminarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ELIMINARFACTURAFONDO.png"))); // NOI18N
        jPanel1.add(jLabelEliminarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 90));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 120, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseClicked
        try {
            int  fila = ventas.getSelectedRow();

            String codigo = ventas.getValueAt(fila, 0).toString();

            int  numero = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar la venta N°"+ codigo +"?");
            if((numero == 1) || (numero == 2)){
                JOptionPane.showMessageDialog(this, "La venta no fue eliminada");
            }
            else{
                String mensaje = controlVenta.eliminarVenta(codigo);
                controlCarritoVen.eliminarProductos(codigo);
                JOptionPane.showMessageDialog(this, mensaje);
                cargarVentas("");
            }

        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_ventasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vendedor v = new Vendedor(usuario);
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        String busqueda = this.busqueda.getText();
        cargarVentas(busqueda);
    }//GEN-LAST:event_busquedaKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEliminarCotizacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable ventas;
    // End of variables declaration//GEN-END:variables
}
