package proyectoprogra.JFrames;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import proyectoprogra.Categoria;
import proyectoprogra.Globales;
import proyectoprogra.Menu;
import proyectoprogra.Equipo;

public class AgregarEquipos extends javax.swing.JFrame {

    public AgregarEquipos() {

        initComponents();
        setTitle("Agregar Equipo");
        setLocationRelativeTo(null);
        setResizable(false);
        cargarClientesActivas();
        cargarCategoriaActivas();
        cargarEmpleadosActivos();
        cargarSucursalesActivas();
        
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
        txtNombreEquipo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        checkEstado = new javax.swing.JCheckBox();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionEquipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbEmpleado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre Equipo");

        txtNombreEquipo.setName("txtNombreEquipo"); // NOI18N
        txtNombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEquipoActionPerformed(evt);
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

        jLabel5.setText("Categoria");

        jLabel6.setText("Estado");

        checkEstado.setSelected(true);
        checkEstado.setEnabled(false);

        jLabel1.setText("Sucursal");

        jLabel3.setText("Descripcion Equipo");

        jLabel4.setText("Empleado");

        jLabel7.setText("Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEstado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDescripcionEquipo)
                            .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcionEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Validamos que la sucursal escribrio todos los datos\
        Equipo e = new Equipo();

        boolean encontrado = false;

        try {
            if (txtNombreEquipo.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir el nombre del equipo");
            }
            if (cbCategoria.getSelectedIndex() < 0) {
                throw new Exception("Debe seleccionar una categoria para el equipo");
            }
            if (cbSucursal.getSelectedIndex() < 0) {
                throw new Exception("Debe seleccionar una sucursal para el equipo");
            }
            if (cbEmpleado.getSelectedIndex() < 0) {
                throw new Exception("Debe seleccionar un empleado para el equipo");
            }
            if (cbCliente.getSelectedIndex() < 0) {
                throw new Exception("Debe seleccionar un cliente para el equipo");
            }
            if (txtDescripcionEquipo.getText().equalsIgnoreCase("")) {
                throw new Exception("Debe escribir una descripcion para el equipo");
            }
            e.setFechaCreacion(calcularFechaActual());
            e.setNombreEquipo(txtNombreEquipo.getText());
            e.setNombreCategoria(cbCategoria.getSelectedItem().toString());
            e.setNombreSucursal(cbSucursal.getSelectedItem().toString());
            e.setNickEmpleado(cbEmpleado.getSelectedItem().toString());
            e.setNicknameCliente(cbCliente.getSelectedItem().toString());
            e.setDescripcion(txtDescripcionEquipo.getText());
            e.setEstado(checkEstado.isSelected());
            // de aqui para abajo es el metodo para agregar una categoria
            if (btnAgregar.getText().equalsIgnoreCase("Agregar")) {

                // Este for verifica si ya existe el nombreEquipo en la lista de equipos
                for (int i = 0; i < Globales.Equipos.size(); i++) {
                    if (Globales.Equipos.get(i).getNombreEquipo().equalsIgnoreCase(e.getNombreEquipo())) {
                        encontrado = true;
                    }
                }
                if (encontrado == true) {
                    throw new Exception("Ya existe un equipo con ese nombre");
                } else {
                    Globales.Equipos.add(e);
                    JOptionPane.showMessageDialog(null, "El Equipo: " + e.getNombreEquipo() + " ha sido agregado exitosamente");
                    this.setVisible(false);
                    new ListadoEquipos().setVisible(true);

                }
            }
            // de aqui para abajo es el metodo para editar una equipo

            if (btnAgregar.getText().equalsIgnoreCase("Editar")) {

                // Este for verifica si ya existe el nombre en la lista de categorias
                for (int i = 0; i < Globales.Equipos.size(); i++) {
                    if (Globales.Equipos.get(i).getNombreEquipo().equalsIgnoreCase(e.getNombreEquipo())) {
                        encontrado = true;
                        Globales.Equipos.get(i).setNombreCategoria(e.getNombreCategoria());
                        Globales.Equipos.get(i).setNombreSucursal(e.getNombreSucursal());
                        Globales.Equipos.get(i).setNickEmpleado(e.getNickEmpleado());
                        Globales.Equipos.get(i).setNicknameCliente(e.getNicknameCliente());
                        Globales.Equipos.get(i).setDescripcion(e.getDescripcion());
                        Globales.Equipos.get(i).setEstado(e.isEstado());
                    }
                }
                if (encontrado == false) {
                    throw new Exception("No se encontro un equipo con ese nombre");
                } else {
                    JOptionPane.showMessageDialog(null, "La categoria: " + e.getNombreEquipo() + " ha sido agregada exitosamente");
                    this.setVisible(false);
                    new ListadoEquipos().setVisible(true);

                }
            }
        } catch (Exception c) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos: " + c.getMessage(), "Error!",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        Globales.guardarEquipos();


    }//GEN-LAST:event_btnAgregarActionPerformed

    private String calcularFechaActual() { // esto sirve para obtener el dia
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }
    private void txtNombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEquipoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        new ListadoEquipos().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    public void cargarCategoriaActivas() {
        cbCategoria.removeAllItems();
        for (int i = 0; i < Globales.Categorias.size(); i++) {
            if (Globales.Categorias.get(i).isEstado() == true) {
                cbCategoria.addItem(Globales.Categorias.get(i).getNombreCategoria()); // esto inserta en el combobox
            }

        }
    }

    public void cargarEmpleadosActivos() {
        cbEmpleado.removeAllItems();
        for (int i = 0; i < Globales.Empleados.size(); i++) {
            if (Globales.Empleados.get(i).isEstado() == true) {
                cbEmpleado.addItem(Globales.Empleados.get(i).getNickname()); // esto inserta en el combobox
            }

        }
    }

    public void cargarSucursalesActivas() {
        cbSucursal.removeAllItems();
        for (int i = 0; i < Globales.Sucursales.size(); i++) {
            if (Globales.Sucursales.get(i).isEstado() == true) {
                cbSucursal.addItem(Globales.Sucursales.get(i).getNombre()); // esto inserta en el combobox
            }

        }
    }

    public void cargarClientesActivas() {
        cbCliente.removeAllItems();
        for (int i = 0; i < Globales.Clientes.size(); i++) {
            if (Globales.Clientes.get(i).isEstado() == true) {
                cbCliente.addItem(Globales.Clientes.get(i).getNickname()); // esto inserta en el combobox
            }

        }
    }

    public void editarEquipo(Equipo ListadoEquipos) {
        this.setTitle("Editar Equipo");
        btnAgregar.setText("Editar");

        txtNombreEquipo.setText(ListadoEquipos.getNombreEquipo());
        txtNombreEquipo.setEnabled(false);
        cbCategoria.setSelectedItem(ListadoEquipos.getNombreCategoria());
        cbEmpleado.setSelectedItem(ListadoEquipos.getNickEmpleado());
        cbCliente.setSelectedItem(ListadoEquipos.getNicknameCliente());
        cbSucursal.setSelectedItem(ListadoEquipos.getNombreSucursal());
        txtDescripcionEquipo.setText(ListadoEquipos.getDescripcion());
        checkEstado.setSelected(ListadoEquipos.isEstado());
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
            java.util.logging.Logger.getLogger(AgregarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AgregarEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbEmpleado;
    private javax.swing.JComboBox<String> cbSucursal;
    private javax.swing.JCheckBox checkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDescripcionEquipo;
    private javax.swing.JTextField txtNombreEquipo;
    // End of variables declaration//GEN-END:variables
}
