
import javax.swing.JRadioButton;


public class CatalogoPropietarios {
    private String Nompropietario;
    private String Apellidos;
    private String Ciudad;
    private String Direccion;
    private int telefono;
    private String correo;
    private String estado;

    public CatalogoPropietarios() {
        this.Nompropietario = null;
        this.Apellidos = null;
        this.Ciudad = null;
        this.Direccion = null;
        this.telefono = 0;
        this.correo = null;
        this.estado = null;
        
    }
    
    

    public CatalogoPropietarios(String Nompropietario, String Apellidos, String Ciudad, String Direccion, int telefono, String correo, String estado) {
        this.Nompropietario = Nompropietario;
        this.Apellidos = Apellidos;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    CatalogoPropietarios(String nompropietario, String apellidos, String ciudad, String direccion, String Correo, int Telefono, JRadioButton estado1) {
        this.Nompropietario = Nompropietario;
        this.Apellidos = Apellidos;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    
    public String getNompropietario() {
        return Nompropietario;
    }

    public void setNompropietario(String Nompropietario) {
        this.Nompropietario = Nompropietario;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String GetDatos(){
        return "Propietarios;\n"
                + "nombre del prorpietario"+ Nompropietario + Apellidos+"\nciudad:"+Ciudad+"\ndireccion"+Direccion+"\nNúmero de telefono;"+telefono+"\n correo electronico"+correo+"\nestado:"+estado;    }
  
    
  
                
    }


