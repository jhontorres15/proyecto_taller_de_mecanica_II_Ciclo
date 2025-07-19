
package Formularios;

import DAL.Clientes;
import DAL.Persona;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Registro_Clientes extends javax.swing.JFrame {
    
    DefaultTableModel Modelo;
    
     //Declarar variable de tipo: Entero
    int Codigo=1, Filas;
    
    //Establecer el Directorio del Proyecto, donde se desea guardar el Archivo de Texto
    String DirectorioCliente = new File("src/Archivo_Datos/Registro_Clientes.txt").getAbsolutePath();
    String DirectorioNacionalidad = new File("src/Archivo_Datos/Registro_Nacionalidad.txt").getAbsolutePath();
    String DirectorioDocIdentidad = new File("src/Archivo_Datos/Registro_Documentos_Identidad.txt").getAbsolutePath();
    String DirectorioDepartamento = new File("src/Archivo_Datos/Registro_Departamentos.txt").getAbsolutePath();
    String DirectorioProvincia = new File("src/Archivo_Datos/Registro_Provincias.txt").getAbsolutePath();
    String DirectorioDistrito = new File("src/Archivo_Datos/Registro_Distritos.txt").getAbsolutePath();
    
    Persona ObjPersona = new Persona("","","","","","","","","","","","");
    Persona ObjCliente = new Persona("","","","","","","","","","","","");

    SimpleDateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    
    String CodCliente;
    
    TableRowSorter TFiltroFila;
    
    public Registro_Clientes() {
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
        Modelo.addColumn("Estado del Cliente");
        
        //Establecer el Modelo al Control: jTable_RegistroClientes
        this.jTable_RegistroClientes.setModel(Modelo);
   
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
        Lb_Codigo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        RBTN_Registrado = new javax.swing.JRadioButton();
        RBTN_Anulado = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        CBO_Nacionalidad = new javax.swing.JComboBox();
        JDate_Fec_Nac = new com.toedter.calendar.JDateChooser();
        BTNNuevo = new javax.swing.JButton();
        BTNGuardar = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Lb_Num_Registro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        CBO_CampoBuscar = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        TXTConsultar_Datos = new javax.swing.JTextField();
        BTN_Limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_RegistroClientes = new javax.swing.JTable();
        BTN_Eliminar = new javax.swing.JButton();
        BTN_Salir = new javax.swing.JButton();
        BTN_Editar = new javax.swing.JButton();
        BTNLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 1, 14))); // NOI18N

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
        TXTApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTApellidosFocusLost(evt);
            }
        });
        TXTApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTApellidosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTApellidosKeyTyped(evt);
            }
        });

        TXTNombres.setText("jTextField2");
        TXTNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTNombresFocusLost(evt);
            }
        });
        TXTNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNombresKeyTyped(evt);
            }
        });

        TXTNumDoc_Identidad.setText("jTextField3");
        TXTNumDoc_Identidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTNumDoc_IdentidadFocusLost(evt);
            }
        });
        TXTNumDoc_Identidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNumDoc_IdentidadKeyTyped(evt);
            }
        });

        TXTDireccion.setText("jTextField4");
        TXTDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTDireccionKeyPressed(evt);
            }
        });

        TXTTelefono.setText("jTextField5");
        TXTTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTTelefonoFocusLost(evt);
            }
        });
        TXTTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTTelefonoKeyTyped(evt);
            }
        });

        TXTEmail.setText("jTextField6");

        Lb_Codigo.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Codigo.setText("Lb_Codigo");
        Lb_Codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Lb_Codigo.setOpaque(true);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel16.setText("Estado Cliente:");

        RBTN_Registrado.setText("Registrado");

        RBTN_Anulado.setText("Anulado");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel18.setText("Nacionalidad:");

        CBO_Nacionalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_Nacionalidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_NacionalidadItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTNumDoc_Identidad)
                            .addComponent(CBO_Tipo_Doc_Identidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBO_Departamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBO_Provincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBO_Distrito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXTDireccion)
                            .addComponent(TXTTelefono)
                            .addComponent(TXTEmail)
                            .addComponent(TXTNombres)
                            .addComponent(CBO_Nacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lb_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JDate_Fec_Nac, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(TXTApellidos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBTN_Registrado)
                        .addGap(18, 18, 18)
                        .addComponent(RBTN_Anulado)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Lb_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(CBO_Tipo_Doc_Identidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TXTNumDoc_Identidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CBO_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CBO_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CBO_Distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TXTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TXTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(RBTN_Registrado)
                    .addComponent(RBTN_Anulado))
                .addContainerGap())
        );

        BTNNuevo.setText("Nuevo");
        BTNNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNNuevoActionPerformed(evt);
            }
        });

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

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Busqueda de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seleccione el campo de consuta:");

        CBO_CampoBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBO_CampoBuscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBO_CampoBuscarItemStateChanged(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ingrese Dato a consultar:");

        TXTConsultar_Datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTConsultar_DatosKeyReleased(evt);
            }
        });

        BTN_Limpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBO_CampoBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TXTConsultar_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_Limpiar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBO_CampoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTConsultar_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_RegistroClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_RegistroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_RegistroClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_RegistroClientes);

        BTN_Eliminar.setText("Eliminar");

        BTN_Salir.setText("Salir");
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

        BTN_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Editar.png"))); // NOI18N
        BTN_Editar.setText("Editar");
        BTN_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EditarActionPerformed(evt);
            }
        });

        BTNLimpiar.setText("Limpiar");

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro de Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(514, 514, 514)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BTN_Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BTNLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTNNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTNGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTNCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BTN_Salir)
                                        .addGap(54, 54, 54)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_Editar)
                            .addComponent(BTN_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(BTNNuevo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNGuardar)
                            .addComponent(BTNCancelar)
                            .addComponent(BTN_Salir))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        jPanel6.getAccessibleContext().setAccessibleName("Foto");

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void Validar_Longitud_Datos (JTextField Control, String Campo, String Texto) 
    { 
        //Declarar Variables 
        int NumMinimo=0, NumMaximo=0; 
         
        if (Campo != "<Seleccione>") 
        { 
            //Evaluar si el Texto convertido a Mayusculas es igual a la Cadena: D.N.I. 
            if (Campo.substring(0, 6).toUpperCase().equals("D.N.I.")) 
            {             
                //Establecer Número Mínimo y Máximo de Caracteres 
                NumMinimo = 8; NumMaximo = 8; 
            } 
            //Evaluar si el Texto convertido a Mayusculas es igual a la Cadena: R.U.C. 
            else if (Campo.substring(0, 6).toUpperCase().equals("R.U.C.")) 
            {             
                //Establecer Número Mínimo y Máximo de Caracteres 
                NumMinimo = 11; NumMaximo = 11; 
            } 
            //Evaluar si el Texto convertido en Mayúsculas es igual a la Cadena: TELEFONO 
            else if (Campo.toUpperCase().equals("TELÉFONO")) 
            { 
                //Establecer Número Mínimo y Máximo de Caracteres 
                NumMinimo = 7; NumMaximo = 9; 
            } 
            else 
            { 
                //Establecer Número Máximo de Caracteres 
                NumMinimo = 12; NumMaximo = 12;                 
            } 
         
            //Evaluar si la Longitud del Texto es Mayor a Cero y Menor al Número Mínimo de Caracteres 
            if (Texto.length()>0 && Texto.length()<NumMinimo) 
            { 
                //Mostrar Mensaje de Error 
                JOptionPane.showMessageDialog(null, "Faltan Dígitos en el Campo: " + 
        Campo.toUpperCase() , this.getTitle(), JOptionPane.ERROR_MESSAGE); 
             
                //Ubicar Cursor en el Control: JTextField 
                Control.requestFocus(); 
            }  
            else if (Texto.length()>NumMaximo) 
            { 
                //Mostrar Mensaje de Error 
            JOptionPane.showMessageDialog(null, "Excede el N° de Dígitos en el Campo: " + 
            Campo.toUpperCase() , this.getTitle(), JOptionPane.ERROR_MESSAGE); 
                //Ubicar Cursor en el Control: JTextField 
                Control.requestFocus(); 
            } 
        } 
        else 
        { 
            //Mostrar Mensaje de Advertencia 
            JOptionPane.showMessageDialog(null, "Seleccione Primero el Tipo de Documento de Identidad del Cliente", this.getTitle(), JOptionPane.WARNING_MESSAGE); 
             
            //Limpiar Texto 
            Control.setText(""); 
             
            //Ubicar Cursor en Control 
            this.CBO_Tipo_Doc_Identidad.requestFocus(); 
        } 
    } 
    
    //Crear el Método Local: Cambiar Cursor[)
