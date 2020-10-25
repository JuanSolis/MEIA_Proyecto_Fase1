
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class BuscarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form BuscarUsuario
     */
    
    Usuario usuarioActual;
    Usuario usuarioEncontrado;

    public BuscarUsuario(Usuario user) {
        initComponents();
        
        BuscarUsuario.this.setBackground(new Color(0,0,0,0));
        
        ImageIcon Buscar = new ImageIcon("src/Imagenes/Search.jpg");
       Icon IconBuscar = new ImageIcon(Buscar.getImage().getScaledInstance(labelBuscar.getWidth(), labelBuscar.getHeight(), Image.SCALE_FAST));
       
       ImageIcon cerrar = new ImageIcon("src/Imagenes/cancelar.png");
       Icon iconoCerrar = new ImageIcon(cerrar.getImage().getScaledInstance(txtCerrar.getWidth(), txtCerrar.getHeight(), Image.SCALE_FAST));
       
       txtCerrar.setIcon(iconoCerrar);
       
       labelBuscar.setIcon(IconBuscar);
       
       btAgregarAmigo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarUsuario = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        labelResultado = new javax.swing.JLabel();
        txtCerrar = new javax.swing.JLabel();
        btAgregarAmigo = new javax.swing.JButton();
        btnEliminarAmigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 600, 70));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setOpaque(false);

        txtBuscarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarUsuario.setBorder(null);
        txtBuscarUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarUsuarioFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 95, 34));

        labelResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 520, 40));

        txtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(txtCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -10, 30, 30));

        btAgregarAmigo.setBackground(new java.awt.Color(102, 153, 255));
        btAgregarAmigo.setText("Agregar");
        btAgregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarAmigoActionPerformed(evt);
            }
        });
        jPanel1.add(btAgregarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 95, 40));

        btnEliminarAmigo.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarAmigo.setText("Eliminar Amigo");
        btnEliminarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAmigoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 560, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         if (!txtBuscarUsuario.getText().equals("")) {
             try {
                 BuscarUsuario(txtBuscarUsuario.getText());
             } catch (IOException ex) {
                 Logger.getLogger(BuscarUsuario.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btAgregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarAmigoActionPerformed
        String rutaListaAmigos = "C:\\MEIA\\lista_amigos.txt";
        File archivo = new File(rutaListaAmigos);
        try {
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
            
        FileWriter escribirEnArchivo = new FileWriter(archivo,true);
        BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
        SolicitudAmistad solicitud = new SolicitudAmistad();
        
        solicitud.usuario = usuarioActual;
        solicitud.usuario_amigo = usuarioEncontrado;
        solicitud.aceptado = 0;
        solicitud.fecha_transaccion = formatter.format(date).toString();
        solicitud.fecha_usuario_transaccion = "";
        solicitud.estatus = 0;
        
        String result = solicitud.GetText();
        bw.write(result+ System.getProperty( "line.separator" ));
        bw.close();
        escribirEnArchivo.close();

        System.out.println("Solicitud De Amistad escrita");
        
        
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_btAgregarAmigoActionPerformed

    
    public boolean VerificarSiEsAmigo() throws IOException{
    String rutaListaAmigos = "C:\\MEIA\\lista_amigos.txt";
        File Archivo = new File(rutaListaAmigos);
        
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        boolean sonAmigos = false;
            if(Archivo.exists()==true)
            {
                if (Archivo.length() > 0) {
                    SolicitudAmistad solicitud = new SolicitudAmistad();
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

                                    if (split[0].trim().equals(usuarioActual.nombreUsuario) && split[1].trim().equals(usuarioActual.nombreUsuario)) {
                                        if (split[2].trim().equals("1")) {
                                            sonAmigos = true;
                                        }else {
                                            sonAmigos = false;
                                        }
                                        
                                    }
                                }
                               
                                Linea=LeerArchivo.readLine();
                                
                            }

                            LecturaArchivo.close();
                            LeerArchivo.close();
                }
            }
            
            return sonAmigos;
    }
    private void txtBuscarUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarUsuarioFocusGained

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0)
        {
 
                LoginForm formLogin = new LoginForm();
                formLogin.setVisible(true);
                this.dispose();
        }
    }//GEN-LAST:event_txtCerrarMouseClicked

    private void btnEliminarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAmigoActionPerformed
        String rutaListaAmigos = "C:\\MEIA\\lista_amigos.txt";
        File Archivo = new File(rutaListaAmigos);
        
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
            
            if(Archivo.exists()==true)
            {
                if (Archivo.length() > 0) {
                    try {
                        SolicitudAmistad solicitud = new SolicitudAmistad();
                        FileReader LecturaArchivo;
                        
                        LecturaArchivo = new FileReader(Archivo);
                        BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                        String Linea="";
                        
                        Linea=LeerArchivo.readLine();
                        String[] split;
                        int lineaPosicion = 1;
                        while(Linea != null)
                        {
                            if(!"".equals(Linea))
                            {
                                split=Linea.split("\\|");
                                
                                if (split[0].trim().equals(usuarioActual.nombreUsuario) && split[1].trim().equals(usuarioActual.nombreUsuario)) {
                                    if (split[2].trim().equals("1")) {
                                        
                                        RandomAccessFile raf = new RandomAccessFile(rutaListaAmigos, "rw");
                                        raf.seek(42* lineaPosicion);
                                        raf.writeBytes("0"); 
                                        
                                        
                                        raf.close();
                                    }
                                    
                                }
                            }
                            lineaPosicion++;
                            Linea=LeerArchivo.readLine();
                            
                        }
                        
                        LecturaArchivo.close();
                        LeerArchivo.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(BuscarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(BuscarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    }//GEN-LAST:event_btnEliminarAmigoActionPerformed

    public void BuscarUsuario(String buscarUsuario) throws IOException{
        
        String rutaBitacora = "C:\\MEIA\\bitacora_usuario.txt";
        String rutaMaestro = "C:\\MEIA\\usuario.txt";
        String response = "";
     
        if ((usuarioEncontrado = BuscarEnArchivo(buscarUsuario, rutaBitacora)) != null) {
                response = "Usuario: " + usuarioEncontrado.nombreUsuario+ "\n"+
                           "Nombre: " + usuarioEncontrado.nombre+ "\n" +
                           "Apellido: " + usuarioEncontrado.apellido+ "\n" +
                           "Correo: " + usuarioEncontrado.correo_alterno+ "\n";
                
                labelResultado.setText(response);
        }
        else {
            if ((usuarioEncontrado = BuscarEnArchivo(buscarUsuario,rutaMaestro)) != null) {
                
                response = "Usuario: " + usuarioEncontrado.nombreUsuario+ "\n" + 
                           "Nombre: " + usuarioEncontrado.nombre+ "\n" +
                           "Apellido: " + usuarioEncontrado.apellido+ "\n" +
                           "Correo: " + usuarioEncontrado.correo_alterno+ "\n";
                
                labelResultado.setText(response);
            }
            else {
                response = "";
                labelResultado.setText(response);
                JOptionPane.showMessageDialog(null, "El usuario no existe");
            
                
            }
        }
        
        if (usuarioEncontrado != null) {
            if (VerificarSiEsAmigo()) {
                 btAgregarAmigo.setVisible(false);
                 btnEliminarAmigo.setVisible(true);
            }else {
                btnEliminarAmigo.setVisible(false);
                btAgregarAmigo.setVisible(true);
            }
           
        }
        
        
        
        
    }
    
    public Usuario BuscarEnArchivo(String buscarUsuario, String rutaBusqueda){
        
        File archivo = new File(rutaBusqueda);
       
        
        if (archivo.length() > 0) {
            Usuario user = new Usuario();
                try {
                    FileReader LecturaArchivo = new FileReader(archivo);
                    BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                    String Linea="";
                    Linea=LeerArchivo.readLine();
                    String[] split;
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split=Linea.replace("=", "").split("\\|");
                            if (Linea.contains(buscarUsuario)) {
                                user.nombreUsuario = split[0];
                                user.nombre = split[1];
                                user.apellido = split[2];
                                user.password = split[3];
                                user.rol = Integer.parseInt(split[4]);
                                user.fecha_nacimiento = split[5];
                                user.correo_alterno = split[6];
                                user.telefono = Integer.parseInt(split[7]);
                                user.path_fotografia = split[8];
                                user.estatus = Integer.parseInt(split[9]);
                                if (user.estatus == 1) {
                                    System.out.println("Se encontro el usuario " + user.nombreUsuario + "en Bitacora");
                                    
                                }
                                else {
                                    System.out.println("El usuario " + user.nombreUsuario + "se dio de baja en Bitacora");
                                    user =  null;
                                }
                            }else{
                                user =  null;
                                
                            }
                            
                        }
                        
                        Linea=LeerArchivo.readLine();
                    }
                    
                    LecturaArchivo.close();
                    LeerArchivo.close();
                    return user;
                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo Bitacora");
                    return null;
                }
        }
        else {
            return null;
        }
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
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarAmigo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarAmigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}