package Formularios;

import DAL.Vehiculo;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Frm_Vehiculo extends javax.swing.JFrame {
     
  //declarar variable jfram\
    
  JFrame Formulario;
   
   String CodVehiculo;
    
  
  DefaultTableModel Modelo;
  
  int Codigo=1, Filas;
  
  String DirectorioMarca = new File("src/Archivo_Datos/Registro_Marca.txt").getAbsolutePath();
  String DirectorioColor = new File("src/Archivo_Datos/Colores.txt").getAbsolutePath();
  String DirectorioModelo = new File("src/Archivo_Datos/Registro_Modelo.txt").getAbsolutePath();
  String DirectorioVehiculo = new File("src/Archivo_Datos/Registro_Vehiculo.txt").getAbsolutePath();
  Vehiculo ObjVehiculo = new Vehiculo("","","","","","","");
  
    public Frm_Vehiculo() {
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
        //Establecer Nombre de las Columnas para el Control: jTable_Vehiculos(A través de la variable: Modelo)
        Modelo.addColumn("Código Cliente");
        Modelo.addColumn("Matricula");
        Modelo.addColumn("Color");
        Modelo.addColumn("Marca");
        Modelo.addColumn("Modelo");
        Modelo.addColumn("Km");
        Modelo.addColumn("Foto");
        

        //Establecer el Modelo al Control: jTableRegistro_Vehiculo
        this.jTableRegistro_Vehiculo.setModel(Modelo);
    }
     
    void AutoAjustar_Columnas()
    {
        //Establecer Anchos de Columnas
        //Definir el Tamaño de cada Columna del control (jTable):jTableRegistro_Vehiculo
        int [] Anchos = {60, 180, 140, 100, 120, 100, 100};

        //Recorrer el Número de Columnas del Objeto (JTable): jTableRegistro_Vehiculo
        for (int Columna = 0; Columna < this.jTableRegistro_Vehiculo.getColumnCount(); Columna++)
        {
        //Establecer el Ancho de Columna para cada Columna del JTable: jTableRegistro_Vehiculo
        this.jTableRegistro_Vehiculo.getColumnModel().getColumn(Columna).setPreferredWidth(Anchos[Columna]);
        }

        //Establecer el AutoRediseño de Tamaño del jTable en: AUTO_RESIZE_OFF
        this.jTableRegistro_Vehiculo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //Mostrar las barras de desplazamiento: Vertical y Horizontal
        this.jTableRegistro_Vehiculo.setShowVerticalLines(true);
        this.jTableRegistro_Vehiculo.setShowHorizontalLines(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TXTN_Placa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TXT_Km = new javax.swing.JTextField();
        TXT_CodCliente = new javax.swing.JTextField();
        CBO_Marca = new javax.swing.JComboBox<>();
        CBO_Modelo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistro_Vehiculo = new javax.swing.JTable();
        CBO_Color = new javax.swing.JComboBox();
        BTN_Examinar = new javax.swing.JButton();
        Lb_Localizador = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Lb_Num_Registro = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Lb_Foto = new javax.swing.JLabel();
        BTN_Editar = new javax.swing.JButton();
        BTN_Salir = new javax.swing.JButton();
        BTN_Nuevo = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        BTN_Guardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nº de Placa : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Km:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Marca :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Modelo :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Color :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ID Cliente:");

        CBO_Marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Marca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_MarcaItemStateChanged(evt);
            }
        });

        CBO_Modelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTableRegistro_Vehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nº de Placa", "Doc. Indentidad"
            }
        ));
        jTableRegistro_Vehiculo.setColumnSelectionAllowed(true);
        jTableRegistro_Vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegistro_VehiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegistro_Vehiculo);
        jTableRegistro_Vehiculo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        CBO_Color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BTN_Examinar.setText("Examinar");
        BTN_Examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ExaminarActionPerformed(evt);
            }
        });

        Lb_Localizador.setText("Lb_Localizador");

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "N de Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Lb_Num_Registro.setText("Lb_Num_Registro");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Lb_Num_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lb_Num_Registro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 1, 14))); // NOI18N

        Lb_Foto.setBackground(new java.awt.Color(0, 51, 204));
        Lb_Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lb_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        BTN_Editar.setText("Editar");
        BTN_Editar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Editar.setMaximumSize(new java.awt.Dimension(101, 1));
        BTN_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EditarActionPerformed(evt);
            }
        });

        BTN_Salir.setText("Salir");
        BTN_Salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

        BTN_Nuevo.setText("Nuevo");
        BTN_Nuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoActionPerformed(evt);
            }
        });

        BTNCancelar.setText("Cancelar");
        BTNCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelarActionPerformed(evt);
            }
        });

        BTN_Guardar.setText("Guardar");
        BTN_Guardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBO_Modelo, 0, 270, Short.MAX_VALUE)
                                    .addComponent(CBO_Marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TXT_Km, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(BTN_Examinar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(TXT_CodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TXTN_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(CBO_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(100, 100, 100))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(504, 504, 504)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTN_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTNCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lb_Localizador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_CodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CBO_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBO_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTN_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBO_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN_Nuevo)
                        .addComponent(BTN_Guardar)
                        .addComponent(BTNCancelar)
                        .addComponent(BTN_Salir))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXT_Km, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Lb_Localizador)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Examinar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Vehiculo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //crear metodo agregar registro