void Cambiar_Cursor(java.awt.event.KeyEvent evento, javax.swing.JTextField CajaTexto)
{
//Evaluar si se ha presionado la Tecla: Enter o la Tab (Tabulación)
if (evento.getKeyCode() == KeyEvent.VK_ENTER | evento.getKeyCode() == KeyEvent.VK_TAB)
//Ubicar Cursor en el Control: JTextField
CajaTexto.requestFocus();

 }

void Mensaje_Validacion(String Mensaje)
{
    JOptionPane.showMessageDialog(null, Mensaje, this.getTitle(),JOptionPane.WARNING_MESSAGE);
}

 //Crear Método Local: Convertir_TextoMayusculas() 
 void Convertir_TextoMayusculas(javax.swing.JTextField CajaTexto) 
    { 
        //Convertir Texto a Mayúsculas de Control: CajaTexto 
        CajaTexto.setText(CajaTexto.getText().toUpperCase()); 
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
    this.BTN_Eliminar.setEnabled(valor);
    this.BTNLimpiar.setEnabled(valor);
    this.BTN_Salir.setEnabled(valor);
}

//Crear el Método Local: Cargar_OpcionesBusqueda()
void Cargar_OpcionesBusqueda()
{
//Limpiar todos los Elementos del ComBox: CBO_CampoBuscar
    this.CBO_CampoBuscar.removeAllItems();
    //Agregar un Primer Elemento al ComboBox: CBO_CampoBuscar
    this.CBO_CampoBuscar.addItem("<Seleccione>");
    this.CBO_CampoBuscar.addItem("Apellidos");
    this.CBO_CampoBuscar.addItem("Nombres");
    this.CBO_CampoBuscar.addItem("Nacionalidad");
    this.CBO_CampoBuscar.addItem("Nº de Documento de Identidad");
    this.CBO_CampoBuscar.addItem("Distrito");
    this.CBO_CampoBuscar.addItem("Dirección");
    this.CBO_CampoBuscar.addItem("Estado del Cliente");
}
void Cargar_Nacionalidad()
{
    // Paso 1: Limpiar todos los elementos existentes del ComboBox llamado CBO_Nacionalidad
    // Esto asegura que el combo no tenga datos duplicados ni antiguos antes de recargar los nuevos.
    this.CBO_Nacionalidad.removeAllItems();

    // Paso 2: Agregar un primer elemento fijo al ComboBox como opción por defecto.
    // "<Seleccione>" es una opción genérica que indica al usuario que debe elegir una nacionalidad.
    this.CBO_Nacionalidad.addItem("<Seleccione>");

    // Paso 3: Llamar al método Leer_Nacionalidad del objeto ObjPersona
    // Este método debería cargar los datos de nacionalidades desde un archivo o base de datos,
    // y guardarlos en la matriz ObjPersona.MatrizNacionalidad.
    ObjPersona.Leer_Nacionalidad(DirectorioNacionalidad);

    // Paso 4: Recorrer la matriz de nacionalidades cargada para llenar el ComboBox
    // La matriz contiene los datos de nacionalidades (una por fila).
    for (int Fila = 0; Fila < ObjPersona.MatrizNacionalidad.length; Fila++)
    {
        // Agregar cada nacionalidad al ComboBox. Se asume que están en la primera columna (índice 0).
        this.CBO_Nacionalidad.addItem(ObjPersona.MatrizNacionalidad[Fila][0]);
    }
}

    
void Cargar_Doc_Identidad(String Nacionalidad)
{
    // Paso 1: Limpiar todos los elementos actuales del ComboBox CBO_Tipo_Doc_Identidad
    this.CBO_Tipo_Doc_Identidad.removeAllItems();

    // Paso 2: Agregar un primer elemento como opción por defecto
    this.CBO_Tipo_Doc_Identidad.addItem("<Seleccione>");
    
    // Paso 3: Llamar al método que carga los documentos de identidad desde un archivo o base de datos
    // Los datos se guardan en una matriz (MatrizDocumentosidentidad) del objeto ObjCliente
    ObjCliente.Leer_Documentos_Identidad(DirectorioDocIdentidad);
    
    // Paso 4: Si la nacionalidad seleccionada es "Peruana", se muestran solo D.N.I. y R.U.C.
    if(Nacionalidad.equals("Peruana"))
    {
        for (int Fila = 0; Fila < ObjCliente.MatrizDocumentosidentidad.length; Fila++)
        {
            // Evaluar si el documento empieza con "D.N.I." o "R.U.C."
            if (ObjCliente.MatrizDocumentosidentidad[Fila][0].substring(0, 6).equals("D.N.I.") ||
                ObjCliente.MatrizDocumentosidentidad[Fila][0].substring(0, 6).equals("R.U.C."))
            {
                // Agregar solo esos documentos al ComboBox
                this.CBO_Tipo_Doc_Identidad.addItem(ObjCliente.MatrizDocumentosidentidad[Fila][0]);
            }
        }
    }
    // Paso 5: Si es una nacionalidad diferente a "<Seleccione>", se excluyen D.N.I. y R.U.C.
    else if (!"<Seleccione>".equals(Nacionalidad))
    {
        for (int Fila = 0; Fila < ObjCliente.MatrizDocumentosidentidad.length; Fila++)
        {
            // Agregar documentos diferentes a "D.N.I." y "R.U.C."
            if (!"D.N.I.".equals(ObjCliente.MatrizDocumentosidentidad[Fila][0].substring(0, 6)) &&
                !"R.U.C.".equals(ObjCliente.MatrizDocumentosidentidad[Fila][0].substring(0, 6)))
            {
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
    // Paso 1: Limpiar todos los elementos actuales del ComboBox CBO_Distrito
    this.CBO_Distrito.removeAllItems();

    // Paso 2: Agregar un primer elemento por defecto para que el usuario seleccione
    this.CBO_Distrito.addItem("<Seleccione>");
    
    // Paso 3: Llamar al método que lee los distritos desde un archivo o base de datos
    // Los datos se guardan en una matriz (MatrizDistrito) del objeto ObjPersona
    ObjPersona.Leer_Distrito(DirectorioDistrito);
          
    // Paso 4: Recorrer todos los registros de la matriz de distritos
    for (int Fila = 0; Fila < ObjPersona.MatrizDistrito.length; Fila++)
    {
        // Verificar si el distrito pertenece a la provincia seleccionada
        if (ObjPersona.MatrizDistrito[Fila][1].equals(NombreProvincia))
        {
            // Paso 5: Agregar el nombre del distrito al ComboBox
            // MatrizDistrito[Fila][0] contiene el nombre del distrito
            // MatrizDistrito[Fila][1] contiene el nombre de la provincia asociada
            this.CBO_Distrito.addItem(ObjPersona.MatrizDistrito[Fila][0]);
        }
    }
}


void AutoAjustar_Columnas()
{
    // Paso 1: Definir los anchos deseados para cada columna del JTable
    // Cada número del arreglo 'Anchos' representa el ancho en píxeles de una columna
    int [] Anchos = {60, 180, 140, 100, 100, 130, 160, 140, 140, 200, 240, 100, 150, 100};
    
    // Paso 2: Recorrer el número de columnas del JTable
    // El método getColumnCount() devuelve la cantidad de columnas actuales
    for (int Columna = 0; Columna < this.jTable_RegistroClientes.getColumnCount(); Columna++)
    {
        // Paso 3: Establecer el ancho preferido para cada columna usando los valores del arreglo
        this.jTable_RegistroClientes.getColumnModel().getColumn(Columna).setPreferredWidth(Anchos[Columna]);
    }
    
    // Paso 4: Desactivar el ajuste automático del tamaño de columnas
    // Esto permite que las columnas usen solo el ancho que se estableció manualmente
    this.jTable_RegistroClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    
    // Paso 5: Activar la visualización de líneas horizontales y verticales para mayor claridad visual
    this.jTable_RegistroClientes.setShowVerticalLines(true);
    this.jTable_RegistroClientes.setShowHorizontalLines(true);
}

// Método para leer los datos de clientes desde un archivo y cargarlos al JTable
void Leer_Datos()
{
    // 1. Crear una instancia de la clase Clientes con valores vacíos.
    // Esto sirve para inicializar el objeto y luego llamar a sus métodos.
    Clientes ObjCliente = new Clientes("","","","","","","","","","","","","","");

    // 2. Llamar al método que carga los datos desde el archivo hacia una matriz
    ObjCliente.Leer_Clientes(DirectorioCliente);
     
    try
    {
        // 3. Recorrer la matriz de clientes cargada desde el archivo
        for (int i = 0; i < ObjCliente.MatrizClientes.length; i++)
        {
            // 4. (Opcional) Imprimir una línea vacía en consola
            System.out.println();
            
            // 5. Agregar cada fila de la matriz como una nueva fila al JTable
            Modelo.addRow(new Object[] {
                ObjCliente.MatrizClientes[i][0],  // Código Cliente
                ObjCliente.MatrizClientes[i][1],  // Nombre
                ObjCliente.MatrizClientes[i][2],  // Apellido
                ObjCliente.MatrizClientes[i][3],  // Sexo
                ObjCliente.MatrizClientes[i][4],  // Nacionalidad
                ObjCliente.MatrizClientes[i][5],  // Tipo Doc.
                ObjCliente.MatrizClientes[i][6],  // Número Doc.
                ObjCliente.MatrizClientes[i][7],  // Dirección
                ObjCliente.MatrizClientes[i][8],  // Teléfono
                ObjCliente.MatrizClientes[i][9],  // Correo
                ObjCliente.MatrizClientes[i][10], // Departamento
                ObjCliente.MatrizClientes[i][11], // Provincia
                ObjCliente.MatrizClientes[i][12], // Distrito
                ObjCliente.MatrizClientes[i][13]  // Estado
            });
        }

        // 6. Obtener el código del último cliente leído
        int Fila = ObjCliente.MatrizClientes.length;
        if (Fila > 0) {
            CodCliente = ObjCliente.MatrizClientes[Fila - 1][0];  // Último código leído
        } else {
            CodCliente = "C0000";  // Si no hay datos, asignar código inicial
        }
    }
    catch (Exception Error)
    {
        // 7. En caso de error, asignar código base
        CodCliente = "C0000";
    }
}

// Método para cargar los datos de un cliente seleccionado en la tabla al formulario
void Cargar_Filas() throws ParseException
{
    String EstadoCliente;

    // 1. Obtener el índice de la fila seleccionada en el JTable
    int Seleccion = this.jTable_RegistroClientes.getSelectedRow();
    
    // 2. Cargar los datos de cada celda de la fila seleccionada a los controles del formulario
    this.Lb_Codigo.setText(this.jTable_RegistroClientes.getValueAt(Seleccion, 0).toString()); // Código
    this.TXTApellidos.setText(this.jTable_RegistroClientes.getValueAt(Seleccion, 1).toString()); // Apellidos
    this.TXTNombres.setText(this.jTable_RegistroClientes.getValueAt(Seleccion, 2).toString()); // Nombres
    this.JDate_Fec_Nac.setDate(FormatoFecha.parse(this.jTable_RegistroClientes.getValueAt(Seleccion, 3).toString())); // Fecha Nac.
    this.CBO_Nacionalidad.setSelectedItem(this.jTable_RegistroClientes.getValueAt(Seleccion, 4).toString()); // Nacionalidad
    this.CBO_Tipo_Doc_Identidad.setSelectedItem(this.jTable_RegistroClientes.getValueAt(Seleccion, 5).toString()); // Tipo Doc.
    this.TXTNumDoc_Identidad.setText(this.jTable_RegistroClientes.getValueAt(Seleccion, 6).toString()); // Número Doc.
    this.CBO_Departamento.setSelectedItem(this.jTable_RegistroClientes.getValueAt(Seleccion, 7).toString()); // Departamento
    this.CBO_Provincia.setSelectedItem(this.jTable_RegistroClientes.getValueAt(Seleccion, 8).toString()); // Provincia
    this.CBO_Distrito.setSelectedItem(this.jTable_RegistroClientes.getValueAt(Seleccion, 9).toString()); // Distrito
    this.TXTDireccion.setText(this.jTable_RegistroClientes.getValueAt(Seleccion, 10).toString()); // Dirección
    this.TXTTelefono.setText(this.jTable_RegistroClientes.getValueAt(Seleccion, 11).toString()); // Teléfono
    this.TXTEmail.setText(this.jTable_RegistroClientes.getValueAt(Seleccion, 12).toString()); // Email

    // 3. Obtener el estado del cliente y marcar el radio correspondiente
    EstadoCliente = this.jTable_RegistroClientes.getValueAt(Seleccion, 13).toString().toUpperCase(); // Estado (Registrado o Anulado)

    if(EstadoCliente.equals("REGISTRADO")) {
        this.RBTN_Registrado.setSelected(true);  // Activar botón "Registrado"
    } else {
        this.RBTN_Anulado.setSelected(true);     // Activar botón "Anulado"
    }

    // 4. Guardar el número de fila seleccionada en la variable global
    Filas = Seleccion;
}


// Método para agregar un nuevo registro de cliente a la tabla
void Agregar_Registro()
{
    // Crear un arreglo de String para almacenar los datos del cliente (14 columnas)
    String [] InfoClientes = new String[14];
    
    // Llenar el arreglo con los datos capturados en los controles del formulario
    InfoClientes[0] = this.Lb_Codigo.getText();                                // Código del cliente
    InfoClientes[1] = this.TXTApellidos.getText();                            // Apellidos
    InfoClientes[2] = this.TXTNombres.getText();                              // Nombres
    InfoClientes[3] = FormatoFecha.format(this.JDate_Fec_Nac.getDate());      // Fecha de nacimiento formateada
    InfoClientes[4] = this.CBO_Nacionalidad.getSelectedItem().toString();     // Nacionalidad seleccionada
    InfoClientes[5] = this.CBO_Tipo_Doc_Identidad.getSelectedItem().toString();// Tipo de documento
    InfoClientes[6] = this.TXTNumDoc_Identidad.getText();                      // Número de documento
    InfoClientes[7] = this.CBO_Departamento.getSelectedItem().toString();     // Departamento seleccionado
    InfoClientes[8] = this.CBO_Provincia.getSelectedItem().toString();        // Provincia seleccionada
    InfoClientes[9] = this.CBO_Distrito.getSelectedItem().toString();         // Distrito seleccionado
    InfoClientes[10] = this.TXTDireccion.getText();                           // Dirección
    InfoClientes[11] = this.TXTTelefono.getText();                            // Teléfono
    InfoClientes[12] = this.TXTEmail.getText();                               // Email
    
    // Definir el estado del cliente según el radio botón seleccionado
    if(RBTN_Registrado.isSelected() == true)
    {
        InfoClientes[13] = "Registrado";  // Estado Registrado
    }
    if(RBTN_Anulado.isSelected() == true)
    {
        InfoClientes[13] = "Anulado";     // Estado Anulado
    }
    
    // Agregar el arreglo como una nueva fila en el modelo de la tabla (JTable)
    Modelo.addRow(InfoClientes);
    
    // Mostrar mensaje informando que el registro fue guardado con éxito
    JOptionPane.showMessageDialog(null, "Registro Guardado con éxito", this.getTitle(),
                                  JOptionPane.INFORMATION_MESSAGE);
    
    // Actualizar la variable global con el código del último cliente agregado
    CodCliente = InfoClientes[0];
    
    // Colocar el cursor (foco) en el campo de apellidos para facilitar la entrada de un nuevo registro
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
int Fila = this.jTable_RegistroClientes.getSelectedRow();
//Establecer Valores en el Control
this.jTable_RegistroClientes.setValueAt(this.Lb_Codigo.getText(), Fila, 0);
this.jTable_RegistroClientes.setValueAt(this.TXTApellidos.getText(),Fila,1);
this.jTable_RegistroClientes.setValueAt(this.TXTNombres.getText(),Fila,2);
this.jTable_RegistroClientes.setValueAt(this.Fecha(JDate_Fec_Nac),Fila,3);
this.jTable_RegistroClientes.setValueAt(this.CBO_Nacionalidad.getSelectedItem().toString(),Fila,4);
this.jTable_RegistroClientes.setValueAt(this.CBO_Tipo_Doc_Identidad.getSelectedItem().toString(),Fila,5);
this.jTable_RegistroClientes.setValueAt(this.TXTNumDoc_Identidad.getText(),Fila,6);
this.jTable_RegistroClientes.setValueAt(this.CBO_Departamento.getSelectedItem().toString(),Fila,7);
this.jTable_RegistroClientes.setValueAt(this.CBO_Provincia.getSelectedItem().toString(),Fila,8);
this.jTable_RegistroClientes.setValueAt(this.CBO_Distrito.getSelectedItem().toString(),Fila,9);
this.jTable_RegistroClientes.setValueAt(this.TXTDireccion.getText(),Fila,10);
this.jTable_RegistroClientes.setValueAt(this.TXTTelefono.getText(),Fila,11);
this.jTable_RegistroClientes.setValueAt(this.TXTEmail.getText(),Fila,12);


    if(RBTN_Registrado.isSelected()==true)
    {
    this.jTable_RegistroClientes.setValueAt("Registrado", Fila, 13);
    }
   
    if(RBTN_Anulado.isSelected()==true)
    {
    this.jTable_RegistroClientes.setValueAt("Anulado", Fila, 13);
    }

}
}

void Validar_Datos()
{
    int Contador = 0;  // Variable para controlar si hay duplicados
    String NumDni = "";

    // Si el botón tiene texto "GUARDAR", se va a registrar un nuevo cliente
    if (this.BTNGuardar.getText().toUpperCase().equals("GUARDAR"))
    {
        // Si la tabla está vacía, no hay duplicados
        if (this.jTable_RegistroClientes.getRowCount() == 0)
        {
            Contador = 0;
        }
        else
        {
            // Recorrer todos los registros de la tabla
            for (int i = 0; i < this.jTable_RegistroClientes.getRowCount(); i++)
            {
                // Obtener el número de documento de la fila i (columna 6)
                NumDni = this.jTable_RegistroClientes.getValueAt(i, 6).toString();

                // Verificar si el número de documento ingresado ya existe
                if (this.TXTNumDoc_Identidad.getText().equals(NumDni))
                {
                    // Mostrar mensaje de error
                    JOptionPane.showMessageDialog(null, 
                        "El número de DNI: " + this.TXTNumDoc_Identidad.getText() + " ya se encuentra registrado.",
                        this.getTitle(), JOptionPane.ERROR_MESSAGE);

                    // Colocar el cursor en el campo de DNI para corregirlo
                    this.TXTNumDoc_Identidad.requestFocus();

                    Contador++;  // Encontró duplicado, aumentar contador

                    break;  // Salir del ciclo porque ya existe el DNI
                }
            }
        }
    }

    // Si el botón tiene texto "ACTUALIZAR", se va a modificar un registro existente
    if (this.BTNGuardar.getText().toUpperCase().equals("ACTUALIZAR"))
    {
        // Obtener la fila seleccionada en la tabla
        int Fila = this.jTable_RegistroClientes.getSelectedRow();

        // Obtener el DNI actual de esa fila
        NumDni = this.jTable_RegistroClientes.getValueAt(Fila, 6).toString();

        // Si el DNI no cambió, no hay problema
        if (this.TXTNumDoc_Identidad.getText().equals(NumDni))
        {
            Contador = 0;
        }
        else
        {
            // Si cambió, verificar que el nuevo DNI no esté repetido
            for (int i = 0; i < this.jTable_RegistroClientes.getRowCount(); i++)
            {
                NumDni = this.jTable_RegistroClientes.getValueAt(i, 6).toString();

                if (this.TXTNumDoc_Identidad.getText().equals(NumDni))
                {
                    JOptionPane.showMessageDialog(null, 
                        "El Número de Documento: " + this.TXTNumDoc_Identidad.getText() + " ya se encuentra registrado.",
                        this.getTitle(), JOptionPane.ERROR_MESSAGE);

                    this.TXTNumDoc_Identidad.requestFocus();

                    Contador++;  // Encontró duplicado

                    break;  // Salir del ciclo
                }
            }
        }
    }

    // Si no se encontraron duplicados, proceder con guardar o actualizar
    if (Contador == 0)
    {
        if (this.BTNGuardar.getText().equalsIgnoreCase("GUARDAR"))
        {
            this.Agregar_Registro();  // Agregar nuevo registro
        }
        else
        {
            Modificar_Registro();     // Modificar registro existente
        }

        TotalFilas();     // Actualizar total de filas mostradas

        Guardar_Fichero();  // Guardar datos en archivo

        this.Habilitar_Controles(false); // Deshabilitar controles para evitar cambios

        this.BTNGuardar.setText("Guardar");  // Resetear texto del botón a "Guardar"
    }
}

void Guardar_Fichero()
{
    // Obtener el modelo de la tabla que contiene los datos de los clientes
    DefaultTableModel Modelo = (DefaultTableModel) jTable_RegistroClientes.getModel();

    // Usamos try con recursos para abrir el archivo y asegurar que se cierre automáticamente
    try (FileWriter Guardar = new FileWriter(DirectorioCliente)) {
        
        // Recorrer todas las filas de la tabla
        for (int i = 0; i < this.jTable_RegistroClientes.getRowCount(); i++) {
            
            // Por cada fila, escribir en el archivo todas las columnas (0 a 13)
            // Cada dato se escribe en una línea distinta con salto de línea '\n'
            Guardar.write(Modelo.getValueAt(i, 0).toString() + "\n");  // columna 0
            Guardar.write(Modelo.getValueAt(i, 1).toString() + "\n");  // columna 1
            Guardar.write(Modelo.getValueAt(i, 2).toString() + "\n");  // columna 2
            Guardar.write(Modelo.getValueAt(i, 3).toString() + "\n");  // columna 3
            Guardar.write(Modelo.getValueAt(i, 4).toString() + "\n");  // columna 4
            Guardar.write(Modelo.getValueAt(i, 5).toString() + "\n");  // columna 5
            Guardar.write(Modelo.getValueAt(i, 6).toString() + "\n");  // columna 6
            Guardar.write(Modelo.getValueAt(i, 7).toString() + "\n");  // columna 7
            Guardar.write(Modelo.getValueAt(i, 8).toString() + "\n");  // columna 8
            Guardar.write(Modelo.getValueAt(i, 9).toString() + "\n");  // columna 9
            Guardar.write(Modelo.getValueAt(i, 10).toString() + "\n"); // columna 10
            Guardar.write(Modelo.getValueAt(i, 11).toString() + "\n"); // columna 11
            Guardar.write(Modelo.getValueAt(i, 12).toString() + "\n"); // columna 12
            Guardar.write(Modelo.getValueAt(i, 13).toString() + "\n"); // columna 13
        }
    }
    catch(Exception Error)
    {
        // Si ocurre un error, imprimir detalles en la consola para depuración
        Error.printStackTrace();

        // Mostrar mensaje de error en ventana emergente para informar al usuario
        JOptionPane.showMessageDialog(null, 
            "Error: 1056\n" + Error.toString(), 
            this.getTitle(), 
            JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, 
            "Error: AQUI TOY LINEA 1106 " + Error.getMessage(), 
            this.getTitle(),
            JOptionPane.ERROR_MESSAGE);
    }
}

void TotalFilas()
{
    int NumFilas = this.jTable_RegistroClientes.getRowCount();
    this.Lb_Num_Registro.setText(""+NumFilas);
}

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            
        Limpiar();
        AutoAjustar_Columnas();
        Cargar_Nacionalidad();
        Cargar_Departamento();
        Leer_Datos();
        Cargar_Doc_Identidad("<Seleccione>");
        Cargar_OpcionesBusqueda();
        TotalFilas();
         this.Botones(true);
        this.Habilitar_Controles(false);
    }//GEN-LAST:event_formWindowOpened

    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
          //Declarar variable de tipo: Entero
        int Rpta;
        //Mostrar Mensaje de Confirmacion
        Rpta = JOptionPane.showConfirmDialog(null,"¿Desea Salir de la Ventana?", "Registro de Clientes",
        JOptionPane. YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //'Evaluar Si se ha Pulsado el Botón: Si
        if (Rpta == 0)
        {
            //establecer el conjunto de filas o en el control.
            this.jTable_RegistroClientes.setRowSorter(null);
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
                     
                     //Deshabilitar la Opcion Redimensionar el Tamaño de la Ventana
                     FormularioMenu.setResizable(false);
                     
                     //Mostrar formulario
                     FormularioMenu.setVisible(true);
        }
    }//GEN-LAST:event_BTN_SalirActionPerformed

    private void CBO_Tipo_Doc_IdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBO_Tipo_Doc_IdentidadActionPerformed

    }//GEN-LAST:event_CBO_Tipo_Doc_IdentidadActionPerformed

    private void TXTNumDoc_IdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNumDoc_IdentidadKeyTyped
        // Obtener el carácter que se ha presionado en el evento de teclado
