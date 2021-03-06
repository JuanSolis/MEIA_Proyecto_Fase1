
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan-Gtsk
 */
public class formMensajes extends javax.swing.JFrame {

    /**
     * Creates new form formMensajes
     */
    DefaultListModel<String> modeloListaAmigos = new DefaultListModel<String>();
    
    Usuario usuarioActual;
    public formMensajes(Usuario user) {
        initComponents();
         formMensajes.this.setBackground(new Color(0,0,0,0));
         
         usuarioActual = user;
       
       ImageIcon cerrar = new ImageIcon("src/Imagenes/cancelar.png");
       Icon iconoCerrar = new ImageIcon(cerrar.getImage().getScaledInstance(txtCerrar.getWidth(), txtCerrar.getHeight(), Image.SCALE_FAST));
       
       txtCerrar.setIcon(iconoCerrar);
       try{
        buscarAmigos();
        }catch(Exception ex){
            System.out.println(ex);
        }
       
    }

    public void buscarAmigos() throws FileNotFoundException, IOException{
        String rutaListaAmigos = "C:\\MEIA\\lista_amigos.txt";
        File Archivo = new File(rutaListaAmigos);
        
            if(Archivo.exists()==true)
            {
                if (Archivo.length() > 0) {
                    
                    FileReader LecturaArchivo;
              
                        LecturaArchivo = new FileReader(Archivo);
                        BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                        String Linea="";
                      
                            Linea=LeerArchivo.readLine();
                            String[] split;
                          
                            while(Linea != null)
                            {
                                if(!"".equals(Linea))
                                {
                                    split=Linea.split("\\|");        

                                    if (split[0].trim().equals(usuarioActual.nombreUsuario) || split[1].trim().equals(usuarioActual.nombreUsuario)) {
                                        if (split[2].trim().equals("1")) {
                                            if (split[0].trim().equals(usuarioActual.nombreUsuario)) {
                                                modeloListaAmigos.addElement(split[1].trim());
                                                
                                            }
                                            
                                            if (split[1].trim().equals(usuarioActual.nombreUsuario)) {
                                                modeloListaAmigos.addElement(split[0].trim());
                                            }
                                        }
                                        
                                    }
                                }
                               
                                Linea=LeerArchivo.readLine();
                                
                            }
                            jList1.setModel(modeloListaAmigos);
                            LecturaArchivo.close();
                            LeerArchivo.close();
                }
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtMensaje = new javax.swing.JTextField();
        txtAmigo = new javax.swing.JTextField();
        btnEnviarMensaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(txtCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 100));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 130, 30));
        jPanel1.add(txtAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 130, 30));

        btnEnviarMensaje.setText("Enviar Mensaje");
        btnEnviarMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMensajeMouseClicked(evt);
            }
        });
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviarMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 230, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de amigos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mensaje");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Amigo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 60, 40));

        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 70, 20));

        txtTipo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));
        jPanel1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 510, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void mandarMensaje(String amigoUsuario){
        String rutaArchivo = "C:\\MEIA\\mensajes.txt";
        File archivo = new File(rutaArchivo);
        try {
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
            
        FileWriter escribirEnArchivo = new FileWriter(archivo,true);
        BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
        mensaje msg = new mensaje();
        
        msg.usuarioNombre = usuarioActual.nombreUsuario;
        msg.usuarioAmigo = amigoUsuario;
        msg.fecha = formatter.format(date);
        msg.contenidoMensaje = txtMensaje.getText();
        msg.tipo_mensaje = Integer.parseInt(txtTipo.getValue().toString());
        msg.status = 1;
        
        String result = msg.GetText();
        bw.write(result+ System.getProperty( "line.separator" ));
        bw.close();
        escribirEnArchivo.close();
        JOptionPane.showMessageDialog(null, "Mensaje Enviado");
        System.out.println("Mensaje enviado");
        
        
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        String amigo = txtAmigo.getText();
        String mensaje = txtMensaje.getText();

        if (modeloListaAmigos.contains(amigo)) {
            mandarMensaje(amigo);
        }else {
            JOptionPane.showMessageDialog(null, "Usuario no no esta en lista de amigos");
        }        
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    
    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0)
        {

            LoginForm formLogin = new LoginForm();
            formLogin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_txtCerrarMouseClicked

    private void btnEnviarMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMensajeMouseClicked
        
    }//GEN-LAST:event_btnEnviarMensajeMouseClicked
    
    public void mostarImg(String path){
        ImageIcon img = new ImageIcon(path);
       Icon iconoImg = new ImageIcon(img.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_FAST));
       
       jLabel2.setIcon(iconoImg);
    
    }
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
            java.util.logging.Logger.getLogger(formMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAmigo;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JSpinner txtTipo;
    // End of variables declaration//GEN-END:variables
}
