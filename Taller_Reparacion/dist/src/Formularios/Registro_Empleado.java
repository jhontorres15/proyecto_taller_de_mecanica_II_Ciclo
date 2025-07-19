/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import DAL.Empleado;
import DAL.Persona;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author promo jhonny
 */
public class Registro_Empleado extends javax.swing.JFrame {

      DefaultTableModel Modelo;
    
     //Declarar variable de tipo: Entero
    int Codigo=1, Filas;
    
     JFrame Formulario;
     
    //Establecer el Directorio del Proyecto, donde se desea guardar el Archivo de Texto
    String DirectorioEmpleado = new File("src/Archivo_Datos/Registro_Empleados.txt").getAbsolutePath();
    String DirectorioNacionalidad = new File("src/Archivo_Datos/Registro_Nacionalidad.txt").getAbsolutePath();
    String DirectorioDocIdentidad = new File("src/Archivo_Datos/Registro_Documentos_Identidad.txt").getAbsolutePath();
    String DirectorioDepartamento = new File("src/Archivo_Datos/Registro_Departamentos.txt").getAbsolutePath();
    String DirectorioProvincia = new File("src/Archivo_Datos/Registro_Provincias.txt").getAbsolutePath();
    String DirectorioDistrito = new File("src/Archivo_Datos/Registro_Distritos.txt").getAbsolutePath();
    
    Persona ObjPersona = new Persona("","","","","","","","","","","","");
    Persona ObjCliente = new Persona("","","","","","","","","","","","");
    Empleado ObjEmpleado = new Empleado("","","","","","","","","","","","","","","","","","");

    SimpleDateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    
    String CodCliente;
    
    TableRowSorter TFiltroFila;
    public Registro_Empleado() {
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
        Modelo.addColumn("Código");
        Modelo.addColumn("Area");
        Modelo.addColumn("Cargo");
        Modelo.addColumn("Sueldo");
        Modelo.addColumn("Estado");
        Modelo.addColumn("Apellidos");
        Modelo.addColumn("Nombres");
        Modelo.addColumn("Fecha de Nacimineto");
        Modelo.addColumn("Nacionalidad");
        Modelo.addColumn("Doc. Identidad");
        Modelo.addColumn("Nº Doc. Identidad");
        Modelo.addColumn("Departamento");
        Modelo.addColumn("Provincia");
        Modelo.addColumn("Distrito");
        Modelo.addColumn("Dirección");
        Modelo.addColumn("Telefono");
        Modelo.addColumn("Email");
        Modelo.addColumn("Foto");
        
        //Establecer el Modelo al Control: jTable_RegistroEmpleados
        this.jTable_RegistroEmpleados.setModel(Modelo);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CBO_Departamento = new javax.swing.JComboBox();
        CBO_Provincia = new javax.swing.JComboBox();
        CBO_Distrito = new javax.swing.JComboBox();
        CBO_Tipo_Doc_Identidad = new javax.swing.JComboBox();
        TXTApellidos = new javax.swing.JTextField();
        TXTNombres = new javax.swing.JTextField();
        TXTNumDoc_Identidad = new javax.swing.JTextField();
        TXTDireccion = new javax.swing.JTextField();
        TXTTelefono = new javax.swing.JTextField();
        TXTEmail = new javax.swing.JTextField();
        Lb_CodigoEmpleado = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CBO_Nacionalidad = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TXT_Area = new javax.swing.JTextField();
        TXT_Cargo = new javax.swing.JTextField();
        TXT_Sueldo = new javax.swing.JTextField();
        TXT_Estado = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Lb_Foto = new javax.swing.JLabel();
        BTNGuardar = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        BTNNuevo = new javax.swing.JButton();
        Lb_Localizador = new javax.swing.JLabel();
        BTN_Examinar = new javax.swing.JButton();
        BTN_Editar = new javax.swing.JButton();
        BTN_Salir = new javax.swing.JButton();
        JDate_Fec_Nac = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_RegistroEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Empleado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de Nacimineto:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Documento de Identidad:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("N de Doc. de Identidad:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("Departamento:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel9.setText("Provincia:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setText("Distrito:");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel11.setText("Direccion:");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setText("Telefono:");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel13.setText("Email:");

        CBO_Departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Departamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_DepartamentoItemStateChanged(evt);
            }
        });

