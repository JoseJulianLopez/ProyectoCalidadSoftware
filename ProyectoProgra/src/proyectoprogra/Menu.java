package proyectoprogra;

import java.util.ArrayList;
import proyectoprogra.JFrames.ListadoClientes;
import proyectoprogra.JFrames.ListadoEmpleados;
import proyectoprogra.JFrames.ListadoSucursales;
import proyectoprogra.JFrames.ListadoCategorias;
import proyectoprogra.JFrames.ListadoEquipos;
import proyectoprogra.JFrames.ListadoFacturas;
import proyectoprogra.JFrames.Exportar;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setTitle("Principal");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(400, 300);
        Globales.cargarClientes();
        Globales.cargarEmpleados();
        Globales.cargarSucursales();
        Globales.cargarCategorias();
        Globales.cargarEquipos();
        Globales.cargarFacturas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuEmpleados = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuSucursales = new javax.swing.JMenuItem();
        menuCategoria = new javax.swing.JMenuItem();
        menuEquipos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuFacturas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuIngresosDia = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);

        jMenu1.setText("Clientes");

        menuUsuarios.setText("Lista Clientes");
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(menuUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Empleados");

        menuEmpleados.setText("Lista Empleados");
        menuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadosActionPerformed(evt);
            }
        });
        jMenu2.add(menuEmpleados);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Catalogos");

        menuSucursales.setText("Sucursales");
        menuSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSucursalesActionPerformed(evt);
            }
        });
        jMenu3.add(menuSucursales);

        menuCategoria.setText("Categorias");
        menuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaActionPerformed(evt);
            }
        });
        jMenu3.add(menuCategoria);

        menuEquipos.setText("Equipos");
        menuEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEquiposActionPerformed(evt);
            }
        });
        jMenu3.add(menuEquipos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Facturas");

        menuFacturas.setText("Listado de Factuas");
        menuFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFacturasActionPerformed(evt);
            }
        });
        jMenu4.add(menuFacturas);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Exportar");

        menuIngresosDia.setText("Ingresos del dia");
        menuIngresosDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIngresosDiaActionPerformed(evt);
            }
        });
        jMenu5.add(menuIngresosDia);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadosActionPerformed
        ListadoEmpleados jfe = new ListadoEmpleados();
        jfe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEmpleadosActionPerformed

    private void menuSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSucursalesActionPerformed
        ListadoSucursales jfs = new ListadoSucursales();
        jfs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuSucursalesActionPerformed

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        ListadoClientes jfu = new ListadoClientes();
        jfu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void menuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaActionPerformed
        ListadoCategorias jfu = new ListadoCategorias();
        jfu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuCategoriaActionPerformed

    private void menuEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEquiposActionPerformed
        ListadoEquipos jfu = new ListadoEquipos();
        jfu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEquiposActionPerformed

    private void menuFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFacturasActionPerformed
        ListadoFacturas jfu = new ListadoFacturas();
        jfu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuFacturasActionPerformed

    private void menuIngresosDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIngresosDiaActionPerformed
        Exportar jfu = new Exportar();
        jfu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuIngresosDiaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuCategoria;
    private javax.swing.JMenuItem menuEmpleados;
    private javax.swing.JMenuItem menuEquipos;
    private javax.swing.JMenuItem menuFacturas;
    private javax.swing.JMenuItem menuIngresosDia;
    private javax.swing.JMenuItem menuSucursales;
    private javax.swing.JMenuItem menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
