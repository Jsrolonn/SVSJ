package Vistas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jsrol
 */
import javax.swing.*;
import utilitarios.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelos.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;

public class MenuPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalView
     */
    data mostrar_datos;
    String set_look = "com.sun.java.swing.plaf.metal.MetalLookAndFeel";
    public MenuPrincipalView() {
        initComponents();
            mostrar_datos = new data();
            mostrar_datos.el_dato();//primero ejecutar este método para después ejecutar el resto
            lbl_data.setText("Fecha: "+mostrar_datos.dia_semana+ " "+mostrar_datos.dia+" de "+mostrar_datos.mes+" del "+mostrar_datos.anho);
            timer1.start();
    }
        public void lookandfeel()
        {
            try
            {
                UIManager.setLookAndFeel(set_look);
                SwingUtilities.updateComponentTreeUI(this);
            }
                catch (Exception error)
            {
                JOptionPane.showMessageDialog(null, error);
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jLabel1 = new javax.swing.JLabel();
        lbl_data = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        menu_produccion = new javax.swing.JMenu();
        pr_registrar_materiales = new javax.swing.JMenuItem();
        pr_gestionar_inventario = new javax.swing.JMenuItem();
        menu_ventas = new javax.swing.JMenu();
        ven_registrar_venta = new javax.swing.JMenuItem();
        ven_registrar_componentes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ven_registrar_pedido = new javax.swing.JMenuItem();
        ven_administrar_clientes = new javax.swing.JMenuItem();
        menu_administrar = new javax.swing.JMenu();
        adm_gestionar_proveedores = new javax.swing.JMenuItem();
        adm_administrar_usuarios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        adm_generar_informes = new javax.swing.JMenu();
        adm_generar_reporteDiario = new javax.swing.JMenuItem();
        adm_generar_reporteSem = new javax.swing.JMenuItem();
        adm_generar_reporteMens = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        adm_generar_CantCliente = new javax.swing.JMenuItem();
        adm_generar_CantEmp = new javax.swing.JMenuItem();
        menu_apariencia = new javax.swing.JMenu();
        apar_liquid = new javax.swing.JMenuItem();
        apar_metal = new javax.swing.JMenuItem();
        apar_nimbus = new javax.swing.JMenuItem();
        menu_salir = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas Y Stock de Joyeria");
        setBackground(new java.awt.Color(16, 119, 178));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/una.png"))); // NOI18N

        lbl_data.setBackground(new java.awt.Color(255, 255, 255));
        lbl_data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_data.setText("Fecha");
        lbl_data.setOpaque(true);

        lbl_hora.setBackground(new java.awt.Color(255, 255, 255));
        lbl_hora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_hora.setText("Hora");
        lbl_hora.setOpaque(true);

        BarraMenu.setBackground(new java.awt.Color(202, 239, 255));
        BarraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BarraMenu.setForeground(new java.awt.Color(255, 255, 255));

        menu_produccion.setMnemonic('O');
        menu_produccion.setText("Produccion");

        pr_registrar_materiales.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        pr_registrar_materiales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/Oro.png"))); // NOI18N
        pr_registrar_materiales.setMnemonic('E');
        pr_registrar_materiales.setText("Registrar Materiales");
        menu_produccion.add(pr_registrar_materiales);

        pr_gestionar_inventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        pr_gestionar_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/gestionarInventario.png"))); // NOI18N
        pr_gestionar_inventario.setMnemonic('G');
        pr_gestionar_inventario.setText("Gestionar Inventario");
        menu_produccion.add(pr_gestionar_inventario);

        BarraMenu.add(menu_produccion);

        menu_ventas.setMnemonic('V');
        menu_ventas.setText("Ventas");

        ven_registrar_venta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ven_registrar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/registrarVenta.png"))); // NOI18N
        ven_registrar_venta.setMnemonic('R');
        ven_registrar_venta.setText("Registrar Venta");
        menu_ventas.add(ven_registrar_venta);

        ven_registrar_componentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ven_registrar_componentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/registrarComponente.png"))); // NOI18N
        ven_registrar_componentes.setMnemonic('T');
        ven_registrar_componentes.setText("Registrar Inventario de Componentes");
        menu_ventas.add(ven_registrar_componentes);
        menu_ventas.add(jSeparator1);

        ven_registrar_pedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ven_registrar_pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/Pedido.png"))); // NOI18N
        ven_registrar_pedido.setMnemonic('P');
        ven_registrar_pedido.setText("Ingresar Pedido");
        menu_ventas.add(ven_registrar_pedido);

        ven_administrar_clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ven_administrar_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/administracliente.png"))); // NOI18N
        ven_administrar_clientes.setMnemonic('C');
        ven_administrar_clientes.setText("Administrar Clientes");
        menu_ventas.add(ven_administrar_clientes);

        BarraMenu.add(menu_ventas);

        menu_administrar.setMnemonic('A');
        menu_administrar.setText("Administrar");

        adm_gestionar_proveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        adm_gestionar_proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/Proveedor.png"))); // NOI18N
        adm_gestionar_proveedores.setMnemonic('E');
        adm_gestionar_proveedores.setText("Gestionar Proveedores");
        menu_administrar.add(adm_gestionar_proveedores);

        adm_administrar_usuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        adm_administrar_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/employees.png"))); // NOI18N
        adm_administrar_usuarios.setMnemonic('U');
        adm_administrar_usuarios.setText("Administrar Usuarios");
        menu_administrar.add(adm_administrar_usuarios);
        menu_administrar.add(jSeparator2);

        adm_generar_informes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/Informes.png"))); // NOI18N
        adm_generar_informes.setMnemonic('N');
        adm_generar_informes.setText("Generar Informes");

        adm_generar_reporteDiario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        adm_generar_reporteDiario.setMnemonic('D');
        adm_generar_reporteDiario.setText("Reporte de ventas diarias.");
        adm_generar_informes.add(adm_generar_reporteDiario);

        adm_generar_reporteSem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        adm_generar_reporteSem.setMnemonic('S');
        adm_generar_reporteSem.setText("Reporte de ventas Semanales");
        adm_generar_informes.add(adm_generar_reporteSem);

        adm_generar_reporteMens.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        adm_generar_reporteMens.setMnemonic('M');
        adm_generar_reporteMens.setText("Reporte de ventas Mensuales");
        adm_generar_informes.add(adm_generar_reporteMens);
        adm_generar_informes.add(jSeparator3);

        adm_generar_CantCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        adm_generar_CantCliente.setMnemonic('C');
        adm_generar_CantCliente.setText("Cantidad de Clientes en el Mes");
        adm_generar_informes.add(adm_generar_CantCliente);

        adm_generar_CantEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        adm_generar_CantEmp.setText("Cantidad de Empleados");
        adm_generar_CantEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_generar_CantEmpActionPerformed(evt);
            }
        });
        adm_generar_informes.add(adm_generar_CantEmp);

        menu_administrar.add(adm_generar_informes);

        BarraMenu.add(menu_administrar);

        menu_apariencia.setMnemonic('P');
        menu_apariencia.setText("Apariencia");

        apar_liquid.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        apar_liquid.setMnemonic('L');
        apar_liquid.setText("Look And Feel – Liquid");
        apar_liquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apar_liquidActionPerformed(evt);
            }
        });
        menu_apariencia.add(apar_liquid);

        apar_metal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        apar_metal.setMnemonic('M');
        apar_metal.setText("Look And Feel – Metal");
        apar_metal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apar_metalActionPerformed(evt);
            }
        });
        menu_apariencia.add(apar_metal);

        apar_nimbus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        apar_nimbus.setMnemonic('N');
        apar_nimbus.setText("Look And Feel – Nimbus");
        apar_nimbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apar_nimbusActionPerformed(evt);
            }
        });
        menu_apariencia.add(apar_nimbus);

        BarraMenu.add(menu_apariencia);

        menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/Salir.png"))); // NOI18N
        menu_salir.setMnemonic('S');
        menu_salir.setText("Salir");
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        BarraMenu.add(menu_salir);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_data, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(lbl_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_data)
                    .addComponent(lbl_hora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menu_salirMouseClicked

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        mostrar_datos.leer_hora();
        lbl_hora.setText("Hora: "+mostrar_datos.hora);
    }//GEN-LAST:event_timer1OnTime

    private void apar_liquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apar_liquidActionPerformed
        set_look = "com.birosoft.liquid.LiquidLookAndFeel";
        lookandfeel();
    }//GEN-LAST:event_apar_liquidActionPerformed

    private void apar_metalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apar_metalActionPerformed
        set_look = "javax.swing.plaf.metal.MetalLookAndFeel";
        lookandfeel();
    }//GEN-LAST:event_apar_metalActionPerformed

    private void apar_nimbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apar_nimbusActionPerformed
        set_look = "javax.swing.plaf.nimbus.NimbusLookAndFeel"; //com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
        lookandfeel();
    }//GEN-LAST:event_apar_nimbusActionPerformed

    private void adm_generar_CantEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_generar_CantEmpActionPerformed
       try {
        // Ruta del archivo .jasper
        String reportePath = "C:\\Users\\jsrol\\Documents\\NetBeansProjects\\SVSJ\\src\\reportes\\Empleado.jasper";

        // Crear una conexión a la base de datos (aquí se asume que ya tienes la clase de conexión configurada)
        Connection conn = Conexion.getConnection();

        // Llenar el reporte con los datos
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportePath, null, conn);

        // Mostrar el reporte en el JasperViewer
        JasperViewer.viewReport(jasperPrint, false);
    } catch (JRException | SQLException e) {
    }
    }//GEN-LAST:event_adm_generar_CantEmpActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem adm_administrar_usuarios;
    private javax.swing.JMenuItem adm_generar_CantCliente;
    private javax.swing.JMenuItem adm_generar_CantEmp;
    private javax.swing.JMenu adm_generar_informes;
    private javax.swing.JMenuItem adm_generar_reporteDiario;
    private javax.swing.JMenuItem adm_generar_reporteMens;
    private javax.swing.JMenuItem adm_generar_reporteSem;
    private javax.swing.JMenuItem adm_gestionar_proveedores;
    private javax.swing.JMenuItem apar_liquid;
    private javax.swing.JMenuItem apar_metal;
    private javax.swing.JMenuItem apar_nimbus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lbl_data;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JMenu menu_administrar;
    private javax.swing.JMenu menu_apariencia;
    private javax.swing.JMenu menu_produccion;
    private javax.swing.JMenu menu_salir;
    private javax.swing.JMenu menu_ventas;
    private javax.swing.JMenuItem pr_gestionar_inventario;
    private javax.swing.JMenuItem pr_registrar_materiales;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private javax.swing.JMenuItem ven_administrar_clientes;
    private javax.swing.JMenuItem ven_registrar_componentes;
    private javax.swing.JMenuItem ven_registrar_pedido;
    private javax.swing.JMenuItem ven_registrar_venta;
    // End of variables declaration//GEN-END:variables
}