        CBO_Provincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Provincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_ProvinciaItemStateChanged(evt);
            }
        });

        CBO_Distrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CBO_Tipo_Doc_Identidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Tipo_Doc_Identidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBO_Tipo_Doc_IdentidadActionPerformed(evt);
            }
        });

        TXTApellidos.setText("jTextField1");
        TXTApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTApellidosKeyTyped(evt);
            }
        });

        TXTNombres.setText("jTextField2");
        TXTNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNombresKeyTyped(evt);
            }
        });

        TXTNumDoc_Identidad.setText("jTextField3");
        TXTNumDoc_Identidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNumDoc_IdentidadKeyTyped(evt);
            }
        });

        TXTDireccion.setText("jTextField4");

        TXTTelefono.setText("jTextField5");
        TXTTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTTelefonoKeyTyped(evt);
            }
        });

        TXTEmail.setText("jTextField6");

        Lb_CodigoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        Lb_CodigoEmpleado.setText("Lb_Codigo");
        Lb_CodigoEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Lb_CodigoEmpleado.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel18.setText("Nacionalidad:");

        CBO_Nacionalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Nacionalidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_NacionalidadItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel14.setText("Area:");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel19.setText("Cargo:");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel20.setText("Sueldo:");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel21.setText("Estado:");

        TXT_Area.setText("TXT_Area");

        TXT_Cargo.setText("TXT_Cargo");

        TXT_Sueldo.setText("TXT_Sueldo");

        TXT_Estado.setText("TXT_Sueldo");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 1, 14))); // NOI18N

        Lb_Foto.setBackground(new java.awt.Color(0, 51, 204));
        Lb_Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lb_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        BTNGuardar.setText("Guardar");
        BTNGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGuardarActionPerformed(evt);
            }
        });

        BTNCancelar.setText("Cancelar");
        BTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelarActionPerformed(evt);
            }
        });

        BTNNuevo.setText("Nuevo");
        BTNNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNNuevoActionPerformed(evt);
            }
        });

        Lb_Localizador.setText("Lb_Localizador");

        BTN_Examinar.setText("Examinar");
        BTN_Examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ExaminarActionPerformed(evt);
            }
        });

        BTN_Editar.setText("Editar");
        BTN_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EditarActionPerformed(evt);
            }
        });

        BTN_Salir.setText("Salir");
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

        jTable_RegistroEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_RegistroEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_RegistroEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_RegistroEmpleados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addGap(146, 146, 146))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel18)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTNumDoc_Identidad)
                            .addComponent(CBO_Tipo_Doc_Identidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lb_CodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBO_Nacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXTApellidos)
                            .addComponent(TXTNombres)
                            .addComponent(CBO_Departamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JDate_Fec_Nac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBO_Provincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBO_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel11)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel12))
                                            .addGap(4, 4, 4)))
                                    .addComponent(jLabel21))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(TXTEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(TXTTelefono)
                                    .addComponent(TXT_Area)
                                    .addComponent(TXT_Cargo)
                                    .addComponent(TXT_Sueldo)
                                    .addComponent(TXT_Estado))
                                .addGap(68, 68, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Lb_Localizador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BTN_Examinar)
                                        .addGap(42, 42, 42))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(BTNNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(BTNGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_Localizador)
                            .addComponent(BTN_Examinar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Salir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Lb_CodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(TXTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(JDate_Fec_Nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(CBO_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(CBO_Tipo_Doc_Identidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(TXT_Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(TXT_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(TXTNumDoc_Identidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(TXT_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CBO_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(CBO_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(CBO_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNNuevo)
                            .addComponent(BTNGuardar)
                            .addComponent(BTN_Editar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_RegistroEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_RegistroEmpleadosMouseClicked

          try {
              this.Cargar_Filas();
          } catch (ParseException ex) {
              Logger.getLogger(Registro_Empleado.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jTable_RegistroEmpleadosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Limpiar();
       AutoAjustar_Columnas();
        Cargar_Nacionalidad();
        Cargar_Departamento();
        Leer_Datos();
        Cargar_Doc_Identidad("<Seleccione>");
        //Cargar_OpcionesBusqueda();
        TotalFilas();
         this.Botones(true);
        this.Habilitar_Controles(false);
    }//GEN-LAST:event_formWindowOpened

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        //Declarar variable de tipo: Entero
        int Rpta;
        //Mostrar Mensaje de Confirmacion
        Rpta = JOptionPane.showConfirmDialog(null,"¿Desea Salir de la Ventana?", "Registro de Empleados",
            JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //'Evaluar Si se ha Pulsado el Botón: Si
        if (Rpta == 0)
        {
            //establecer el conjunto de filas o en el control.
            this.jTable_RegistroEmpleados.setRowSorter(null);
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

    private void BTN_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EditarActionPerformed

        this.Habilitar_Controles(true);
        this.Botones(false);

        this.BTNGuardar.setText("Actualizar");
    }//GEN-LAST:event_BTN_EditarActionPerformed

    private void BTN_ExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ExaminarActionPerformed
        //OBtener la ruta de la imagen
        String Ruta = new Registro_Empleado().ExaminarArchivo();

        //representar imagen
        ImageIcon img = new ImageIcon(Ruta);
        Icon Imagen = new ImageIcon(img.getImage().getScaledInstance(this.Lb_Foto.getWidth(),this.Lb_Foto.getHeight(), Image.SCALE_SMOOTH ));

        this.Lb_Localizador.setText(String.valueOf(Ruta));

        this.Lb_Foto.setIcon(Imagen);

        this.repaint();

        File FotoProducto = new File(System.getProperty("user.dir")+ "\\src\\Imagen_Empleados\\"+this.Lb_CodigoEmpleado.getText()+".jpg");

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

    private void BTNNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNNuevoActionPerformed
        // TODO add your handling code here:
        Limpiar();
        //Declarar una Variable de Tipo: String I
        String CodigoCliente="";

        //Declarar una Variable de Tipo: Entero

        int Codigo = Integer.parseInt(CodCliente.substring(1))+1;

        if (Codigo>0 && Codigo<10)
        {
            //Generar Código del Cliente
            CodigoCliente = "E000" + String.valueOf(Codigo);
        }
        else if (Codigo>=10 && Codigo <= 99)
        {
            //Generar Código del Cliente
            CodigoCliente = "E00" + String.valueOf (Codigo);
        }
        else if (Codigo>=100 && Codigo <= 999)
        {
            //Generar Código del Cliente
            CodigoCliente = "E0" + String.valueOf(Codigo);
        }
        else if (Codigo>=1000 && Codigo <= 9999)
        {
            //Generar Código del Cliente
            CodigoCliente = "E" + String.valueOf(Codigo);
        }
        //Mostrar Código del Cliente
        this.Lb_CodigoEmpleado.setText(CodigoCliente);

        this.Botones(false);
        this.Habilitar_Controles(true);
    }//GEN-LAST:event_BTNNuevoActionPerformed

    private void BTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelarActionPerformed
        this.BTNGuardar.setText("Guardar");
        this.Limpiar();
        this.Habilitar_Controles(false);
        this.Botones(true);
    }//GEN-LAST:event_BTNCancelarActionPerformed

    private void BTNGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGuardarActionPerformed

        this.Validar_Datos();

        this.Botones(true);

        this.Habilitar_Controles(false);
    }//GEN-LAST:event_BTNGuardarActionPerformed

    private void CBO_NacionalidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_NacionalidadItemStateChanged
        if(evt.getStateChange()== ItemEvent.SELECTED)
        {
            this.Cargar_Doc_Identidad(this.CBO_Nacionalidad.getSelectedItem().toString());
        }
    }//GEN-LAST:event_CBO_NacionalidadItemStateChanged

    private void TXTTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTelefonoKeyTyped
        char c = evt.getKeyChar();
        if(c <'0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_TXTTelefonoKeyTyped

    private void TXTNumDoc_IdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNumDoc_IdentidadKeyTyped
        char c = evt.getKeyChar();
        if(c <'0' || c >'9')
        evt.consume();
    }//GEN-LAST:event_TXTNumDoc_IdentidadKeyTyped

    private void TXTNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNombresKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
        evt.consume();
    }//GEN-LAST:event_TXTNombresKeyTyped

    private void TXTApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTApellidosKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
        evt.consume();
    }//GEN-LAST:event_TXTApellidosKeyTyped

    private void CBO_Tipo_Doc_IdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBO_Tipo_Doc_IdentidadActionPerformed

    }//GEN-LAST:event_CBO_Tipo_Doc_IdentidadActionPerformed

    private void CBO_ProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_ProvinciaItemStateChanged
        //Evaluar si se ha Seleccionado un Elemento de la Lista
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            //Invocar al Método: Cargar_Provincia
            this.Cargar_Distrito(this.CBO_Provincia.getSelectedItem().toString());
        }
    }//GEN-LAST:event_CBO_ProvinciaItemStateChanged

    private void CBO_DepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_DepartamentoItemStateChanged
        //Evaluar si se ha Seleccionado un Elemento de la Lista
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            //Invocar al Método: Cargar_Provincia
            this.Cargar_Provincia(this.CBO_Departamento.getSelectedItem().toString());
        }
    }//GEN-LAST:event_CBO_DepartamentoItemStateChanged
void AutoAjustar_Columnas()
{
    //Establecer Anchos de Columnas
    //Definir el Tamaño de cada Columna del control (jTable): jTable_RegistroNotas
    int [] Anchos = {60, 180, 140, 100, 100, 130, 160, 140, 140, 200, 240, 100, 150, 100,100,100,100,100};
    
    //Recorrer el Número de Columnas del Objeto (JTable): ]Table_RegistroNotas
    for (int Columna = 0; Columna < this.jTable_RegistroEmpleados.getColumnCount(); Columna++)
    {
    //Establecer el Ancho de Columna para cada Columna del JTable: JTable_RegistroNotas
    this.jTable_RegistroEmpleados.getColumnModel().getColumn(Columna).setPreferredWidth(Anchos[Columna]);
    }
    
    //Establecer el AutoRediseño de Tamaño del jTable en: AUTO_RESIZE_OFF
    this.jTable_RegistroEmpleados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    
    //Mostrar las barras de desplazamiento: Vertical y Horizontal
    this.jTable_RegistroEmpleados.setShowVerticalLines(true);
    this.jTable_RegistroEmpleados.setShowHorizontalLines(true);
}
 public void Limpiar()
    {
     this.JDate_Fec_Nac.setDate(null);
     this.TXTApellidos.setText("");
     this.TXTDireccion.setText("");
     this.TXTEmail.setText("");
     this.TXTNombres.setText("");
     this.TXTNumDoc_Identidad.setText("");
     this.TXTTelefono.setText("");
     //this.TXTConsultar_Datos.setText("");
     this.CBO_Nacionalidad.setSelectedIndex(0);
     this.CBO_Tipo_Doc_Identidad.setSelectedIndex(0);
     this.CBO_Departamento.setSelectedIndex(0);
     this.CBO_Provincia.setSelectedIndex(0);
     this.CBO_Distrito.setSelectedIndex(0);
     this.Lb_CodigoEmpleado.setText("");
     this.TXT_Cargo.setText("");
     this.TXT_Area.setText("");
     this.TXT_Estado.setText("");
     this.TXT_Sueldo.setText("");
     
     
     try
     { //Mostrar Fecha de Nacimiento: Fecha Actual - 18 Años
        Calendar Calendario = Calendar.getInstance();
        Calendario.add(Calendar.YEAR, -18);
        String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(Calendario.getTime());
        this.JDate_Fec_Nac.setDate(FormatoFecha.parse(Fecha));
     }
        catch (Exception Error)
        {
                }

    }    
     public String ExaminarArchivo()
   {
    //Declarar variable de Tipo: String
    String Ruta;
    //Filtrar Extension del Nombre del Archivo
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Imagen JPG", "jpg", "png");
    //Declarar variable (Selector de Archivo): CuadroDialogo
    JFileChooser CuadroDialogo = new JFileChooser();
    CuadroDialogo.setDialogTitle("Seleccionar Imagen de la persona");

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
     
     
//Crear el Método Local: Habilitar_Controles()
void Habilitar_Controles (boolean Valor)
{
//Establecer Propiedad: Habilitar/Deshabilitar (true/false)
    this.TXTApellidos.setEnabled(Valor);
    this.TXTNombres.setEnabled(Valor);
    this.JDate_Fec_Nac.setEnabled(Valor);
    this.CBO_Nacionalidad.setEnabled(Valor);
    this.CBO_Tipo_Doc_Identidad.setEnabled(Valor);
    this.TXTNumDoc_Identidad.setEnabled(Valor);
    this.CBO_Departamento.setEnabled(Valor);
    this.CBO_Provincia.setEnabled(Valor);
    this.CBO_Distrito.setEnabled(Valor);
    this.TXTDireccion.setEnabled(Valor);
    this.TXTTelefono.setEnabled(Valor);
    this.TXTEmail.setEnabled(Valor);
}
    
void Botones(boolean valor)
{
    this.BTNNuevo.setEnabled(valor);
    this.BTNGuardar.setEnabled(!valor);
    this.BTNCancelar.setEnabled(!valor);
    this.BTN_Editar.setEnabled(valor);
   // this.BTN_Eliminar.setEnabled(valor);
    //this.BTNLimpiar.setEnabled(valor);
    this.BTN_Salir.setEnabled(valor);
}

//Crear el Método Local: Cargar_Nacionalidad()
void Cargar_Nacionalidad()
{
    //Limpiar todos los Elementos del ComboBox: CBO_Nacionalidad
   this.CBO_Nacionalidad.removeAllItems();
   //Agregar un Primer Elemento al ComboBox: CBO_Nacionalidad
   this.CBO_Nacionalidad.addItem("<Seleccione>");
   //Invocar al Método: Leer_Nacionalidad
   ObjPersona.Leer_Nacionalidad(DirectorioNacionalidad);
   //Recorrer los Elementos de la Matriz: MatrizNacionalidad
   for (int Fila = 0; Fila < ObjPersona.MatrizNacionalidad.length; Fila++)
   {
   //Agregar Datos al Control: CBO_Nacionalidad
   this.CBO_Nacionalidad.addItem(ObjPersona.MatrizNacionalidad[Fila][0]);
   }
}

    
void Cargar_Doc_Identidad(String Nacionalidad)
{
    this.CBO_Tipo_Doc_Identidad.removeAllItems();
    this.CBO_Tipo_Doc_Identidad.addItem("<Seleccione>");
    
     
    //Invocar al metodo
    ObjCliente.Leer_Documentos_Identidad(DirectorioDocIdentidad);
    
    if(Nacionalidad.equals("Peruana"))
    {
    //Recorrer los Elemntos de la matriz:MatrizDocumentosidentidad
     for (int Fila = 0; Fila < ObjCliente.MatrizDocumentosidentidad.length; Fila++)
     {
        if (ObjCliente.MatrizDocumentosidentidad[Fila][0].substring(0, 6).equals("D.N.I.") ||
               ObjCliente.MatrizDocumentosidentidad[Fila][0].substring(0, 6).equals("R.U.C."))
        {
        //Agregar Datos al Control: CBO_Documentoldentidad
        this.CBO_Tipo_Doc_Identidad.addItem(ObjCliente.MatrizDocumentosidentidad[Fila][0]);
        }
     }
    }
    else if (!"<Seleccione>".equals(Nacionalidad))
    {
        //Recorrer los Elementos de la Matriz: MatrizDocumentosidentidad
        for (int Fila = 0; Fila < ObjCliente.MatrizDocumentosidentidad.length; Fila++)
        {
        if (!"D.N.I.".equals(ObjCliente.MatrizDocumentosidentidad[Fila][0].substring(0, 6)) &&
        !"R.U.C.".equals(ObjCliente.MatrizDocumentosidentidad[Fila][0].substring(0, 6)))
        {
        //Agregar Datos al Control: CBO_Documentoldentidad
        this.CBO_Tipo_Doc_Identidad.addItem(ObjCliente.MatrizDocumentosidentidad[Fila][0]);
        }
        }
    }

}

//Crear Método Local: Cargar_Departamento
void Cargar_Departamento()
{
    //Limpiar todos los Elementos del ComboBox: CBO_Departamento
    this.CBO_Departamento.removeAllItems();
    //Agregar un Primer Elemento al ComboBox: CBO_Departamento
    this.CBO_Departamento.addItem("<Seleccione>");

    //Invocar al Método: Leer_Departamentos
    ObjPersona.Leer_Departamentos(DirectorioDepartamento);
    
    //Recorrer los Elementos de la Matriz: MatrizDepartamento
     for (int i = 0; i < ObjPersona.MatrizDepartamento.length; i++)
     {
         //Agregar Datos al Control: CBO_Departamento
      this.CBO_Departamento.addItem(ObjPersona.MatrizDepartamento[i][0]);
     }
}

void Cargar_Provincia(String NombreDepartamento)
{
    //Limpiar todos los Elementos del ComboBox: CBO_Departamento
    this.CBO_Provincia.removeAllItems();
    
    //Agregar un Primer Elemento al ComboBox: CBO_Departamento
    this.CBO_Provincia.addItem("<Seleccione>");
    
            //Invocar al Método: Leer_Provincia
          ObjPersona.Leer_Provincia(DirectorioProvincia);  
    
     //Recorrer los Elementos de la Matriz: MatrizDepartamento
     for (int i = 0; i < ObjPersona.MatrizProvincia.length; i++)
     {
       if(ObjPersona.MatrizProvincia[i][1].equals(NombreDepartamento))  
       {
         //Agregar Datos al Control: CBO_Departamento
        this.CBO_Provincia.addItem(ObjPersona.MatrizProvincia[i][0]);
       }
     }
    
}

void Cargar_Distrito(String NombreProvincia)
{
    //Limpiar todos los Elementos del ComboBox: CBO_Departamento
    this.CBO_Distrito.removeAllItems();
    //Agregar un Primer Elemento al ComboBox: CBO_Departamento
    this.CBO_Distrito.addItem("<Seleccione>");
    
     //distrito
     ObjPersona.Leer_Distrito(DirectorioDistrito);
          
    //Recorrer los Elementos de la Matriz: MatrizDistrito
    for (int Fila = 0; Fila < ObjPersona.MatrizDistrito.length; Fila++)
    {
    if (ObjPersona.MatrizDistrito[Fila][1].equals(NombreProvincia))
    {
    //Agregar Datos al Control: CBO_Distrito
    this.CBO_Distrito.addItem(ObjPersona.MatrizDistrito[Fila][0]); // 0 Es la Columna de la Provincia
    }
    }
}
   void Leer_Datos()
{    
    
     //Instanciar la Clase: Cliente, a través de un Objeto
      Empleado ObjEmpleado = new Empleado("","","","","","","","","","","","","","","","","","");
    
    ObjEmpleado.Leer_Empleado(DirectorioEmpleado);
     
    try
     {

    //Crear Estructura Repetitiva (Bucle): while (Leer lineas del archivo)
        for (int i = 0; i < ObjEmpleado.MatrizEmpleado.length; i++)
        {
        //Leer Datos de la Matriz de Datos
        System.out.println();
        
        //Agregar Filas al Modelo de Datos del JTable.
            Modelo.addRow(new Object[] {ObjEmpleado.MatrizEmpleado[i][0],
                                        ObjEmpleado.MatrizEmpleado[i][1],
                                        ObjEmpleado.MatrizEmpleado[i][2],
                                        ObjEmpleado.MatrizEmpleado[i][3],
                                        ObjEmpleado.MatrizEmpleado[i][4],
                                        ObjEmpleado.MatrizEmpleado[i][5],
                                        ObjEmpleado.MatrizEmpleado[i][6],
                                        ObjEmpleado.MatrizEmpleado[i][7],
                                        ObjEmpleado.MatrizEmpleado[i][8],
                                        ObjEmpleado.MatrizEmpleado[i][9],
                                        ObjEmpleado.MatrizEmpleado[i][10],
                                        ObjEmpleado.MatrizEmpleado[i][11],
                                        ObjEmpleado.MatrizEmpleado[i][12],
                                        ObjEmpleado.MatrizEmpleado[i][13],
                                        ObjEmpleado.MatrizEmpleado[i][14],
                                        ObjEmpleado.MatrizEmpleado[i][15],
                                        ObjEmpleado.MatrizEmpleado[i][16],
                                        ObjEmpleado.MatrizEmpleado[i][17]});

        
          }  
       
          int Fila = ObjEmpleado.MatrizEmpleado.length;

          if (Fila > 0) {
             CodCliente = ObjEmpleado.MatrizEmpleado[Fila -1][0];
          }
          else
          {
             CodCliente = "E0000";  
          }
      }
     catch(Exception Error)
      {
             CodCliente = "E0000";
      } 
 
}
void Cargar_Filas() throws ParseException 
{
       String Foto;
    int Seleccion = this.jTable_RegistroEmpleados.getSelectedRow();
    
    //Cargar datos en los controles
    this.Lb_CodigoEmpleado.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 0).toString());
    this.TXT_Area.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 1).toString());
    this.TXT_Cargo.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 2).toString());
    this.TXT_Sueldo.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 3).toString());
    this.TXT_Estado.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 4).toString());
    this.TXTApellidos.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 5).toString());
    this.TXTNombres.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 6).toString());
    this.JDate_Fec_Nac.setDate(FormatoFecha.parse(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 7).toString()));
    this.CBO_Nacionalidad.setSelectedItem(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 8).toString());
    this.CBO_Tipo_Doc_Identidad.setSelectedItem(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 9).toString());
    this.TXTNumDoc_Identidad.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 10).toString());
    this.CBO_Departamento.setSelectedItem(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 11).toString());
    this.CBO_Provincia.setSelectedItem(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 12).toString());
    this.CBO_Distrito.setSelectedItem(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 13).toString());
    this.TXTDireccion.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 14).toString());
    this.TXTTelefono.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 15).toString());
    this.TXTEmail.setText(this.jTable_RegistroEmpleados.getValueAt(Seleccion, 16).toString());
    Foto = this.jTable_RegistroEmpleados.getValueAt(Seleccion, 17).toString();
    Filas = Seleccion;
    
    if(!Foto.equals("")||Foto!=null)
    {
        this.Mostar_Imagen(Foto);
    }
}
 void Mostar_Imagen(String Imagen)
   {
        //mpostar imagen
      ImageIcon Foto = new ImageIcon("src/Imagen_Empleados/"+ Imagen);
      
      Icon Icono = new ImageIcon(Foto.getImage().getScaledInstance(this.Lb_Foto.getWidth(), this.Lb_Foto.getHeight(),
                                                                  Image.SCALE_DEFAULT));
      
      //asiganr la imagen
      this.Lb_Foto.setIcon(Icono);
      
      this.repaint();
   }

