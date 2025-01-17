package proyectoprogra.JFrames;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyectoprogra.Globales;
import proyectoprogra.Factura;
import proyectoprogra.Menu;

public class ListadoFacturas extends javax.swing.JFrame {

    public ListadoFacturas() {

        initComponents();
        setTitle("Listado Facturas");
        setLocationRelativeTo(null);
        setResizable(false);
        cargarListaFacturas();
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
        btnAgregarFactura = new javax.swing.JButton();
        btnVerFactura = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Listado de Facturas");

        btnAgregarFactura.setText("Agregar Factura");
        btnAgregarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar(evt);
            }
        });

        btnVerFactura.setText("Ver Facturas");
        btnVerFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFactura(evt);
            }
        });

        btnDesactivar.setText("Anular Factura");
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

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "No. Factura", "Cliente", "Monto a Pagar", "Estado"
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
        jScrollPane1.setViewportView(tablaFacturas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerFactura)
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
                    .addComponent(btnAgregarFactura)
                    .addComponent(btnVerFactura)
                    .addComponent(btnDesactivar)
                    .addComponent(btnSalir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesactivar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivar
        int row = tablaFacturas.getSelectedRow();
        AgregarFacturas agru = new AgregarFacturas();
        if (row >= 0) {
            int numero = Integer.parseInt(tablaFacturas.getModel().getValueAt(row, 1).toString());
            for (int i = 0; i < Globales.Facturas.size(); i++) {
                if (Globales.Facturas.get(i).getNumeroFactura() == numero) {
                    Globales.Facturas.get(i).setEstado(false);
                    break;
                }
            }
            cargarListaFacturas();

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una factura");
        }

        Globales.guardarFacturas();
    }//GEN-LAST:event_btnDesactivar

    private void btnAgregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar
        AgregarFacturas agru = new AgregarFacturas();
        agru.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAgregar

    private void btnVerFactura(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFactura
        int row = tablaFacturas.getSelectedRow();
        AgregarFacturas agru = new AgregarFacturas();
        if (row >= 0) {
            int numero = Integer.parseInt(tablaFacturas.getModel().getValueAt(row, 1).toString());
            for (int i = 0; i < Globales.Facturas.size(); i++) {
                if (Globales.Facturas.get(i).getNumeroFactura() == numero) {
                    agru.editarFactura(Globales.Facturas.get(i));
                    agru.setVisible(true);
                    this.setVisible(false);
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una factura");
        }
    }//GEN-LAST:event_btnVerFactura

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
            java.util.logging.Logger.getLogger(ListadoFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new ListadoFacturas().setVisible(true);

            }
        });
    }

    public void cargarListaFacturas() {
        DefaultTableModel model = (DefaultTableModel) tablaFacturas.getModel();
        Object[] dataRow;
        model.setRowCount(0);
        for (int i = 0; i < Globales.Facturas.size(); i++) {
            dataRow = new Object[]{
                Globales.Facturas.get(i).getFecha(),
                Globales.Facturas.get(i).getNumeroFactura(),
                Globales.Facturas.get(i).getNicknameCliente(),
                Globales.Facturas.get(i).getMontoAPagar(),
                Globales.Facturas.get(i).isEstado()
            };
            model.addRow(dataRow);

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFactura;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tablaFacturas;
    // End of variables declaration//GEN-END:variables
}
