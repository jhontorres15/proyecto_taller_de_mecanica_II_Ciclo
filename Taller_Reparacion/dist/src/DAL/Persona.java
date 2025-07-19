
package DAL;

import java.io.File;
import java.util.Scanner;

public class Persona 
{
  //Definir atributos
    private String Apellidos;
    private String Nombres;
    private String Fec_Nac;
    private String Nacionalidad;
    private String Tipo_Doc_Identidad;
    private String Num_Doc_Identidad;
    private String Departamento;
    private String Provincia;
    private String Distrito;
    private String Direccion;  
    private String Telefono;
    private String Email;
    


public Persona(String Pers_Apellidos,
               String Pers_Nombres,
               String Pers_Fec_Nac,
               String Pers_Nacionalidad,
               String Pers_TipoDoc_Identidad,
               String Pers_NumDoc_Identidad,
               String Pers_Departamento,
               String Pers_Provincia,
               String Pers_Distrito,
               String Pers_Direccion,
               String Pers_Telefono,
               String Pers_Email)
    {
     this.Apellidos = Pers_Apellidos;
     this.Nombres = Pers_Nombres;
     this.Fec_Nac = Pers_Fec_Nac;
     this.Nacionalidad = Pers_Nacionalidad;
     this.Tipo_Doc_Identidad = Pers_TipoDoc_Identidad;
     this.Num_Doc_Identidad = Pers_NumDoc_Identidad;
     this.Departamento = Pers_Departamento;
     this.Provincia = Pers_Provincia;
     this.Distrito = Pers_Distrito;
     this.Direccion = Pers_Direccion;
     this.Telefono = Pers_Telefono;
     this.Email = Pers_Email;
    }
   //definir las propiedades(encapsulamiento de datos)



        public String getApellidos() {
            return Apellidos;
        }

        public void setApellidos(String Apellidos) {
            this.Apellidos = Apellidos;
        }

        public String getNombres() {
            return Nombres;
        }

        public void setNombres(String Nombres) {
            this.Nombres = Nombres;
        }

        public String getFec_Nac() {
            return Fec_Nac;
        }

        public void setFec_Nac(String Fec_Nac) {
            this.Fec_Nac = Fec_Nac;
        }


        public String getNacionalidad() {
            return Nacionalidad;
        }

        public void setNacionalidad(String Nacionalidad) {
            this.Nacionalidad = Nacionalidad;
        }

        public String getTipo_Doc_Identidad() {
            return Tipo_Doc_Identidad;
        }

        public void setTipo_Doc_Identidad(String Tipo_Doc_Identidad) {
            this.Tipo_Doc_Identidad = Tipo_Doc_Identidad;
        }

        public String getNum_Doc_Identidad() {
            return Num_Doc_Identidad;
        }

        public void setNum_Doc_Identidad(String Num_Doc_Identidad) {
            this.Num_Doc_Identidad = Num_Doc_Identidad;
        }

        public String getDepartamento() {
            return Departamento;
        }

        public void setDepartamento(String Departamento) {
            this.Departamento = Departamento;
        }

        public String getProvincia() {
            return Provincia;
        }

        public void setProvincia(String Provincia) {
            this.Provincia = Provincia;
        }

        public String getDistrito() {
            return Distrito;
        }

        public void setDistrito(String Distrito) {
            this.Distrito = Distrito;
        }

        public String getDireccion() {
            return Direccion;
        }

        public void setDireccion(String Direccion) {
            this.Direccion = Direccion;
        }

        public String getTelefono() {
            return Telefono;
        }

        public void setTelefono(String Telefono) {
            this.Telefono = Telefono;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }
        
        
        //Crear un Vector de Datos Bidimensional (String): Matriz de Datos
        public String [ ] [ ] MatrizNacionalidad;
        public String [ ] [ ] MatrizDocumentosidentidad;
        public String [ ] [ ] MatrizDepartamento;
        public String [ ] [ ] MatrizProvincia;
        public String [ ] [ ] MatrizDistrito;