//crear metodo agregar registro
void Agregar_Registro()
{
    String [] InfoEmpleados = new String[18];
    
    InfoEmpleados[0]= this.Lb_CodigoEmpleado.getText();
    InfoEmpleados[1]= this.TXT_Area.getText();
    InfoEmpleados[2]= this.TXT_Cargo.getText();
    InfoEmpleados[3]= this.TXT_Sueldo.getText();
    InfoEmpleados[4]= this.TXT_Estado.getText();
    InfoEmpleados[5]= this.TXTApellidos.getText();
    InfoEmpleados[6]= this.TXTNombres.getText();
    InfoEmpleados[7]= FormatoFecha.format(this.JDate_Fec_Nac.getDate());
    InfoEmpleados[8]= this.CBO_Nacionalidad.getSelectedItem().toString();
    InfoEmpleados[9]= this.CBO_Tipo_Doc_Identidad.getSelectedItem().toString();
    InfoEmpleados[10]= this.TXTNumDoc_Identidad.getText();
    InfoEmpleados[11]= this.CBO_Departamento.getSelectedItem().toString();
    InfoEmpleados[12]= this.CBO_Provincia.getSelectedItem().toString();
    InfoEmpleados[13]= this.CBO_Distrito.getSelectedItem().toString();
    InfoEmpleados[14]= this.TXTDireccion.getText();
    InfoEmpleados[15]= this.TXTTelefono.getText();
    InfoEmpleados[16]= this.TXTEmail.getText();
    InfoEmpleados[17]= this.Lb_Foto.getText();
    
    
       //ESTO VA EN AGREGAR VEHICYLO
     //Evaluar si el Icono del control Label es Nulo (Vacio)
     if (this.Lb_Foto.getIcon() == null)
     {
     //WAsignar Valor "null" en el Vector de Datos
     InfoEmpleados[17] = "null";
    }
      else
    {
    //"Asignar Nombre de la Fotografia, según el Nombrel de Código del + ".jpg"
    InfoEmpleados[17] = this.Lb_CodigoEmpleado.getText()+".jpg";
    } 
    //ingresar los datos a la tabla
    Modelo.addRow(InfoEmpleados);
    
    JOptionPane.showMessageDialog(null,"Registro Guardado con exito", this.getTitle(),
                                 JOptionPane.INFORMATION_MESSAGE);
    CodCliente = InfoEmpleados[0];
    
    this.TXTApellidos.requestFocus();
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
int Fila = this.jTable_RegistroEmpleados.getSelectedRow();
//Establecer Valores en el Control
this.jTable_RegistroEmpleados.setValueAt(this.Lb_CodigoEmpleado.getText(), Fila, 0);
this.jTable_RegistroEmpleados.setValueAt(this.TXT_Area.getText(),Fila,1);
this.jTable_RegistroEmpleados.setValueAt(this.TXT_Cargo.getText(),Fila,2);
this.jTable_RegistroEmpleados.setValueAt(this.TXT_Sueldo.getText(),Fila,3);
this.jTable_RegistroEmpleados.setValueAt(this.TXT_Estado.getText(),Fila,4);
this.jTable_RegistroEmpleados.setValueAt(this.TXTApellidos.getText(),Fila,5);
this.jTable_RegistroEmpleados.setValueAt(this.TXTNombres.getText(),Fila,6);
this.jTable_RegistroEmpleados.setValueAt(this.Fecha(JDate_Fec_Nac),Fila,7);
this.jTable_RegistroEmpleados.setValueAt(this.CBO_Nacionalidad.getSelectedItem().toString(),Fila,8);
this.jTable_RegistroEmpleados.setValueAt(this.CBO_Tipo_Doc_Identidad.getSelectedItem().toString(),Fila,9);
this.jTable_RegistroEmpleados.setValueAt(this.TXTNumDoc_Identidad.getText(),Fila,10);
this.jTable_RegistroEmpleados.setValueAt(this.CBO_Departamento.getSelectedItem().toString(),Fila,11);
this.jTable_RegistroEmpleados.setValueAt(this.CBO_Provincia.getSelectedItem().toString(),Fila,12);
this.jTable_RegistroEmpleados.setValueAt(this.CBO_Distrito.getSelectedItem().toString(),Fila,13);
this.jTable_RegistroEmpleados.setValueAt(this.TXTDireccion.getText(),Fila,14);
this.jTable_RegistroEmpleados.setValueAt(this.TXTTelefono.getText(),Fila,15);
this.jTable_RegistroEmpleados.setValueAt(this.TXTEmail.getText(),Fila,16);
this.jTable_RegistroEmpleados.setValueAt(this.Lb_CodigoEmpleado.getText()+".jpg",Fila,17);

}

}