char c = evt.getKeyChar();

// Verificar si el carácter NO está entre '0' y '9' (es decir, no es un número)
if (c < '0' || c > '9') {
    // Si no es un número, consumir el evento para evitar que se escriba en el campo
    evt.consume();
}
    }//GEN-LAST:event_TXTNumDoc_IdentidadKeyTyped

    private void TXTApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTApellidosKeyTyped
              char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
            evt.consume();
    }//GEN-LAST:event_TXTApellidosKeyTyped

    private void TXTNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNombresKeyTyped
             char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' '))
            evt.consume();
    }//GEN-LAST:event_TXTNombresKeyTyped

    private void BTNNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNNuevoActionPerformed
                     // TODO add your handling code here:
 // Limpiar campos o formularios antes de generar un nuevo código
Limpiar();

// Declarar una variable para almacenar el nuevo código de cliente
String CodigoCliente = "";

// Convertir el código actual de cliente (CodCliente) en un número entero para incrementar
// CodCliente tiene formato por ejemplo: "C0001", se quita la primera letra y se convierte a entero
int Codigo = Integer.parseInt(CodCliente.substring(1)) + 1;

// Según el valor de 'Codigo', se genera el nuevo código con ceros a la izquierda para mantener el formato

if (Codigo > 0 && Codigo < 10) {
    // Si el código está entre 1 y 9, se agrega "C000" delante (Ejemplo: C0005)
    CodigoCliente = "C000" + String.valueOf(Codigo);
} else if (Codigo >= 10 && Codigo <= 99) {
    // Si el código está entre 10 y 99, se agrega "C00" delante (Ejemplo: C025)
    CodigoCliente = "C00" + String.valueOf(Codigo);
} else if (Codigo >= 100 && Codigo <= 999) {
    // Si el código está entre 100 y 999, se agrega "C0" delante (Ejemplo: C123)
    CodigoCliente = "C0" + String.valueOf(Codigo);
} else if (Codigo >= 1000 && Codigo <= 9999) {
    // Si el código está entre 1000 y 9999, se agrega solo "C" delante (Ejemplo: C1234)
    CodigoCliente = "C" + String.valueOf(Codigo);
}

