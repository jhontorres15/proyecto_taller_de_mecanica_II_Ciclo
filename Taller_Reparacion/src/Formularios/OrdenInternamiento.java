
package Formularios;
import DAL.Orden_Internamiento;
import DAL.Clientes;
import DAL.Vehiculo;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author XIOMARA
 */
public class OrdenInternamiento extends javax.swing.JFrame {

    DefaultTableModel Modelo;
     //Declarar variable de tipo: Entero
    int Codigo=1, Filas;
    

    
    String DirectorioCliente = new File("src/Archivo_Datos/Registro_Clientes.txt").getAbsolutePath();
    String DirectorioVehiculo = new File("src/Archivo_Datos/Registro_Vehiculo.txt").getAbsolutePath();
    String DirectorioOrdenInternamiento = new File("src/Archivo_Datos/Orden_Internamiento.txt").getAbsolutePath();
    
    String CodClientes;
    String CodCliente;
    
    Vehiculo ObjVehiculo = new Vehiculo("","","","","","","");
    
    public OrdenInternamiento() {
        initComponents();
        
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
        Modelo.addColumn("Código Internamiento");
        Modelo.addColumn("Apellidos");
        Modelo.addColumn("Nombres");
        Modelo.addColumn("Nacionalidad");
        Modelo.addColumn("Tipo Doc. Identidad");
        Modelo.addColumn("Nº Doc. Identidad");
        Modelo.addColumn("Distrito");
        Modelo.addColumn("Dirección");
        Modelo.addColumn("Placa");       
        Modelo.addColumn("Color");
        Modelo.addColumn("Marca");
        Modelo.addColumn("Modelo");
        Modelo.addColumn("KM");
        Modelo.addColumn("Foto");
        Modelo.addColumn("Fecha de ingreso");
        Modelo.addColumn("Fecha de entrega");
        Modelo.addColumn("Año");

        
        //Establecer el Modelo al Control: jTable_RegistroClientes
        this.JTable_Orden_Internamiento.setModel(Modelo);
    
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXTApellidos = new javax.swing.JTextField();
        TXTNombres = new javax.swing.JTextField();
        TXTNumDocumento = new javax.swing.JTextField();
        TXTColorVehiculo = new javax.swing.JTextField();
        TXTMarca = new javax.swing.JTextField();
        TXTDireccion = new javax.swing.JTextField();
        LBRegistroCliente = new javax.swing.JLabel();
        TXTNacionalidad = new javax.swing.JTextField();
        LBRegistroVehiculo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        TXTCodIntern = new javax.swing.JTextField();
        TXTKm = new javax.swing.JTextField();
        TXTAño = new javax.swing.JTextField();
        TXTFechaIngreso = new javax.swing.JTextField();
        TXTFechaEntrega = new javax.swing.JTextField();
        BTN_Buscar = new javax.swing.JButton();
        BTN_Nuevo = new javax.swing.JButton();
        BTN_Guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Orden_Internamiento = new javax.swing.JTable();
        TXT_Tipo_Doc = new javax.swing.JTextField();
        TXT_Distrito = new javax.swing.JTextField();
        TXT_Modelo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Lb_Foto = new javax.swing.JLabel();
        TXT_Placa = new javax.swing.JTextField();
        Lb_Localizador = new javax.swing.JLabel();
        BTN_Salir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        TXTApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Apellidos ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Nombres ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTNumDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "N° de Documento ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTColorVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Color (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Marca (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Dirección ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        LBRegistroCliente.setBackground(new java.awt.Color(255, 255, 255));
        LBRegistroCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LBRegistroCliente.setForeground(new java.awt.Color(0, 0, 102));
        LBRegistroCliente.setText("DATOS DEL CLIENTE");

        TXTNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Nacionalidad ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        LBRegistroVehiculo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LBRegistroVehiculo.setForeground(new java.awt.Color(0, 0, 102));
        LBRegistroVehiculo.setText("DATOS DEL VEHICULO");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 102));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 102));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 102));
        jTextField2.setFont(new java.awt.Font("NSimSun", 1, 48)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Orden de Internamiento ");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);

        TXTCodIntern.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Código", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227)
                .addComponent(TXTCodIntern, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTCodIntern, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TXTKm.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Km (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        TXTKm.setOpaque(false);

        TXTAño.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Año (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        TXTAño.setOpaque(false);

        TXTFechaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Fecha de Ingreso (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXTFechaEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Fecha de Entrega (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        BTN_Buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTN_Buscar.setText("Buscar");
        BTN_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarActionPerformed(evt);
            }
        });

        BTN_Nuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTN_Nuevo.setText("Nuevo");
        BTN_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoActionPerformed(evt);
            }
        });

        BTN_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTN_Guardar.setText("Guardar");
        BTN_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActionPerformed(evt);
            }
        });

        JTable_Orden_Internamiento.setModel(new javax.swing.table.DefaultTableModel(
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
        JTable_Orden_Internamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_Orden_InternamientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Orden_Internamiento);

        TXT_Tipo_Doc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Tipo de Documento", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXT_Distrito.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Distrito", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TXT_Modelo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Modelo (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 1, 14))); // NOI18N

        Lb_Foto.setBackground(new java.awt.Color(0, 51, 204));
        Lb_Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(Lb_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );

        TXT_Placa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Placa (*)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        Lb_Localizador.setText("Lb_Localizador");

        BTN_Salir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTN_Salir1.setText("Salir");
        BTN_Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(441, 441, 441)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LBRegistroVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1805, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(TXT_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TXT_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(TXTColorVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TXTFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TXTFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TXTKm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TXTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(Lb_Localizador, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TXTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(TXTNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(TXT_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(TXT_Tipo_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(TXTNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(44, 44, 44)))
                                        .addComponent(BTN_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BTN_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LBRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LBRegistroVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_Tipo_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTNumDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_Buscar))
                                .addGap(18, 18, 18)
                                .addComponent(TXTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTColorVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Lb_Localizador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(BTN_Nuevo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BTN_Guardar)
                                    .addComponent(BTN_Salir1)))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //Crear el Método Local: Leer_Datos()
void Leer_Datos_Internamiento()
{    
    
     //Instanciar la Clase: Cliente, a través de un Objeto
      Orden_Internamiento ObjInternamiento = new Orden_Internamiento("","","","","","","","","","","","","","","","","");
    
    ObjInternamiento.Leer_Orden_Internamiento(DirectorioOrdenInternamiento);
     
    try
     {

    //Crear Estructura Repetitiva (Bucle): while (Leer lineas del archivo)
        for (int i = 0; i < ObjInternamiento.MatrizInternamiento.length; i++)
        {
        //Leer Datos de la Matriz de Datos
        System.out.println();
        
        //Agregar Filas al Modelo de Datos del JTable.
            Modelo.addRow(new Object[] {ObjInternamiento.MatrizInternamiento[i][0],
                                        ObjInternamiento.MatrizInternamiento[i][1],
                                        ObjInternamiento.MatrizInternamiento[i][2],
                                        ObjInternamiento.MatrizInternamiento[i][3],
                                        ObjInternamiento.MatrizInternamiento[i][4],
                                        ObjInternamiento.MatrizInternamiento[i][5],
                                        ObjInternamiento.MatrizInternamiento[i][6],
                                        ObjInternamiento.MatrizInternamiento[i][7],
                                        ObjInternamiento.MatrizInternamiento[i][8],
                                        ObjInternamiento.MatrizInternamiento[i][9],
                                        ObjInternamiento.MatrizInternamiento[i][10],
                                        ObjInternamiento.MatrizInternamiento[i][11],
                                        ObjInternamiento.MatrizInternamiento[i][12],
                                        ObjInternamiento.MatrizInternamiento[i][13],
                                        ObjInternamiento.MatrizInternamiento[i][14],
                                        ObjInternamiento.MatrizInternamiento[i][15],
                                        ObjInternamiento.MatrizInternamiento[i][16]});

        
          }  
       
          int Fila = ObjInternamiento.MatrizInternamiento.length;

          if (Fila > 0) {
             CodClientes = ObjInternamiento.MatrizInternamiento[Fila -1][0];
          }
          else
          {
             CodClientes = "I0000";  
          }
      }
     catch(Exception Error)
      {
             CodClientes = "I0000";
      } 
 
}
   



    private void BTN_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarActionPerformed
     
    String dni = this.TXTNumDocumento.getText().trim();
    if (!dni.isEmpty()) {
        BuscarClientePorDNI(dni);
        Cargar_Filas_auto(dni);
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un número de documento");
    }
    }//GEN-LAST:event_BTN_BuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Leer_Datos_Internamiento();
        this.Botones(true);
        this.Habilitar_Controles(false);
    }//GEN-LAST:event_formWindowOpened

    private void BTN_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActionPerformed
       this.Agregar_Registro();
    }//GEN-LAST:event_BTN_GuardarActionPerformed

    private void BTN_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoActionPerformed
          //Declarar una Variable de Tipo: String I
     String CodigoCliente="";
   
    //Declarar una Variable de Tipo: Entero
   
   int Codigo = Integer.parseInt(CodClientes.substring(1))+1;
   
   if (Codigo>0 && Codigo<10)
     {
    //Generar Código del Cliente
    CodigoCliente = "I000" + String.valueOf(Codigo);
        }
    else if (Codigo>=10 && Codigo <= 99)
    {
    //Generar Código del Cliente
    CodigoCliente = "I00" + String.valueOf (Codigo);
    }
    else if (Codigo>=100 && Codigo <= 999)
    {
    //Generar Código del Cliente
    CodigoCliente = "I0" + String.valueOf(Codigo);
    }
    else if (Codigo>=1000 && Codigo <= 9999)
            {
    //Generar Código del Cliente
    CodigoCliente = "I" + String.valueOf(Codigo);
    }
    //Mostrar Código del Cliente
    this.TXTCodIntern.setText(CodigoCliente);
    
    this.Botones(false);
 
    }//GEN-LAST:event_BTN_NuevoActionPerformed

    private void JTable_Orden_InternamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_Orden_InternamientoMouseClicked
        Cargar_Filas();
    }//GEN-LAST:event_JTable_Orden_InternamientoMouseClicked

    private void BTN_Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salir1ActionPerformed
        //Declarar variable de tipo: Entero
        int Rpta;
        //Mostrar Mensaje de Confirmacion
        Rpta = JOptionPane.showConfirmDialog(null,"¿Desea Salir de la Ventana?", "Orden de internamiento",
            JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //'Evaluar Si se ha Pulsado el BotÃ³n: Si
        if (Rpta == 0)
        {
            
            //invocar el metodo guardar
            Guardar_Fichero();
            //Cerrar el Formulario
            dispose();

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
    }//GEN-LAST:event_BTN_Salir1ActionPerformed

    
    void Cargar_Filas()
{
    String Foto;
    
    // Obtiene el número de fila seleccionada en la tabla
    int Seleccion = this.JTable_Orden_Internamiento.getSelectedRow();

    // Obtiene el valor de la columna 13 (la columna de la foto) de esa fila
    Foto = this.JTable_Orden_Internamiento.getValueAt(Seleccion, 13).toString();

    // Guarda el índice de la fila seleccionada en una variable global llamada Filas
    Filas = Seleccion;
    
    // Si hay una foto (es decir, no está vacía ni es null), la muestra
    if (!Foto.equals("") || Foto != null)
    {
        this.Mostar_Imagen(Foto);  // Llama al método que muestra la imagen en la interfaz
    }
}

   void Mostar_Imagen(String Imagen)
{
    // Crea un objeto ImageIcon con la ruta donde está almacenada la imagen
    ImageIcon Foto = new ImageIcon("src/Imagen_Vehiculos/" + Imagen);

    // Escala la imagen al tamaño del JLabel Lb_Foto, para que se vea correctamente
    Icon Icono = new ImageIcon(
        Foto.getImage().getScaledInstance(
            this.Lb_Foto.getWidth(),     // Ancho del JLabel
            this.Lb_Foto.getHeight(),    // Alto del JLabel
            Image.SCALE_DEFAULT          // Tipo de escalado
        )
    );

    // Asigna el icono (imagen escalada) al JLabel Lb_Foto
    this.Lb_Foto.setIcon(Icono);

    // Imprime la ruta de la imagen por consola para verificar
    System.out.println("Ruta de imagen: " + Foto);

    // Vuelve a repintar la interfaz para asegurarse que se muestra la imagen actualizada
    this.repaint();
}

      

void Guardar_Fichero()
{
//Crear Controlador de Errores
try
{
//Establecer Ruta del Archivo de Texto a Escribir la Secuencia de Datos
FileWriter Guardar = new FileWriter(DirectorioOrdenInternamiento); 
//Recorrer Filas del Modelo de Datos del Control: jTable
for (int i=0; i < this.JTable_Orden_Internamiento.getRowCount(); i++)
{
 //Escribir la Secuencia de Datos
 Guardar.write(Modelo.getValueAt(i,0).toString()+"\n");//columna 0
 Guardar.write(Modelo.getValueAt(i,1).toString()+"\n");//columna 1
 Guardar.write(Modelo.getValueAt(i,2).toString()+"\n");//columna 2
 Guardar.write(Modelo.getValueAt(i,3).toString()+"\n");//columna 3
 Guardar.write(Modelo.getValueAt(i,4).toString()+"\n");//columna 4
 Guardar.write(Modelo.getValueAt(i,5).toString()+"\n");//columna 5
 Guardar.write(Modelo.getValueAt(i,6).toString()+"\n");//columna 6
 Guardar.write(Modelo.getValueAt(i,7).toString()+"\n");//columna 7
 Guardar.write(Modelo.getValueAt(i,8).toString()+"\n");//columna 8
 Guardar.write(Modelo.getValueAt(i,9).toString()+"\n");//columna 9
 Guardar.write(Modelo.getValueAt(i,10).toString()+"\n");//columna 10
 Guardar.write(Modelo.getValueAt(i,11).toString()+"\n");//columna 11
 Guardar.write(Modelo.getValueAt(i,12).toString()+"\n");//columna 12
 Guardar.write(Modelo.getValueAt(i,13).toString()+"\n");//columna 13
 Guardar.write(Modelo.getValueAt(i,14).toString()+"\n");//columna 13
 Guardar.write(Modelo.getValueAt(i,15).toString()+"\n");//columna 13
 Guardar.write(Modelo.getValueAt(i,16).toString()+"\n");//columna 13
 
}
Guardar.close();
}
catch(Exception Error)
  {
      JOptionPane.showMessageDialog(null, "Error: guardar fichero "+ Error.getMessage(),this.getTitle(),JOptionPane.ERROR_MESSAGE);
  }
}



public void BuscarClientePorDNI(String dniBuscado) {
    // Creamos un objeto de tipo Clientes con todos los campos vacíos,
    // pero internamente podrá leer los datos desde un archivo
    Clientes ObjCliente = new Clientes("","","","","","","","","","","","","","");

    // Llamamos al método Leer_Clientes para llenar la matriz desde el archivo de datos
    ObjCliente.Leer_Clientes(DirectorioCliente);

    // Recorremos la matriz de clientes ya cargada desde el archivo
    for (int i = 0; i < ObjCliente.MatrizClientes.length; i++) {
        // Comparamos el DNI de la fila actual con el DNI buscado (columna 6)
        if (ObjCliente.MatrizClientes[i][6].equals(dniBuscado)) {
            // Si lo encuentra, cargamos los datos encontrados en los campos del formulario
            this.TXTApellidos.setText(ObjCliente.MatrizClientes[i][1]);      // Apellidos
            this.TXTNombres.setText(ObjCliente.MatrizClientes[i][2]);        // Nombres
            this.TXTNacionalidad.setText(ObjCliente.MatrizClientes[i][4]);   // Nacionalidad
            this.TXT_Tipo_Doc.setText(ObjCliente.MatrizClientes[i][5]);      // Tipo de Documento
            this.TXTNumDocumento.setText(ObjCliente.MatrizClientes[i][6]);   // Número de Documento (DNI)
            this.TXT_Distrito.setText(ObjCliente.MatrizClientes[i][9]);      // Distrito
            this.TXTDireccion.setText(ObjCliente.MatrizClientes[i][12]);     // Dirección

            return; // Terminamos el método ya que encontramos el cliente
        }
    }

    // Si no encuentra el cliente, no hace nada (pero puedes agregar un mensaje aquí si quieres)

    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
}

 

    void Cargar_Filas_auto(String dniBuscado)
{
    
      Vehiculo ObjVehiculo = new Vehiculo("","","","","","","");
      ObjVehiculo.Leer_Vehiculo(DirectorioVehiculo);
    for (int i = 0; i < ObjVehiculo.MatrizVehiculo.length; i++) {
        if (ObjVehiculo.MatrizVehiculo[i][0].equals(dniBuscado)) {
    //Cargar datos en los controles
    this.TXT_Placa.setText(ObjVehiculo.MatrizVehiculo[i][1]);
    this.TXTColorVehiculo.setText(ObjVehiculo.MatrizVehiculo[i][2]);
    this.TXTMarca.setText(ObjVehiculo.MatrizVehiculo[i][3]);
    this.TXT_Modelo.setText(ObjVehiculo.MatrizVehiculo[i][4]);
    this.TXTKm.setText(ObjVehiculo.MatrizVehiculo[i][5]);
    this.Lb_Foto.setText(ObjVehiculo.MatrizVehiculo[i][6]);
    
     return; 
     }
    }
} 
    
// Método para agregar un nuevo registro de cliente a la tabla
void Agregar_Registro()
{
    // Crear un arreglo de 17 elementos tipo String para almacenar la información del cliente
    String[] InfoClientes = new String[17];
    
    // Obtener el texto de cada campo del formulario y asignarlo al arreglo
    InfoClientes[0] = this.TXTCodIntern.getText();       // Código interno del cliente
    InfoClientes[1] = this.TXTApellidos.getText();       // Apellidos
    InfoClientes[2] = this.TXTNombres.getText();         // Nombres
    InfoClientes[3] = this.TXTNacionalidad.getText();    // Nacionalidad
    InfoClientes[4] = this.TXT_Tipo_Doc.getText();       // Tipo de documento
    InfoClientes[5] = this.TXTNumDocumento.getText();    // Número de documento
    InfoClientes[6] = this.TXT_Distrito.getText();       // Distrito
    InfoClientes[7] = this.TXTDireccion.getText();       // Dirección
    InfoClientes[8] = this.TXT_Placa.getText();          // Placa del vehículo
    InfoClientes[9] = this.TXTColorVehiculo.getText();   // Color del vehículo
    InfoClientes[10] = this.TXTMarca.getText();          // Marca del vehículo
    InfoClientes[11] = this.TXT_Modelo.getText();        // Modelo del vehículo
    InfoClientes[12] = this.TXTKm.getText();             // Kilometraje
    InfoClientes[13] = this.Lb_Foto.getText();           // Foto o ruta de la imagen
    InfoClientes[14] = this.TXTFechaIngreso.getText();   // Fecha de ingreso
    InfoClientes[15] = this.TXTFechaEntrega.getText();   // Fecha de entrega
    InfoClientes[16] = this.TXTAño.getText();            // Año del vehículo

    // Agregar el arreglo como una nueva fila en el modelo de la tabla
    Modelo.addRow(InfoClientes);
    
    // Mostrar mensaje informando que el registro fue guardado correctamente
    JOptionPane.showMessageDialog(null, "Registro Guardado con éxito", this.getTitle(),
                                  JOptionPane.INFORMATION_MESSAGE);
    
    // Guardar el código del cliente recién agregado para referencia futura
    CodCliente = InfoClientes[0];
    
    // Poner el foco del cursor nuevamente en el campo de Apellidos para seguir ingresando
    this.TXTApellidos.requestFocus();
}

    //Crear el Método Local: Habilitar_Controles()
void Habilitar_Controles (boolean Valor)
{
//Establecer Propiedad: Habilitar/Deshabilitar (true/false)
    this.TXTApellidos.setEditable(Valor);
    this.TXTNombres.setEditable(Valor);
    this.TXTCodIntern.setEditable(Valor);
    
    this.TXTColorVehiculo.setEditable(Valor);
    this.TXTDireccion.setEditable(Valor);
    this.TXT_Tipo_Doc.setEditable(Valor);
    this.TXT_Placa.setEditable(Valor);
    this.TXT_Distrito.setEditable(Valor);
    this.TXTNacionalidad.setEditable(Valor);
    this.TXT_Modelo.setEditable(Valor);
    this.TXTMarca.setEditable(Valor);
    this.TXTKm.setEditable(Valor);

}
    
void Botones(boolean valor)
{
    this.BTN_Buscar.setEnabled(valor);
    this.BTN_Guardar.setEnabled(!valor);
    this.BTN_Nuevo.setEnabled(valor);
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
            java.util.logging.Logger.getLogger(OrdenInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new OrdenInternamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Buscar;
    private javax.swing.JButton BTN_Guardar;
    private javax.swing.JButton BTN_Nuevo;
    private javax.swing.JButton BTN_Salir1;
    private javax.swing.JTable JTable_Orden_Internamiento;
    private javax.swing.JLabel LBRegistroCliente;
    private javax.swing.JLabel LBRegistroVehiculo;
    private javax.swing.JLabel Lb_Foto;
    private javax.swing.JLabel Lb_Localizador;
    private javax.swing.JTextField TXTApellidos;
    private javax.swing.JTextField TXTAño;
    private javax.swing.JTextField TXTCodIntern;
    private javax.swing.JTextField TXTColorVehiculo;
    private javax.swing.JTextField TXTDireccion;
    private javax.swing.JTextField TXTFechaEntrega;
    private javax.swing.JTextField TXTFechaIngreso;
    private javax.swing.JTextField TXTKm;
    private javax.swing.JTextField TXTMarca;
    private javax.swing.JTextField TXTNacionalidad;
    private javax.swing.JTextField TXTNombres;
    private javax.swing.JTextField TXTNumDocumento;
    private javax.swing.JTextField TXT_Distrito;
    private javax.swing.JTextField TXT_Modelo;
    private javax.swing.JTextField TXT_Placa;
    private javax.swing.JTextField TXT_Tipo_Doc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