void Agregar_Registro()
{
    String [] InfoVehiculos = new String[7];
    
    InfoVehiculos[0]= this.TXT_CodCliente.getText();
    InfoVehiculos[1]= this.TXTN_Placa.getText();
    InfoVehiculos[2]= this.CBO_Color.getSelectedItem().toString();
    InfoVehiculos[3]= this.CBO_Marca.getSelectedItem().toString();
    InfoVehiculos[4]= this.CBO_Modelo.getSelectedItem().toString();
    InfoVehiculos[5]= this.TXT_Km.getText();
    InfoVehiculos[6]= this.Lb_Foto.getText();
    
       //ESTO VA EN AGREGAR VEHICYLO
     //Evaluar si el Icono del control Label es Nulo (Vacio)
     if (this.Lb_Foto.getIcon() == null)
     {
     //WAsignar Valor "null" en el Vector de Datos
     InfoVehiculos[6] = "null";
    }
      else
    {
    //"Asignar Nombre de la Fotografia, según el Nombrel de Código del + ".jpg"
    InfoVehiculos[6] = this.TXT_CodCliente.getText()+".jpg";
    } 
     
    //ingresar los datos a la tabla
    Modelo.addRow(InfoVehiculos);
    
    JOptionPane.showMessageDialog(null,"Registro Guardado con exito", this.getTitle(),
                                 JOptionPane.INFORMATION_MESSAGE);
    CodVehiculo = InfoVehiculos[0];
    
    this.TXT_CodCliente.requestFocus();
}

void Guardar_Fichero()
{
//Crear Controlador de Errores
try
{
//Establecer Ruta del Archivo de Texto a Escribir la Secuencia de Datos
FileWriter Guardar = new FileWriter(DirectorioVehiculo, false); 
//Recorrer Filas del Modelo de Datos del Control: jTable
for (int i=0; i < this.jTableRegistro_Vehiculo.getRowCount(); i++)
{
 //Escribir la Secuencia de Datos
 Guardar.write(Modelo.getValueAt(i,0).toString()+"\n");//columna 0
 Guardar.write(Modelo.getValueAt(i,1).toString()+"\n");//columna 1
 Guardar.write(Modelo.getValueAt(i,2).toString()+"\n");//columna 2
 Guardar.write(Modelo.getValueAt(i,3).toString()+"\n");//columna 3
 Guardar.write(Modelo.getValueAt(i,4).toString()+"\n");//columna 4
 Guardar.write(Modelo.getValueAt(i,5).toString()+"\n");//columna 5
 Guardar.write(Modelo.getValueAt(i,6).toString()+"\n");//columna 6

}
Guardar.close();
}
catch(Exception Error)
  {
      JOptionPane.showMessageDialog(null, "Error: AQUI TOYLINEA GUARADAR FICHEO "+ Error.getMessage(),this.getTitle(),JOptionPane.ERROR_MESSAGE);
  }
}  

