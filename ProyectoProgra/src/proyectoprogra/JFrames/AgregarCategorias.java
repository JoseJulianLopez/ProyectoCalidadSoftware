package proyectoprogra.JFrames;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectoprogra.Globales;
import proyectoprogra.Menu;
import proyectoprogra.Categoria;

public class AgregarCategorias extends javax.swing.JFrame {

    public AgregarCategorias() {

        initComponents();
        setTitle("Agregar Categoria");
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

        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCaracteristicas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkEstado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre");

        txtNombre.setName("txtNombre"); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
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

        jLabel5.setText("Caracteristicas");

        txtCaracteristicas.setName("txtNombre"); // NOI18N

        jLabel6.setText("Estado");

        checkEstado.setSelected(true);
        checkEstado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkEstado)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnAgregar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Validamos que la sucursal escribrio todos los datos\
        Categoria c = new Categoria();

        boolean encontrado = false;

        try {

            if (txtNombre.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir el nombre de la categoria");
            }
            if (txtCaracteristicas.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir la caracteristicas de la categoria");
            }

            c.setNombreCategoria(txtNombre.getText());
            c.setCaracteristicas(txtCaracteristicas.getText());
            c.setEstado(checkEstado.isSelected());
            // de aqui para abajo es el metodo para agregar una categoria
            if (btnAgregar.getText().equalsIgnoreCase("Agregar")) {

                // Este for verifica si ya existe el codigo en la lista de categorias
                for (int i = 0; i < Globales.Categorias.size(); i++) {
                    if (Globales.Categorias.get(i).getNombreCategoria().equalsIgnoreCase(c.getNombreCategoria())) {
                        encontrado = true;
                    }
                }
                if (encontrado == true) {
                    throw new Exception("Ya existe una categoria con ese nombre");
                } else {
                    Globales.Categorias.add(c);
                    JOptionPane.showMessageDialog(null, "La categoria: " + c.getNombreCategoria() + " ha sido agregada exitosamente");
                    this.setVisible(false);
                    new ListadoCategorias().setVisible(true);

                }
            }
            // de aqui para abajo es el metodo para editar una sucursal

            if (btnAgregar.getText().equalsIgnoreCase("Editar")) {
                if (c.isEstado() == false && estaEnUso(c.getNombreCategoria())) {
                    return;
                }

                // Este for verifica si ya existe el nombre en la lista de categorias
                for (int i = 0; i < Globales.Categorias.size(); i++) {
                    if (Globales.Categorias.get(i).getNombreCategoria().equalsIgnoreCase(c.getNombreCategoria())) {
                        encontrado = true;
                        Globales.Categorias.get(i).setNombreCategoria(c.getNombreCategoria());
                        Globales.Categorias.get(i).setCaracteristicas(c.getCaracteristicas());
                        Globales.Categorias.get(i).setEstado(c.isEstado());
                    }
                }
                if (encontrado == false) {
                    throw new Exception("No se encontro una categoria con ese nombre");
                } else {
                    JOptionPane.showMessageDialog(null, "La categoria: " + c.getNombreCategoria() + " ha sido editada exitosamente");
                    this.setVisible(false);
                    new ListadoCategorias().setVisible(true);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + e.getMessage(), "Error!",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        Globales.guardarCategorias();


    }//GEN-LAST:event_btnAgregarActionPerformed

    public boolean estaEnUso(String nombreCategoria) {
        for (int i = 0; i < Globales.Equipos.size(); i++) {
            if (Globales.Equipos.get(i).getNombreCategoria().equalsIgnoreCase(nombreCategoria)) {
                JOptionPane.showMessageDialog(null, "No se puede inactivar la categoria " + nombreCategoria +  " porque es usada en el equipo "
                        + Globales.Equipos.get(i).getNombreEquipo());
                return true;
            }
        }
        return false;
    }


    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        new ListadoCategorias().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    public void editarCategoria(Categoria categoriaActual) {
        this.setTitle("Editar Categoria");
        btnAgregar.setText("Editar");

        txtNombre.setText(categoriaActual.getNombreCategoria());
        txtNombre.setEnabled(false);
        txtCaracteristicas.setText(categoriaActual.getCaracteristicas());
        checkEstado.setSelected(categoriaActual.isEstado());
        checkEstado.setEnabled(true);

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
            java.util.logging.Logger.getLogger(AgregarCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AgregarCategorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox checkEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCaracteristicas;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
