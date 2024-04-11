package proyectoprogra.JFrames;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectoprogra.Globales;
import proyectoprogra.Menu;
import proyectoprogra.Sucursal;

public class AgregarSucursal extends javax.swing.JFrame {

    public AgregarSucursal() {

        initComponents();
        setTitle("Agregar Sucursal");
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
        txtCiudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkEstado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.setName("txtNombre"); // NOI18N

        jLabel1.setText("Nombre");

        jLabel2.setText("Ciudad");

        txtCiudad.setName("txtNombre"); // NOI18N
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefono");

        txtTelefono.setName("txtNombre"); // NOI18N

        jLabel4.setText("Correo Electronico");

        txtCorreo.setName("txtNombre"); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

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

        jLabel5.setText("Direccion");

        txtDireccion.setName("txtNombre"); // NOI18N

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
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtTelefono)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtDireccion)
                            .addComponent(txtCorreo)
                            .addComponent(checkEstado))))
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
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Validamos que la sucursal escribrio todos los datos\
        Sucursal s = new Sucursal();

        boolean encontrado = false;

        try {
            if (txtNombre.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir el nombre de la sucursal");
            }
            if (txtCiudad.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir la ciudad de la sucursal");
            }
            if (txtDireccion.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir la direccion de la sucursal");
            }
            if (txtTelefono.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir el telefono de la sucursal");
            }
            if (txtCorreo.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir el correo de la sucursal");
            }

            s.setNombre(txtNombre.getText());
            s.setCiudad(txtCiudad.getText());
            s.setDireccion(txtDireccion.getText());
            s.setTelefono(txtTelefono.getText());
            s.setCorreo(txtCorreo.getText());
            s.setEstado(checkEstado.isSelected());
            // de aqui para abajo es el metodo para agregar un cliente
            if (btnAgregar.getText().equalsIgnoreCase("Agregar")) {

                // Este for verifica si ya existe el nickname en la lista de empleados
                for (int i = 0; i < Globales.Sucursales.size(); i++) {
                    if (Globales.Sucursales.get(i).getNombre().equalsIgnoreCase(s.getNombre())) {
                        encontrado = true;
                    }
                }
                if (encontrado == true) {
                    throw new Exception("Ya existe una sucursal con ese nombre");
                } else {
                    Globales.Sucursales.add(s);
                    JOptionPane.showMessageDialog(null, "La sucursal: " + s.getNombre() + " ha sido agregada exitosamente");
                    this.setVisible(false);
                    new ListadoSucursales().setVisible(true);

                }
            }
            // de aqui para abajo es el metodo para editar una sucursal

            if (btnAgregar.getText().equalsIgnoreCase("Editar")) {
                if (s.isEstado() == false && estaEnUso(s.getNombre())) {
                    return;
                }

                // Este for verifica si ya existe el nickname en la lista de empleados
                for (int i = 0; i < Globales.Sucursales.size(); i++) {
                    if (Globales.Sucursales.get(i).getNombre().equalsIgnoreCase(s.getNombre())) {
                        encontrado = true;
                        Globales.Sucursales.get(i).setNombre(s.getNombre());
                        Globales.Sucursales.get(i).setCiudad(s.getCiudad());
                        Globales.Sucursales.get(i).setDireccion(s.getDireccion());
                        Globales.Sucursales.get(i).setTelefono(s.getTelefono());
                        Globales.Sucursales.get(i).setCorreo(s.getCorreo());
                        Globales.Sucursales.get(i).setEstado(s.isEstado());
                    }
                }
                if (encontrado == false) {
                    throw new Exception("No se encontro una sucursal con ese nombre");
                } else {
                    JOptionPane.showMessageDialog(null, "La sucursal: " + s.getNombre() + " ha sido editada exitosamente");
                    this.setVisible(false);
                    new ListadoSucursales().setVisible(true);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + e.getMessage(), "Error!",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        Globales.guardarSucursales();


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        new ListadoSucursales().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    public void editarSucursal(Sucursal sucursalActual) {
        this.setTitle("Editar Sucursal");
        btnAgregar.setText("Editar");

        txtNombre.setText(sucursalActual.getNombre());
        txtNombre.setEnabled(false);
        txtCiudad.setText(sucursalActual.getCiudad());
        txtDireccion.setText(sucursalActual.getDireccion());
        txtTelefono.setText(sucursalActual.getTelefono());
        checkEstado.setSelected(sucursalActual.isEstado());
        checkEstado.setEnabled(true);
        txtCorreo.setText(sucursalActual.getCorreo());
    }

    public boolean estaEnUso(String nombreSucursal) {
        for (int i = 0; i < Globales.Equipos.size(); i++) {
            if (Globales.Equipos.get(i).getNombreSucursal().equalsIgnoreCase(nombreSucursal)) {
                JOptionPane.showMessageDialog(null, "No se puede inactivar la sucursal " + nombreSucursal + " porque es usada en el equipo "
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
            java.util.logging.Logger.getLogger(AgregarSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarSucursal().setVisible(true);
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
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
