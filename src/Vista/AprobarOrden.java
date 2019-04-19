/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControlOrden;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class AprobarOrden extends javax.swing.JFrame {
    String usuario;
    DefaultTableModel tabla;
    ControlOrden controlOrden = new ControlOrden();
    /**
     * Creates new form AprobarOrden
     */
    public AprobarOrden(String usuario) {
        this.usuario = usuario;
        initComponents();
        setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        cargarOrdenes("");
    }
    
    void cargarOrdenes(String busqueda){
        tabla = controlOrden.cargarOrdenes(busqueda);
        this.ordenes.setModel(tabla);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordenes = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EncabezadoAprobOrd.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setText("N° Orden:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        busqueda.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        busqueda.setBorder(null);
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
        });
        jPanel1.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 150, 10));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);

        ordenes.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        ordenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ordenes.setPreferredSize(new java.awt.Dimension(400, 400));
        ordenes.setSelectionBackground(new java.awt.Color(102, 0, 102));
        ordenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ordenes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 450, 167));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR2.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JefeTaller u = new JefeTaller(usuario);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ordenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenesMouseClicked
        try {
            int  fila = ordenes.getSelectedRow();
            
            String codigo = ordenes.getValueAt(fila, 0).toString();
            String producto = ordenes.getValueAt(fila, 2).toString();
            String cantidad = ordenes.getValueAt(fila, 3).toString();
            int peticion = Integer.parseInt(cantidad);
            
            int  numero = JOptionPane.showConfirmDialog(rootPane, "¿Desea aprobar la orden N°"+ codigo +"?");
            System.out.println( numero );
            if((numero == 1) || (numero == 2)){
                JOptionPane.showMessageDialog(this, "La orden no ha sido aprobada");
            }
            else{
                String mensaje = controlOrden.aprobarOrden(codigo, producto, peticion);
                JOptionPane.showMessageDialog(this, mensaje);
                cargarOrdenes("");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ordenesMouseClicked

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        String busqueda = this.busqueda.getText();
        cargarOrdenes(busqueda);
    }//GEN-LAST:event_busquedaKeyReleased

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busqueda;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable ordenes;
    // End of variables declaration//GEN-END:variables
}
