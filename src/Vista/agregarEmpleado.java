/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControlUsuario;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class agregarEmpleado extends javax.swing.JFrame {
    String usuario;
    ControlUsuario controlUsuario = new ControlUsuario();
    Date date = new Date();
    /**
     * Creates new form agregarEmpleado
     */
    public agregarEmpleado(String usuario) {
        this.usuario = usuario;
        initComponents();
        setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        sede = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        cargo = new javax.swing.JComboBox<>();
        fecha = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 170, 10));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 170, 10));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 170, 10));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 170, 10));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 170, 10));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 170, 10));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 170, 10));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 10));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, 10));
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, 10));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setText("Cedula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 25));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 25));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setText("Cargo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 25));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setText("Salario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 130, 25));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de inicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, 25));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 25));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel8.setText("N° Sede");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 130, 25));

        jLabel9.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel9.setText("Telefono");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 25));

        jLabel10.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel10.setText("Estado");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 130, 25));

        cedula.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cedula.setForeground(new java.awt.Color(102, 0, 102));
        cedula.setBorder(null);
        cedula.setOpaque(false);
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 170, 25));

        nombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 0, 102));
        nombre.setBorder(null);
        nombre.setOpaque(false);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 170, 25));

        salario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        salario.setForeground(new java.awt.Color(102, 0, 102));
        salario.setBorder(null);
        salario.setOpaque(false);
        salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salarioKeyTyped(evt);
            }
        });
        jPanel1.add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, 25));

        direccion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(102, 0, 102));
        direccion.setBorder(null);
        direccion.setOpaque(false);
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 170, 25));

        sede.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        sede.setForeground(new java.awt.Color(102, 0, 102));
        sede.setBorder(null);
        sede.setOpaque(false);
        sede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sedeKeyTyped(evt);
            }
        });
        jPanel1.add(sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 170, 25));

        telefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(102, 0, 102));
        telefono.setBorder(null);
        telefono.setOpaque(false);
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 170, 25));

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AGREGAR2.png"))); // NOI18N
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AGREGAR.png"))); // NOI18N
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 150, 40));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR2.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CERRAR.png"))); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 150, 40));

        cargo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        cargo.setForeground(new java.awt.Color(102, 0, 102));
        cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Vendedor", "Jefe de taller" }));
        cargo.setBorder(null);
        cargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargo.setOpaque(false);
        jPanel1.add(cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, 25));

        fecha.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 170, 21));

        password.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 0, 102));
        password.setBorder(null);
        password.setOpaque(false);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, 25));

        jLabel11.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel11.setText("Contraseña");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 25));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 170, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 170, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 170, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 170, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 170, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 170, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 170, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AGREGAREMPLEADOS.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 80));

        estado.setEditable(false);
        estado.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 0, 102));
        estado.setText("Activo");
        estado.setBorder(null);
        estado.setOpaque(false);
        estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estadoKeyTyped(evt);
            }
        });
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 170, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        Menu_Gerente u = new Menu_Gerente(usuario);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        try{
            if((this.cedula.getText().equals(""))||(this.nombre.getText().equals("")) || (this.salario.getText().equals(""))
                    || (this.direccion.getText().equals("")) || (this.sede.getText().equals("")) || (this.telefono.getText().equals("")) || (this.password.getText().equals(""))){
                JOptionPane.showMessageDialog(this, "Ingrese la informacion correspondiente en cada campo");
            }
            else{
                String cedula = this.cedula.getText();
                String password = this.password.getText();
                String estado = this.estado.getText();
                String nombre = this.nombre.getText();
                String cargo = this.cargo.getSelectedItem().toString();
                String salario = this.salario.getText();
                String fecha = this.fecha.getText();
                String direccion = this.direccion.getText();
                String id_sede = this.sede.getText();
                String telefono = this.telefono.getText();
                
                String mensaje = controlUsuario.agregarUsuario(cedula, password, estado, nombre, cargo, salario, fecha, direccion, id_sede, telefono);
                JOptionPane.showMessageDialog(this, mensaje);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al capturar los datos");
            System.out.println(e);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char id = evt.getKeyChar();
        if(Character.isLetter(id)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo caracteres numericos");
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void salarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarioKeyTyped
        char contenido = evt.getKeyChar();
        if(Character.isLetter(contenido)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo caracteres numericos");
        }
    }//GEN-LAST:event_salarioKeyTyped

    private void sedeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sedeKeyTyped
        char contenido = evt.getKeyChar();
        if(Character.isLetter(contenido)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo caracteres numericos");
        }
    }//GEN-LAST:event_sedeKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char contenido = evt.getKeyChar();
        if(Character.isLetter(contenido)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo caracteres numericos");
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void estadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField password;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField sede;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
