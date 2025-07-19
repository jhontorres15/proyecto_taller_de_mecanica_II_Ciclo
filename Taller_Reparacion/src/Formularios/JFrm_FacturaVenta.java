package Formularios;

import DAL.Clientes;
import DAL.Registros_de_Servicios;
import DAL.Servicio;
import java.awt.Color;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.imageio.ImageIO;
import javax.swing.ListModel;

public class JFrm_FacturaVenta extends javax.swing.JFrame {
    
    //Declarar variables para las listas a utilizar
    DefaultListModel ListaServ = new DefaultListModel();
    DefaultListModel ListaSubServ = new DefaultListModel();
    DefaultListModel ListaPrec = new DefaultListModel();
    DefaultListModel Listaimport = new DefaultListModel();
    DefaultListModel Listacant = new DefaultListModel();
    
    String DirectorioOrdenServicio = new File("src/Archivo_Datos/Orden_Servicio.txt").getAbsolutePath();
    String DirectorioServicios = new File("src/Archivo_Datos/Registros_Detalles_Servicio.txt").getAbsolutePath();
    String Directorio_Factura = new File ("src/Archivo_Datos/Registro_Facturas.txt").getAbsolutePath();
    //Crear un Vector de Datos (String):Matriz de Datos
    String[][]Servicios =new String[7][3];//[filas][columnas]

     Servicio ObjOrdenServicio = new Servicio("","","","","","","","","","","","","","","");
    Registros_de_Servicios ObjDetallesServicio = new Registros_de_Servicios("","","","","","");
    
    public JFrm_FacturaVenta() {
        initComponents();
          
        this.ListaPrecio.setModel(ListaPrec);
        this.ListaServicio.setModel(ListaServ);
        this.ListaSubServicio.setModel(ListaSubServ);
        this.ListaCantidad.setModel(Listacant);
        this.ListaImporte.setModel(Listaimport);
        //Establecer el color de fondo del formulario
        //this.getContentPane().setBackground(Color.DARK_GRAY);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        BTN_Guardar = new javax.swing.JButton();
        BTN_Nuevo = new javax.swing.JButton();
        impresion1 = new Formularios.impresion();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaServicio = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaSubServicio = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaPrecio = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LB_Subtotal = new javax.swing.JLabel();
        LB_IGV = new javax.swing.JLabel();
        LB_Total = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListaCantidad = new javax.swing.JList();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListaImporte = new javax.swing.JList();
        jLabel29 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Lb_Apellidos = new javax.swing.JTextField();
        Lb_Nombres = new javax.swing.JTextField();
        Lb_Num_Doc = new javax.swing.JTextField();
        Lb_Distrito = new javax.swing.JTextField();
        Lb_Direccion = new javax.swing.JTextField();
        TXT_CodServ = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Lb_NumFactura = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LB_NombreFacturaBoleta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Lb_Fecha = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();
        BTN_Buscar = new javax.swing.JButton();
        BTN_Salir4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BTN_Guardar.setText("Guardar");
        BTN_Guardar.setToolTipText("Guardar");
        BTN_Guardar.setName("BTN_Guardar"); // NOI18N

        BTN_Nuevo.setText("Nuevo");
        BTN_Nuevo.setToolTipText("Nuevo");
        BTN_Nuevo.setName("BTN_Nuevo"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel5.setText("GUTIERREZ MOTORS");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de Servicio"));

        jLabel6.setText("Servicio");

        jLabel26.setText("Subservicio");

        jLabel27.setText("Precio");

        ListaServicio.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaServicio);

        ListaSubServicio.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListaSubServicio);

        ListaPrecio.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(ListaPrecio);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("IGV. (18%) :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Total a pagar:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Sub Total:");

        LB_Subtotal.setText("LB_Subtotal");

        LB_IGV.setText("LB_IGV");

        LB_Total.setText("LB_Total");

        ListaCantidad.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(ListaCantidad);

        jLabel28.setText("Cantidad");

        ListaImporte.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(ListaImporte);

        jLabel29.setText("Total");

