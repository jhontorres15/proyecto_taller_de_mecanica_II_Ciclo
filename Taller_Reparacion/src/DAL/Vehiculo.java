
package DAL;

import java.io.File;
import java.util.Scanner;

public class Vehiculo {
    
    
   private String Cod_Cliente; 
   private String matricula;
   private String Color;
   private String marca;
   private String modelo;
   private String km;
   private String foto;
   
   
   
   
  public Vehiculo(String Vehiculo_cliente,
                  String Vehiculo_matricula,
                  String Vehiculo_Color,
                  String Vehiculo_marca,
                  String Vehiculo_modelo,
                  String Vehiculo_km,
                  String Vehiculo_Foto)
          
    {   
        this.Cod_Cliente = Vehiculo_cliente;
        this.matricula = Vehiculo_matricula;
        this.Color = Vehiculo_Color;
        this.marca = Vehiculo_marca;
        this.modelo = Vehiculo_modelo;
        this.km = Vehiculo_km;
        this.foto = Vehiculo_Foto;
    }
    
    public String getCodCliente() {
        return Cod_Cliente;
    }

    public void setCodCliente(String codCliente) {
        this.Cod_Cliente = codCliente;
    }
     
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }
    
    public String getfoto() {
        return foto;
    }

    public void setfoto(String foto) {
        this.foto = foto;
    }
    
     public String [ ] [ ] MatrizMarca; 
     public String [ ] [ ] MatrizColor;
     public String [ ] [ ] MatrizModelo;    
     public String [ ] [ ] MatrizVehiculo;
    
   //crear metodo leer vehiculo 
    public void Leer_Vehiculo(String ruta)
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
            Fila = (Fila / 7); // 7 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizVehiculo = new String [Fila][7]; //7 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setCodCliente(Linea.nextLine());
                this.setMatricula(Linea.nextLine());
                this.setColor(Linea.nextLine());
                this.setMarca(Linea.nextLine());
                this.setModelo(Linea.nextLine());
                this.setKm(Linea.nextLine());
                this.setfoto(Linea.nextLine());
                 
                //Establecer Valores a la Matriz de Datos
                MatrizVehiculo[Fila][0] = this.getCodCliente();
                MatrizVehiculo[Fila][1] = this.getMatricula();
                MatrizVehiculo[Fila][2] = this.getColor();
                MatrizVehiculo[Fila][3] = this.getMarca();
                MatrizVehiculo[Fila][4] = this.getModelo();
                MatrizVehiculo[Fila][5] = this.getKm();
                MatrizVehiculo[Fila][6] = this.getfoto();
              
            Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: dal" + Error.getMessage());
           }

    }
     
     public void Leer_Marca(String Ruta)
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
            MatrizMarca = new String [Fila][1]; // 1 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setMarca(Linea.nextLine());
                 
                //Establecer Valores a la Matriz de Datos
                MatrizMarca[Fila][0] = this.getMarca();
                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: marca" + Error.getMessage());
          }
        }
     
     public void Leer_Modelo(String Ruta)
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
            Fila = (Fila / 2); // 2 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizModelo = new String [Fila][2]; // 2Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setModelo(Linea.nextLine());
                this.setMarca(Linea.nextLine());
                 
                //Establecer Valores a la Matriz de Datos
                MatrizModelo[Fila][0] = this.getModelo();
                MatrizModelo[Fila][1] = this.getMarca();
                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: modelo" + Error.getMessage());
           }
        }
      public void Leer_Color(String Ruta)
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
            MatrizColor = new String [Fila][1]; // 1 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setColor(Linea.nextLine());
                 
                //Establecer Valores a la Matriz de Datos
                MatrizColor[Fila][0] = this.getColor();
                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: Color" + Error.getMessage());
          }
        }
     
  }
