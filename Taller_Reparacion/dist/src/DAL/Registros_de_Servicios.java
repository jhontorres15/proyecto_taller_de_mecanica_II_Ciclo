
package DAL;

import java.io.File;
import java.util.Scanner;


public class Registros_de_Servicios {
    private String CodServ;
    private String Servicio;
    private String SubServ;
    private String Precio ;
    private String cantidad;
    private String Total;
    
     public Registros_de_Servicios(String CodServi,
                                   String ServicioMayor,
                                   String SubServicio,
                                   String Prec, 
                                   String Cant,
                                   String total)
    {
    this.CodServ = CodServi;
    this.Servicio= ServicioMayor;
    this.Servicio = SubServicio;
    this.Precio = Prec;
    this.cantidad = Cant;
    this.Total = total;
    }

    public String getCodServ() {
        return CodServ;
    }

    public void setCodServ(String CodServ) {
        this.CodServ = CodServ;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public String getSubServ() {
        return SubServ;
    }

    public void setSubServ(String SubServ) {
        this.SubServ = SubServ;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
     
        public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }
    
      public String [][] MatrizRegistrosDeServicios;
    
      public void Leer_Detalles_Servicios(String ruta)
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
            Fila = (Fila / 6); // 18 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizRegistrosDeServicios = new String [Fila][6]; //

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setCodServ(Linea.nextLine());//
                this.setServicio(Linea.nextLine());//
                this.setSubServ(Linea.nextLine());
                this.setPrecio(Linea.nextLine());
                this.setCantidad(Linea.nextLine());
                this.setTotal(Linea.nextLine());
                


                //Establecer Valores a la Matriz de Datos
                MatrizRegistrosDeServicios[Fila][0] = this.getCodServ();
                MatrizRegistrosDeServicios[Fila][1] = this.getServicio();
                MatrizRegistrosDeServicios[Fila][2] = this.getSubServ();
                MatrizRegistrosDeServicios[Fila][3] = this.getPrecio();
                MatrizRegistrosDeServicios[Fila][4] = this.getCantidad();
                MatrizRegistrosDeServicios[Fila][5] = this.getTotal();

                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: registros Serv" + Error.getMessage());
           }

    }


      
     
}
