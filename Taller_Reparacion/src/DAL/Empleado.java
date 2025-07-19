
package DAL;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author promo jhonny
 */

public class Empleado extends Persona{
    
     //Atributos de la Sub Clase: Cliente
    private String CodEmpleado;
    private String Foto;
    private String Area;
    private String Cargo;
    private String Sueldo;
    private String Estado;
    
    //Constructor de la Sub Clase: Cliente
public Empleado (String Emp_Apellidos,
                String Emp_Nombres,
                String Emp_Fec_Nac,
                String Emp_Nacionalidad,
                String Emp_Tipo_Doc_Identidad,
                String Emp_Num_Doc_Identidad,
                String Emp_Departamento,
                String Emp_Provincia,
                String Emp_Distrito,
                String Emp_Direccion,
                String Emp_Telefono,
                String Emp_Email,
                String Emp_CodEmpleado,
                String Emp_Area,
                String Emp_Cargo,
                String Emp_Sueldo,
                String Emp_Estado,
                String Emp_Foto_Empleado)
{
        super (Emp_Apellidos,
               Emp_Nombres,
               Emp_Fec_Nac,
               Emp_Nacionalidad,
               Emp_Tipo_Doc_Identidad,
               Emp_Num_Doc_Identidad,
               Emp_Departamento,
               Emp_Provincia,
               Emp_Distrito,
               Emp_Direccion,
               Emp_Telefono,
               Emp_Email);
        this.CodEmpleado = Emp_CodEmpleado;
        this.Foto = Emp_Foto_Empleado;
        this.Area = Emp_Area;
        this.Cargo = Emp_Cargo;
        this.Sueldo = Emp_Sueldo;
        this.Estado = Emp_Estado;
}

    public String getCodEmpleado() {
        return CodEmpleado;
    }

    public void setCodEmpleado(String CodEmpleado) {
        this.CodEmpleado = CodEmpleado;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
 
        
        public String [][] MatrizEmpleado;
    
   //crear metodo leer clientes 
    public void Leer_Empleado(String ruta)
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
            Fila = (Fila / 18); // 14 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizEmpleado = new String [Fila][18]; // 14 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setCodEmpleado(Linea.nextLine());
                this.setArea(Linea.nextLine());
                this.setCargo(Linea.nextLine());
                this.setSueldo(Linea.nextLine());
                this.setEstado(Linea.nextLine());
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
                this.setFoto(Linea.nextLine());
                 
                //Establecer Valores a la Matriz de Datos
                MatrizEmpleado[Fila][0] = this.getCodEmpleado();
                MatrizEmpleado[Fila][1] = this.getArea();
                MatrizEmpleado[Fila][2] = this.getCargo();
                MatrizEmpleado[Fila][3] = this.getSueldo();
                MatrizEmpleado[Fila][4] = this.getEstado();
                MatrizEmpleado[Fila][5] = this.getApellidos();
                MatrizEmpleado[Fila][6] = this.getNombres();
                MatrizEmpleado[Fila][7] = this.getFec_Nac();
                MatrizEmpleado[Fila][8] = this.getNacionalidad();
                MatrizEmpleado[Fila][9] = this.getTipo_Doc_Identidad();
                MatrizEmpleado[Fila][10] = this.getNum_Doc_Identidad();
                MatrizEmpleado[Fila][11] = this.getDepartamento();
                MatrizEmpleado[Fila][12] = this.getProvincia();
                MatrizEmpleado[Fila][13] = this.getDistrito();
                MatrizEmpleado[Fila][14] = this.getDireccion();
                MatrizEmpleado[Fila][15] = this.getTelefono();
                MatrizEmpleado[Fila][16] = this.getEmail();
                MatrizEmpleado[Fila][17] = this.getFoto();
                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {

            System.out.println("Error: DAL/Empleado" + Error.getMessage());
          }}
           

    
    
}