//Crear el Método: Modificar_Registro
void Modificar_Registro()
{
//Mostrar Mensaje de Confirmación
    int Rpta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que Desea Modificar los Datos del cliente?", "Confirmación ... " , JOptionPane. YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE);

    //Evaluar si es la Respuesta es Afirmativa
    if (Rpta == JOptionPane. YES_OPTION)
    {
    //Obtener el Nº de la Fila Seleccionada
    int Fila = this.jTableRegistro_Vehiculo.getSelectedRow();
    //Establecer Valores en el Control
    this.jTableRegistro_Vehiculo.setValueAt(this.TXT_CodCliente.getText(), Fila, 0);
    this.jTableRegistro_Vehiculo.setValueAt(this.TXTN_Placa.getText(),Fila,1);
    this.jTableRegistro_Vehiculo.setValueAt(this.CBO_Color.getSelectedItem().toString(),Fila,2);
    this.jTableRegistro_Vehiculo.setValueAt(this.CBO_Marca.getSelectedItem().toString(),Fila,3);
    this.jTableRegistro_Vehiculo.setValueAt(this.CBO_Modelo.getSelectedItem().toString(),Fila,4);
    this.jTableRegistro_Vehiculo.setValueAt(this.TXT_Km.getText(),Fila,5);
    this.jTableRegistro_Vehiculo.setValueAt(this.TXTN_Placa.getText()+".jpg",Fila, 6);
}
}

//Crear el Método: Validar_Datos()
void Validar_Datos()
{
    int Contador = 0;
    
    String Placa="";
    
    //Evaluar si el Texto del Boton: BTN_Guardar es igual al Texto: GUARDAR
    if(this.BTN_Guardar.getText().toUpperCase().equals("GUARDAR"))
    {
          
     if (this.jTableRegistro_Vehiculo.getRowCount() == 0)
     {
        Contador = 0;
     }
     else
     {
        //Recorrer los Elementos del Control JTable
        for (int i = 0; i < this.jTableRegistro_Vehiculo.getRowCount(); i++)
        {
            //Capturar la Descripción del Producto
            Placa = this.jTableRegistro_Vehiculo.getValueAt(i, 1).toString(); // 1 Columna: Descripcion    
            

             //MEvaluar si la Descripción del Producto Existe
            if (this.TXTN_Placa.getText().equals(Placa))
            {
            //Mostrar Mensaje de Error
            JOptionPane.showMessageDialog(null, "El numero de Matricula: " + this.TXTN_Placa.getText() +", ya se encunetra registrado ",
                                          this.getTitle(), JOptionPane.ERROR_MESSAGE);

            this.TXTN_Placa.requestFocus();

            Contador++;

            //fin de poroceso 
              break;
            }
        }
     }
  }
    
   if(this.BTN_Guardar.getText().toUpperCase().equals("ACTUALIZAR")) 
   {
       //obtenr eo numero de filas \
       int Fila = this.jTableRegistro_Vehiculo.getSelectedRow();
       
       
       //Capturar la num dni
         Placa = this.jTableRegistro_Vehiculo.getValueAt(Fila,1).toString(); // 6 Columna: dni
                 
       //capturar la descripcion del producto
       if(this.TXTN_Placa.getText().equals(Placa))
       {
                  Contador = 0; 
       }
       else
       {
         //Recorrer Elementos del Control: JTable
         for(int i = 0 ; i < this.jTableRegistro_Vehiculo.getRowCount(); i++)
         {
             
             //Capturar la num dni
         Placa = this.jTableRegistro_Vehiculo.getValueAt(i,1).toString(); // 6 Columna: dni
         
         //Evaluar si la dni Existe
         if (this.TXTN_Placa.getText().equals(Placa))
         {
             
             
         //Mostrar Mensaje de Error
         JOptionPane.showMessageDialog(null, "EL Numero de Documento; " + this.TXTN_Placa.getText() + ", ya se encuentra Registrado",
         this.getTitle(), JOptionPane.ERROR_MESSAGE);
         
         //Ubicar Cursor en el Cursor
         this.TXTN_Placa.requestFocus();
         
         //incrementar el Valor de la variable: Contador
         Contador++; // Contador = Contador + 1;
         
         //Fin del Proceso
         break ;
         }
        }
       }
   }
   if(Contador == 0)
   {
       if(this.BTN_Guardar.getText().toUpperCase().equals("GUARDAR"))
       {
          Agregar_Registro();
       }
       else
       {
           Modificar_Registro();
       }
       
       //invocar al metodo:total_Filas
       TotalFilas();
       
       //Invocar al metodo guardar archivo
      Guardar_Fichero();
       
       
       this.Habilitar_Controles(false);
       
       //Establecer txt Guaragr en el  btn de nombre BTN_Guardar
       this.BTN_Guardar.setText("Guardar");
   }
}