// Mostrar el nuevo código generado en la etiqueta correspondiente del formulario
this.Lb_Codigo.setText(CodigoCliente);

// Deshabilitar algunos botones (probablemente para evitar acciones mientras se ingresa datos)
this.Botones(false);

//tar los controles del formulario para permitir ingreso de datos
this.Habilitar_Controles(true);

    }//GEN-LAST:event_BTNNuevoActionPerformed

    private void TXTTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTelefonoKeyTyped
     char c = evt.getKeyChar();
        if(c <'0' || c >'9') 
            evt.consume();
    }//GEN-LAST:event_TXTTelefonoKeyTyped

    private void jTable_RegistroClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_RegistroClientesMouseClicked
        try {
            this.Cargar_Filas();
        } catch (ParseException ex) {
            Logger.getLogger(Registro_Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable_RegistroClientesMouseClicked

    private void CBO_DepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_DepartamentoItemStateChanged
               //Evaluar si se ha Seleccionado un Elemento de la Lista
      if(evt.getStateChange() == ItemEvent.SELECTED)
      {
          //Invocar al Método: Cargar_Provincia
        this.Cargar_Provincia(this.CBO_Departamento.getSelectedItem().toString());
      }
    }//GEN-LAST:event_CBO_DepartamentoItemStateChanged

    private void CBO_ProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_ProvinciaItemStateChanged
                //Evaluar si se ha Seleccionado un Elemento de la Lista
      if(evt.getStateChange() == ItemEvent.SELECTED)
      {
          //Invocar al Método: Cargar_Provincia
        this.Cargar_Distrito(this.CBO_Provincia.getSelectedItem().toString());
      }
    }//GEN-LAST:event_CBO_ProvinciaItemStateChanged

    private void CBO_NacionalidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_NacionalidadItemStateChanged
    if(evt.getStateChange()== ItemEvent.SELECTED)
    {
        this.Cargar_Doc_Identidad(this.CBO_Nacionalidad.getSelectedItem().toString());
    }
    }//GEN-LAST:event_CBO_NacionalidadItemStateChanged

    private void BTN_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EditarActionPerformed
    
        
        this.Habilitar_Controles(true);
        this.Botones(false);
        
        this.BTNGuardar.setText("Actualizar");
 
    }//GEN-LAST:event_BTN_EditarActionPerformed

    private void BTNGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGuardarActionPerformed

     if (this.TXTApellidos.getText().equals("")&&this.TXTNombres.getText().equals("")&&this.TXTEmail.getText().equals(""))
    {   
          // Mostrar mensaje de error
       JOptionPane.showMessageDialog(null, 
          "Hay campos vacios, rellene completamente", this.getTitle(), JOptionPane.ERROR_MESSAGE);

           // Colocar el cursor en el campo de DNI para corregirlo
              this.TXTNumDoc_Identidad.requestFocus();
    } 
    else
     {
          this.Validar_Datos();
       
       this.Botones(true);
       
       this.Habilitar_Controles(false);
     }
       
       
    }//GEN-LAST:event_BTNGuardarActionPerformed

    private void BTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelarActionPerformed
        this.BTNGuardar.setText("Guardar");
        this.Limpiar();
        this.Habilitar_Controles(false);
        this.Botones(true);
    }//GEN-LAST:event_BTNCancelarActionPerformed

    private void CBO_CampoBuscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBO_CampoBuscarItemStateChanged
       this.TXTConsultar_Datos.requestFocus();
    }//GEN-LAST:event_CBO_CampoBuscarItemStateChanged

    private void TXTConsultar_DatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTConsultar_DatosKeyReleased
   // Obtener el modelo de la tabla jTable_RegistroClientes para poder trabajar con sus datos