        jLabel3.setText("Av.Morro de Arica N°214  Rimac-Lima "); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(LB_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_IGV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LB_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)))
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LB_Subtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(LB_IGV))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(LB_Total))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel15.setText("RUC/DNI:");

        jLabel16.setText("corrreo:");

        jLabel17.setText("Distrito:");

        jLabel18.setText("Cod Servicio:");

        jLabel19.setText("Apellidos:");

        jLabel20.setText("Nombres:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lb_Apellidos)
                            .addComponent(Lb_Nombres)
                            .addComponent(Lb_Num_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Distrito)
                            .addComponent(Lb_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXT_CodServ, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TXT_CodServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Lb_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Lb_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Lb_Num_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Lb_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Lb_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Facturacion N°"));

        Lb_NumFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_NumFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Lb_NumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jLabel7.setText("Teléfono: 916798229");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Factoria Automotriz");

        jLabel1.setText("tipoi de facturación:");

        LB_NombreFacturaBoleta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("fecha");

        javax.swing.GroupLayout impresion1Layout = new javax.swing.GroupLayout(impresion1);
        impresion1.setLayout(impresion1Layout);
        impresion1Layout.setHorizontalGroup(
            impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(impresion1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(impresion1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(impresion1Layout.createSequentialGroup()
                        .addGroup(impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(impresion1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel7)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2))
                            .addGroup(impresion1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(LB_NombreFacturaBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        impresion1Layout.setVerticalGroup(
            impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(impresion1Layout.createSequentialGroup()
                .addGroup(impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(impresion1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_NombreFacturaBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(impresion1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(impresion1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(impresion1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(impresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        BTN_Buscar.setText("Buscar");
        BTN_Buscar.setToolTipText("Buscar RUC");
        BTN_Buscar.setName("Buscar RUC"); // NOI18N
        BTN_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarActionPerformed(evt);
            }
        });

        BTN_Salir4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Salir4.setText("Salir");
        BTN_Salir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(impresion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_Nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Imprimir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BTN_Salir4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_Guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(impresion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(BTN_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BTN_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BTN_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BTN_Salir4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void BuscarServicio(String CodServ) {
    // Creamos el objeto Cliente que ya tiene los datos leídos
    Servicio ObjOrdenServicio = new Servicio("","","","","","","","","","","","","","","");
    
    ObjOrdenServicio.Leer_Orden_Servicio(DirectorioOrdenServicio);

    // Recorremos la matriz ya cargada
    for (int i = 0; i <   ObjOrdenServicio.MatrizServicio.length; i++) {
        if (  ObjOrdenServicio.MatrizServicio[i][0].equals(CodServ)) {
            // Cargamos los datos en los controles del formulario
            
            this.Lb_Apellidos.setText(ObjOrdenServicio.MatrizServicio[i][1]);
            this.Lb_Nombres.setText(ObjOrdenServicio.MatrizServicio[i][2]);
            this.Lb_Num_Doc.setText(ObjOrdenServicio.MatrizServicio[i][5]);
            this.Lb_Distrito.setText(ObjOrdenServicio.MatrizServicio[i][6]);
            this.Lb_Direccion.setText(ObjOrdenServicio.MatrizServicio[i][7]);

            return; // Salimos del método si ya lo encontramos
        }
    }

    // Si no lo encontró
    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
}
    
    void Cargar_facturacion()
{
//Limpiar todos los Elementos del ComBox: CBO_CampoBuscar
    this.LB_NombreFacturaBoleta.removeAllItems();
    //Agregar un Primer Elemento al ComboBox: CBO_CampoBuscar
    this.LB_NombreFacturaBoleta.addItem("<Seleccione>");
    this.LB_NombreFacturaBoleta.addItem("Boleta");
    this.LB_NombreFacturaBoleta.addItem("Factura");
}
    
    public String Fecha_Actual() {
    // Declarar variables de tipo Date
    Date Fecha = new Date();
    
    // Declarar una variable de tipo SimpleDateFormat con el formato correcto
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    // Retornar valor
    return formato.format(Fecha);
}
    
    // Metodo para Imprimir
    void Imprimir_Factura() {
        // Verificar si se ha generado el número de la factura
        if (this.Lb_NumFactura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Debe generar el N° de la Factura para proceder a imprimir.", this.getTitle(),
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un documento para la impresión
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex != 0) {
                    return NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                // Configurar la fuente y el tamaño de texto
                Font titleFont = new Font("Serif", Font.BOLD, 14);
                Font boldFont = new Font("Serif", Font.BOLD, 12); // Fuente negrita para el encabezado
                Font infoFont = new Font("Serif", Font.PLAIN, 12);
                Font footerFont = new Font("Serif", Font.PLAIN, 10);

                // Obtener el tamaño de la página imprimible
                double width = pageFormat.getImageableWidth();
                double height = pageFormat.getImageableHeight();

                // Calcular el centro de la página
                FontMetrics titleMetrics = g.getFontMetrics(titleFont);
                FontMetrics boldMetrics = g.getFontMetrics(boldFont);
                FontMetrics infoMetrics = g.getFontMetrics(infoFont);
                FontMetrics footerMetrics = g.getFontMetrics(footerFont);

                // Cargar la imagen
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File("src/imagen_servicio/tr.jpeg"));
                } catch (Exception e) {
                    e.printStackTrace();
                    return NO_SUCH_PAGE;
                }

                // Redimensionar la imagen
                int imgWidth = img.getWidth() / 2;  // Reducir el tamaño de la imagen
                int imgHeight = img.getHeight() / 2;  // Reducir el tamaño de la imagen

                // Posicionar la imagen
                int imgX = (int) (width - imgWidth - 50);  // Alineado a la derecha
                int imgY = 20;  // Subir un poco más la imagen

                // Dibujar la imagen
                g2d.drawImage(img, imgX, imgY, imgWidth, imgHeight, null);

                // Imprimir encabezado alineado a la izquierda, centrado verticalmente y en negrita
                g.setFont(titleFont);
                g.drawString("GUTIERREZ MOTORS ", 100, 50);

                g.setFont(boldFont);
                g.drawString("Lima, Perú", 100, 70);
                g.drawString("Telefono: 0756795 - 99735294", 100, 90);

                // Espacio para la información de la factura
                int infoStartY = (int) (height / 2) - 220; // Ajusta esta posición para dejar espacio arriba

                // Información de la factura alineada a la izquierda
                g.setFont(infoFont);
                String facturaInfo = "Factura: " + LB_NombreFacturaBoleta.getSelectedItem();
                String numeroInfo = "Número: " + Lb_NumFactura.getText();
                String clienteInfo = "Cliente: " + Lb_Apellidos.getText() + ", " + Lb_Nombres.getText();
                String totalInfo = "Total: " + LB_Total.getText();
                
              // Obtener todos los subservicios en un solo String
                ListModel<String> modelo = ListaSubServicio.getModel();
                StringBuilder serviciosBuilder = new StringBuilder("Servicios: ");
                for (int i = 0; i < modelo.getSize(); i++) {
                   serviciosBuilder.append(modelo.getElementAt(i));
                if (i < modelo.getSize() - 1) {
                 serviciosBuilder.append(", ");
                 }
                 }
                  String servicios = serviciosBuilder.toString();


                String fechaInfo = "Fecha: " + Lb_Fecha.getText();

                String[] infoLines = {facturaInfo, numeroInfo, clienteInfo, totalInfo , servicios, fechaInfo};
                int y = infoStartY; // Posición vertical inicial
                int x = 100; // Posición horizontal fija para alineación a la izquierda
                for (String line : infoLines) {
                    g.drawString(line, x, y);
                    y += 20; // Espacio entre líneas
                }

                // Texto final centrado y subido más arriba
                String schedule = "HORARIO DE ATENCIÓN";
                String scheduleDetails = "Lunes a Domingo 09:00 am a 10:00 pm";
                String thanks = "Gracias por su preferencia";

                int scheduleWidth = footerMetrics.stringWidth(schedule);
                int scheduleDetailsWidth = footerMetrics.stringWidth(scheduleDetails);
                int thanksWidth = footerMetrics.stringWidth(thanks);

                int scheduleX = (int) ((width - scheduleWidth) / 2);
                int scheduleDetailsX = (int) ((width - scheduleDetailsWidth) / 2);
                int thanksX = (int) ((width - thanksWidth) / 2);

                g.setFont(footerFont);
                g.drawString(schedule, scheduleX, (int) (height / 2) + 40); // Subido más arriba
                g.drawString(scheduleDetails, scheduleDetailsX, (int) (height / 2) + 55); // Subido más arriba
                g.drawString(thanks, thanksX, (int) (height / 2) + 70); // Subido más arriba

                return PAGE_EXISTS;
            }
        });

        try {
            job.print();
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error al imprimir: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
public String Generar_NumFactura() {
    String NumFactura = "";
    Scanner Linea;
    File Leer_Doc = new File(Directorio_Factura);
    int Fila = 0;

    try {
       

        Linea = new Scanner(Leer_Doc);

        while (Linea.hasNextLine()) {
            Linea.nextLine();
            Fila++;
        }

        // Si cada factura ocupa 1 línea:
        // Si ocupa 4 líneas, usa: Fila = Fila / 4;
        // Ajusta esto según cómo guardas los datos
        // Fila = Fila / 4;
        
        Fila++; // Para generar el siguiente número

        // Formato de número
        if (Fila < 10)
            NumFactura = "001-00000" + Fila;
        else if (Fila < 100)
            NumFactura = "001-0000" + Fila;
        else if (Fila < 1000)
            NumFactura = "001-000" + Fila;
        else if (Fila < 10000)
            NumFactura = "001-00" + Fila;
        else if (Fila < 100000)
            NumFactura = "001-0" + Fila;
        else
            NumFactura = "001-" + Fila;

    } catch (Exception Error) {
        JOptionPane.showMessageDialog(null, "Error: " + Error.getMessage(), this.getTitle(),
                JOptionPane.ERROR_MESSAGE);
    }

    return NumFactura;
}
    

    
    //Crear el metodo: Salir()
    void Salir()
    {
        // Declarar variable de tipo: entero(int)
        int Rpta;
        
        //Mostrar un mensaje de confirmacion
        Rpta=JOptionPane.showConfirmDialog(null,"¿Desea salir de la ventana de factura de venta", this.getTitle(),JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        //Evaluar la respuesta del usuario
        if(Rpta==0)
        {
            //Salir del programa
            System.exit(0);
        }
          
    }
  
    void limpiar()
    {
      this.TXT_CodServ.setText("");
        
    }
    
    
    void Cargar_Detalles_Servicio(String CodServ)
{
    //Limpiar todos los Elementos del ComboBox: CBO_Departamento
    this.ListaServicio.removeAll();
    this.ListaSubServicio.removeAll();
    this.ListaPrecio.removeAll();
    
    ObjDetallesServicio.Leer_Detalles_Servicios(DirectorioServicios);
    
            //Invocar al Método:Leer_Detalles_Servicios
          ObjDetallesServicio.Leer_Detalles_Servicios(DirectorioServicios);  
    
     //Recorrer los Elementos de la Matriz: 
     for (int i = 0; i < ObjDetallesServicio.MatrizRegistrosDeServicios.length; i++)
     {
       if(ObjDetallesServicio.MatrizRegistrosDeServicios[i][0].equals(CodServ))  
       {
        
        ListaServ.add(ListaServ.size(),(ObjDetallesServicio.MatrizRegistrosDeServicios[i][1]));   
        ListaSubServ.add(ListaSubServ.size(),(ObjDetallesServicio.MatrizRegistrosDeServicios[i][2]));
        ListaPrec.add(ListaPrec.size(),(ObjDetallesServicio.MatrizRegistrosDeServicios[i][3]));
        Listacant.add(Listacant.size(),(ObjDetallesServicio.MatrizRegistrosDeServicios[i][4]));
        Listaimport.add(Listaimport.size(),(ObjDetallesServicio.MatrizRegistrosDeServicios[i][5]));
        
       }
     }
    
}

    //Crear Método: Calcular
void Calcular()
{
    //Declarar Variable e Iniciar en 0
    int I=0;
    double Subtotal=0, Igv, Total;
    String Cadena_Importe;
    //Permite Establecer un Formato a la cantidad de Decimales de un Numero
    DecimalFormat Formato = new DecimalFormat("0.00");
    //Crear Estructura Repetitiva
    while (I < this.Listaimport.getSize())
    {
    //Obtener el Valor de los Items de la Lista: Listalmp, a través de su Index
    Cadena_Importe = this.Listaimport.get(I).toString();
    //Reemplazar Caracter (,) por el (.)
    Cadena_Importe = Cadena_Importe.replace(",", ".");
    //Realizar Sumatoria de los Importes
    Subtotal = Subtotal + Double.parseDouble(Cadena_Importe);
    //Incrementar Valor de la Variable I
    I++; // | = | + 1;
    }
        //Efectuar Cálculos
    Subtotal = (Subtotal /1.18);
    Igv = (Subtotal * 0.18);
    Total = (Subtotal + Igv);
    //Mostrar Resultado con Formato Decimal
    this.LB_Subtotal.setText(Formato.format(Subtotal));
    this.LB_IGV.setText(Formato.format(Igv));
    this.LB_Total.setText(Formato.format(Total));
}

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

Cargar_facturacion();
        //Establecer titulo a la ventana
        this.setTitle("Factura de venta");
        this.limpiar();
          this.Lb_NumFactura.setText(this.Generar_NumFactura());
          
          this.Lb_Fecha.setText(this.Fecha_Actual());
    }//GEN-LAST:event_formWindowOpened

    private void BTN_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarActionPerformed
    
    String codigo = this.TXT_CodServ.getText().trim();
    if (!codigo.isEmpty()) {
        BuscarServicio(codigo);
        Cargar_Detalles_Servicio(codigo);
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un número de documento");
    }       
    
    this.Calcular();
    }//GEN-LAST:event_BTN_BuscarActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed

Imprimir_Factura();


    }//GEN-LAST:event_ImprimirActionPerformed

    private void BTN_Salir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salir4ActionPerformed
        //Declarar variable de tipo: Entero
        int Rpta;
        //Mostrar Mensaje de Confirmacion
        Rpta = JOptionPane.showConfirmDialog(null,"¿Desea Salir de la Ventana?", "fACTURACIÓN",
            JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //'Evaluar Si se ha Pulsado el Botón: Si
        if (Rpta == 0)
        {
            //Cerrar el Formulario
            this.dispose();

            //Mostrar Formulario Principal
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
    }//GEN-LAST:event_BTN_Salir4ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(JFrm_FacturaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrm_FacturaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrm_FacturaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrm_FacturaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Crear un controlador de errores
                try
                {
                    //Crear un objeto que instancie al formulario
                    JFrm_FacturaVenta formulario = new JFrm_FacturaVenta();
                    
                    //Establecer ancho y alto del formulario
                    //formulario.setSize(880,946);
                    
                    //Evitar que el usuario redimensione el tamaño de la Ventana(Formulario)
                    formulario.setResizable(false);
                    
                    //Ubicar el formulario en el centro de la pantalla
                    formulario.setLocationRelativeTo(null);
                    
                    //Deshabilitar el boton cerrar del formulario
                    formulario.setDefaultCloseOperation(0);
                    
                    //Mostrar el formulario
                   // formulario.setVisible(true);
                    
                }
                catch(Exception Error)
                {
                    //Mostrar mensaje de error
                    JOptionPane.showMessageDialog(null, Error.getMessage(),"Factura de Venta",JOptionPane.ERROR_MESSAGE);
                }
                new JFrm_FacturaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Buscar;
    private javax.swing.JButton BTN_Guardar;
    private javax.swing.JButton BTN_Nuevo;
    private javax.swing.JButton BTN_Salir1;
    private javax.swing.JButton BTN_Salir2;
    private javax.swing.JButton BTN_Salir3;
    private javax.swing.JButton BTN_Salir4;
    private javax.swing.JButton Imprimir;
    private javax.swing.JLabel LB_IGV;
    private javax.swing.JComboBox<String> LB_NombreFacturaBoleta;
    private javax.swing.JLabel LB_Subtotal;
    private javax.swing.JLabel LB_Total;
    private javax.swing.JTextField Lb_Apellidos;
    private javax.swing.JTextField Lb_Direccion;
    private javax.swing.JTextField Lb_Distrito;
    private javax.swing.JLabel Lb_Fecha;
    private javax.swing.JTextField Lb_Nombres;
    private javax.swing.JLabel Lb_NumFactura;
    private javax.swing.JTextField Lb_Num_Doc;
    private javax.swing.JList ListaCantidad;
    private javax.swing.JList ListaImporte;
    private javax.swing.JList ListaPrecio;
    private javax.swing.JList ListaServicio;
    private javax.swing.JList ListaSubServicio;
    private javax.swing.JTextField TXT_CodServ;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private Formularios.impresion impresion1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
