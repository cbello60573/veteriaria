import javax.swing.JOptionPane;


public class citas implements modulo3, modificar, cancelar, reservar {
    
    private String Fecha;
    private int Hora;
    private String NomMascota;
    private String NomPropietario;
    private int Pago;
    private String Veterinario;
    public String cambio;
    public String FerchaC;
    public String resultado;
    
    

    public citas(String Fecha, int Hora, String NomMascota, String NomPropietario, int Pago, String Veterinario) {
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.NomMascota = NomMascota;
        this.NomPropietario = NomPropietario;
        this.Pago = Pago;
        this.Veterinario = Veterinario;
    }

   

    
    @Override
    public void reserva() {
        String FechaR=JOptionPane.showInputDialog("que fecha quiere agendar la cita?");
        int HoraR=Integer.parseInt(JOptionPane.showInputDialog("A que hora desea la cita?"));
        //excepcion si ya una cita a esa hora
    }
    
    
    
    
    
    @Override
    public String Citas() {
        
        NomMascota=JOptionPane.showInputDialog("Digite el nombre de la mascota:");
        NomPropietario=JOptionPane.showInputDialog("Digite el nombre del propietario:");
        //exepcion de si ya esta el nombre de la mascota
        Pago=Integer.parseInt(JOptionPane.showInputDialog("digite el monto de la cita:"));
        Veterinario=JOptionPane.showInputDialog("Digite el nombre del veterinario:");
        return null;
        
        
        
    }

    @Override
    public void modificar() {
        String cambio=JOptionPane.showInputDialog("que desea modificar?");
        
        
        
    }

    @Override
    public void canelar() {
        String FechaC=JOptionPane.showInputDialog("digite la fecha de su cita");
        int HoraC=Integer.parseInt(JOptionPane.showInputDialog("digite la hora de su cita"));
        String resultado=JOptionPane.showInputDialog("esta seguro/a de querer cancelar su cita? si/no");
        
                
    }

    
    
    
    
}