DefaultTableModel ModeloTabla = (DefaultTableModel) this.jTable_RegistroClientes.getModel();

// Añadir un "listener" (escuchador) al campo de texto TXTConsultar_Datos que detecta cuando se suelta una tecla
this.TXTConsultar_Datos.addKeyListener(new KeyAdapter() {
    @Override
    public void keyReleased(java.awt.event.KeyEvent evento) {
        // Variable para saber en qué campo se quiere buscar
        String CampoBuscar;

        // Obtener el campo seleccionado en el combo box (CBO_CampoBuscar), por ejemplo "Apellido" o "Nombres"
        CampoBuscar = CBO_CampoBuscar.getSelectedItem().toString();

        // Según el campo seleccionado, aplicar un filtro en la tabla sobre la columna correspondiente:
        if (CampoBuscar.equals("Apellido")) {
            // Filtrar la tabla en la columna 1 (suponiendo que ahí están los apellidos)
            TFiltroFila.setRowFilter(RowFilter.regexFilter(("!?") + TXTConsultar_Datos.getText(), 1));
        } else if (CampoBuscar.equals("Nombres")) {
            // Filtrar en columna 2 (nombres)
            TFiltroFila.setRowFilter(RowFilter.regexFilter(("!?") + TXTConsultar_Datos.getText(), 2));
        } else if (CampoBuscar.equals("Nacionalidad")) {
            // Filtrar en columna 4 (nacionalidad)
            TFiltroFila.setRowFilter(RowFilter.regexFilter(("!?") + TXTConsultar_Datos.getText(), 4));
        } else if (CampoBuscar.equals("Nº de Documento de Identidad")) {
            // Filtrar en columna 6 (número de documento)
            TFiltroFila.setRowFilter(RowFilter.regexFilter(("!?") + TXTConsultar_Datos.getText(), 6));
        } else if (CampoBuscar.equals("Estado del Cliente")) {
            // Filtrar en columna 13 (estado)
            TFiltroFila.setRowFilter(RowFilter.regexFilter(("!?") + TXTConsultar_Datos.getText(), 13));
        }
    }
});

