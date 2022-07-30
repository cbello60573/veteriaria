import javax.swing.JOptionPane;
import java.util.LinkedList;


public class Usuario {
    
    LinkedList<String> lista = new LinkedList();
    
    Persona u = new Persona();
    String usua;
    String contra;
    
    public void agregar(){
        
        u.usuario = JOptionPane.showInputDialog("Ingresu su usuario");
        u.contraseña = JOptionPane.showInputDialog("Ingrese su contraseña");
        u.nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        u.apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        u.estado = JOptionPane.showInputDialog("Ingrese su estado");
        
        lista.add(u.usuario);//0
        lista.add(u.contraseña);//1
        lista.add(u.nombre);//2
        lista.add(u.apellido);//3
        lista.add(u.estado);//4
    }
    public void consultar(){
        
        int x;
        for(x = 0; x < 1;x++){
        usua = JOptionPane.showInputDialog(null, "Ingrese su usuario");
        contra = JOptionPane.showInputDialog(null, "Ingrese su usuario");
            if(usua == null ? u.usuario == null : usua.equals(u.usuario)){
               if(contra == null ? u.contraseña == null: contra.equals(u.contraseña)){
               System.out.println("Bienvenido " +lista.get(lista.indexOf(u.nombre))); 
               }else{
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                consultar();
               } 
            }else{
                JOptionPane.showMessageDialog(null,"Usuario incorrecto");
                consultar();
            }
        }
    }
}
