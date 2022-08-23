
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;



public class ReservarCita extends javax.swing.JFrame {
    
    public String propietario;
    public String fech;
    public String hor;
    public String mascot;
    public String Nveterinario;
    public int pag;      
    
    public ReservarCita() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
    }
public void agregar() {
        Citas_1 e = new Citas_1();
        ReservarCita rc = new ReservarCita();

        e.setPropietario(Propietariotext.getText());
        e.setFecha(fecha.getText());
        e.setHora(hora.getText());
        e.setMascota(animaltext.getText());
        e.setNveterinario(JOptionPane.showInputDialog(null,
                "Digite el nombre del veterinario :"));
        e.setPago(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite la cantidad a pagar :")));
        try {
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream("citas.dat", true));
            dos.writeUTF(e.getPropietario());
            dos.writeUTF(e.getFecha());
            dos.writeUTF(e.getHora());
            dos.writeUTF(e.getMascota());
            dos.writeUTF(e.getNveterinario());
            dos.writeInt(e.getPago());
            JOptionPane.showMessageDialog(null,
                    "¡Datos fueron grabados correctamente!", "Datos agregados",
                    JOptionPane.INFORMATION_MESSAGE);
            dos.close();
        } catch (IOException ex01) {
            JOptionPane.showMessageDialog(null,
                    "¡Ocurrió un error al guardar, revise!",
                    "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consultar() {
        int encontrado = 0;
        try {
            String propietaris = JOptionPane.showInputDialog(null, "Digite el nombre a consultar:");
            DataInputStream dis = new DataInputStream(new FileInputStream("citas.dat"));
            try {
                while (true) {
                    propietario=dis.readUTF();
                    fech = dis.readUTF();
                    hor = dis.readUTF();
                    mascot = dis.readUTF();
                    Nveterinario = dis.readUTF();
                    pag = dis.readInt();
                    if (propietario.equals(propietaris)) {
                        encontrado = 1;
                        JOptionPane.showMessageDialog(null, "El propietario " + propietario +
                                "\n con fecha cita " + fech
                                + "\n Con hora cita " + hor + 
                                "\n con el veterinario " + Nveterinario + 
                                "\n factura:  " + pag);
                    }
                }
            } catch (EOFException ex02) {
                dis.close();
                if (encontrado == 0) {
                    JOptionPane.showMessageDialog(null, "¡El propietario buscado no existe!");
                }
            }
        } catch (FileNotFoundException ex03) {
            JOptionPane.showMessageDialog(null, "¡El archivo no existe!");
        } catch (IOException ex04) {
            JOptionPane.showMessageDialog(null, "¡Error inesperado!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editar() {
        try {
            try {
                String prop;
                prop = JOptionPane.showInputDialog(null,"Digite el nombre del propietario a modificar:");
                DataInputStream dis = new DataInputStream(new FileInputStream(
                        "citas.dat"));
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(
                        "auxiliar.dat"));
                try {
                    while (true) {
                        propietario=dis.readUTF();
                        fech = dis.readUTF();
                        hor = dis.readUTF();
                        mascot = dis.readUTF();
                        Nveterinario = dis.readUTF();
                        pag = dis.readInt();
                        if (prop == null ? propietario == null : prop.equals(propietario)) {
                            fech = JOptionPane.showInputDialog(null,
                                    "Digite la nueva fecha de la cita:");
                            hor = ((JOptionPane.showInputDialog(null,
                                    "Digite la nueva hora de la cita:")));
                            JOptionPane.showMessageDialog(null, "¡Cita Modificada!");
                        }
                        dos.writeUTF(propietario);
                        dos.writeUTF(fech);
                        dos.writeUTF(hor);
                        dos.writeUTF(mascot);
                        dos.writeUTF(Nveterinario);
                        dos.writeInt(pag);
                    }
                } catch (EOFException e0) {
                    dis.close();
                    dos.close();
                    intercambiar();
                }
            } catch (FileNotFoundException e1) {
                JOptionPane.showMessageDialog(null, "¡El archivo no existe!");
            }
        } catch (IOException e2) {
            JOptionPane.showMessageDialog(null, "¡Error inesperado!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminar() {
        String propietari;
        try {
            propietari = JOptionPane.showInputDialog(null,
                    "Digite el nombre del propietario que desea eliminar:");
            DataInputStream dis = new DataInputStream(new FileInputStream(
                    "citas.dat"));
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
                    "auxiliar.dat"));
            try {
                while (true) {
                    propietario=dis.readUTF();
                    fech = dis.readUTF();
                    hor = dis.readUTF();
                    mascot = dis.readUTF();
                    Nveterinario = dis.readUTF();
                    pag = dis.readInt();
                    if (propietari == null ? propietario != null : !propietari.equals(propietario)) {
                        dos.writeUTF(propietario);
                        dos.writeUTF(fech);
                        dos.writeUTF(hor);
                        dos.writeUTF(mascot);
                        dos.writeUTF(Nveterinario);
                        dos.writeInt(pag);
                    }
                    JOptionPane.showMessageDialog(null,"Datos borrados");
                }
            } catch (EOFException ex05) {
                dis.close();
                dos.close();
                intercambiar();
            }
        } catch (FileNotFoundException ex06) {
            JOptionPane.showMessageDialog(null, "¡El archivo no existe!");
        } catch (IOException ex07) {
            JOptionPane.showMessageDialog(null, "¡Error inesperado!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public void intercambiar() {
        try {
            DataInputStream dis=new DataInputStream(new FileInputStream("auxiliar.dat"));
            DataOutputStream dos=new DataOutputStream(new FileOutputStream("citas.dat"));
            try {
                while (true) {
                    propietario=dis.readUTF();
                    fech = dis.readUTF();
                    hor = dis.readUTF();
                    mascot = dis.readUTF();
                    Nveterinario = dis.readUTF();
                    pag = dis.readInt();
                    
                    dos.writeUTF(propietario);
                    dos.writeUTF(fech);
                    dos.writeUTF(hor);
                    dos.writeUTF(mascot);
                    dos.writeUTF(Nveterinario);
                    dos.writeInt(pag);
                }
            } catch (EOFException ex05) {
                dis.close();
                dos.close();
            }
        } catch (FileNotFoundException ex06) {
            JOptionPane.showMessageDialog(null, "¡El archivo no existe!");
        } catch (IOException ex07) {
            JOptionPane.showMessageDialog(null, "¡Error inesperado!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Activar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Propietariotext = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        animaltext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JFormattedTextField();
        hora = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Activar1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Activar1.setText("RESERVAR");
        Activar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Activar1MouseClicked(evt);
            }
        });
        Activar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Activar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reserva De Cita");

        Propietariotext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(60, 63, 66));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));

        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton5.setText("CERRAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addContainerGap(1008, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(212, 212, 212))
        );

        animaltext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de la Mascota:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nombre del Propietario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Hora de cita:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Fecha de cita:");

        fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton6.setText("CONSULTAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton7.setText("CANCELAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(Activar1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(animaltext, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                    .addComponent(Propietariotext, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                    .addComponent(fecha)
                                    .addComponent(hora))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addGap(64, 64, 64)))))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Propietariotext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(animaltext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Activar1)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(210, 210, 210))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Activar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Activar1ActionPerformed
        agregar();
    }//GEN-LAST:event_Activar1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenúCitas mc = new MenúCitas();
        mc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        consultar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Activar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activar1MouseClicked
    }//GEN-LAST:event_Activar1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Activar1;
    private javax.swing.JTextField Propietariotext;
    private javax.swing.JTextField animaltext;
    private javax.swing.JFormattedTextField fecha;
    private javax.swing.JTextField hora;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
