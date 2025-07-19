package Formularios;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Menu extends javax.swing.JFrame {
          
        public Menu()
        {
                 initComponents();
         
    }

    Menu(Object usuarioValidado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        BTN_Salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        BTNRegistrar_Cliente = new javax.swing.JCheckBoxMenuItem();
        BTN_Registro_Vehiculo = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Orden_Internamiento = new javax.swing.JCheckBoxMenuItem();
        Orden_Servicio = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Registro_Empleado = new javax.swing.JCheckBoxMenuItem();
        BTNRegistro_Usuario = new javax.swing.JCheckBoxMenuItem();
        BTN_ConprovantedePago = new javax.swing.JMenu();
        JFrm_FacturaVenta = new javax.swing.JCheckBoxMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Salir_Sistema.png"))); // NOI18N
        BTN_Salir.setText("Salir");
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 650, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_servicio/muy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1990, 1080));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Abrir2.png"))); // NOI18N
        jMenu1.setText("Mantenimiento");

        BTNRegistrar_Cliente.setSelected(true);
        BTNRegistrar_Cliente.setText("Registrar Cliente");
        BTNRegistrar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistrar_ClienteActionPerformed(evt);
            }
        });
        jMenu1.add(BTNRegistrar_Cliente);

        BTN_Registro_Vehiculo.setSelected(true);
        BTN_Registro_Vehiculo.setText("Registrar de Vehiculo");
        BTN_Registro_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Registro_VehiculoActionPerformed(evt);
            }
        });
        jMenu1.add(BTN_Registro_Vehiculo);

        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Nuevo.png"))); // NOI18N
        jMenu3.setText("Procesos");

        Orden_Internamiento.setSelected(true);
        Orden_Internamiento.setText("Orden de Internamiento");
        Orden_Internamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Orden_InternamientoActionPerformed(evt);
            }
        });
        jMenu3.add(Orden_Internamiento);

        Orden_Servicio.setSelected(true);
        Orden_Servicio.setText("Orden de Servicio");
        Orden_Servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Orden_ServicioActionPerformed(evt);
            }
        });
        jMenu3.add(Orden_Servicio);

        jMenuBar1.add(jMenu3);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Registrar_Usuario.png"))); // NOI18N
        jMenu2.setText("Usuarios");

        Registro_Empleado.setSelected(true);
        Registro_Empleado.setText("Registar Empleado");
        Registro_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro_EmpleadoActionPerformed(evt);
            }
        });
        jMenu2.add(Registro_Empleado);

        BTNRegistro_Usuario.setSelected(true);
        BTNRegistro_Usuario.setText(" Registrar Usuario");
        BTNRegistro_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistro_UsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(BTNRegistro_Usuario);

        jMenuBar1.add(jMenu2);

        BTN_ConprovantedePago.setBackground(new java.awt.Color(255, 255, 255));
        BTN_ConprovantedePago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN_ConprovantedePago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Registrar_Pedido.png"))); // NOI18N
        BTN_ConprovantedePago.setText("Conprobante de Pago");

        JFrm_FacturaVenta.setSelected(true);
        JFrm_FacturaVenta.setText("Factura o Boleta de Venta");
        JFrm_FacturaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFrm_FacturaVentaActionPerformed(evt);
            }
        });
        BTN_ConprovantedePago.add(JFrm_FacturaVenta);

        jMenuBar1.add(BTN_ConprovantedePago);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNRegistrar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrar_ClienteActionPerformed
               Registro_Clientes newframe = new Registro_Clientes();
                newframe.setVisible(true);

                this.dispose();
    }//GEN-LAST:event_BTNRegistrar_ClienteActionPerformed

    private void JFrm_FacturaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFrm_FacturaVentaActionPerformed
                JFrm_FacturaVenta newframe = new JFrm_FacturaVenta();
                 newframe.setVisible(true);

                 this.dispose();
    }//GEN-LAST:event_JFrm_FacturaVentaActionPerformed

    private void BTN_Registro_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Registro_VehiculoActionPerformed
                 Frm_Vehiculo newframe = new Frm_Vehiculo();
                 newframe.setVisible(true);

                 this.dispose();
    }//GEN-LAST:event_BTN_Registro_VehiculoActionPerformed

    private void Orden_ServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Orden_ServicioActionPerformed
                 OrdenServicio newframe = new OrdenServicio();
                 newframe.setVisible(true);

                 this.dispose();
    }//GEN-LAST:event_Orden_ServicioActionPerformed

    private void Orden_InternamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Orden_InternamientoActionPerformed
                OrdenInternamiento newframe = new OrdenInternamiento();
                 newframe.setVisible(true);

                 this.dispose();
    }//GEN-LAST:event_Orden_InternamientoActionPerformed

    private void Registro_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro_EmpleadoActionPerformed
                 Registro_Empleado newframe = new Registro_Empleado();
                 newframe.setVisible(true);

                 this.dispose();
    }//GEN-LAST:event_Registro_EmpleadoActionPerformed

    private void BTNRegistro_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistro_UsuarioActionPerformed
               
USUARIO newframe = new USUARIO();
                 newframe.setVisible(true);    
        
                 
    }//GEN-LAST:event_BTNRegistro_UsuarioActionPerformed

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        //Declarar variable de tipo: Entero
        int Rpta;
        //Mostrar Mensaje de Confirmacion
        Rpta = JOptionPane.showConfirmDialog(null,"¿Desea Salir de la Ventana?", "Registro de Clientes",
            JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //'Evaluar Si se ha Pulsado el Botón: Si
        if (Rpta == 0)
        {

            //Cerrar el Formulario
            dispose();

        }
    }//GEN-LAST:event_BTN_SalirActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            Menu FormularioMenu = new Menu();

            //Mostrar Formulario al Centro de la Pantalla
            FormularioMenu.setLocationRelativeTo(null);

            //Maximisar Ventana
            FormularioMenu.setExtendedState(MAXIMIZED_BOTH);

            //Deshabilitar el Boton Cerrar de la Ventana
            FormularioMenu.setDefaultCloseOperation(0);

            //Deshabilitar la Opcion Redimensionar el TamaÃ±o de la Ventana
            FormularioMenu.setResizable(false);

            //Mostrar formulario
            FormularioMenu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem BTNRegistrar_Cliente;
    private javax.swing.JCheckBoxMenuItem BTNRegistro_Usuario;
    private javax.swing.JMenu BTN_ConprovantedePago;
    private javax.swing.JCheckBoxMenuItem BTN_Registro_Vehiculo;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JCheckBoxMenuItem JFrm_FacturaVenta;
    private javax.swing.JCheckBoxMenuItem Orden_Internamiento;
    private javax.swing.JCheckBoxMenuItem Orden_Servicio;
    private javax.swing.JCheckBoxMenuItem Registro_Empleado;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
  
  
 }
    
    
