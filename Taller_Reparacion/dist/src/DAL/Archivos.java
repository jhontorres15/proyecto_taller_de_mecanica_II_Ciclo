
package DAL;


public class Archivos {
      
//Definir atributos
    private String Apellidos;
    private String Nombres;
    private String Nacionalidad;
    private String TipoDoc;
    private String NumDoc;
    private String Distrito; 
    private String Direcc;  
    private String placa;
    private String Colores;
    private String marcas;
    private String modelos;
    private String kms;
    private String Foto;


public Archivos(String Archi_Apellidos,      
                String Archi_Nombres,
                String Archi_Nacionalidad,
                String Archi_TipoDoc_Identidad,
                String Archi_NumDoc_Identidad,
                String Archi_Distrito,
                String Archi_Direccion,
                String Archi_Vehiculo_matricula,
                String Archi_Vehiculo_Color,
                String Archi_Vehiculo_marca,
                String Archi_Vehiculo_modelo,
                String Archi_Vehiculo_km,
                String Archi_Vehiculo_Foto)
    {
     this.Apellidos = Archi_Apellidos;
     this.Nombres = Archi_Nombres;
     this.Nacionalidad = Archi_Nacionalidad;
     this.TipoDoc = Archi_TipoDoc_Identidad;
     this.NumDoc = Archi_NumDoc_Identidad;
     this.Distrito = Archi_Distrito;
     this.Direcc = Archi_Direccion;
     this.placa = Archi_Vehiculo_matricula;
     this.Colores = Archi_Vehiculo_Color;
     this.marcas = Archi_Vehiculo_marca;
     this.modelos = Archi_Vehiculo_modelo;
     this.kms = Archi_Vehiculo_km;
     this.Foto = Archi_Vehiculo_Foto;
    }

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

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getTipoDoc() {
        return TipoDoc;
    }

    public void setTipoDoc(String TipoDoc) {
        this.TipoDoc = TipoDoc;
    }

    public String getNumDoc() {
        return NumDoc;
    }

    public void setNumDoc(String NumDoc) {
        this.NumDoc = NumDoc;
    }
    
    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }
    
    public String getDirecc() {
        return Direcc;
    }

    public void setDirecc(String Direcc) {
        this.Direcc = Direcc;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public String getKms() {
        return kms;
    }

    public void setKms(String kms) {
        this.kms = kms;
    }

   
}

