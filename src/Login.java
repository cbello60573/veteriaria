
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    LinkedList<String> lista = new LinkedList<>();
    LinkedList<String> list = new LinkedList<>(); 
    LinkedList<String> lis = new LinkedList<>(); 
    Persona us = new Persona();
    Persona co = new Persona();
    Persona es = new Persona();
    public void agregar(){
        
        us.usuario = JOptionPane.showInputDialog("Ingrese su usuario");
        co.contraseña = JOptionPane.showInputDialog("Ingrese su contraseña");
               
        lista.addLast(us.usuario);//0
        list.addLast(co.contraseña);//1
        
    }
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contratext = new javax.swing.JPasswordField();
        usuatext = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        entrar = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        registro = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño sin título (3).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("My Pet and Me");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño sin título (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 0, 250, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño sin título (3).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diseño sin título (4).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, 90));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("USUARIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        contratext.setBackground(new java.awt.Color(255, 255, 255));
        contratext.setForeground(new java.awt.Color(204, 204, 204));
        contratext.setText("********");
        contratext.setBorder(null);
        contratext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contratextMousePressed(evt);
            }
        });
        jPanel1.add(contratext, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 440, 30));

        usuatext.setBackground(new java.awt.Color(255, 255, 255));
        usuatext.setForeground(new java.awt.Color(204, 204, 204));
        usuatext.setText("Ingrese su usuario");
        usuatext.setBorder(null);
        usuatext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuatextMousePressed(evt);
            }
        });
        usuatext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuatextActionPerformed(evt);
            }
        });
        jPanel1.add(usuatext, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 440, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 440, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 440, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 440, 10));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CONTRASEÑA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        entrar.setBackground(new java.awt.Color(86, 129, 170));
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarMouseExited(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(86, 129, 170));
        jTextField2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("ENTRAR");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout entrarLayout = new javax.swing.GroupLayout(entrar);
        entrar.setLayout(entrarLayout);
        entrarLayout.setHorizontalGroup(
            entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        entrarLayout.setVerticalGroup(
            entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 140, 40));

        registro.setBackground(new java.awt.Color(86, 129, 170));
        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registroMouseExited(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(86, 129, 170));
        jTextField3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("REGISTRARSE");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registroLayout = new javax.swing.GroupLayout(registro);
        registro.setLayout(registroLayout);
        registroLayout.setHorizontalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        registroLayout.setVerticalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuatextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuatextActionPerformed

    }//GEN-LAST:event_usuatextActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseEntered
        entrar.setBackground(new Color(86,129,250));
    }//GEN-LAST:event_entrarMouseEntered

    private void entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseExited
        entrar.setBackground(new Color(86,129,170));
    }//GEN-LAST:event_entrarMouseExited

    private void registroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseExited
        registro.setBackground(new Color(86,129,170));
    }//GEN-LAST:event_registroMouseExited

    private void registroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseEntered
         registro.setBackground(new Color(86,129,250));
    }//GEN-LAST:event_registroMouseEntered

    private void contratextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contratextMousePressed
        if(String.valueOf(contratext.getPassword()).equals("********")){
            contratext.setText("");
            contratext.setForeground(Color.black);
        }
        if(usuatext.getText().isEmpty()){
            usuatext.setText("Ingrese su usuario");
            usuatext.setForeground(Color.gray);
        }
    }//GEN-LAST:event_contratextMousePressed

    private void usuatextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuatextMousePressed
        if(usuatext.getText().equals("Ingrese su usuario")){
            usuatext.setText("");
            usuatext.setForeground(Color.black);
        }
        if(String.valueOf(contratext.getPassword()).isEmpty()){
            contratext.setText("********");
            contratext.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuatextMousePressed

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        String usuar = usuatext.getText();
        String contra = String.valueOf(contratext.getPassword());
        
        for(int i = 0; i < lista.size(); i++){
            if(usuar.equals(lista.get(i))){
                us.getUsuario();
                for(int x = 0; x < list.size(); x++){
                    if(contra.equals(list.get(x))){
                    co.getContraseña();
                    Menú m = new Menú();
                    m.setVisible(true);
                    this.setVisible(false);
                    break;
                    }else{
                        JOptionPane.showMessageDialog(this, "contraseña incorrecta");
                        break;
                    }
                }    
            }
        }    
        
    }//GEN-LAST:event_entrarMouseClicked

    private void registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseClicked
        agregar();
    }//GEN-LAST:event_registroMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contratext;
    private javax.swing.JPanel entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel registro;
    private javax.swing.JTextField usuatext;
    // End of variables declaration//GEN-END:variables
}