void TotalFilas()
{
    int NumFilas = this.jTableRegistro_Vehiculo.getRowCount();
    this.Lb_Num_Registro.setText(""+NumFilas);
}

void Limpiar()
    {
        this.Lb_Foto.setText(null);
        this.TXTN_Placa.setText("");
        this.TXT_CodCliente.setText("");
        this.TXT_Km.setText("");
        this.CBO_Marca.setSelectedIndex(0);
        this.CBO_Modelo.setSelectedIndex(0);
        this.CBO_Color.setSelectedIndex(0);
    }

//Crear el Método Local: Habilitar_Controles()
void Habilitar_Controles (boolean Valor)
{
//Establecer Propiedad: Habilitar/Deshabilitar (true/false)
    this.TXT_CodCliente.setEnabled(Valor);
    this.TXT_Km.setEnabled(Valor);
    this.TXTN_Placa.setEnabled(Valor);

}
    
void Botones(boolean valor)
{
    this.BTN_Nuevo.setEnabled(valor);
    this.BTN_Guardar.setEnabled(!valor);
    this.BTNCancelar.setEnabled(!valor);
    this.BTN_Editar.setEnabled(valor);
   // this.BTN_Eliminar.setEnabled(valor);
    this.BTN_Salir.setEnabled(valor);
    this.jTableRegistro_Vehiculo.setEnabled(valor);
}
    
    void Cargar_Color()
{
    //Limpiar todos los Elementos del ComboBox: CBO_Color
   this.CBO_Color.removeAllItems();
   //Agregar un Primer Elemento al ComboBox: CBO_Color
   this.CBO_Color.addItem("<Seleccione>");
   //Invocar al Método: Leer_Color
   ObjVehiculo.Leer_Color(DirectorioColor);
   //Recorrer los Elementos de la Matriz: MatrizColor
   for (int Fila = 0; Fila < ObjVehiculo.MatrizColor.length; Fila++)
   {//    fila se suma en cada vuelta, 
    //Agregar Datos al Control: CBO_Color lo que el valor fila va aumentando de uno en uno
     this.CBO_Color.addItem(ObjVehiculo.MatrizColor[Fila][0]);
   }
}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    Cargar_Marca();
    Leer_Datos();
    AutoAjustar_Columnas();
    TotalFilas();
    Cargar_Color();
    }//GEN-LAST:event_formWindowOpened

    private void CBO_MarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_MarcaItemStateChanged
                 //Evaluar si se ha Seleccionado un Elemento de la Lista
      if(evt.getStateChange() == ItemEvent.SELECTED)
      {
          //Invocar al Método: Cargar_Provincia
        this.Cargar_Modelo(this.CBO_Marca.getSelectedItem().toString());
      }
    }//GEN-LAST:event_CBO_MarcaItemStateChanged

    private void jTableRegistro_VehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegistro_VehiculoMouseClicked
    Cargar_Filas();
    }//GEN-LAST:event_jTableRegistro_VehiculoMouseClicked

    private void BTN_ExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ExaminarActionPerformed
     //OBtener la ruta de la imagen
        String Ruta = new Frm_Vehiculo().ExaminarArchivo();
        
        //representar imagen
        ImageIcon img = new ImageIcon(Ruta);
        Icon Imagen = new ImageIcon(img.getImage().getScaledInstance(this.Lb_Foto.getWidth(),this.Lb_Foto.getHeight(), Image.SCALE_SMOOTH ));
        
        this.Lb_Localizador.setText(String.valueOf(Ruta));
        
        this.Lb_Foto.setIcon(Imagen);
        
        this.repaint();
        
        File FotoProducto = new File(System.getProperty("user.dir")+ "\\src\\Imagen_Vehiculos\\"+this.TXTN_Placa.getText()+".jpg");
        
        //obetenr la ruta de origen
        String RutaOrigen= this.Lb_Localizador.getText();
        
        //la ruta de destino
        String RutaDestino= FotoProducto.getAbsolutePath();
        
        //Creando Archivo
        File ArchivoOrigen = new File(RutaOrigen);
        File ArchivoDestino = new File(RutaDestino);
        try
        {
       // Copiar Archivo de la Ruta de Origen hacia la Nueva Ruta de Destino (Reemplanzando si Existe el Archivo).
        Files.copy(ArchivoOrigen.toPath(), ArchivoDestino.toPath(), REPLACE_EXISTING);
        }
        catch(Exception Error)
        {
        //imprimir Error
        System.out.println(Error);
        }
    }//GEN-LAST:event_BTN_ExaminarActionPerformed

    private void BTN_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EditarActionPerformed

        this.Habilitar_Controles(true);
        this.Botones(false);

        this.BTN_Guardar.setText("Actualizar");
    }//GEN-LAST:event_BTN_EditarActionPerformed

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        //Declarar variable de tipo: Entero
        int Rpta;
        //Mostrar Mensaje de Confirmacion
        Rpta = JOptionPane.showConfirmDialog(null,"¿Desea Salir de la Ventana?", "Registro de Vehiculo",
            JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //'Evaluar Si se ha Pulsado el BotÃ³n: Si
        if (Rpta == 0)
        {
            //establecer el conjunto de filas o en el control.
            this.jTableRegistro_Vehiculo.setRowSorter(null);
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
    }//GEN-LAST:event_BTN_SalirActionPerformed

    private void BTN_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoActionPerformed
        // TODO add your handling code here:
        Limpiar();
        this.Botones(false);
        this.Habilitar_Controles(true);
        this.BTN_Guardar.setText("Guardar");
        this.TXT_CodCliente.requestFocus();
    }//GEN-LAST:event_BTN_NuevoActionPerformed

    private void BTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelarActionPerformed
        this.BTN_Guardar.setText("Guardar");
        this.Limpiar();
        this.Habilitar_Controles(false);
        this.Botones(true);
    }//GEN-LAST:event_BTNCancelarActionPerformed

    private void BTN_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActionPerformed

        this.Validar_Datos();

        this.Botones(true);

        this.Habilitar_Controles(false);

    }//GEN-LAST:event_BTN_GuardarActionPerformed

    void Cargar_Marca()
{
    //Limpiar todos los Elementos del ComboBox: CBO_Marca
   this.CBO_Marca.removeAllItems();
   //Agregar un Primer Elemento al ComboBox: CBO_Marca
   this.CBO_Marca.addItem("<Seleccione>");
   //Invocar al Método: Leer_Nacionalidad
   ObjVehiculo.Leer_Marca(DirectorioMarca);
   //Recorrer los Elementos de la Matriz: MatrizNacionalidad
   for (int Fila = 0; Fila < ObjVehiculo.MatrizMarca.length; Fila++)
   {
   //Agregar Datos al Control: CBO_Marca
   this.CBO_Marca.addItem(ObjVehiculo.MatrizMarca[Fila][0]);
   }
}
    void Cargar_Modelo(String NombreMarca)
{
    //Limpiar todos los Elementos del ComboBox: CBO_Modelo
    this.CBO_Modelo.removeAllItems();
    
    //Agregar un Primer Elemento al ComboBox: CBO_Modelo
    this.CBO_Modelo.addItem("<Seleccione>");
    
            //Invocar al Método: Leer_Modelo
          ObjVehiculo.Leer_Modelo(DirectorioModelo);  
    
     //Recorrer los Elementos de la Matriz: MatrizModelo
     for (int i = 0; i < ObjVehiculo.MatrizModelo.length; i++)
     {
       if(ObjVehiculo.MatrizModelo[i][1].equals(NombreMarca))  
       {
         //Agregar Datos al Control: CBO_DModelo
        this.CBO_Modelo.addItem(ObjVehiculo.MatrizModelo[i][0]);
       }
     }
}

  //Crear la Función: ExaminarArchivo
   public String ExaminarArchivo()
   {
    //Declarar variable de Tipo: String
    String Ruta;
    //Filtrar Extension del Nombre del Archivo
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Imagen JPG", "jpg", "png");
    //Declarar variable (Selector de Archivo): CuadroDialogo
    JFileChooser CuadroDialogo = new JFileChooser();
    CuadroDialogo.setDialogTitle("Seleccionar Imagen del Producto");

    //Establecer Filtro de Archivo
    CuadroDialogo.setFileFilter(filtro);
    //Mostrar Cuadro de Dialogo Abierto
    int Valor = CuadroDialogo.showOpenDialog(Formulario);
    //Evaluar si el Valor del Selector de Archivo = Opción Aprobado
    if (Valor == JFileChooser.APPROVE_OPTION)
    {
    //Obtener Ruta del Archivo Seleccionado

        Ruta = CuadroDialogo.getSelectedFile().getPath();
        System.out.println(Ruta);
    }
    else
    {
        Ruta = "";
    }
         return Ruta;
   }
    
   void Mostar_Imagen(String Imagen)
   {
        //mpostar imagen
      ImageIcon Foto = new ImageIcon("src/Imagen_Vehiculos/"+ Imagen);
      
      Icon Icono = new ImageIcon(Foto.getImage().getScaledInstance(this.Lb_Foto.getWidth(), this.Lb_Foto.getHeight(),
                                                                  Image.SCALE_DEFAULT));
      
      //asiganr la imagen
      this.Lb_Foto.setIcon(Icono);
      
      this.repaint();
   }
    


