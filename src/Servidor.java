
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor extends Observable implements Runnable{
    
    
    private int Puerto;
    
    public Servidor (int Puerto){
        this.Puerto=Puerto;
        
    }

    Servidor(int i, int mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Servidor(int i, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void run() {
        
        ServerSocket servidor=null;
        Socket sc=null;
        DataInputStream in;
        DataInputStream out;
        
        
        
        try {
            servidor= new ServerSocket(Puerto);
            System.out.println("iniciando Servidor");
            
            while(true){
                
                sc= servidor.accept();
                System.out.println("empleado conectado");
                in= new DataInputStream(sc.getInputStream());
                
                String mensaje = in.readUTF();
                System.out.println(mensaje);
                
                this.setChanged();
                this.notifyObservers();
                this.clearChanged();
                
                sc.close();
                System.out.println("empelado desconectado");
                
                
            }
        }catch(IOException ex){
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        
    }
    
}