// Crear un TableRowSorter con el modelo de tabla para permitir filtrar filas
TFiltroFila = new TableRowSorter(ModeloTabla);

// Asignar el sorter (filtro) a la tabla para que funcione el filtrado
this.jTable_RegistroClientes.setRowSorter(TFiltroFila);

// Llamar al método TotalFilas(), que probablemente actualiza la cantidad de filas visibles después del filtro
this.TotalFilas();

    }//GEN-LAST:event_TXTConsultar_DatosKeyReleased

    private void TXTApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTApellidosFocusLost
       this.Convertir_TextoMayusculas(TXTApellidos);
    }//GEN-LAST:event_TXTApellidosFocusLost

    private void TXTNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTNombresFocusLost
         this.Convertir_TextoMayusculas(TXTNombres);
    }//GEN-LAST:event_TXTNombresFocusLost

    private void TXTApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTApellidosKeyPressed
       this.Cambiar_Cursor(evt, this.TXTNombres); 
    }//GEN-LAST:event_TXTApellidosKeyPressed

    private void TXTDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTDireccionKeyPressed
        this.Cambiar_Cursor(evt, this.TXTTelefono);
    }//GEN-LAST:event_TXTDireccionKeyPressed

    private void TXTTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTelefonoKeyPressed
         this.Cambiar_Cursor(evt, this.TXTEmail);
    }//GEN-LAST:event_TXTTelefonoKeyPressed

    private void TXTNumDoc_IdentidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTNumDoc_IdentidadFocusLost
    this.Validar_Longitud_Datos(this.TXTNumDoc_Identidad,"TELÉFONO", 
        this.TXTNumDoc_Identidad.getText());
    }//GEN-LAST:event_TXTNumDoc_IdentidadFocusLost

    private void TXTTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTTelefonoFocusLost
      this.Validar_Longitud_Datos(this.TXTTelefono,"TELÉFONO", 
        this.TXTTelefono.getText());
    }//GEN-LAST:event_TXTTelefonoFocusLost
     
