public class Persona {
 String usuario;   
 String contraseña;     
 String estado;   
 
 public Persona(){
     this.usuario="";
     this.contraseña="";             
     this.estado="";                
 }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
