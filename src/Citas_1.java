
public class Citas_1 {
    public String fecha;
    public String hora;
    public String mascota;
    public String propietario;
    public String Nveterinario;
    public int pago;

    
        public Citas_1() {
        this.fecha= "";
        this.hora = "";
        this.mascota = "";
        this.propietario = "";
        this.Nveterinario = "";
        this.pago = 0;

    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getNveterinario() {
        return Nveterinario;
    }

    public void setNveterinario(String Nveterinario) {
        this.Nveterinario = Nveterinario;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
        
}
