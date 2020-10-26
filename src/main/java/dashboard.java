
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
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
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    
    Usuario usuarioActual = new Usuario();
    File ubicacion;
    File descriptor;
    public dashboard(Usuario user, String location, String locationDescriptor) throws IOException {
        initComponents();
        usuarioActual = user;
        ubicacion = new File(location);
        descriptor = new File(locationDescriptor);
          dashboard.this.setBackground(new Color(0,0,0,0));
        
       ImageIcon cerrar = new ImageIcon("src/Imagenes/cancelar.png");
       Icon iconoCerrar = new ImageIcon(cerrar.getImage().getScaledInstance(labelCerrar1.getWidth(), labelCerrar1.getHeight(), Image.SCALE_FAST));
       
       labelCerrar1.setIcon(iconoCerrar);
       
       ImageIcon usuario = new ImageIcon(usuarioActual.path_fotografia);
       Icon imagenUsuario = new ImageIcon(usuario.getImage().getScaledInstance(labelImagenPerfil.getWidth(), labelImagenPerfil.getHeight(), Image.SCALE_FAST));
       
       labelImagenPerfil.setIcon(imagenUsuario);
       
       
       ImageIcon cerrarSesion = new ImageIcon("src/Imagenes/cerrarSesion.png");
       Icon imagenCerrarSesion = new ImageIcon(cerrarSesion.getImage().getScaledInstance(labelCerrarSesion.getWidth(), labelCerrarSesion.getHeight(), Image.SCALE_FAST));
       
       labelCerrarSesion.setIcon(imagenCerrarSesion);

       ImageIcon editarPerfil = new ImageIcon("src/Imagenes/edit.png");
       Icon imagenEditarPerfil = new ImageIcon(editarPerfil.getImage().getScaledInstance(labelEditar.getWidth(), labelEditar.getHeight(), Image.SCALE_FAST));
       
       labelEditar.setIcon(imagenEditarPerfil);
       
       ImageIcon  bajarPerfil = new ImageIcon("src/Imagenes/delete.png");
       Icon imagenBajarPerfil = new ImageIcon(bajarPerfil.getImage().getScaledInstance(labelBaja.getWidth(), labelBaja.getHeight(), Image.SCALE_FAST));
       
       labelBaja.setIcon(imagenBajarPerfil);
       
       ImageIcon  imagenBackUp = new ImageIcon("src/Imagenes/backup.png");
       Icon iconoBackUp = new ImageIcon(imagenBackUp.getImage().getScaledInstance(labelBaja.getWidth(), labelBaja.getHeight(), Image.SCALE_FAST));
       
       labelBaja1.setIcon(iconoBackUp);
       
       
       ImageIcon  imagenBuscar = new ImageIcon("src/Imagenes/Search.jpg");
       Icon iconoBuscar = new ImageIcon(imagenBuscar.getImage().getScaledInstance(labelBuscar.getWidth(), labelBuscar.getHeight(), Image.SCALE_FAST));
       
       labelBuscar.setIcon(iconoBuscar);
       
       ImageIcon crearGrupoimg = new ImageIcon("src/Imagenes/cancelar.png");
       Icon iconoCrearGrupo = new ImageIcon(crearGrupoimg.getImage().getScaledInstance(labelCrearGrupo.getWidth(), labelCrearGrupo.getHeight(), Image.SCALE_FAST));
       
       labelCrearGrupo.setIcon(iconoCrearGrupo);
       
       
       labelWelcome.setText("Bienvenido " + usuarioActual.nombreUsuario);
       labelUsuario.setText(usuarioActual.nombreUsuario);
       labelNombre.setText(usuarioActual.nombre);
       labelNombre.setText(usuarioActual.nombre);
       labelNombre.setText(usuarioActual.nombre);
       labelApellido.setText(usuarioActual.apellido);
       
       String rol = "";
       
        if (usuarioActual.rol == 0) {
            rol = "Usuario";
            labelBaja.setVisible(true);
            jLabel2.setText("Dar de Baja");
            labelBaja1.setVisible(false);
        }
        else {
            rol = "Administrador";
            labelBaja1.setVisible(true);
            jLabel2.setText("Crear BackUp");
            labelBaja.setVisible(false);
        }
       
        labelRol.setText(rol);
        
        
     

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCerrar1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelImagenPerfil = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelRol = new javax.swing.JLabel();
        labelCerrarSesion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        PanelUsuario = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        labelEditar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelBaja = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelBaja1 = new javax.swing.JLabel();
        labelBuscar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelCrearGrupo = new javax.swing.JLabel();
        labelAgregarAmigoGrupo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrar1MouseClicked(evt);
            }
        });
        getContentPane().add(labelCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 32, 30));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        labelImagenPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelImagenPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagenPerfilMouseClicked(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("jLabel1");

        labelApellido.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        labelApellido.setForeground(new java.awt.Color(255, 255, 255));
        labelApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApellido.setText("jLabel1");

        labelRol.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        labelRol.setForeground(new java.awt.Color(255, 255, 255));
        labelRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRol.setText("jLabel1");

        labelCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRol, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addComponent(labelApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagenPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(labelCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(labelCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("RED-SOCIAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 740, 30));

        PanelUsuario.setBackground(new java.awt.Color(248, 246, 246));
        PanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelWelcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(0, 102, 255));
        labelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWelcome.setText("labelWelcome");
        PanelUsuario.add(labelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 740, -1));

        labelEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEditarMouseClicked(evt);
            }
        });
        PanelUsuario.add(labelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 125, 116, 98));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Perfil");
        PanelUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 234, 116, -1));

        labelBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBajaMouseClicked(evt);
            }
        });
        PanelUsuario.add(labelBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 116, 98));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dar de Baja");
        PanelUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 234, 116, -1));

        labelBaja1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBaja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBaja1MouseClicked(evt);
            }
        });
        PanelUsuario.add(labelBaja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 125, 116, 98));

        labelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBuscarMouseClicked(evt);
            }
        });
        PanelUsuario.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 116, 98));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Crear Grupo");
        PanelUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 116, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscar");
        PanelUsuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 116, -1));

        labelCrearGrupo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCrearGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCrearGrupoMouseClicked(evt);
            }
        });
        PanelUsuario.add(labelCrearGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 116, 98));

        labelAgregarAmigoGrupo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAgregarAmigoGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAgregarAmigoGrupoMouseClicked(evt);
            }
        });
        PanelUsuario.add(labelAgregarAmigoGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 116, 98));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agregar a Grupo");
        PanelUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 116, -1));

        getContentPane().add(PanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 740, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelImagenPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagenPerfilMouseClicked
       
    }//GEN-LAST:event_labelImagenPerfilMouseClicked
    
    private void labelCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrar1MouseClicked
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_labelCerrar1MouseClicked

    private void labelCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarSesionMouseClicked
     int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar sesion? ", "¿Cerrar Sesion?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0)
        {
           LoginForm formularioLogin = new LoginForm();
           formularioLogin.setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_labelCerrarSesionMouseClicked

    private void labelEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEditarMouseClicked
        EditarPerfil formularioEditar = new EditarPerfil(usuarioActual,ubicacion, descriptor);
        formularioEditar.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelEditarMouseClicked

    private void labelBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBajaMouseClicked
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que deseas dar de baja tu cuenta? ", "¿Dar de Baja?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0)
        {
            try{
                FileReader reader = new FileReader(ubicacion);
                BufferedReader bf = new BufferedReader(reader);
                String linea = "";
                int lineaPosicion = 0;

                RandomAccessFile escritor = new RandomAccessFile(ubicacion.getPath(), "rw");
                System.out.println("Dando de Baja");
                usuarioActual.estatus = 0;
                while ((linea = bf.readLine()) != null) {

                    if (linea.contains(usuarioActual.nombreUsuario)) {
                        escritor.seek((lineaPosicion * 400));

                        escritor.writeBytes(usuarioActual.DelimitarCaracteres());

                    }
                    lineaPosicion++;
                }

                escritor.close();
                bf.close();
                reader.close();

                System.out.println("Dato de baja");
                FileReader readerDescriptor = new FileReader(descriptor);
                BufferedReader bfDescriptor = new BufferedReader(readerDescriptor);

                linea = "";
                String lineaModificada = "";
                List lista = new ArrayList();
                int lineaPosicionDecriptor = 0;
                int inactivos = 0;
                int activos = 0;

                SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
                Date date = new Date(System.currentTimeMillis());
                while ((linea = bfDescriptor.readLine()) != null) {
                    lista.add(linea);

                    if (linea.contains("fecha_modificacion:")) {
                        lineaModificada = "fecha_modificacion:" + formatter.format(date);
                        lista.set(lineaPosicionDecriptor, lineaModificada);

                    }

                    if (linea.contains("usuario_modificacion:")) {
                        lineaModificada = "usuario_modificacion:" + usuarioActual.nombreUsuario;
                        lista.set(lineaPosicionDecriptor, lineaModificada);

                    }
                    if (linea.contains("registros_activos:")) {
                        activos = Integer.parseInt(linea.split(":")[1]);

                        lineaModificada = "registros_activos:" + (activos-1) ;
                        lista.set(lineaPosicionDecriptor, lineaModificada);

                    }
                    if (linea.contains("registros_inactivos:")) {
                        inactivos = Integer.parseInt(linea.split(":")[1]);

                        lineaModificada = "registros_inactivos:" + (inactivos+1) ;
                        lista.set(lineaPosicionDecriptor, lineaModificada);

                    }
                    lineaPosicionDecriptor++;
                }

                bfDescriptor.close();
                readerDescriptor.close();

                Iterator iter = lista.iterator();

                String rutaDecriptor = descriptor.getPath();
                descriptor.delete();

                if (!descriptor.exists()) {

                    File nuevoArchivoDecriptor = new File(rutaDecriptor);
                    nuevoArchivoDecriptor.createNewFile();

                    System.out.println("Eliminado");
                    FileWriter escribirEnDescriptor = new FileWriter(nuevoArchivoDecriptor,true);

                    while(iter.hasNext()) {
                        escribirEnDescriptor.write((iter.next().toString() + System.getProperty("line.separator")));
                    }
                    JOptionPane.showMessageDialog(null,"perfil Dado de Baja");

                    escribirEnDescriptor.close();
                    LoginForm formularioMain = new LoginForm();
                    formularioMain.setVisible(true);
                    dispose();
                }

            }
            catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_labelBajaMouseClicked

    public void revisarNotificacion() throws IOException{
        String rutaListaAmigos = "C:\\MEIA\\lista_amigos.txt";
        File Archivo = new File(rutaListaAmigos);
        
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
            
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
                            int lineaPosicion = 0;
                            while(Linea != null)
                            {
                                if(!"".equals(Linea))
                                {
                                    split=Linea.split("\\|");        

                                    if (split[5].trim().equals("0") && split[2].trim().equals("0")) {
                                        if (split[1].trim().equals(usuarioActual.nombreUsuario)) {
                                            int iRespuesta = JOptionPane.showConfirmDialog(null, "Deseas Aceptar la invitacion de " + split[0] , "¿Aceptar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                            RandomAccessFile raf = new RandomAccessFile(rutaListaAmigos, "rw");
                                             raf.seek((88 * lineaPosicion) + (42+lineaPosicion));
                                            raf.writeBytes("1");

                                            raf.seek((88 * lineaPosicion) + (65+lineaPosicion));
                                            raf.writeBytes(formatter.format(date).toString());
                                            raf.seek((88 * lineaPosicion) + (86+lineaPosicion));
                                            raf.writeBytes("1"); 
                                            
                                            raf.close(); 
                                        }
                                        
                                    }
                                }
                                lineaPosicion++;
                                Linea=LeerArchivo.readLine();
                                
                            }

                            LecturaArchivo.close();
                            LeerArchivo.close();
                }
            }
    }
    
    private void labelBaja1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBaja1MouseClicked
        String bitacoraBackup = "C:\\MEIA\\bitacora_backup.txt";
        String descriptorBitacoraBackup = "C:\\MEIA\\desc_bitacora_backup.txt";
        File arBitacora = new File(bitacoraBackup);
        File arDescriptor = new File(descriptorBitacoraBackup);
        try{
            
            arBitacora.createNewFile();
            
            arDescriptor.createNewFile();
   
       
        
       
        
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser.showOpenDialog(this);
            File archivo = fileChooser.getSelectedFile();

            String rutaDestino = archivo.getPath()+ "\\MEIA_Backup";

            SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
            Date date = new Date(System.currentTimeMillis());
            if (archivo != null) {

               copiarDirectorio("C:\\MEIA", rutaDestino);
               BackUp bkp = new BackUp();
               bkp.usuario = usuarioActual.nombreUsuario;
               bkp.ruta_absoluta = rutaDestino;
               bkp.fecha_transaccion = formatter.format(date);
               try{
                insertarBackUp(bkp,arBitacora,arDescriptor);
                JOptionPane.showMessageDialog(null, "BackUp Creado");
               }  
               catch(Exception ex) {
                   System.out.println("Error");
               }


            }
            else {
                JOptionPane.showMessageDialog(null, "Por favor seleccione un directorio"); 
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
                
    }//GEN-LAST:event_labelBaja1MouseClicked

    private void labelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseClicked

        BuscarUsuario formBuscarUsuario = new BuscarUsuario(usuarioActual);
        formBuscarUsuario.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_labelBuscarMouseClicked

    public void escribirGrupo() throws IOException{
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
    
        
        Grupo nuevoGrupo = new Grupo();
        boolean seguir = true;
        String nombreGrupo = "";
        String descripcion = "";
        while(seguir){
        
            nombreGrupo = JOptionPane.showInputDialog("Escribe el nombre del grupo");
            if (nombreGrupo.equals("")) {
                seguir = true;
            }
            else {
                seguir = false;
            }
        }
        
        boolean seguirDescripcion = true;
        while(seguirDescripcion){
        
           descripcion = JOptionPane.showInputDialog("Escribe la descripcion del grupo");
            if (descripcion.equals("")) {
                seguirDescripcion = true;
            }
            else {
                seguirDescripcion = false;
            }
        }
        
            
            String rutaListaAmigos = "C:\\MEIA\\grupo.txt";
            File Archivo = new File(rutaListaAmigos);
            nuevoGrupo.creadorGrupo = usuarioActual.nombreUsuario;
            nuevoGrupo.nombreGrupo = nombreGrupo;
            nuevoGrupo.descriptorGrupo = descripcion;
            nuevoGrupo.fechaTransaccion = formatter.format(date).toString();
            nuevoGrupo.status = 1;
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
                            int lineaPosicion = 0;
                            while(Linea != null)
                            {
                                if(!"".equals(Linea))
                                {
                                    split=Linea.split("\\|");        

                                    if (!(split[0].trim().equals(usuarioActual.nombreUsuario) && split[1].trim().equals(nombreGrupo))) {
                                            
                                            
//                                            RandomAccessFile raf = new RandomAccessFile(rutaListaAmigos, "rw");
//                                             raf.seek((88 * lineaPosicion) + (42+lineaPosicion));
//                                            raf.writeBytes("1");
//
//                                            raf.seek((88 * lineaPosicion) + (65+lineaPosicion));
//                                            raf.writeBytes(formatter.format(date).toString());
//                                            raf.seek((88 * lineaPosicion) + (86+lineaPosicion));
//                                            raf.writeBytes("1"); 
//                                            
//                                            raf.close(); 
                                            FileWriter escribirEnArchivo = new FileWriter(Archivo,true);
                                            BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
                                            bw.write(nuevoGrupo.getGrupoData() + System.getProperty("line.separator"));
                                            bw.close();
                                            escribirEnArchivo.close();
                                            JOptionPane.showMessageDialog(null, "Grupo Creado");
                                            break;
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null, "Ya existe un grupo con ese nombre!");
                                        break;
                                    }
                                }
                                lineaPosicion++;
                                Linea=LeerArchivo.readLine();
                                
                            }

                            LecturaArchivo.close();
                            LeerArchivo.close();
                }
            }else {
                Archivo.createNewFile();
                FileWriter escribirEnArchivo = new FileWriter(Archivo,true);
                BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
                bw.write(nuevoGrupo.getGrupoData() + System.getProperty("line.separator"));
                bw.close();
                escribirEnArchivo.close(); 
                JOptionPane.showMessageDialog(null, "Grupo Creado");
            
            }
            
        
    
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
            revisarNotificacion();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_formComponentShown

    private void labelCrearGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrearGrupoMouseClicked
         try {
            escribirGrupo();
        } catch (IOException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelCrearGrupoMouseClicked

    private void labelAgregarAmigoGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAgregarAmigoGrupoMouseClicked
        AgregarAGrupo formAgregarAmigoGrupo = new AgregarAGrupo(usuarioActual);
        formAgregarAmigoGrupo.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_labelAgregarAmigoGrupoMouseClicked
    
    private void insertarBackUp(BackUp Bku, File arBitacora, File arDescriptor ) throws IOException{
        //No es primera vez
         SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        String linea = "";
        int cantidadLineas = 0;
        FileReader lectorBitacoraBackUp = new FileReader(arBitacora);
        BufferedReader bfBitacoraBackUp = new BufferedReader(lectorBitacoraBackUp);
        FileWriter escritorBitacoraBackUp = new FileWriter(arBitacora, true);
        BufferedWriter bgEsBitacora = new BufferedWriter(escritorBitacoraBackUp);
        bgEsBitacora.write(Bku.DelimitarCaracteres() + System.getProperty("line.separator"));
        
         while ((bfBitacoraBackUp.readLine())!=null) {
                        cantidadLineas++; 
         }
        
        bgEsBitacora.close();
        escritorBitacoraBackUp.close();
        bfBitacoraBackUp.close();
        lectorBitacoraBackUp.close();
        
            FileReader lectorDescriptor = new FileReader(arDescriptor);
            BufferedReader bfDescriptor = new BufferedReader(lectorDescriptor);
            
            List lista =    new ArrayList();
            if (arDescriptor.length() > 0 ) {
                int lineaActual = 0;
              
                linea = "";
                String lineaModificada = "";
                while (( linea = bfDescriptor.readLine())!= null) {
                    
                    lista.add(linea);

                    if (linea.contains("fecha_modificacion:")) { 

                        lineaModificada = ("fecha_modificacion:" + formatter.format(date).toString());
                        lista.set(lineaActual, lineaModificada); 

                    }
                    if (linea.contains("usuario_modificacion:")) {
                        lineaModificada = ("usuario_modificacion:" + usuarioActual.nombreUsuario);
                        lista.set(lineaActual, lineaModificada); 

                    }

                    if (linea.contains("#_registros:")) {
                        lineaModificada = ("#_registros:" + String.valueOf(cantidadLineas));
                        lista.set(lineaActual, lineaModificada); 

                    }
                    
                    lineaActual++;
                }
                       
                        
                bfDescriptor.close();
                lectorDescriptor.close();


                Iterator iter = lista.iterator();

                String rutaDescriptor = arDescriptor.getPath();
                arDescriptor.delete();

                if (!arDescriptor.exists()) {

                    File nuevoArchivoDecriptor = new File(rutaDescriptor);
                    nuevoArchivoDecriptor.createNewFile();


                      FileWriter escribirEnDescriptor = new FileWriter(nuevoArchivoDecriptor,true);


                    while(iter.hasNext()) {
                        escribirEnDescriptor.write((iter.next().toString() + System.getProperty("line.separator")));
                    }
                    escribirEnDescriptor.close();
                }
           
        }else{  
                FileWriter EscribirEnDescriptor = new FileWriter(arDescriptor,true);
                PrintWriter  bwD = new PrintWriter (EscribirEnDescriptor);
                bwD.write("nombre_simbolico:bitacora_backup" + System.getProperty( "line.separator" ));
                bwD.write("fecha_creacion:" + formatter.format(date) + System.getProperty( "line.separator" ));
                bwD.write("usuario_creacion:" + usuarioActual.nombreUsuario + System.getProperty( "line.separator" ));
                bwD.write("fecha_modificacion:" + formatter.format(date) + System.getProperty( "line.separator" ));
                bwD.write("usuario_modificacion:" + usuarioActual.nombreUsuario + System.getProperty( "line.separator" ));
                bwD.write("#_registros:1"  + System.getProperty( "line.separator" ));
                bwD.close();
                EscribirEnDescriptor.close();
        }
        
        
    }
    private void copiarDirectorio(String origen, String destino) {
        comprobarCrearDirectorio(destino);
        File directorio = new File(origen);
        File f;
        if (directorio.isDirectory()) {
            comprobarCrearDirectorio(destino);
            String [] files = directorio.list();
                if (files.length > 0) {
                    for (String archivo : files) {
                        f = new File (origen + File.separator + archivo);
                        if(f.isDirectory()) {
                            comprobarCrearDirectorio(destino+File.separator+archivo+File.separator);
                            copiarDirectorio(origen+File.separator+archivo+File.separator, destino+File.separator+archivo+File.separator);
                        } else { //Es un archivo
                            copiarArchivo(origen+File.separator+archivo, destino+File.separator+archivo);
                        }
                    }
                }
            }
        }
    
    private void copiarArchivo(String sOrigen, String sDestino) {
        try {
            File origen = new File(sOrigen);
            File destino = new File(sDestino);
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void comprobarCrearDirectorio(String ruta) {
    File directorio = new File(ruta);
    if (!directorio.exists()) {
        directorio.mkdirs();
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(null, "Hola");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAgregarAmigoGrupo;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelBaja;
    private javax.swing.JLabel labelBaja1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelCerrar1;
    private javax.swing.JLabel labelCerrarSesion;
    private javax.swing.JLabel labelCrearGrupo;
    private javax.swing.JLabel labelEditar;
    private javax.swing.JLabel labelImagenPerfil;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelWelcome;
    // End of variables declaration//GEN-END:variables
}
