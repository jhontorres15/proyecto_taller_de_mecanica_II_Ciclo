
package Formularios;

import DAL.Clientes;
import DAL.Registros_de_Servicios;
import DAL.Servicio;
import DAL.Vehiculo;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class OrdenServicio extends javax.swing.JFrame {
    
    DefaultTableModel Modelo;
    
    DefaultListModel ListaServ = new DefaultListModel();
    DefaultListModel ListaSubServ = new DefaultListModel();
    DefaultListModel ListaPrec = new DefaultListModel();
    DefaultListModel ListaCant = new DefaultListModel();
    DefaultListModel Listalmp = new DefaultListModel();
     //Declarar variable de tipo: Entero
    int Codigo=1, Filas;
    
      TableRowSorter TFiltroFila;
    
    String CodCliente;
    
    String DirectorioCliente = new File("src/Archivo_Datos/Registro_Clientes.txt").getAbsolutePath();
    String DirectorioVehiculo = new File("src/Archivo_Datos/Registro_Vehiculo.txt").getAbsolutePath();
    String DirectorioOrdenServicio = new File("src/Archivo_Datos/Orden_Servicio.txt").getAbsolutePath();
    String DirectorioServicios = new File("src/Archivo_Datos/Registros_Detalles_Servicio.txt").getAbsolutePath();
    
    
    public OrdenServicio() {
        initComponents();
    
        this.ListaPrecio.setModel(ListaPrec);
        this.ListaServicio.setModel(ListaServ);
        this.ListaSubServicio.setModel(ListaSubServ);
        this.ListaCantidad.setModel(ListaCant);
        this.ListaImporte.setModel(Listalmp);
        
        //Establecer un Nuevo Modelo de la Clase: DefaultTableModel
        Modelo = new DefaultTableModel()
        {
            //Crear Función para Bloquear la Edición de Celdas
            public boolean isCellEditable(int row, int column)
            {
            //Bloquear Edición
            return false;
            }
        };
        
        
        //Establecer Nombre de las Columnas para el Control: jTable_RegistroNotas (A través de la variable: Modelo)
        Modelo.addColumn("Código de servicio");
        Modelo.addColumn("Servicio");
        Modelo.addColumn("SubServicio");
        Modelo.addColumn("Precio");
        Modelo.addColumn("Cantidad");
        Modelo.addColumn("Total");
 
        
        //Establecer el Modelo al Control: jTable_RegistroClientes
        this.JTable_OrdenDetalleServicio.setModel(Modelo);
      

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        TXT_CodServicio = new javax.swing.JTextField();
        BTN_Eliminar = new javax.swing.JButton();
        BTN_Guadar = new javax.swing.JButton();
        JTable_Servicio = new javax.swing.JScrollPane();
        JTable_OrdenDetalleServicio = new javax.swing.JTable();
        BTN_Salir = new javax.swing.JButton();
        BTNNuevo = new javax.swing.JButton();
        TXTConsultar_Datos = new javax.swing.JTextField();
        TXT_Codigo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CBO_Placa = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        LBRegistroCliente = new javax.swing.JLabel();
        TXTKm = new javax.swing.JTextField();
        TXTApellidos = new javax.swing.JTextField();
        TXTNombres = new javax.swing.JTextField();
        TXTColorVehiculo1 = new javax.swing.JTextField();
        BTN_Buscar = new javax.swing.JButton();
        TXTNumDocumento = new javax.swing.JTextField();
        TXTNacionalidad = new javax.swing.JTextField();
        Lv_Foto = new javax.swing.JTextField();
        LBRegistroVehiculo = new javax.swing.JLabel();
        TXTMarca = new javax.swing.JTextField();
        TXTDireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TXT_Modelo = new javax.swing.JTextField();
        TXTAño = new javax.swing.JTextField();
        TXT_Distrito = new javax.swing.JTextField();
        TXT_Tipo_Doc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TXTCantidad = new javax.swing.JTextField();
        LB_Importe = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListaImporte = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListaCantidad = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaPrecio = new javax.swing.JList();
        BTN_Agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXT_Precio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaSubServicio = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaServicio = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        CBO_Subservicio = new javax.swing.JComboBox();
        CBO_Servicio = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        LBRegistroVehiculo1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Lb_Foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 102));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 102));
        jTextField2.setFont(new java.awt.Font("NSimSun", 1, 48)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Orden de Servicio");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);

        TXT_CodServicio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Código", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 691, Short.MAX_VALUE)
                .addComponent(TXT_CodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_CodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BTN_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTN_Eliminar.setText("Eliminar");

        BTN_Guadar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTN_Guadar.setText("Guardar");
        BTN_Guadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuadarActionPerformed(evt);
            }
        });

        JTable_OrdenDetalleServicio.setModel(new javax.swing.table.DefaultTableModel(
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
        JTable_Servicio.setViewportView(JTable_OrdenDetalleServicio);

        BTN_Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTN_Salir.setText("Salir");
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

        BTNNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNNuevo.setText("Nuevo");
        BTNNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNNuevoActionPerformed(evt);
            }
        });

        TXTConsultar_Datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTConsultar_DatosKeyReleased(evt);
            }
        });

        TXT_Codigo.setText("Código");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CBO_Placa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Placa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_PlacaItemStateChanged(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 102));

        LBRegistroCliente.setBackground(new java.awt.Color(255, 255, 255));
        LBRegistroCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LBRegistroCliente.setForeground(new java.awt.Color(0, 0, 102));
        LBRegistroCliente.setText("DATOS DEL CLIENTE");

        TXTKm.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Km (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Apellidos ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Nombres ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTColorVehiculo1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Color (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        BTN_Buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTN_Buscar.setText("Buscar");
        BTN_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarActionPerformed(evt);
            }
        });

        TXTNumDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "N° de Documento ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Nacionalidad ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        Lv_Foto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Foto (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        LBRegistroVehiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LBRegistroVehiculo.setForeground(new java.awt.Color(0, 0, 102));
        LBRegistroVehiculo.setText("DATOS DEL VEHICULO");

        TXTMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Marca (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Dirección ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        TXT_Modelo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Modelo (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTAño.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Año (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXT_Distrito.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Distrito", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXT_Tipo_Doc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Tipo de Documento", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(BTN_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTApellidos)
                                    .addComponent(TXTNacionalidad)
                                    .addComponent(TXT_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TXT_Tipo_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TXTNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))))
                            .addComponent(LBRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBO_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TXTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(TXTColorVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(TXT_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lv_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(LBRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(TXTKm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_Tipo_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LBRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXT_Modelo)
                    .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBO_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lv_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTColorVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TXTKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Precio");

        jLabel8.setText("SubServicios");

        TXTCantidad.setText("jTextField1");
        TXTCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTCantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTCantidadKeyTyped(evt);
            }
        });

        ListaImporte.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(ListaImporte);

        ListaCantidad.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(ListaCantidad);

        ListaPrecio.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaPrecio);

        BTN_Agregar.setText("Agregar");
        BTN_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AgregarActionPerformed(evt);
            }
        });

        jLabel7.setText("Servicios:");

        jLabel6.setText("TOTAL");

        TXT_Precio.setText("jTextField7");

        jLabel3.setText("SubServicios");

        jLabel2.setText("Servicios:");

        jLabel1.setText("Total:");

        ListaSubServicio.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(ListaSubServicio);

        ListaServicio.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListaServicio);

        jLabel10.setText("Cantidad:");

        CBO_Subservicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Subservicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_SubservicioItemStateChanged(evt);
            }
        });

        CBO_Servicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Servicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_ServicioItemStateChanged(evt);
            }
        });

        jLabel5.setText("Cantidad:");

        LBRegistroVehiculo1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LBRegistroVehiculo1.setForeground(new java.awt.Color(0, 0, 102));
        LBRegistroVehiculo1.setText("DATOS DE LOS SERVICIOS");

        jLabel4.setText("Precio");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 1, 14))); // NOI18N

        Lb_Foto.setBackground(new java.awt.Color(0, 51, 204));
        Lb_Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lb_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lb_Foto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(CBO_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(TXTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(LB_Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBO_Subservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(TXT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BTN_Agregar))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(LBRegistroVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBRegistroVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(CBO_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(CBO_Subservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(BTN_Agregar))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1)
                                    .addComponent(LB_Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(795, 795, 795)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTable_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXT_Codigo)
                        .addGap(18, 18, 18)
                        .addComponent(TXTConsultar_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(290, 290, 290)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Guadar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Guadar)
                        .addGap(26, 26, 26)
                        .addComponent(BTN_Eliminar)
                        .addGap(31, 31, 31)
                        .addComponent(BTN_Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_Codigo)
                            .addComponent(TXTConsultar_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTable_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        void Cargar_Placas(String Dni)
{
          Vehiculo ObjVehiculo = new Vehiculo("","","","","","","");
      ObjVehiculo.Leer_Vehiculo(DirectorioVehiculo);
    
     //Recorrer los Elementos de la Matriz: 
     for (int i = 0; i < ObjVehiculo.MatrizVehiculo.length; i++)
     {
       if(ObjVehiculo.MatrizVehiculo[i][0].equals(Dni))  
       {
         //Agregar Datos al Control: 
          this.CBO_Placa.addItem(ObjVehiculo.MatrizVehiculo[i][1]);
       
       }
     }
    
}
        void Cargar_Filas_Placa(String placa)
{
      Vehiculo ObjVehiculo = new Vehiculo("","","","","","","");
      ObjVehiculo.Leer_Vehiculo(DirectorioVehiculo);
    for (int i = 0; i < ObjVehiculo.MatrizVehiculo.length; i++) {
        if (ObjVehiculo.MatrizVehiculo[i][1].equals(placa)) {
    //Cargar datos en los controles
    //this.CBO_Placa.setSelectItem(ObjVehiculo.MatrizVehiculo[i][1]);
    this.TXTColorVehiculo1.setText(ObjVehiculo.MatrizVehiculo[i][2]);
    this.TXTMarca.setText(ObjVehiculo.MatrizVehiculo[i][3]);
    this.TXT_Modelo.setText(ObjVehiculo.MatrizVehiculo[i][4]);
    this.TXTKm.setText(ObjVehiculo.MatrizVehiculo[i][5]);
    this.Lv_Foto.setText(ObjVehiculo.MatrizVehiculo[i][6]);
    
     return; 
     }
    }
} 
    
    //Crear Método: Limpiar()
    void Limpiar()
    {
       //Limpiar los objetos (controles)
        this.TXT_Precio.setText("");
        this.LB_Importe.setText("");
        this.TXTCantidad.setText("");
        this.CBO_Placa.removeAllItems();
        this.ListaPrecio.removeAll();
        this.ListaServicio.removeAll();
        this.ListaSubServicio.removeAll();
    }
    
    //Crear Metodo: Cargar_Servicio        
    void Cargar_Servicio()
    {
        //Agregar Elelmentos al ComboBox: CBO_Servicio
        this.CBO_Servicio.addItem("<Seleccione>");
        this.CBO_Servicio.addItem("AUXILIO MECÁNICO");
        this.CBO_Servicio.addItem("MECÁNICA EN GENERAL");
        this.CBO_Servicio.addItem("DIAGNÓSTICO ELECTRÓNICO");
        this.CBO_Servicio.addItem("MANTENIMIENTO PREVENTIVO");
        this.CBO_Servicio.addItem("MANTENIMIENTO MAYOR");
        this.CBO_Servicio.addItem("AFINAMIENTO ELECTRÓNICO");
        this.CBO_Servicio.addItem("MANTENIMIENTO CORRECTIVO");
    }
    
     //Crear Metodo: Cargar_Subservicio
     void Cargar_Subservicio()
    {
        //Eliminar (quitar) los Elementos del ComboBox: CBO_Subservicio
        this.CBO_Subservicio.removeAllItems();
        this.CBO_Subservicio.addItem("<Seleccione>");
    
            String Servicio;
            
            //Obtener el Texto del Elemento Seleccionado
            Servicio = CBO_Servicio.getSelectedItem().toString();
            
            //Evaluar segun el Servicio Seleccionado
            if (Servicio == "MANTENIMIENTO PREVENTIVO")
            {
                //Agregar Elementos en el ComboBox: CBO_Subservicio
                this.CBO_Subservicio.addItem("CAMBIO DE ACEITE");
                this.CBO_Subservicio.addItem("ESCANEO");
                this.CBO_Subservicio.addItem("MANTENIMIENTO DE FRENOS");
                this.CBO_Subservicio.addItem("LAVADO DE MOTOR");
                this.CBO_Subservicio.addItem("CAMBIO DE ARRENDELA DE TAPÓN");
                this.CBO_Subservicio.addItem("REVISIÓN DE FLUIDOS");
                this.CBO_Subservicio.addItem("REVISIÓN DE FAJAS");
                this.CBO_Subservicio.addItem("REVISIÓN DE NEUMÁTICOS");
                this.CBO_Subservicio.addItem("CAMBIO DE FILTRO DE ACEITE, AIRE Y CABINA");
                
            }
            else if (Servicio == "MANTENIMIENTO MAYOR")
            {
                //Agregar Elementos en el ComboBox: CBO_Subservicio
                this.CBO_Subservicio.addItem("CAMBIO DE ACEITE DE MOTOR");
                this.CBO_Subservicio.addItem("CAMBIO DE FILTRO DE ACEITE");
                this.CBO_Subservicio.addItem("CAMBIO DE FILTRO DE AIRE");
                this.CBO_Subservicio.addItem("CAMBIO DE FILTRO DE CABINA Ó A/C");
                this.CBO_Subservicio.addItem("CAMBIO DE ARANDELA DE TAPÓN DE CARTER");
                this.CBO_Subservicio.addItem("REVISIÓN DE FRENOS, LIMPIEZA Y REGULACIÓN");
                this.CBO_Subservicio.addItem("INSPECCIÓN DE NEUMÁTICOS Y ROTACIÓN");
                this.CBO_Subservicio.addItem("INSPECCIÓN DE PRESIÓN DE NEUMÁTICOS");
                this.CBO_Subservicio.addItem("REVISIÓN DE SUSPENSIÓN DELANTERO Y POSTERIOR");
                this.CBO_Subservicio.addItem("REVISIÓN DE FUGA DE ACEITE Y REFIGERANTE");
                this.CBO_Subservicio.addItem("PRUEBA DE HERMETICIDAD DEL SISTEMA DE REFRIGERACIÓN");
                this.CBO_Subservicio.addItem("ESCANEO Y VERIFICACIÓN DE CÓDIGOS DE ERROR Y RESETEO");
                this.CBO_Subservicio.addItem("REVISIÓN DE PLUMILLAS LIMPIAPARABRISAS");
                this.CBO_Subservicio.addItem("RELLENADO DE FLUIDOS");
                this.CBO_Subservicio.addItem("REVISIÓN DE HIDROLINA DEL SERVO DE DIRECCIÓN");
                this.CBO_Subservicio.addItem("TESTEO DE LÍQUIDO DE FRENOS");
                this.CBO_Subservicio.addItem("INSPECCIÓN DE TAPA DE REFRIGERANTE");
                this.CBO_Subservicio.addItem("COMPROBACIÓN DEL ESTADO DE BATERÍA");
                this.CBO_Subservicio.addItem("INSPECCIÓN DEL ESTADO DE REFRIGERANTE");
                this.CBO_Subservicio.addItem("LAVADO DE MOTOR");
                this.CBO_Subservicio.addItem("LAVADO DE CARROCERÍA");
                this.CBO_Subservicio.addItem("REVISIÓN DE FAJAS");
                
            }
            else if (Servicio == "AFINAMIENTO ELECTRÓNICO")
            {
                //Agregar Elementos en el ComboBox: CBO_Subservicio
                this.CBO_Subservicio.addItem("PRUEBA Y DIAGNÓSTICO DE BOBINAS");
                this.CBO_Subservicio.addItem("REVISIÓN DEL ESTADO DE BUJÍAS(CAMBIO SI ES NECESARIO)");
                this.CBO_Subservicio.addItem("PRUEBA DE COMPRENSIÓN DEL MOTOR");
                this.CBO_Subservicio.addItem("LIMPIEZA DEL SENSOR MAP/MAF/IAC");
                this.CBO_Subservicio.addItem("LIMPIEZA DE OPTURADOR Y CALIBRACIÓN");
                this.CBO_Subservicio.addItem("LIMPIEZA DE INYECTORES");
                this.CBO_Subservicio.addItem("MANTENIMIENTO DE BORNES DE BATERÍA");
                this.CBO_Subservicio.addItem("ESCANEO Y RESETEO DE TODAS LAS COMPUTADORAS");
            }
            else if (Servicio == "MANTENIMIENTO CORRECTIVO")
            {
                //Agregar Elementos en el ComboBox: CBO_Subservicio
                this.CBO_Subservicio.addItem("CAMBIO DE PASTILLAS");
                this.CBO_Subservicio.addItem("CAMBIO DE BRUJÍAS");
                this.CBO_Subservicio.addItem("CAMBIO DE REFRIGERANTE");
                this.CBO_Subservicio.addItem("CAMBIO DE ACEITE DE CAJA");
                this.CBO_Subservicio.addItem("CAMBIO DE LÍQUIDO DE FRENO");
                this.CBO_Subservicio.addItem("CAMBIO DE HIDROLINA DE CAJA AUTOMÁTICA");
                this.CBO_Subservicio.addItem("CAMBIO DE BATERÍA");
                this.CBO_Subservicio.addItem("CAMBIO DE SUSPENSIÓN");
                this.CBO_Subservicio.addItem("CAMBIO DE KIT DE EMBRAGUE");
            }
        }
    
    //Crear Método: Agregar_Bebida
void Agregar_Servicio()
{
   int Rpta;
    //Evaluar si Existe el Producto Seleccionado dentro de la Lista
    if (ListaServ.contains(this.CBO_Servicio.getSelectedItem().toString()) == true &&
            ListaSubServ.contains(this.CBO_Subservicio.getSelectedItem().toString()) == true )
    {
    //Mostrar Mensaje de Advertencia
    JOptionPane.showMessageDialog(null,
    "El Servicio Seleccionado ya existe en la Lista de Servicio", this.getTitle(),2);
    }
    else
    {
    //Mostrar Mensaje de Confirmación
    Rpta = JOptionPane.showConfirmDialog(null, "¿Desea Agregar el Servicio?",
    this.getTitle(), JOptionPane.YES_NO_OPTION);
    //Evaluar si Rpta es SI
    
    if (Rpta == 0)
    {
    //Agregar Elementos a las Listas
    ListaSubServ.add(ListaSubServ.size(), this.CBO_Subservicio.getSelectedItem().toString());
    ListaPrec.add(ListaPrec.size(), this.TXT_Precio.getText());
    ListaServ.add(ListaServ.size(), this.CBO_Servicio.getSelectedItem().toString());
    ListaCant.add(ListaCant.size(), this.TXTCantidad.getText());
    Listalmp.add(Listalmp.size(), this.LB_Importe.getText());
    }
}
} 

void Cargar_Imagen(String Imagen)
{
//Mostrar Imagen
ImageIcon Foto = new ImageIcon("src/imagen_servicio/" + Imagen);
//Establecer Icono
Icon Icono = new ImageIcon(Foto.getImage().getScaledInstance(this.Lb_Foto.getWidth(),
this.Lb_Foto.getHeight(), Image.SCALE_DEFAULT));
//Asignar Imagen a Control: JLabel
this.Lb_Foto.setIcon(Icono);
//Representar Imagen
this.repaint();
}
     
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Eliminar (Quitar) los Elementos del ComboBox:CBO_Servicio
        this.CBO_Servicio.removeAllItems();
        
        //Elimar (Quitar) los Elementos del ComboBox:CBO_Subservicio
        this.CBO_Subservicio.removeAllItems();
        Botones(true);
        this.Habilitar_Controles(false);
        //Invocar Metodo: Cargar_Servicio
        Cargar_Servicio();
        Leer_Detalles_Servicios();
           this.BTN_Salir.setEnabled(true);
    
    }//GEN-LAST:event_formWindowOpened

    private void CBO_ServicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_ServicioItemStateChanged
        // Evaluar si se ha Seleccionado un Item del ComboBox: CBO_Servicio
        if(evt.getStateChange()==ItemEvent.SELECTED)
        {
            //Invocar Metodo: Cargar_Subservicio
            Cargar_Subservicio();
            
            //Invocar Metodo: Limpiar
            Limpiar();
        }
    }//GEN-LAST:event_CBO_ServicioItemStateChanged
   void Leer_Detalles_Servicios()
{    
    
     //Instanciar la Clase: servicio, a través de un Objeto
      Registros_de_Servicios ObjOrdenDetalllesServicio = new Registros_de_Servicios("","","","","","");
    
    ObjOrdenDetalllesServicio.Leer_Detalles_Servicios(DirectorioServicios);
     
    try
     {

    //Crear Estructura Repetitiva (Bucle): while (Leer lineas del archivo)
        for (int i = 0; i < ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios.length; i++)
        {
          //Leer Datos de la Matriz de Datos
          System.out.println();
        
          //Agregar Filas al Modelo de Datos del JTable.
            Modelo.addRow(new Object[] {ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios[i][0],
                                        ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios[i][1],
                                        ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios[i][2],
                                        ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios[i][3],
                                        ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios[i][4],
                                        ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios[i][5]
            });
            
       
          int Fila = ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios.length;

          if (Fila > 0) {
             CodCliente = ObjOrdenDetalllesServicio.MatrizRegistrosDeServicios[Fila -1][0];
          }
          else
          {
             CodCliente = "S0000";  
          }
        }
      
     }
        
     catch(Exception Error)
      {
             CodCliente = "S0000";
      } 

}
  void Habilitar_Controles (boolean Valor)
{
//Establecer Propiedad: Habilitar/Deshabilitar (true/false)
    this.TXTApellidos.setEditable(Valor);
    this.TXTNombres.setEditable(Valor);
    this.TXTNacionalidad.setEditable(Valor);
    this.TXT_Tipo_Doc.setEditable(Valor);
    this.TXTNumDocumento.setEditable(!Valor);
    this.TXT_Distrito.setEditable(Valor);
    this.TXTDireccion.setEditable(Valor);
    this.TXT_CodServicio.setEditable(Valor);
    this.Lv_Foto.setEditable(Valor);
    this.TXT_Tipo_Doc.setEditable(Valor);
    this.CBO_Placa.setEditable(!Valor);
    this.TXT_Distrito.setEditable(Valor);
    this.TXT_Modelo.setEditable(Valor);
    this.TXTMarca.setEditable(Valor);
    this.TXTKm.setEditable(!Valor);
}
  
void Cargar_Precios(String subservicio)
{
    //Declarar Variable
    String Servicio, Subservicio;
    
    //Capturar el Cargo Seleccionado              
    Servicio = this.CBO_Servicio.getSelectedItem().toString();
    Subservicio = this.CBO_Subservicio.getSelectedItem().toString();
    
    //Evaluar Subservicio Seleccionado
    if(Servicio == "AUXILIO MECÁNICO" && Subservicio.substring(0, 8).toString().equals("<Seleccione>") == true)
    {
        this.TXT_Precio.setText("120.00");
        
    }
    else if(Servicio == "MECÁNICA EN GENERAL" && Subservicio == "<Seleccione>")
    {
        this.TXT_Precio.setText("180.00");
    }
    else if(Servicio == "DIAGNÓSTICO ELECTRÓNICO")
    {
        this.TXT_Precio.setText("70.00");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "CAMBIO DE ACEITE")
    {
        this.TXT_Precio.setText("90.00");
        this.Cargar_Imagen("cambio_aceite.jpg");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "ESCANEO")
    {
        this.TXT_Precio.setText("60.00");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "MANTENIMIENTO DE FRENOS")
    {
        this.TXT_Precio.setText("110.00");
        this.Cargar_Imagen("mantenimineto_de_frenos.jpg");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "LAVADO DE MOTOR")
    {
        this.TXT_Precio.setText("50.00");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "CAMBIO DE ARRENDELA DE TAPÓN")
    {
        this.TXT_Precio.setText("15.00");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "REVISIÓN DE FLUIDOS")
    {
        this.TXT_Precio.setText("25.00");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "REVISIÓN DE FAJAS")
    {
        this.TXT_Precio.setText("30.00");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "REVISIÓN DE NEUMÁTICOS")
    {
        this.TXT_Precio.setText("35.00");
    }
    else if(Servicio == "MANTENIMIENTO PREVENTIVO" && Subservicio == "CAMBIO DE FILTRO DE ACEITE, AIRE Y CABINA")
    {
        this.TXT_Precio.setText("130.00");
    
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "CAMBIO DE ACEITE DE MOTOR")
    {
        this.TXT_Precio.setText("95.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "CAMBIO DE FILTRO DE ACEITE")
    {
        this.TXT_Precio.setText("40.00");
        this.Cargar_Imagen("cambio_filtro_aceite.jpg");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "CAMBIO DE FILTRO DE AIRE")
    {
        this.TXT_Precio.setText("60.00");
        this.Cargar_Imagen("cambio_filtro_aire.jpg");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "CAMBIO DE FILTRO DE CABINA Ó A/C")
    {
        this.TXT_Precio.setText("65.00");
        this.Cargar_Imagen("cambio_filtro_cabina_ac.jpg");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "CAMBIO DE ARANDELA DE TAPÓN DE CARTER")
    {
        this.TXT_Precio.setText("10.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "REVISIÓN DE FRENOS, LIMPIEZA Y REGULACIÓN")
    {
        this.TXT_Precio.setText("130.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "INSPECCIÓN DE NEUMÁTICOS Y ROTACIÓN")
    {
        this.TXT_Precio.setText("45.00");
        this.Cargar_Imagen("cambio_de_neumaticos.jpg");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "INSPECCIÓN DE PRESIÓN DE NEUMÁTICOS")
    {
        this.TXT_Precio.setText("15.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "REVISIÓN DE SUSPENSIÓN DELANTERO Y POSTERIOR")
    {
        this.TXT_Precio.setText("100.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "REVISIÓN DE FUGA DE ACEITE Y REFIGERANTE")
    {
        this.TXT_Precio.setText("85.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "PRUEBA DE HERMETICIDAD DEL SISTEMA DE REFRIGERACIÓN")
    {
        this.TXT_Precio.setText("70.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "ESCANEO Y VERIFICACIÓN DE CÓDIGOS DE ERROR Y RESETEO")
    {
        this.TXT_Precio.setText("90.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "REVISIÓN DE PLUMILLAS LIMPIAPARABRISAS")
    {
        this.TXT_Precio.setText("25.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "RELLENADO DE FLUIDOS")
    {
        this.TXT_Precio.setText("40.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "REVISIÓN DE HIDROLINA DEL SERVO DE DIRECCIÓN")
    {
        this.TXT_Precio.setText("45.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "TESTEO DE LÍQUIDO DE FRENOS")
    {
        this.TXT_Precio.setText("35.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "INSPECCIÓN DE TAPA DE REFRIGERANTE")
    {
        this.TXT_Precio.setText("15.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "COMPROBACIÓN DEL ESTADO DE BATERÍA")
    {
        this.TXT_Precio.setText("30.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "INSPECCIÓN DEL ESTADO DE REFRIGERANTE")
    {
        this.TXT_Precio.setText("25.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "LAVADO DE MOTOR")
    {
        this.TXT_Precio.setText("50.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "LAVADO DE CARROCERÍA")
    {
        this.TXT_Precio.setText("35.00");
    }
    else if(Servicio == "MANTENIMIENTO MAYOR" && Subservicio == "REVISIÓN DE FAJAS")
    {
        this.TXT_Precio.setText("40.00");
    }
    else if(Servicio == "AFINAMIENTO ELECTRÓNICO" && Subservicio == "PRUEBA Y DIAGNÓSTICO DE BOBINAS")
    {
        this.TXT_Precio.setText("70.00");
    }
    else if(Servicio == "AFINAMIENTO ELECTRÓNICO" && Subservicio == "REVISIÓN DEL ESTADO DE BUJÍAS(CAMBIO SI ES NECESARIO)")
    {
        this.TXT_Precio.setText("100.00");
    }
    else if(Servicio == "AFINAMIENTO ELECTRÓNICO" && Subservicio == "PRUEBA DE COMPRENSIÓN DEL MOTOR")
    {
        this.TXT_Precio.setText("120.00");
    }
    else if(Servicio == "AFINAMIENTO ELECTRÓNICO" && Subservicio == "LIMPIEZA DEL SENSOR MAP/MAF/IAC")
    {
        this.TXT_Precio.setText("90.00");
    }
    else if(Servicio == "AFINAMIENTO ELECTRÓNICO" && Subservicio == "LIMPIEZA DE OPTURADOR Y CALIBRACIÓN")
    {
        this.TXT_Precio.setText("85.00");
    }
    else if(Servicio == "AFINAMIENTO ELECTRÓNICO" && Subservicio == "LIMPIEZA DE INYECTORES")
    {
        this.TXT_Precio.setText("110.00");
    }
    else if(Servicio == "AFINAMIENTO ELECTRÓNICO" && Subservicio == "MANTENIMIENTO DE BORNES DE BATERÍA")
    {
        this.TXT_Precio.setText("25.00");
    }
    else if(Servicio == "AFINAMIENTO ELECTRÓNICO" && Subservicio == "ESCANEO Y RESETEO DE TODAS LAS COMPUTADORAS")
    {
        this.TXT_Precio.setText("100.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE PASTILLAS")
    {
        this.TXT_Precio.setText("150.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE BRUJÍAS")
    {
        this.TXT_Precio.setText("80.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE REFRIGERANTE")
    {
        this.TXT_Precio.setText("95.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE ACEITE DE CAJA")
    {
        this.TXT_Precio.setText("140.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE LÍQUIDO DE FRENO")
    {
        this.TXT_Precio.setText("70.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE HIDROLINA DE CAJA AUTOMÁTICA")
    {
        this.TXT_Precio.setText("85.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE BATERÍA")
    {
        this.TXT_Precio.setText("250.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE SUSPENSIÓN")
    {
        this.TXT_Precio.setText("320.00");
    }
    else if(Servicio == "MANTENIMIENTO CORRECTIVO" && Subservicio == "CAMBIO DE KIT DE EMBRAGUE")
    {
        this.TXT_Precio.setText("450.00");
    }
    else
    {
        this.TXT_Precio.setText("0.00");
    } 
}
   void Botones(boolean valor)
{
    this.BTNNuevo.setEnabled(valor);
    this.BTN_Guadar.setEnabled(!valor);
    this.BTN_Eliminar.setEnabled(valor);
 
} 

    
    private void CBO_SubservicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_SubservicioItemStateChanged
        // Evaluar si se ha seleccionado un item del comboBox: CBO_Cargo
        if(evt.getStateChange()==ItemEvent.SELECTED)
        {
                    // Obtener el ítem seleccionado
        String subservicioSeleccionado = (String) CBO_Subservicio.getSelectedItem();

        // Llamar al método con el valor correcto
        this.Cargar_Precios(subservicioSeleccionado);
            
        }
    }//GEN-LAST:event_CBO_SubservicioItemStateChanged

    private void BTN_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarActionPerformed

    String dni = this.TXTNumDocumento.getText().trim();
    if (!dni.isEmpty()) {
        BuscarClientePorDNI(dni);
        Cargar_Filas_auto(dni);
        Cargar_Placas(dni);
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un número de documento");
    }       
    }//GEN-LAST:event_BTN_BuscarActionPerformed

    private void BTN_GuadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuadarActionPerformed
     validar_datos();
     
   this.Botones(false);
    }//GEN-LAST:event_BTN_GuadarActionPerformed

    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        //Declarar variable de tipo: Entero
        int Rpta;
        //Mostrar Mensaje de Confirmacion
        Rpta = JOptionPane.showConfirmDialog(null,"¿Desea Salir de la Ventana?", "Orden de Servicio",
            JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //'Evaluar Si se ha Pulsado el Botón: Si
        if (Rpta == 0)
        {
            //establecer el conjunto de filas o en el control.
            this.JTable_OrdenDetalleServicio.setRowSorter(null);
            //invocar el metodo guardar
   
            
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
    }//GEN-LAST:event_BTN_SalirActionPerformed

    private void BTNNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNNuevoActionPerformed
        
        // Declarar una variable para almacenar el nuevo código de cliente
        String CodigoCliente = "";

        // Convertir el código actual de cliente (CodCliente) en un número entero para incrementar
        // CodCliente tiene formato por ejemplo: "C0001", se quita la primera letra y se convierte a entero
        int Codigo = Integer.parseInt(CodCliente.substring(1)) + 1;

        // Según el valor de 'Codigo', se genera el nuevo código con ceros a la izquierda para mantener el formato

        if (Codigo > 0 && Codigo < 10) {
            // Si el código está entre 1 y 9, se agrega "C000" delante (Ejemplo: C0005)
            CodigoCliente = "S000" + String.valueOf(Codigo);
        } else if (Codigo >= 10 && Codigo <= 99) {
            // Si el código está entre 10 y 99, se agrega "C00" delante (Ejemplo: C025)
            CodigoCliente = "S00" + String.valueOf(Codigo);
        } else if (Codigo >= 100 && Codigo <= 999) {
            // Si el código está entre 100 y 999, se agrega "C0" delante (Ejemplo: C123)
            CodigoCliente = "S0" + String.valueOf(Codigo);
        } else if (Codigo >= 1000 && Codigo <= 9999) {
            // Si el código está entre 1000 y 9999, se agrega solo "C" delante (Ejemplo: C1234)
            CodigoCliente = "S" + String.valueOf(Codigo);
        }

        // Mostrar el nuevo código generado en la etiqueta correspondiente del formulario
        this.TXT_CodServicio.setText(CodigoCliente);
        this.Botones(false);
  
    }//GEN-LAST:event_BTNNuevoActionPerformed

    private void BTN_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AgregarActionPerformed
                     //Evaluar si el Precio del Producto es 0
         if (this.TXT_Precio.getText() == "0.00")
         {
         //Mostrar Mensaje de Error
         JOptionPane.showMessageDialog (null, "Elija el servicio a realizar", this.getTitle(), 0);
         //Ubicar Cursor en el control: JComboBox
         this.CBO_Servicio.requestFocus();
         }
         //Evaluar si se ha ingresado la Cantidad
         //(se Valida por longitud de caracteres == 0)
         else if (this.CBO_Subservicio.getSelectedItem().toString()== "Seleccione")
         {
         //Mostrar Mensaje de Error
         JOptionPane.showMessageDialog(null, "Ingrese Subservicio", this.getTitle(), 0);
         //Ubicar el Cursor en el control: JTextField
         this.CBO_Subservicio.requestFocus();
         }
         else
         {
         //Invocar al Método: Agregar_Producto
         this.Agregar_Servicio();
         }
    }//GEN-LAST:event_BTN_AgregarActionPerformed

    private void CBO_PlacaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_PlacaItemStateChanged
                  //Evaluar si se ha Seleccionado un Elemento de la Lista
      if(evt.getStateChange() == ItemEvent.SELECTED)
      {
         
    String placa = this.CBO_Placa.getSelectedItem().toString();
    if (!placa.isEmpty()) {
 
        Cargar_Filas_Placa(placa);
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese Placa");
    }       
          //Invocar al Método: Cargar_Provincia
       // this.Cargar_Provincia(this.CBO_Departamento.getSelectedItem().toString());
      }
    }//GEN-LAST:event_CBO_PlacaItemStateChanged

    private void TXTCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCantidadKeyPressed
        //Evaluar si se ha Presionado la Tecla: Enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            //Invocar al Método: Mostrar_Importe
            this.Mostrar_Importe();
          
        }
    }//GEN-LAST:event_TXTCantidadKeyPressed

    private void TXTCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCantidadKeyTyped
        try
        {
            //Declarar Variable de tipo: Char (Caracter)
            char Caracter;
            //Obtener el Caracter Tipeado
            Caracter = evt.getKeyChar();
            //Se Evaluar si el Caracter esta fuera del Rango de 0 a 9
            if (Caracter < '0' | Caracter > '9')
            {
                //Deshabilita teclas
                evt.consume();
            }
        }
        catch (Exception e)
        {

        }
    }//GEN-LAST:event_TXTCantidadKeyTyped

    private void TXTConsultar_DatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTConsultar_DatosKeyReleased
        // Obtener el modelo de la tabla jTable_RegistroClientes para poder trabajar con sus datos
        DefaultTableModel ModeloTabla = (DefaultTableModel) this.JTable_OrdenDetalleServicio.getModel();

        // Añadir un "listener" (escuchador) al campo de texto TXTConsultar_Datos que detecta cuando se suelta una tecla
        this.TXTConsultar_Datos.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evento) {
                // Variable para saber en qué campo se quiere buscar
                String CampoBuscar;

                // Obtener el campo seleccionado en el combo box (CBO_CampoBuscar), por ejemplo "Apellido" o "Nombres"
                CampoBuscar = TXT_Codigo.getText();

                // Según el campo seleccionado, aplicar un filtro en la tabla sobre la columna correspondiente:
                if (CampoBuscar.equals("Código")) {
                    // Filtrar la tabla en la columna 1 (suponiendo que ahí están los apellidos)
                    TFiltroFila.setRowFilter(RowFilter.regexFilter(("!?") + TXTConsultar_Datos.getText(), 0));
                } 
            }
        });

        // Crear un TableRowSorter con el modelo de tabla para permitir filtrar filas
        TFiltroFila = new TableRowSorter(ModeloTabla);

        // Asignar el sorter (filtro) a la tabla para que funcione el filtrado
        this.JTable_OrdenDetalleServicio.setRowSorter(TFiltroFila);

    }//GEN-LAST:event_TXTConsultar_DatosKeyReleased

 //Crear el Método Local: Guardar_servicios()
void Guardar_Servicios()
    {
        
    String precio = this.TXT_Precio.getText();
    //Evaluar si se ha Generado el Número de Factura de Venta
    if (this.TXT_CodServicio.getText().length() == 0)
    {
    //Mostrar Mensaje de Error
    JOptionPane.showMessageDialog(null,
    "Debe Generar el Nº de Servicio, para proceder con el guardado", this.getTitle(),
    JOptionPane.ERROR_MESSAGE);
    }
    //Evaluar si Existen Datos del Cliente
    else if (this.TXT_CodServicio.getText().equals(""))
    {
        
    //Mostrar Mensaje de Error
    JOptionPane.showMessageDialog(null, "Debe llenar los datos del cliente para proceder", this.getTitle(),
    JOptionPane.ERROR_MESSAGE);
    
    //Ubicar el Cursor en el Control: TXTRuc_Cliente
    this.TXTNumDocumento.requestFocus();
    
    }
    //Evaluar si se ha generado la Fecha de Emisión
    else if (this.TXTAño.getText().equals(""))
    {
        //Mostrar Mensaje de Error
        JOptionPane.showMessageDialog(null,
        "Debe Especificar el year del servicio", this.getTitle(),
        JOptionPane.ERROR_MESSAGE);
     }
    
        //Evaluar si existen Productos en la Lista a Facturar
     else if (this.ListaServ.getSize() == 0 || this.TXT_Precio.getText().equals("0.00"))
    {
        //Mostrar Mensaje de Error
        JOptionPane.showMessageDialog(null, "No Existen Servcios a agregar", this.getTitle(),
        JOptionPane.ERROR_MESSAGE);
    }      
    else
    {
        
      //Declarar una variable de tipo: Entero
      int Rpta;
      //Mostrar Mensaje de Confirmación
      Rpta = JOptionPane.showConfirmDialog(null, "¿Desea Guardar los Datos?", this.getTitle(),
      JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

     if(Rpta == 0)   
     {
     try
        {
            
        //Establecer Ruta del Archivo de Texto a Escribir la Secuencia de Datos
        FileWriter Guardar = new FileWriter(DirectorioServicios, true);
        
        //Recorrer Filas del Modelo de Datos del Control: jTable
        for (int i=0; i < this.ListaServ.getSize(); i++)
        {
            
         //Escribir la Secuencia de Datos
         Guardar.write(this.TXT_CodServicio.getText()+"\n");//columna 0
         Guardar.write(ListaServ.get(i).toString()+"\n");//columna 0
         Guardar.write(ListaSubServ.get(i).toString()+"\n");//columna 1
         Guardar.write(ListaPrec.get(i).toString()+"\n");//columna 2
         Guardar.write(ListaCant.get(i).toString()+"\n");//columna 2
         Guardar.write(Listalmp.get(i).toString()+"\n");//columna 2

        }
        Guardar.close();
        
        }
        catch(Exception Error)
          {
              JOptionPane.showMessageDialog(null, "Error: Guardar fichero 1051"+ Error.getMessage(),this.getTitle(),JOptionPane.ERROR_MESSAGE);
          }
     }
     else
     {
         
     }
    }
  }

//Crear el Método Local: Eliminar_Producto()
void Eliminar_Producto()
{
//Declarar una Variable
int Indice, Rpta;
//Capturar el Indice Seleccionado
Indice = this.ListaServicio.getSelectedIndex();
//Evaluar Si el Indice es igual a -1 (Significa: No hay Elementos Seleccionados)
if (Indice != - 1)
{
//Mostrar Mensaje de Confirmación
Rpta = JOptionPane.showConfirmDialog(null,
"¿Desea Eliminar éste Producto: " +
this.ListaServicio.getSelectedValue().toString() + "7", "Confirmación ... ",
JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//Evaluar si Rpta es SI

 if (Rpta == 0)
 {
  //  Eliminar Item, según el Indice Seleccionado
this.ListaServ.remove(Indice);
this.ListaPrec.remove(Indice);
this.ListaSubServ.remove(Indice);
this.ListaCantidad.remove(Indice);
this.ListaImporte.remove(Indice);


//Invocar al Método: Calcular()
//this.Calcular();
 }
}
else
{
//Mostrar Mensaje de Error
JOptionPane.showMessageDialog(null, "No existe un Elemento Seleccionado", this.getTitle(),
JOptionPane.ERROR_MESSAGE);
}
 
 }

 //Crear Método: Mostrar_Importe
void Mostrar_Importe()
{
    //Declarar Variable para establecer Formato
    DecimalFormat Num_Decimal = new DecimalFormat("0.00");
    //Declarar Variables
    int Cant;
    double Precio, Importe;
    //Obtener Valores
    Precio = Double.parseDouble(this.TXT_Precio.getText());
    Cant = Integer.parseInt(this.TXTCantidad.getText());
    //Realizar Cálculo
    Importe = (Precio * Cant);
    //Mostrar Valor del Importe
    this.LB_Importe.setText(Num_Decimal.format(Importe));
}
  
      void Mostar_Imagen(String Imagen)
   {
        //mpostar imagen
      ImageIcon Foto = new ImageIcon("src/Imagen_Vehiculos/"+ Imagen);
      
      Icon Icono = new ImageIcon(Foto.getImage().getScaledInstance(this.Lb_Foto.getWidth(), this.Lb_Foto.getHeight(),
                                                                  Image.SCALE_DEFAULT));
      
      //asiganr la imagen
      this.Lb_Foto.setIcon(Icono);
      System.out.println("Ruta de imagen: " + Foto);
      
      this.repaint();
   }
    
public void BuscarClientePorDNI(String dniBuscado) {
    // Creamos el objeto Cliente que ya tiene los datos leídos
    Clientes ObjCliente = new Clientes("","","","","","","","","","","","","","");
    
    ObjCliente.Leer_Clientes(DirectorioCliente);

    // Recorremos la matriz ya cargada
    for (int i = 0; i < ObjCliente.MatrizClientes.length; i++) {
        if (ObjCliente.MatrizClientes[i][6].equals(dniBuscado)) {
            // Cargamos los datos en los controles del formulario
            this.TXTApellidos.setText(ObjCliente.MatrizClientes[i][1]);
            this.TXTNombres.setText(ObjCliente.MatrizClientes[i][2]);
            this.TXTNacionalidad.setText(ObjCliente.MatrizClientes[i][4]);
            this.TXT_Tipo_Doc.setText(ObjCliente.MatrizClientes[i][5]);
            this.TXTNumDocumento.setText(ObjCliente.MatrizClientes[i][6]);
            this.TXT_Distrito.setText(ObjCliente.MatrizClientes[i][9]);
            this.TXTDireccion.setText(ObjCliente.MatrizClientes[i][12]);

            return; // Salimos del método si ya lo encontramos
        }
    }

    // Si no lo encontró
    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
}

 

void Cargar_Filas_auto(String dniBuscado)
{
    
      Vehiculo ObjVehiculo = new Vehiculo("","","","","","","");
      ObjVehiculo.Leer_Vehiculo(DirectorioVehiculo);
    for (int i = 0; i < ObjVehiculo.MatrizVehiculo.length; i++) {
        if (ObjVehiculo.MatrizVehiculo[i][0].equals(dniBuscado)) {
    //Cargar datos en los controles
    //this.CBO_Placa.setSelectItem(ObjVehiculo.MatrizVehiculo[i][1]);
    this.Lv_Foto.setText(ObjVehiculo.MatrizVehiculo[i][2]);
    this.TXTMarca.setText(ObjVehiculo.MatrizVehiculo[i][3]);
    this.TXT_Modelo.setText(ObjVehiculo.MatrizVehiculo[i][4]);
    this.TXTKm.setText(ObjVehiculo.MatrizVehiculo[i][5]);
   
    
     return; 
     }
    }
} 
    
void validar_datos()
{
    String codigo = this.TXT_CodServicio.getText();
    
 if (this.TXTApellidos.getText().equals("")&&this.ListaServicio.getSize().equals("")&&this.TXTAño.getText().equals(""))
    {   
          // Mostrar mensaje de error
       JOptionPane.showMessageDialog(null, 
          "Hay campos vacios, rellene completamente", this.getTitle(), JOptionPane.ERROR_MESSAGE);

           // Colocar el cursor en el campo de DNI para corregirlo
              this.TXTNumDocumento.requestFocus();
              
       
    } 
  else if(codigo == "" )
    {
        
        JOptionPane.showMessageDialog(null, 
          "Cree nuevo código de servicio", this.getTitle(), JOptionPane.ERROR_MESSAGE); 
         
        
        this.BTNNuevo.requestFocus();
        
    }   
    else{
            
      Guardar_Fichero();
      this.Guardar_Servicios();
            
     }
}
    void Guardar_Fichero()
{
//Crear Controlador de Errores
try
{
//Establecer Ruta del Archivo de Texto a Escribir la Secuencia de Datos
FileWriter Guardar = new FileWriter(DirectorioOrdenServicio, true); 
//Recorrer Filas del Modelo de Datos del Control: jTable

 Guardar.write(this.TXT_CodServicio.getText()+"\n");//columna 0
 Guardar.write(this.TXTApellidos.getText()+"\n");//columna 
 Guardar.write(this.TXTNombres.getText()+"\n");//columna 
 Guardar.write(this.TXTNacionalidad.getText()+"\n");//columna 
 Guardar.write(this.TXT_Tipo_Doc.getText()+"\n");//columna 
 Guardar.write(this.TXTNumDocumento.getText()+"\n");//columna 
 Guardar.write(this.TXT_Distrito.getText()+"\n");//columna 
 Guardar.write(this.TXTDireccion.getText()+"\n");//columna 
 Guardar.write(this.CBO_Placa.getSelectedItem().toString()+"\n");//columna
 Guardar.write(this.TXTColorVehiculo1.getText()+"\n");//columna 
 Guardar.write(this.TXTMarca.getText()+"\n");//columna 
 Guardar.write(this.TXT_Modelo.getText()+"\n");//columna
 Guardar.write(this.TXTKm.getText()+"\n");//columna
 Guardar.write(this.Lv_Foto.getText()+"\n");//columna
 Guardar.write(this.TXTAño.getText()+"\n");//columna
 

 Guardar.close();
}
catch(Exception Error)
  {
     
      JOptionPane.showMessageDialog(null, "Error:guardar fichero"+ Error.getMessage(),this.getTitle(),JOptionPane.ERROR_MESSAGE);
  }
}


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
            java.util.logging.Logger.getLogger(OrdenServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
   


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNNuevo;
    private javax.swing.JButton BTN_Agregar;
    private javax.swing.JButton BTN_Buscar;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Guadar;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JComboBox CBO_Placa;
    private javax.swing.JComboBox CBO_Servicio;
    private javax.swing.JComboBox CBO_Subservicio;
    private javax.swing.JTable JTable_OrdenDetalleServicio;
    private javax.swing.JScrollPane JTable_Servicio;
    private javax.swing.JLabel LBRegistroCliente;
    private javax.swing.JLabel LBRegistroVehiculo;
    private javax.swing.JLabel LBRegistroVehiculo1;
    private javax.swing.JLabel LB_Importe;
    private javax.swing.JLabel Lb_Foto;
    private javax.swing.JList ListaCantidad;
    private javax.swing.JList ListaImporte;
    private javax.swing.JList ListaPrecio;
    private javax.swing.JList ListaServicio;
    private javax.swing.JList ListaSubServicio;
    private javax.swing.JTextField Lv_Foto;
    private javax.swing.JTextField TXTApellidos;
    private javax.swing.JTextField TXTAño;
    private javax.swing.JTextField TXTCantidad;
    private javax.swing.JTextField TXTColorVehiculo1;
    private javax.swing.JTextField TXTConsultar_Datos;
    private javax.swing.JTextField TXTDireccion;
    private javax.swing.JTextField TXTKm;
    private javax.swing.JTextField TXTMarca;
    private javax.swing.JTextField TXTNacionalidad;
    private javax.swing.JTextField TXTNombres;
    private javax.swing.JTextField TXTNumDocumento;
    private javax.swing.JTextField TXT_CodServicio;
    private javax.swing.JLabel TXT_Codigo;
    private javax.swing.JTextField TXT_Distrito;
    private javax.swing.JTextField TXT_Modelo;
    private javax.swing.JTextField TXT_Precio;
    private javax.swing.JTextField TXT_Tipo_Doc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
