package proyectoprogra.JFrames;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyectoprogra.Globales;
import proyectoprogra.Equipo;
import proyectoprogra.Menu;

public class ListadoEquipos extends javax.swing.JFrame {

    public ListadoEquipos() {

        initComponents();
        setTitle("Listado Equipo");
        setLocationRelativeTo(null);
        setResizable(false);
        cargarListaEquipos();
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
        btnAgregarCategoria = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Listado de Equipos");

        btnAgregarCategoria.setText("Agregar Equipos");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar(evt);
            }
        });

        btnEditar.setText("Editar Equipos");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar(evt);
            }
        });

        btnDesactivar.setText("Desactivar Equipos");
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

        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Equipo", "Categoria", "Sucursal", "Cliente", "Estado"
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
        jScrollPane1.setViewportView(tablaEquipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDesactivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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
                    .addComponent(btnAgregarCategoria)
                    .addComponent(btnEditar)
                    .addComponent(btnDesactivar)
                    .addComponent(btnSalir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesactivar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivar
        int row = tablaEquipos.getSelectedRow();
        AgregarEquipos agru = new AgregarEquipos();
        if (row >= 0) {
            String nombre = tablaEquipos.getModel().getValueAt(row, 0).toString();
            for (int i = 0; i < Globales.Equipos.size(); i++) {
                if (Globales.Equipos.get(i).getNombreEquipo().equalsIgnoreCase(nombre)) {
                    Globales.Equipos.get(i).setEstado(false);
                    break;
                }
            }
            cargarListaEquipos();

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un equipo");
        }

        Globales.guardarEquipos();
    }//GEN-LAST:event_btnDesactivar

    private void btnAgregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar
        AgregarEquipos agru = new AgregarEquipos();
        agru.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAgregar

    private void btnEditar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar
        int row = tablaEquipos.getSelectedRow();
        AgregarEquipos agru = new AgregarEquipos();
        if (row >= 0) {
            String nombre = tablaEquipos.getModel().getValueAt(row, 0).toString();
            for (int i = 0; i < Globales.Equipos.size(); i++) {
                if (Globales.Equipos.get(i).getNombreEquipo().equalsIgnoreCase(nombre)) {
                    agru.editarEquipo(Globales.Equipos.get(i));
                    agru.setVisible(true);
                    this.setVisible(false);
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un equipo");
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
            java.util.logging.Logger.getLogger(ListadoEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new ListadoEquipos().setVisible(true);

            }
        });
    }

    public void cargarListaEquipos() {
        DefaultTableModel model = (DefaultTableModel) tablaEquipos.getModel();
        Object[] dataRow;
        model.setRowCount(0);
        for (int i = 0; i < Globales.Equipos.size(); i++) {
            dataRow = new Object[]{
                Globales.Equipos.get(i).getNombreEquipo(),
                Globales.Equipos.get(i).getNombreCategoria(),
                Globales.Equipos.get(i).getNombreSucursal(),
                Globales.Equipos.get(i).getNicknameCliente(),
                Globales.Equipos.get(i).isEstado(),};
            model.addRow(dataRow);

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tablaEquipos;
    // End of variables declaration//GEN-END:variables
}