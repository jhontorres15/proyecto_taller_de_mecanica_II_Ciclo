
package DAL;

import java.io.File;
import java.util.Scanner;


public class Orden_Internamiento extends Archivos
{
    private String CodIntern;
    private String FechaIngreso;
    private String FechaEntrega;
    private String year;
            
   //Constructor de la Sub Clase: Cliente
public Orden_Internamiento (String InterCodIntern,
                            String InterFechaIngreso,
                            String InterFechaEntrega,
                            String Interyear,
                            String InterApellidos,
                            String InterNombres,
                            String InterNacionalidad,
                            String InterTipo_Doc_Identidad,
                            String InterNum_Doc_Identidad,
                            String InterDistrito,
                            String InterDireccion,
                            String InterVehiculo_matricula,
                            String InterVehiculo_Color,
                            String InterVehiculo_marca,
                            String InterVehiculo_modelo,
                            String InterVehiculo_km,
                            String InterVehiculo_Foto
                            )
{
        super (InterApellidos,
               InterNombres,
               InterNacionalidad,
               InterTipo_Doc_Identidad,
               InterNum_Doc_Identidad,
               InterDistrito,
               InterDireccion,
               InterVehiculo_matricula,
               InterVehiculo_Color,
               InterVehiculo_marca,
               InterVehiculo_modelo,
               InterVehiculo_km,
              InterVehiculo_Foto);
        this.CodIntern = InterCodIntern;
        this.FechaIngreso = InterFechaIngreso;
        this.FechaEntrega = InterFechaEntrega;
        this.year = Interyear;
}

    public String getCodIntern() {
        return CodIntern;
    }

    public void setCodIntern(String CodIntern) {
        this.CodIntern = CodIntern;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
     
    public String [][] MatrizInternamiento;
   
    //crear metodo leer clientes 
    public void Leer_Orden_Internamiento(String ruta)
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
            Fila = (Fila / 17); // 17 Columnas
            
            //Asignar Tamaño de la Matriz de Datos
            MatrizInternamiento = new String [Fila][17]; // 17 Columnas

            //Volver a Asignar el valor de 0 (Cero) a la Variable: Fila
            Fila = 0;
            //Leer Documento (Nombre del Archivo)
            Linea = new Scanner(Leer_Doc);

            //Crear Estructura Repetitiva (Bucle): while (Leer líneas del archivo)
            while (Linea.hasNextLine())
            {
              //Leer Datos del Archivo de Texto
                this.setCodIntern(Linea.nextLine());//1
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
                this.setFechaIngreso(Linea.nextLine());//15
                this.setFechaEntrega(Linea.nextLine());//16
                this.setYear(Linea.nextLine());//17

                //Establecer Valores a la Matriz de Datos
                MatrizInternamiento[Fila][0] = this.getCodIntern();
                MatrizInternamiento[Fila][1] = this.getApellidos();
                MatrizInternamiento[Fila][2] = this.getNombres();
                MatrizInternamiento[Fila][3] = this.getNacionalidad();
                MatrizInternamiento[Fila][4] = this.getTipoDoc();
                MatrizInternamiento[Fila][5] = this.getNumDoc();
                MatrizInternamiento[Fila][6] = this.getDistrito();
                MatrizInternamiento[Fila][7] = this.getDirecc();
                MatrizInternamiento[Fila][8] = this.getPlaca();
                MatrizInternamiento[Fila][9] = this.getColores();
                MatrizInternamiento[Fila][10] = this.getMarcas();
                MatrizInternamiento[Fila][11] = this.getModelos();
                MatrizInternamiento[Fila][12] = this.getKms();
                MatrizInternamiento[Fila][13] = this.getFoto();
                MatrizInternamiento[Fila][14] = this.getFechaIngreso();
                MatrizInternamiento[Fila][15] = this.getFechaEntrega();
                MatrizInternamiento[Fila][16] = this.getYear();

                
                Fila++;  //incremnetrase el vaor de la variable
            }
          }
          catch (Exception Error)
          {
            //Mostrar Error
            System.out.println("Error: Orden_intern" + Error.getMessage());
           }

    }
}