         //Crear Método Público: Leer_Documentos_Identidad
        public void Leer_Nacionalidad(String Ruta)
        {
                Scanner Linea;
       
        //Obtener el Nombre del Archivo de Texto
        File Leer_Doc = new File(Ruta);

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
            Fila = (Fila / 1); // 1 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizNacionalidad = new String [Fila][1]; // 1 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setNacionalidad(Linea.nextLine());
                 
                //Establecer Valores a la Matriz de Datos
                MatrizNacionalidad[Fila][0] = this.getNacionalidad();
                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: nacionalidad" + Error.getMessage());
          }
        }
        
        //Crear Método Público: Leer_Documentos_Identidad
        public void Leer_Documentos_Identidad(String Ruta)
        {
                Scanner Linea;
       
        //Obtener el Nombre del Archivo de Texto
        File Leer_Doc = new File(Ruta);

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
            Fila = (Fila / 1); // 1 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizDocumentosidentidad = new String [Fila][1]; // 1 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setTipo_Doc_Identidad(Linea.nextLine());
                 
                //Establecer Valores a la Matriz de Datos
                MatrizDocumentosidentidad[Fila][0] = this.getTipo_Doc_Identidad();
                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: en leer documerto de identidad" + Error.getMessage());
          }
        }
        
        
    //Crear metodo publico :Leer_Departamentos
    public void Leer_Departamentos(String Ruta)
    {
        //Declarar una variable de tipo:Scanner
        Scanner Linea;
        //Obtener el nombre del archivo del texto
        File Leer_Doc=new File (Ruta);
        //Declarar una variable de tipo : Contador
        int Fila=0;
        //Crear un controlador de error
        try
        {
            //Leer documento (nombre del archivo)
            Linea =new Scanner (Leer_Doc);
            //Crear estructura repetitiva (Bucle) while (Leer las lineas de texto)
            while (Linea.hasNextLine())
            {
                //Leer Lineas
                Linea.nextLine();
                //Incrementar el valor de la variable 
                Fila++;
            }
            
            //Establecer valor de fila 
            Fila=(Fila/1); //1 Columna
            
            //Asignar tamaño de la matriz de datos (Bidimensional
            MatrizDepartamento =new String[Fila][1]; //1 Columna
            
            //Volver a asignar el valor de 0 a la variable 
            Fila=0;
            
            //Leer documento (Nombre del Archivo)
            Linea = new Scanner (Leer_Doc);
            
            //Crear Estructura Rpepetitiva (Bucle) while(Leer lineas del archivo)
            while (Linea.hasNextLine())
            {
                //Leer datos del archivo
                this.setDepartamento(Linea.nextLine());
               
                //Establecer valores a la matriz de datos 
                MatrizDepartamento[Fila][0]=this.getDepartamento();
                 
                //Incrementar el valor de la ventana 
                Fila++;             
            }
        }
        catch (Exception Error)
        {
            //Mostrar error
            System.out.println("Error:"+Error.getMessage());
        }
        }

        //Crear Metodo Publico: Leer_Provincias 
        public void Leer_Provincia(String Ruta) 
       { 
       //Declarar una variable de Tipo: Scanner 
       Scanner Linea;
    
       //Obtener el Nombre del Archivo de Texto 
      File Leer_Doc = new File(Ruta);
    
       //Declarar una Variable de Tipo: Contador 
       int Fila = 0;
    
       //Crear Controlador de Error 
       try { 
        //Leer Documento (Nombre del Archivo)
        Linea = new Scanner(Leer_Doc);
        
        //Crear Estructura Repetitiva (Bucle): while (Leer las lineas de texto del Archivo) 
        while (Linea.hasNextLine()){
        
        //Leer Lineas 
        Linea.nextLine();
        
        //Incrementar el valor de la Variable 
        Fila++;
        }
        //Establecer Valor de Fila 
        Fila = (Fila / 2); // 2 Columnas
        
        //Asignar Tamaño de la Matriz de Datos 
        MatrizProvincia = new String [Fila] [2]; // 2 Columnas
        
        //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila 
        Fila = 0;
        
        //Leer Documento (Nombre del Archivo)
        Linea = new Scanner(Leer_Doc);
        
        //Crear Estructura Repetitiva (Bucle): while (Leer lineas del archivo) 
       while (Linea.hasNextLine())
       { 
       //Leer Datos del Archivo de Texto 
       this.setProvincia(Linea.nextLine()); 
       this.setDepartamento(Linea.nextLine());
            
        //Establecer Valores a la Matriz de Datos 
       MatrizProvincia[Fila][0] = this.getProvincia(); 
       MatrizProvincia[Fila][1] = this.getDepartamento();
            
       //Incrementar el valor de la Variable 
      Fila++;
        }
        }
        catch (Exception Error)
        {
        //Mostrar Error 
        System.out.println("Error: " + Error.getMessage());
        }
        }
        
        //Crear Metodo Publico: Leer_Distritos 
        public void Leer_Distrito(String Ruta) 
        {
        //Declarar una variable de Tipo: Scanner 
        Scanner Linea;
    
        //Obtener el Nombre del Archivo de Texto 
        File Leer_Doc = new File(Ruta);
    
        //Declarar una Variable de Tipo: Contador 
        int Fila = 0;
    
         //Crear Controlador de Error 
        try 
        {
        //Leer Documento (Nombre del Archivo)
        Linea = new Scanner(Leer_Doc);
        
        //Crear Estructura Repetitiva (Bucle): while (Leer las lineas de texto del Archivo) 
        while (Linea.hasNextLine()){
        
        //Leer Lineas 
        Linea.nextLine();
        
        //Incrementar el valor de la Variable 
        Fila++;
        }
        //Establecer Valor de Fila 
        Fila = (Fila / 3); // 3 Columnas
        
        //Asignar Tamaño de la Matriz de Datos 
        MatrizDistrito = new String [Fila][3]; // 3 Columnas
        
        //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila 
        Fila = 0;
        
        //Leer Documento (Nombre del Archivo)
        Linea = new Scanner(Leer_Doc);
        
        //Crear Estructura Repetitiva (Bucle): while (Leer lineas del archivo) 
        while (Linea.hasNextLine()) {
            //Leer Datos del Archivo de Texto 
            this.setDistrito(Linea.nextLine()); 
            this.setProvincia(Linea.nextLine()); 
            this.setDepartamento(Linea.nextLine());
            
            //Establecer Valores a la Matriz de Datos 
            MatrizDistrito[Fila][0] = this.getDistrito(); 
            MatrizDistrito[Fila][1] = this.getProvincia(); 
            MatrizDistrito[Fila][2] = this.getDepartamento();
            
            //Incrementar el valor de la Variable 
            Fila++;
        }
        }
        catch (Exception Error) 
        {
        //Mostrar Error 
        System.out.println("Error: " + Error.getMessage());
        }
}

}