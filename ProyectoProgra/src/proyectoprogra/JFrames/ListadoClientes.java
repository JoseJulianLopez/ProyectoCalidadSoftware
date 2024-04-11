package proyectoprogra.JFrames;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyectoprogra.Globales;
import proyectoprogra.Cliente;
import proyectoprogra.Menu;

public class ListadoClientes extends javax.swing.JFrame {

    public ListadoClientes() {

        initComponents();
        setTitle("Listado Cliente");
        setLocationRelativeTo(null);
        setResizable(false);
        cargarListaClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAgregarUsuario = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Listado de Clientes");

        btnAgregarUsuario.setText("Agregar Cliente");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar(evt);
            }
        });

        btnEditar.setText("Editar Cliente");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar(evt);
            }
        });

        btnDesactivar.setText("Desactivar Cliente");
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivar(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido1", "Apellido2", "Nickname", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAgregarUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDesactivar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSalir))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarUsuario)
                    .addComponent(btnEditar)
                    .addComponent(btnDesactivar)
                    .addComponent(btnSalir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesactivar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivar
        int row = tablaClientes.getSelectedRow();
        AgregarCliente agru = new AgregarCliente();
        if (row >= 0) {
            String nickname = tablaClientes.getModel().getValueAt(row, 3).toString();
            for (int i = 0; i < Globales.Clientes.size(); i++) {
                if (Globales.Clientes.get(i).getNickname().equalsIgnoreCase(nickname)) {
                    Globales.Clientes.get(i).setEstado(false);
                    break;
                }
            }
            cargarListaClientes();

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
        }

        Globales.guardarCliente();
    }//GEN-LAST:event_btnDesactivar

    private void btnAgregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar
        AgregarCliente agru = new AgregarCliente();
        agru.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAgregar

    private void btnEditar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar
        int row = tablaClientes.getSelectedRow();
        AgregarCliente agru = new AgregarCliente();
        if (row >= 0) {
            String nickname = tablaClientes.getModel().getValueAt(row, 3).toString();
            for (int i = 0; i < Globales.Clientes.size(); i++) {
                if (Globales.Clientes.get(i).getNickname().equalsIgnoreCase(nickname)) {
                    agru.editarCliente(Globales.Clientes.get(i));
                    agru.setVisible(true);
                    this.setVisible(false);
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
        }
    }//GEN-LAST:event_btnEditar

    private void btnSalir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnSalir

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
            java.util.logging.Logger.getLogger(ListadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ListadoClientes().setVisible(true);

            }
        });
    }

    public void cargarListaClientes() {
        DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
        Object[] dataRow;
        model.setRowCount(0);
        for (int i = 0; i < Globales.Clientes.size(); i++) {
            dataRow = new Object[]{
                Globales.Clientes.get(i).getNombre(),
                Globales.Clientes.get(i).getApellido1(),
                Globales.Clientes.get(i).getApellido2(),
                Globales.Clientes.get(i).getNickname(),
                Globales.Clientes.get(i).isEstado()
            };
            model.addRow(dataRow);

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
