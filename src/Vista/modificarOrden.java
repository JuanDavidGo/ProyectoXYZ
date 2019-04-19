/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Natalia
 */
public class modificarOrden extends javax.swing.JFrame {
    String usuario;
    DefaultTableModel tabla;
    DefaultTableModel tabla2;
    ControlOrden controlOrden = new ControlOrden();
    Date date = new Date();
    /**
     * Creates new form modificarOrden
     */
    public modificarOrden(String usuario) {
        this.usuario = usuario;
        initComponents();
        setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        cargarOrdenes("");
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.cedula.setText(usuario);
        this.fecha.setText(dateFormat.format(date));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelModificacionProducto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNumeroOrden1 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordenes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        orden = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        estado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabelModificacionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 204, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MODIFICARORDENFONDO.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        jLabelNumeroOrden1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        jPanel1.add(jLabelNumeroOrden1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        busqueda.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        busqueda.setBorder(null);
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
        });
        jPanel1.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 114, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, 20));

        ordenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        ordenes.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        ordenes.setForeground(new java.awt.Color(102, 0, 102));
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
        ordenes.setPreferredSize(new java.awt.Dimension(300, 300));
        ordenes.setSelectionBackground(new java.awt.Color(102, 0, 102));
        ordenes.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(ordenes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, 290));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 150, 40));

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SELECCIONAR2.png"))); // NOI18N
        consultar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SELECCIONAR.png"))); // NOI18N
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 150, 40));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setText("N° Orden:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 100, -1));

        orden.setEditable(false);
        orden.setBackground(new java.awt.Color(255, 255, 255));
        orden.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        orden.setForeground(new java.awt.Color(102, 0, 102));
        orden.setBorder(null);
        orden.setOpaque(false);
        jPanel1.add(orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 170, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 170, 10));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setText("Cedula Jefe:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        cedula.setEditable(false);
        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(102, 0, 102));
        cedula.setBorder(null);
        cedula.setOpaque(false);
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 170, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 170, 10));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setText("Producto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 100, -1));

        producto.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        producto.setForeground(new java.awt.Color(102, 0, 102));
        producto.setBorder(null);
        producto.setOpaque(false);
        jPanel1.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 170, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 170, 20));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 100, -1));

        cantidad.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cantidad.setForeground(new java.awt.Color(102, 0, 102));
        cantidad.setBorder(null);
        cantidad.setOpaque(false);
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 170, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 170, 20));

        fecha.setEditable(false);
        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(102, 0, 102));
        fecha.setBorder(null);
        fecha.setOpaque(false);
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 170, 20));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel7.setText("Fecha:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 90, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 170, 20));

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(255, 255, 255));
        estado.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 0, 102));
        estado.setBorder(null);
        estado.setOpaque(false);
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 170, 20));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 90, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 170, 10));

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MODIFICAR2.png"))); // NOI18N
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void cargarOrdenes(String busqueda){
        tabla = controlOrden.cargarOrdenes(busqueda);
        String[]  registro = new String[2];
        String [] Titulo = {"CODIGO", "ESTADO"};
        tabla2=new DefaultTableModel(null,Titulo);
        
        for(int i=0;i<tabla.getRowCount();i++){
            registro[0] = tabla.getValueAt(i, 0).toString();
            registro[1] = tabla.getValueAt(i, 5).toString();
            tabla2.addRow(registro);
        }
        
        this.ordenes.setModel(tabla2);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JefeTaller u = new JefeTaller(usuario);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        int  fila = this.ordenes.getSelectedRow();
        if (fila<0) {
            JOptionPane.showMessageDialog(this, "Seleccione una orden para consultar");
        } else {
            String id = this.ordenes.getValueAt(fila, 0).toString();
            String[] orden = controlOrden.consultarOrden(id);
            if (orden == null) {
                JOptionPane.showMessageDialog(this, "No se pudo consultar la orden seleccionada");
            } else {
                this.orden.setText(orden[0]);
                this.producto.setText(orden[2]);
                this.cantidad.setText(orden[3]);
                this.estado.setText(orden[5]);
            }
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        cargarOrdenes(this.busqueda.getText());
    }//GEN-LAST:event_busquedaKeyReleased

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        try{
            int  fila = this.ordenes.getSelectedRow();
            if((this.producto.getText().equals(""))|| (this.cantidad.getText().equals("")) || (this.orden.getText().equals(""))){
                JOptionPane.showMessageDialog(this, "Ingrese la informacion correspondiente en cada campo");
            }else{
                String id_orden = this.orden.getText();
                String id_jefe = this.cedula.getText();
                String id_producto = this.producto.getText();
                String cant = this.cantidad.getText();
                int cantidad = Integer.parseInt(cant);
                String fecha = this.fecha.getText();
                    
                String mensaje = controlOrden.modificarOrden(id_orden, id_jefe, id_producto, cantidad, fecha, "Sin aprobar");
                JOptionPane.showMessageDialog(this, mensaje);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al capturar los datos");
            System.out.println(e);
        }
    }//GEN-LAST:event_modificarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelModificacionProducto;
    private javax.swing.JLabel jLabelNumeroOrden1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField orden;
    private javax.swing.JTable ordenes;
    private javax.swing.JTextField producto;
    // End of variables declaration//GEN-END:variables
}