private String Fecha(JDateChooser ControlCalendario)
{
//Declarar Variables de Tipo: String
String CDia, CMes, Fecha;
//Declarar varibales de Tipo: Entero
int dia, mes, year;
dia = ControlCalendario.getCalendar().get(Calendar.DAY_OF_MONTH);
mes = ControlCalendario.getCalendar().get(Calendar.MONTH)+1;
year = ControlCalendario.getCalendar().get(Calendar.YEAR);
//Evaluar si el Día está entre 1 y 9
if (dia>=1 && dia<10)
{
//Colocar Dia de 2 Digitos, convertido a String
CDia = "0" + String.valueOf (dia);
}
else
{
CDia = String.valueOf (dia);
}

if(mes>=1 && mes<10)
{
 CMes = "0" + String.valueOf (mes);      
}
else
{
  CMes = String.valueOf (mes);   
}

Fecha = CDia + "/"+ CMes+ "/"+ String.valueOf(year);

return Fecha;
}

//Crear el Método: Validar_Datos()
void Validar_Datos()
{
    int Contador = 0;
    
    String NumDni="";
    
    //Evaluar si el Texto del Boton: BTN_Guardar es igual al Texto: GUARDAR
    if(this.BTNGuardar.getText().toUpperCase().equals("GUARDAR"))
    {
          
     if (this.jTable_RegistroEmpleados.getRowCount() == 0)
     {
        Contador = 0;
     }
     else
     {
        //Recorrer los Elementos del Control JTable
        for (int i = 0; i < this.jTable_RegistroEmpleados.getRowCount(); i++)
        {
            //Capturar la Descripción del Producto
            NumDni = this.jTable_RegistroEmpleados.getValueAt(i, 9).toString(); // 9 Columna: Descripcion    
            

             //MEvaluar si la Descripción del Producto Existe
            if (this.TXTNumDoc_Identidad.getText().equals(NumDni))
            {
            //Mostrar Mensaje de Error
            JOptionPane.showMessageDialog(null, "El numero de Dni: " + this.TXTNumDoc_Identidad.getText() +", ya se encunetra registrado ",
                                          this.getTitle(), JOptionPane.ERROR_MESSAGE);

            this.TXTNumDoc_Identidad.requestFocus();

            Contador++;

            //fin de poroceso 
              break;
            }
        }
     }
  }
    
   if(this.BTNGuardar.getText().toUpperCase().equals("ACTUALIZAR")) 
   {
       //obtenr eo numero de filas \
       int Fila = this.jTable_RegistroEmpleados.getSelectedRow();
       
       
       //Capturar la num dni
         NumDni = this.jTable_RegistroEmpleados.getValueAt(Fila,9).toString(); // 6 Columna: dni
                 
       //capturar la descripcion del producto
       if(this.TXTNumDoc_Identidad.getText().equals(NumDni))
       {
                  Contador = 0; 
       }
       else
       {
         //Recorrer Elementos del Control: JTable
         for(int i = 0 ; i < this.jTable_RegistroEmpleados.getRowCount(); i++)
         {
             
             //Capturar la num dni
         NumDni = this.jTable_RegistroEmpleados.getValueAt(i,9).toString(); // 6 Columna: dni
         
         //Evaluar si la dni Existe
         if (this.TXTNumDoc_Identidad.getText().equals(NumDni))
         {
             
             
         //Mostrar Mensaje de Error
         JOptionPane.showMessageDialog(null, "EL Numero de Documento; " + this.TXTNumDoc_Identidad.getText() + ", ya se encuentra Registrado",
         this.getTitle(), JOptionPane.ERROR_MESSAGE);
         
         //Ubicar Cursor en el Cursor
         this.TXTNumDoc_Identidad.requestFocus();
         
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
       if(this.BTNGuardar.getText().equalsIgnoreCase("GUARDAR"))

       {
          this.Agregar_Registro();
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
       this.BTNGuardar.setText("Guardar");
   }
}

//Crear el Método Local: Guardar_Fichero()
void Guardar_Fichero()
{
    DefaultTableModel Modelo = (DefaultTableModel) jTable_RegistroEmpleados.getModel();

//Recorrer Filas del Modelo de Datos del Control: jTable
    try (

//Establecer Ruta del Archivo de Texto a Escribir la Secuencia de Datos
            FileWriter Guardar = new FileWriter(DirectorioEmpleado)) {
        //Recorrer Filas del Modelo de Datos del Control: jTable
        for (int i=0; i < this.jTable_RegistroEmpleados.getRowCount(); i++)
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
            Guardar.write(Modelo.getValueAt(i,13).toString()+"\n");//13
            Guardar.write(Modelo.getValueAt(i,14).toString()+"\n");//14
            Guardar.write(Modelo.getValueAt(i,15).toString()+"\n");//15
            Guardar.write(Modelo.getValueAt(i,16).toString()+"\n");//16
            Guardar.write(Modelo.getValueAt(i,17).toString()+"\n");//17
 }
}
catch(Exception Error)
  {
          Error.printStackTrace(); // Esto imprime el error exacto en la consola
    JOptionPane.showMessageDialog(null, 
        "Error: 1056\n" + Error.toString(), 
        this.getTitle(), 
        JOptionPane.ERROR_MESSAGE);
      JOptionPane.showMessageDialog(null, "Error: 1307 "+ Error.getMessage(),this.getTitle(),JOptionPane.ERROR_MESSAGE);
  }
}

void TotalFilas()
{
    int NumFilas = this.jTable_RegistroEmpleados.getRowCount();
   // this.Lb_Num_Registro.setText(""+NumFilas);
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
            java.util.logging.Logger.getLogger(Registro_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Empleado().setVisible(true);
             
                Registro_Empleado miVentana = new Registro_Empleado();
            miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            miVentana.setExtendedState(JFrame.MAXIMIZED_BOTH); // Pantalla completa
            miVentana.setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton BTNGuardar;
    private javax.swing.JButton BTNNuevo;
    private javax.swing.JButton BTN_Editar;
    private javax.swing.JButton BTN_Examinar;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JComboBox CBO_Departamento;
    private javax.swing.JComboBox CBO_Distrito;
    private javax.swing.JComboBox CBO_Nacionalidad;
    private javax.swing.JComboBox CBO_Provincia;
    private javax.swing.JComboBox CBO_Tipo_Doc_Identidad;
    private com.toedter.calendar.JDateChooser JDate_Fec_Nac;
    private javax.swing.JLabel Lb_CodigoEmpleado;
    private javax.swing.JLabel Lb_Foto;
    private javax.swing.JLabel Lb_Localizador;
    private javax.swing.JTextField TXTApellidos;
    private javax.swing.JTextField TXTDireccion;
    private javax.swing.JTextField TXTEmail;
    private javax.swing.JTextField TXTNombres;
    private javax.swing.JTextField TXTNumDoc_Identidad;
    private javax.swing.JTextField TXTTelefono;
    private javax.swing.JTextField TXT_Area;
    private javax.swing.JTextField TXT_Cargo;
    private javax.swing.JTextField TXT_Estado;
    private javax.swing.JTextField TXT_Sueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_RegistroEmpleados;
    // End of variables declaration//GEN-END:variables
}
