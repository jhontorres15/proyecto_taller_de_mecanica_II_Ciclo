package Formularios;

import DAL.Empleado;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Jfrm_InicioDeSesion_1 extends javax.swing.JFrame {
    
    private ImageIcon imagen;
    private Icon icono;
    // estableceer directorio del proyedcto donde se debe guaradr el TXT
  
    String Directorio_Usuario = new File("src/Archivo_Datos/Registro_UsuariosEmpleados.txt").getAbsolutePath();
    String Directorio_Empleados = new File("src/Archivo_Datos/Registro_Empleados.txt").getAbsolutePath();  
    
    String [][] UsuariosEmp;
    String [][] Empleados;
   
    //Declarar Variable Local de Tipo: Entero
    int Intentos = 3;
     
    //Declarar Variables Para Componente Timer
    int Start =0; //Variable Contador
    Timer timer= null; //Variable del Timer
     
    //Declarar Variables Auxiliares de tipo: String
    String CodEmp, Apellidos_Emp,Nombres_Emp,Area_Emp,Cargo_Emp;
    
    
    public Jfrm_InicioDeSesion_1() {
        initComponents();
        this.setLocationRelativeTo(this);
      
     
     //Establecer el color del formulario
         this.getContentPane().setBackground(new java.awt.Color(0,102,153));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TXTCodUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TXTPassword = new javax.swing.JPasswordField();
        BTN_IniciarSesion = new javax.swing.JButton();
        JProgressBar = new javax.swing.JProgressBar();
        Lb_Cargando = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BTN_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 257, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("INICIAR SESIÓN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("USUARIO:");

        TXTCodUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TXTCodUsuario.setText("Ingrese su código de usuario");
        TXTCodUsuario.setBorder(null);
        TXTCodUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTCodUsuarioFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");

        TXTPassword.setText("Ingrese ");
        TXTPassword.setBorder(null);
        TXTPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPasswordActionPerformed(evt);
            }
        });

        BTN_IniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Iniciar_Sesion.png"))); // NOI18N
        BTN_IniciarSesion.setText("Iniciar Sesión");
        BTN_IniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_IniciarSesionActionPerformed(evt);
            }
        });

        Lb_Cargando.setText("Cargando  0%");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_servicio/circle.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_servicio/GM.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        BTN_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Salir.png"))); // NOI18N
        BTN_Salir.setText("Salir");
        BTN_Salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BTN_Salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BTN_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(TXTCodUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TXTPassword)
                                .addComponent(JProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Lb_Cargando))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTN_IniciarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Lb_Cargando)
                .addGap(18, 18, 18)
                .addComponent(JProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_IniciarSesion)
                    .addComponent(BTN_Salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Crear Metodo Limpiar
    void Limpiar()
    {
     //Limpiar Caja de Texto
        this.TXTCodUsuario.setText("");
        this.TXTPassword.setText("");
        
        
    //Ubicar el Cursor en el Control: TxtUsuario
        this.TXTCodUsuario.requestFocus();
    }
        
     //Crear el Metodo Local: Leer Usuarios()
    void Leer_Usuarios()
    {
     //Declarar una Variable Tipo Scanner
        Scanner Linea;
        
     //Obtener el Nombre del Archivo de Texto
     File Leer_Doc=new File(Directorio_Usuario);
     
     //Declarar una Variable de Tipo: Contador
     int Fila=0;
     
     //Crear Contador de Error
     try
       {
         //Leer Documento(Archivo de Texto)
         Linea =new Scanner(Leer_Doc);
        
         //Crear Estructura Repetitiva(Bucle):while(Leer las Lineas de Texto del Archivo)
         while(Linea.hasNextLine())
         {
             //Leer Lineas
             Linea.nextLine();
             
             //Incrementar el Valor de la Variable
             Fila++;
         }
         
         //Establecer el Valor de la Fila
         Fila=(Fila/4);//4 Columnas
         
         //Asignar Tamaño de la Matriz de Datos
         UsuariosEmp = new String [Fila][4]; //4 Columnas
         
         //Volver a Asignar el Valor de 0(Cero) a la Variable: Fila
         Fila= 0;
         
         //Leer Documento (Nombre del Archivo)
         Linea = new Scanner(Leer_Doc);
         
          //Crear Estructura Repetitiva(Bucle):while(Leer las Lineas de Texto del Archivo)
         while(Linea.hasNextLine())
         {
             //Leer y asignar Datos del Archivo de Texto a la Matriz de Datos 
             UsuariosEmp[Fila][0] = Linea.nextLine();
             UsuariosEmp[Fila][1] = Linea.nextLine();
             UsuariosEmp[Fila][2] = Linea.nextLine();
             UsuariosEmp[Fila][3] = Linea.nextLine();
             
             //Incrementar el Valor de la Variable
             Fila++;
             
         }   
        }
         catch(Exception Error)
         {
             //Mostrar Mensaje de Error
             JOptionPane.showMessageDialog(null,"Error:" + Error.getMessage(),this.getTitle(),
                   JOptionPane.ERROR_MESSAGE);
         }
    }
    
    //Crear el Metodo Local Leer Empleados()
    void Leer_Empleados()
    {
        //Declarar Variable Tipo Scanner
        Scanner Linea;
        
        //Obtener Nombre del Archivo de Texto
        File Leer_Doc = new File(Directorio_Empleados);
        
        //Declarar una VAriable Tipo: Contador
        int Fila=0;
        
        //Crear Controlador de error
        try
        {
            Linea = new Scanner(Leer_Doc);
            
            //Crear Estructura Repetitiva(Bucle): while(Leer las Lineas de Texto del Archivo de Texto)
            while(Linea.hasNextLine())
            {
                //Leer Lineas
                Linea.nextLine();
                
                //Incrementar el valor de la Variable:Fila
                Fila++;
           
            }
            
             //Estableser Valor de La Variable Fila
                Fila=(Fila/18); //18 Columnas 
                
                //Asingnar Tamaño a la Matriz de Datos: Empleado
                Empleados= new String[Fila][18]; 
                
                //Volver Asignar el Valor a la Variable Fila
                Fila=0;
                
                //Leer documento (Nombre del archivo)
                Linea= new Scanner(Leer_Doc);
                
                //Crear Estructura Repetitiva(Bucle): while(Leer las Lineas de Texto del Archivo de Texto)
                while (Linea.hasNextLine())
                {
                    Empleados[Fila][0]= Linea.nextLine();
                    Empleados[Fila][1]= Linea.nextLine();
                    Empleados[Fila][2]= Linea.nextLine();
                    Empleados[Fila][3]= Linea.nextLine();
                    Empleados[Fila][4]= Linea.nextLine();
                    Empleados[Fila][5]= Linea.nextLine();
                    Empleados[Fila][6]= Linea.nextLine();
                    Empleados[Fila][7]= Linea.nextLine();
                    Empleados[Fila][8]= Linea.nextLine();
                    Empleados[Fila][9]= Linea.nextLine();
                    Empleados[Fila][10]= Linea.nextLine();
                    Empleados[Fila][11]= Linea.nextLine();
                    Empleados[Fila][12]= Linea.nextLine();
                    Empleados[Fila][13]= Linea.nextLine();
                    Empleados[Fila][14]= Linea.nextLine();
                    Empleados[Fila][15]= Linea.nextLine();
                    Empleados[Fila][16]= Linea.nextLine();
                    Empleados[Fila][17]= Linea.nextLine();
                    
                    //Incrementa el Valor de la Variable: Fila
                    Fila++;
                    
                }
        }
        catch(Exception Error)
        {
           //Mostrar Mensaje de Error  
           JOptionPane.showMessageDialog(null, "Error:" + Error.getMessage(), this.getTitle(),
                                                                   JOptionPane.ERROR_MESSAGE); 
        }
        
    }
    
    //Crear el metodo Buscar_Empleado
    void Buscar_Empleado(String Codigo)
    {
        //Crear Estructura Repetitiva(Bucle)
        for(int Fila=0; Fila<Empleados.length;Fila++)
        {
            //Evaluar si existe el codigo del Empleado
            if(Codigo.equals(Empleados[Fila][0]))
            {
                //Capturar Datos
                Apellidos_Emp =Empleados[Fila][5];  // 5 Columna Apellidos
                Nombres_Emp= Empleados  [Fila][6];  //6 Columna Nombres
                Area_Emp = Empleados   [Fila][1];  //1 Columna Area               
                Cargo_Emp = Empleados  [Fila][2];  //2 Columna Cargo
                
                //Fin del Bucle
                break;
            }
        }
    }
      
    //Crear Metodo Local: Cronometro()
    void Cronometro()
    {
        //Evaluar si timer es nulo y la variable Start es Igual a Caro(0)
        if(timer == null && Start == 0)
        {
          //Definir que el Contador Realise la funcion cada 100 milisegundos
          timer = new Timer(100, new ActionListener()  
          {
              @Override
              public void actionPerformed(ActionEvent e)
              {
                //Incrementar el Valor de la Variable Contador
                Start ++;
                 
                //Evaluar si la Variable Start es > a Cero(0)y Start es < a 100
                if(Start >0 && Start <100)
                {
                     //Mostrar % de Carga de Acceso
                     Lb_Cargando.setText("Cargando " + String.valueOf(Start)+ " %");
                }
                 else if (Start ==100)
                 {
                     
                     //Mostrar 100% Acceso
                     Lb_Cargando.setText("Cargando 100%");
                     
                     //Mostrar mensaje de Informacion
                     JOptionPane.showMessageDialog(null, "Bienvenido al sistema usuario: " +Apellidos_Emp +", "+
                                                   Nombres_Emp, getTitle(),JOptionPane.INFORMATION_MESSAGE);
                     //Detener Timer
                     timer.stop();                   
                     
                     //Cerrar Formulario Actual
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
                 //Inicialisar Barra de progreso
                 JProgressBar.setValue(Start);
                 
                 //Mostrar % de Carga de Acceso
                 Lb_Cargando.setText("Cargando " + String.valueOf(Start)+ " %");

              }
          });
          //Inicializar Timer
           timer.start();   
        }
         else
        {
            //Inicializar el Valor del Contador: Start en Cero(0) 
            Start=0;
            
            //Estableser Valor a la Barra de Progreso
            this.JProgressBar.setValue(Start);
            
            //Mostrar % de Carga de Acceso
            Lb_Cargando.setText("Cargando " + String.valueOf(Start)+ " %");
            
            //Detener Timer
            timer.stop();
            timer=null;
        }

    }
            
    
      

    void Validar_Usuario(String CodUsuario, String Password) 
    {
        //Crear una Variable de Tipo Entero
        int Fila=0, FilaEncontradaUsuario=0, FilaEncontradaPassword=0;
        
        //Crear Estructura Repetitiva
        while(Fila<UsuariosEmp.length)
        {
            //Crear Condicion Para Evaluar si el Codigo de Usuario Existe dentro de la Matriz
            if(CodUsuario.equals(UsuariosEmp[Fila][1]))//Es la Columna del Codigo de Usuario
            {
                //Asignar Valor a la Variable: FilaEncontrada de 1
                FilaEncontradaUsuario= 1;
                
                //Fin del Bucle
                break;
            }
            
            //Incrementar el Valor de Fila
            Fila++;
        }
        
        //Evaluar el Valor de la Variable:FilaEncontrada es Igual a 0(Cero)
        if(FilaEncontradaUsuario ==0)
        {
            //Mostrar Mensaje de Error
            JOptionPane.showMessageDialog(null,"Usuario no existe", this.getTitle(),JOptionPane.ERROR_MESSAGE);
            
            //Limpiar Control: TxtUsuario
            this.TXTCodUsuario.setText("");
            
            //Ubicar Cursor en el Control TxtUsuario
            this.TXTCodUsuario.requestFocus();
            
            //Mostrar Mensaje de Advertencia
            JOptionPane.showMessageDialog(null,"N° de intentos permitidos: "+ String.valueOf(Intentos), this.getTitle(),
                                           JOptionPane.WARNING_MESSAGE);
        
            //Disminuir el Valor de la Variable Intentos
            Intentos--;
        }
        else
        {
            
            //Asignar el Valor de Fila
            Fila=0;
            
            //Crear Estructura Repetitiva
            while(Fila<UsuariosEmp.length)
            {
               //Crear Condicion Para Evaluar si el Codigo de Usuario Existe dentro de la Matriz
               if(CodUsuario.equals(UsuariosEmp[Fila][1]) && Password.equals(UsuariosEmp[Fila][2]))
                //1 Es la Columna del Codigo de Usuario y 2 Es la Columna del Password
               {
                 //Capturar el Codigo del empleado  
                 CodEmp = UsuariosEmp[Fila][0]; // 0 es la Columna del Codigo del empleado
                   
                 //Asignar Valor a la Variable: FilaEncontrada de 1
                 FilaEncontradaPassword= 1;
                
                 //Fin del Bucle
                 break;
               }
            
                 //Incrementar el Valor de Fila
                 Fila++;
           }
            if(FilaEncontradaUsuario==1 && FilaEncontradaPassword==1)
            {
                JOptionPane.showMessageDialog(null,"Acceso Correcto", this.getTitle(),JOptionPane.PLAIN_MESSAGE);
           
              
              //Invocar al Metodo: Buscar_empleado
              this.Buscar_Empleado(CodEmp);
              
              //Invocar el Metodo Cronometro()
              this.Cronometro();
            }
            else
            {    
               //Mostrar Mensaje de Error
               JOptionPane.showMessageDialog(null,"El Password es incorrecto", this.getTitle(),JOptionPane.ERROR_MESSAGE);
            
               //Limpiar Control: TxtUsuario
               this.TXTPassword.setText("");
            
               //Ubicar Cursor en el Control TxtUsuario
               this.TXTPassword.requestFocus();
               
               
               //Mostrar Mensaje de Advertencia
               JOptionPane.showMessageDialog(null,"N° de Intentos permitidos: "+ String.valueOf(Intentos), this.getTitle(),
                                             JOptionPane.WARNING_MESSAGE);
               
               //Disminuir el Valor de la Variable Intentos
               Intentos--;
            }
        }
    }
    
    
    
        
    
      
    //Crear Metodo Salir
    void Salir()
    {
        //Declarar una Variable de Tipo: Entero
        int Rpta;
        
        //Mostrar un Mensaje de Confirmación
        Rpta = JOptionPane.showConfirmDialog(null,"¿Desea salir de la ventana :Inicio de sesion de usuario?",
                                             this.getTitle(),JOptionPane.YES_NO_OPTION,
                                             JOptionPane.QUESTION_MESSAGE);
        
        dispose();
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Estableser el Titulo de la Ventana
        this.setTitle("Inicio de sesion");
        
        //Invocar Metodos (Limpiar/LeerUsuarios)
        this.Limpiar();
        this.Leer_Usuarios();
        this.Leer_Empleados();
    }//GEN-LAST:event_formWindowOpened
    
    private void BTN_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SalirActionPerformed
        //Invocar al Metodo: Salir
        this.Salir();
    }//GEN-LAST:event_BTN_SalirActionPerformed

    private void BTN_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_IniciarSesionActionPerformed
        //Evaluar si el Valor de la Variable: Intentos es Igual a 0(cero)
        if(Intentos== 0)
        {
            //Mostrar Mensaje de Advertencia
            JOptionPane.showMessageDialog(null,"Lo sentimos usted a superado el N° maximo de intentos permitidos",
                                                                     this.getTitle(),JOptionPane.WARNING_MESSAGE);
            
            //Finalizar el Programa
            System.exit(0);
        }
        else
        {
            
        }
        //Invocar al metodo: Validar_Usuario(Cod_Usuario/Password)
        this.Validar_Usuario(this.TXTCodUsuario.getText(), this.TXTPassword.getText());
        
    }//GEN-LAST:event_BTN_IniciarSesionActionPerformed

    private void TXTCodUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTCodUsuarioFocusLost
        //Convertir a Mayuscula el Texto
        this.TXTCodUsuario.setText(this.TXTCodUsuario.getText().toUpperCase());
    }//GEN-LAST:event_TXTCodUsuarioFocusLost

    private void TXTPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPasswordActionPerformed
    
    
    
    
    
    
    
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Jfrm_InicioDeSesion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfrm_InicioDeSesion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfrm_InicioDeSesion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfrm_InicioDeSesion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jfrm_InicioDeSesion_1().setVisible(true);
            }
        });
    }
    


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_IniciarSesion;
    private javax.swing.JButton BTN_Salir;
    private javax.swing.JProgressBar JProgressBar;
    private javax.swing.JLabel Lb_Cargando;
    private javax.swing.JTextField TXTCodUsuario;
    private javax.swing.JPasswordField TXTPassword;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
 private void pintarImagen(JLabel lbl, String ruta){
                this.imagen = new ImageIcon(ruta);
                this.icono = new ImageIcon(
                        this.imagen.getImage().getScaledInstance(
                                lbl.getWidth(),
                                lbl.getHeight(),
                                Image.SCALE_DEFAULT
                        )
                ); 
                lbl.setIcon((Icon) this.icono);
                this.repaint();
                
         }

}