void Leer_Datos()
    {
        //Instanciar la Clase: Cliente, a través de un Objeto
        Vehiculo ObjVehiculo = new Vehiculo("","","","","","","");
        ObjVehiculo.Leer_Vehiculo(DirectorioVehiculo);

       //Crear Estructura Repetitiva (Bucle): while (Leer lineas del archivo)
        for (int i = 0; i < ObjVehiculo.MatrizVehiculo.length; i++)
        {
        //Leer Datos de la Matriz de Datos
        System.out.println();
        
        //Agregar Filas al Modelo de Datos del JTable.
            Modelo.addRow(new Object[] {ObjVehiculo.MatrizVehiculo[i][0],
                                        ObjVehiculo.MatrizVehiculo[i][1],
                                        ObjVehiculo.MatrizVehiculo[i][2],
                                        ObjVehiculo.MatrizVehiculo[i][3],
                                        ObjVehiculo.MatrizVehiculo[i][4],
                                        ObjVehiculo.MatrizVehiculo[i][5],
                                        ObjVehiculo.MatrizVehiculo[i][6]});
        }

 }

void Cargar_Filas()
{
    String Foto;
    int Seleccion = this.jTableRegistro_Vehiculo.getSelectedRow();
    
    //Cargar datos en los controles
    this.TXT_CodCliente.setText(this.jTableRegistro_Vehiculo.getValueAt(Seleccion, 0).toString());
    this.TXTN_Placa.setText(this.jTableRegistro_Vehiculo.getValueAt(Seleccion, 1).toString());
    this.CBO_Color.setSelectedItem(this.jTableRegistro_Vehiculo.getValueAt(Seleccion, 2).toString());
    this.CBO_Marca.setSelectedItem(this.jTableRegistro_Vehiculo.getValueAt(Seleccion, 3).toString());
    this.CBO_Modelo.setSelectedItem(this.jTableRegistro_Vehiculo.getValueAt(Seleccion, 4).toString());
    this.TXT_Km.setText(this.jTableRegistro_Vehiculo.getValueAt(Seleccion, 5).toString());
    Foto = this.jTableRegistro_Vehiculo.getValueAt(Seleccion, 6).toString();
    Filas = Seleccion;
    
    if(!Foto.equals("")||Foto!=null)
    {
        this.Mostar_Imagen(Foto);
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
            java.util.logging.Logger.getLogger(Frm_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton BTN_Editar;
    private javax.swing.JButton BTN_Examinar;
    private javax.swing.JButton BTN_Guardar;
    private javax.swing.JButton BTN_Nuevo;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JComboBox CBO_Color;
    private javax.swing.JComboBox<String> CBO_Marca;
    private javax.swing.JComboBox CBO_Modelo;
    private javax.swing.JLabel Lb_Foto;
    private javax.swing.JLabel Lb_Localizador;
    private javax.swing.JLabel Lb_Num_Registro;
    private javax.swing.JTextField TXTN_Placa;
    private javax.swing.JTextField TXT_CodCliente;
    private javax.swing.JTextField TXT_Km;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistro_Vehiculo;
    // End of variables declaration//GEN-END:variables
}
