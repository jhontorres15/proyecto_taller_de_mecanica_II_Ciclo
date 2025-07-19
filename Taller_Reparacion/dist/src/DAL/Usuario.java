
package DAL;

import java.io.File;
import java.util.Scanner;

public class Usuario {
    
    private String codempleado;
    private String CodUsuario;
    private String Contrasena;
    private String Estado;
   
    
    
    public Usuario(String Codigo,
                   String Codigo_Usuario,
                   String Password,
                   String Status)
    {
        this.codempleado = Codigo;
        this.CodUsuario = Codigo_Usuario;
        this.Contrasena = Password;
        this.Estado = Status;
    }

    public String getCodempleado() {
        return codempleado;
    }

    public void setCodempleado(String codempleado) {
        this.codempleado = codempleado;
    }

    public String getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(String CodUsuario) {
        this.CodUsuario = CodUsuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    public String [][] MatrizUsuario;
    
        public void Leer_Usuario(String ruta)
    {
        Scanner Linea;
       
        //Obtener el Nombre del Archivo de Texto
        File Leer_Doc = new File(ruta);

        int Fila = 0;
        
        //Crear Controlador de Error

         try
          {
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);
            //Crear Estructura Repetitiva (Bucle): while (Leer las lineas de texto del Archivo)
            while (Linea.hasNextLine())
            {
            //Leer Líneas
            Linea.nextLine();
            
            //Incrementar el valor de la Variable
            Fila++;
            }
            //Establecer Valor de Fila
            Fila = (Fila / 4); // 4 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizUsuario = new String [Fila][4]; //4 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setCodempleado(Linea.nextLine());
                this.setCodUsuario(Linea.nextLine());
                this.setContrasena(Linea.nextLine());
                this.setEstado(Linea.nextLine());
             
                //Establecer Valores a la Matriz de Datos
                MatrizUsuario[Fila][0] = this.getCodempleado();
                MatrizUsuario[Fila][1] = this.getCodUsuario();
                MatrizUsuario[Fila][2] = this.getContrasena();
                MatrizUsuario[Fila][3] = this.getEstado();
              
            Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: dal usuario" + Error.getMessage());
           }

    }
     
}
