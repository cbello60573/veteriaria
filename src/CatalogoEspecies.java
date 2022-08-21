
public class CatalogoEspecies {
    String NomEspecie;
    private String Caracteristicas;
    private String Estado;

    public CatalogoEspecies() {
        this.NomEspecie = null ;
        this.Caracteristicas = null;
        this.Estado = null;
    }
    
    

    public CatalogoEspecies(String NomEspecie, String Caracteristicas, String Estado) {
        this.NomEspecie = NomEspecie;
        this.Caracteristicas = Caracteristicas;
        this.Estado = Estado;
    }

    CatalogoEspecies(String nomespecie, String caracteristicas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNomEspecie() {
        return NomEspecie;
    }

    public void setNomEspecie(String NomEspecie) {
        this.NomEspecie = NomEspecie;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
    
    
}
