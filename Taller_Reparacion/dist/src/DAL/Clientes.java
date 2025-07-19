
package DAL;

import java.io.File;
import java.util.Scanner;


public class Clientes extends Persona
{
    //Atributos de la Sub Clase: Cliente
    private String CodCliente;
    private String Estado_Cliente;
    

//Constructor de la Sub Clase: Cliente
public Clientes (String Cli_Apellidos,
                String Cli_Nombres,
                String Cli_Fec_Nac,
                String Cli_Nacionalidad,
                String Cli_Tipo_Doc_Identidad,
                String Cli_Num_Doc_Identidad,
                String Cli_Departamento,
                String Cli_Provincia,
                String Cli_Distrito,
                String Cli_Direccion,
                String Cli_Telefono,
                String Cli_Email,
                String Cli_CodCliente,
                String Cli_Estado_Cliente)
{
        super (Cli_Apellidos,
               Cli_Nombres,
               Cli_Fec_Nac,
               Cli_Nacionalidad,
               Cli_Tipo_Doc_Identidad,
               Cli_Num_Doc_Identidad,
               Cli_Departamento,
               Cli_Provincia,
               Cli_Distrito,
               Cli_Direccion,
               Cli_Telefono,
               Cli_Email);
        this.CodCliente = Cli_CodCliente;
        this.Estado_Cliente = Cli_Estado_Cliente;
}
   //encapsulamineto de datos

    public String getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(String CodCliente) {
        this.CodCliente = CodCliente;
    }

    public String getEstado_Cliente() {
        return Estado_Cliente;
    }

    public void setEstado_Cliente(String Estado_Cliente) {
        this.Estado_Cliente = Estado_Cliente;
    }
    
    public String [][] MatrizClientes;
    
   //crear metodo leer clientes 
    public void Leer_Clientes(String ruta)
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
            Fila = (Fila / 14); // 14 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizClientes = new String [Fila][14]; // 15 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setCodCliente(Linea.nextLine());
                this.setApellidos(Linea.nextLine());
                this.setNombres(Linea.nextLine());
                this.setFec_Nac(Linea.nextLine());
                this.setNacionalidad(Linea.nextLine());
                this.setTipo_Doc_Identidad(Linea.nextLine());
                this.setNum_Doc_Identidad(Linea.nextLine());
                this.setDepartamento(Linea.nextLine());
                this.setProvincia(Linea.nextLine());
                this.setDistrito(Linea.nextLine());
                this.setDireccion(Linea.nextLine());
                this.setTelefono(Linea.nextLine());
                this.setEmail(Linea.nextLine());
                this.setEstado_Cliente(Linea.nextLine());
                 
                //Establecer Valores a la Matriz de Datos
                MatrizClientes[Fila][0] = this.getCodCliente();
                MatrizClientes[Fila][1] = this.getApellidos();
                MatrizClientes[Fila][2] = this.getNombres();
                MatrizClientes[Fila][3] = this.getFec_Nac();
                MatrizClientes[Fila][4] = this.getNacionalidad();
                MatrizClientes[Fila][5] = this.getTipo_Doc_Identidad();
                MatrizClientes[Fila][6] = this.getNum_Doc_Identidad();
                MatrizClientes[Fila][7] = this.getDepartamento();
                MatrizClientes[Fila][8] = this.getProvincia();
                MatrizClientes[Fila][9] = this.getDistrito();
                MatrizClientes[Fila][10] = this.getDireccion();
                MatrizClientes[Fila][11] = this.getTelefono();
                MatrizClientes[Fila][12] = this.getEmail();
                MatrizClientes[Fila][13] = this.getEstado_Cliente();

                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: DAL/CLIENTES" + Error.getMessage());
           }

    }
}
