
package DAL;

import java.io.File;
import java.util.Scanner;


public class Servicio extends Archivos
{
    private String CodServ;
    private String year;
    
    public Servicio        (String CodServi,
                            String Servicioyear,
                            String ServicioApellidos,
                            String ServicioNombres,
                            String ServicioNacionalidad,
                            String ServicioTipo_Doc_Identidad,
                            String ServicioNum_Doc_Identidad,
                            String ServicioDistrito,
                            String ServicioDireccion,
                            String ServicioVehiculo_matricula,
                            String ServicioVehiculo_Color,
                            String ServicioVehiculo_marca,
                            String ServicioVehiculo_modelo,
                            String ServicioVehiculo_km,
                            String ServicioVehiculo_Foto
                           )
{
        super (ServicioApellidos,
               ServicioNombres,
               ServicioNacionalidad,
               ServicioTipo_Doc_Identidad,
               ServicioNum_Doc_Identidad,
               ServicioDistrito,
               ServicioDireccion,
               ServicioVehiculo_matricula,
               ServicioVehiculo_Color,
               ServicioVehiculo_marca,
               ServicioVehiculo_modelo,
               ServicioVehiculo_km,
              ServicioVehiculo_Foto);
        this.CodServ = CodServi;
        this.year =  Servicioyear;
}

    public String getCodServ() {
        return CodServ;
    }

    public void setCodServ(String CodServ) {
        this.CodServ = CodServ;
    }

   

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
       public String [][] MatrizServicio;
   
    //crear metodo leer clientes 
    public void Leer_Orden_Servicio(String ruta)
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
            Fila = (Fila / 15); // 18 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizServicio = new String [Fila][15]; // 17 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setCodServ(Linea.nextLine());//1
                this.setApellidos(Linea.nextLine());//2
                this.setNombres(Linea.nextLine());//3
                this.setNacionalidad(Linea.nextLine());//4
                this.setTipoDoc(Linea.nextLine());//5
                this.setNumDoc(Linea.nextLine());//6
                this.setDistrito(Linea.nextLine());//7
                this.setDirecc(Linea.nextLine());//8
                this.setPlaca(Linea.nextLine());//9
                this.setColores(Linea.nextLine());//10
                this.setMarcas(Linea.nextLine());//11
                this.setModelos(Linea.nextLine());//12
                this.setKms(Linea.nextLine());//13
                this.setFoto(Linea.nextLine());//14
                this.setYear(Linea.nextLine());//15

                //Establecer Valores a la Matriz de Datos
                MatrizServicio[Fila][0] = this.getCodServ();
                MatrizServicio[Fila][1] = this.getApellidos();
                MatrizServicio[Fila][2] = this.getNombres();
                MatrizServicio[Fila][3] = this.getNacionalidad();
                MatrizServicio[Fila][4] = this.getTipoDoc();
                MatrizServicio[Fila][5] = this.getNumDoc();
                MatrizServicio[Fila][6] = this.getDistrito();
                MatrizServicio[Fila][7] = this.getDirecc();
                MatrizServicio[Fila][8] = this.getPlaca();
                MatrizServicio[Fila][9] = this.getColores();
                MatrizServicio[Fila][10] = this.getMarcas();
                MatrizServicio[Fila][11] = this.getModelos();
                MatrizServicio[Fila][12] = this.getKms();
                MatrizServicio[Fila][13] = this.getFoto();
                MatrizServicio[Fila][14] = this.getYear();
                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: Serv" + Error.getMessage());
           }

    }
    
}