private String Fecha(JDateChooser ControlCalendario)
{
    // Declarar variables para día, mes y fecha en formato String
    String CDia, CMes, Fecha;

    // Declarar variables enteras para día, mes y año
    int dia, mes, year;

    // Obtener el día del mes desde el componente calendario
    dia = ControlCalendario.getCalendar().get(Calendar.DAY_OF_MONTH);

    // Obtener el mes (IMPORTANTE: enero es 0, por eso sumamos 1)
    mes = ControlCalendario.getCalendar().get(Calendar.MONTH) + 1;

    // Obtener el año
    year = ControlCalendario.getCalendar().get(Calendar.YEAR);

    // Verificar si el día es de un dígito (1 a 9), para agregar un 0 adelante y que siempre sea 2 dígitos
    if (dia >= 1 && dia < 10)
    {
        CDia = "0" + String.valueOf(dia); // Ejemplo: 7 -> "07"
    }
    else
    {
        CDia = String.valueOf(dia); // Si es 10 o más, simplemente convertir a String
    }

    // Hacer lo mismo para el mes: agregar 0 si es de un dígito
    if (mes >= 1 && mes < 10)
    {
        CMes = "0" + String.valueOf(mes); // Ejemplo: 3 -> "03"
    }
    else
    {
        CMes = String.valueOf(mes); // Ejemplo: 11 -> "11"
    }

    // Construir la fecha en formato dd/MM/yyyy (día/mes/año)
    Fecha = CDia + "/" + CMes + "/" + String.valueOf(year);

    // Retornar la fecha como String
    return Fecha;
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
     this.TXTConsultar_Datos.setText("");
     this.CBO_Nacionalidad.setSelectedIndex(0);
     this.CBO_Tipo_Doc_Identidad.setSelectedIndex(0);
     this.CBO_Departamento.setSelectedIndex(0);
     this.CBO_Provincia.setSelectedIndex(0);
     this.CBO_Distrito.setSelectedIndex(0);
     this.Lb_Codigo.setText("");
     
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
            java.util.logging.Logger.getLogger(Registro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
                //Contralador de Error
                try
                {
                //Crear un Objeto que instancie al Formulario
                 Registro_Clientes Formulario = new Registro_Clientes();
                //Ubicar Formulario en el centro de la Pantalla
                 Formulario.setLocationRelativeTo(null);
                //Mostrar el Formulario
                 
                 Formulario.setSize(1800,700);
                 
                 Formulario.setResizable(false);
                 
                 Formulario.setDefaultCloseOperation(0);
                 
                 Formulario.setVisible(true);
                }
                catch (Exception Error)
                {
                 JOptionPane.showMessageDialog(null, Error.getMessage());   
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton BTNGuardar;
    private javax.swing.JButton BTNLimpiar;
    private javax.swing.JButton BTNNuevo;
    private javax.swing.JButton BTN_Editar;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Limpiar;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JComboBox CBO_CampoBuscar;
    private javax.swing.JComboBox CBO_Departamento;
    private javax.swing.JComboBox CBO_Distrito;
    private javax.swing.JComboBox CBO_Nacionalidad;
    private javax.swing.JComboBox CBO_Provincia;
    private javax.swing.JComboBox CBO_Tipo_Doc_Identidad;
    private com.toedter.calendar.JDateChooser JDate_Fec_Nac;
    private javax.swing.JLabel Lb_Codigo;
    private javax.swing.JLabel Lb_Num_Registro;
    private javax.swing.JRadioButton RBTN_Anulado;
    private javax.swing.JRadioButton RBTN_Registrado;
    private javax.swing.JTextField TXTApellidos;
    private javax.swing.JTextField TXTConsultar_Datos;
    private javax.swing.JTextField TXTDireccion;
    private javax.swing.JTextField TXTEmail;
    private javax.swing.JTextField TXTNombres;
    private javax.swing.JTextField TXTNumDoc_Identidad;
    private javax.swing.JTextField TXTTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_RegistroClientes;
    // End of variables declaration//GEN-END:variables
}
