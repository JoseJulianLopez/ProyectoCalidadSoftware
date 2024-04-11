package proyectoprogra.JFrames;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectoprogra.Globales;
import proyectoprogra.Menu;
import proyectoprogra.Empleado;

public class AgregarEmpleados extends javax.swing.JFrame {

    public AgregarEmpleados() {

        initComponents();
        setTitle("Agregar Empleados");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkEstado = new javax.swing.JCheckBox();
        txtContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.setName("txtNombre"); // NOI18N

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido 1");

        txtApellido1.setName("txtNombre"); // NOI18N
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nickname");

        txtNickname.setName("txtNombre"); // NOI18N

        jLabel4.setText("Contraseña");

        btnSalir.setText("Salir");
        btnSalir.setName("BTNsalir"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.setName("BTNagregar"); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido 2");

        txtApellido2.setName("txtNombre"); // NOI18N

        jLabel6.setText("Estado");

        checkEstado.setSelected(true);
        checkEstado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtNickname)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtApellido2)
                            .addComponent(checkEstado)
                            .addComponent(txtContra))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnAgregar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Validamos que el usuario escribrio todos los datos\
        Empleado u = new Empleado();

        boolean encontrado = false;

        try {
            if (txtNombre.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir el nombre del empleado");
            }
            if (txtApellido1.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir el primer apellido del empleado");
            }
            if (txtApellido2.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir el segundo apellido del empleado");
            }
            if (txtNickname.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir un nickname del empleado");
            }
            if (txtContra.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir una contraseña para el empleado");
            }

            u.setNombre(txtNombre.getText());
            u.setApellido1(txtApellido1.getText());
            u.setApellido2(txtApellido2.getText());
            u.setNickname(txtNickname.getText());
            u.setContra(txtContra.getText());
            u.setEstado(checkEstado.isSelected());
            // de aqui para abajo es el metodo para agregar un cliente
            if (btnAgregar.getText().equalsIgnoreCase("Agregar")) {

                // Este for verifica si ya existe el nickname en la lista de empleados
                for (int i = 0; i < Globales.Empleados.size(); i++) {
                    if (Globales.Empleados.get(i).getNickname().equalsIgnoreCase(u.getNickname())) {
                        encontrado = true;
                    }
                }
                if (encontrado == true) {
                    throw new Exception("Ya existe un empleado con ese nickname");
                } else {
                    Globales.Empleados.add(u);
                    JOptionPane.showMessageDialog(null, "El empleado: " + u.getNombre() + " "
                            + u.getApellido1() + " " + u.getApellido2() + " con el nickname "
                            + u.getNickname() + " ha sido agregado correctamente");
                    this.setVisible(false);
                    new ListadoEmpleados().setVisible(true);

                }
            }
            // de aqui para abajo es el metodo para editar un cliente

            if (btnAgregar.getText().equalsIgnoreCase("Editar")) {
                if (u.isEstado() == false && estaEnUso(u.getNickname())) {
                    return;
                }

                // Este for verifica si ya existe el nickname en la lista de empleados
                for (int i = 0; i < Globales.Empleados.size(); i++) {
                    if (Globales.Empleados.get(i).getNickname().equalsIgnoreCase(u.getNickname())) {
                        encontrado = true;
                        Globales.Empleados.get(i).setNombre(u.getNombre());
                        Globales.Empleados.get(i).setApellido1(u.getApellido1());
                        Globales.Empleados.get(i).setApellido2(u.getApellido2());
                        Globales.Empleados.get(i).setContra(u.getContra());
                        Globales.Empleados.get(i).setEstado(u.isEstado());
                    }
                }
                if (encontrado == false) {
                    throw new Exception("No se encontro un empleado con ese nickname");
                } else {
                    JOptionPane.showMessageDialog(null, "El empleado: " + u.getNombre() + " "
                            + u.getApellido1() + " " + u.getApellido2() + " con el nickname "
                            + u.getNickname() + " ha sido editado correctamente");
                    this.setVisible(false);
                    new ListadoEmpleados().setVisible(true);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + e.getMessage(), "Error!",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        Globales.guardarEmpleados();


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        new ListadoEmpleados().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    public void editarCliente(Empleado empleadoActual) {
        this.setTitle("Editar Empleado");
        btnAgregar.setText("Editar");

        txtNombre.setText(empleadoActual.getNombre());
        txtApellido1.setText(empleadoActual.getApellido1());
        txtApellido2.setText(empleadoActual.getApellido2());
        txtNickname.setText(empleadoActual.getNickname());
        txtNickname.setEnabled(false);
        checkEstado.setSelected(empleadoActual.isEstado());
        checkEstado.setEnabled(true);
        txtContra.setText(empleadoActual.getContra());
    }

    public boolean estaEnUso(String nombreEmpleado) {
        for (int i = 0; i < Globales.Equipos.size(); i++) {
            if (Globales.Equipos.get(i).getNickEmpleado().equalsIgnoreCase(nombreEmpleado)) {
                JOptionPane.showMessageDialog(null, "No se puede inactivar el empleado " + nombreEmpleado + " porque esta asociado en el equipo "
                        + Globales.Equipos.get(i).getNombreEquipo());
                return true;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(AgregarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox checkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}