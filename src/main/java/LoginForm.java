
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {


    public LoginForm() {
        initComponents();
        LoginForm.this.setBackground(new Color(0,0,0,0));
        
       ImageIcon cerrar = new ImageIcon("src/Imagenes/cancelar.png");
       Icon iconoCerrar = new ImageIcon(cerrar.getImage().getScaledInstance(labelCerrar.getWidth(), labelCerrar.getHeight(), Image.SCALE_FAST));
       
       labelCerrar.setIcon(iconoCerrar);
       
        ImageIcon usuario = new ImageIcon("src/Imagenes/usuario.png");
        Icon iconoUsuario = new ImageIcon(usuario.getImage().getScaledInstance(labelUsuario.getWidth(), labelUsuario.getHeight(), Image.SCALE_FAST));
       
       labelUsuario.setIcon(iconoUsuario);
       
       ImageIcon password = new ImageIcon("src/Imagenes/bloquear.png");
        Icon iconoPassword = new ImageIcon(password.getImage().getScaledInstance(labelPass.getWidth(), labelPass.getHeight(), Image.SCALE_FAST));
       
       labelPass.setIcon(iconoPassword);
       
       ImageIcon ingresar = new ImageIcon("src/Imagenes/galon-derecho.png");
        Icon iconoIngresar = new ImageIcon(ingresar.getImage().getScaledInstance(labelLogin.getWidth(), labelLogin.getHeight(), Image.SCALE_FAST));
       
       labelLogin.setIcon(iconoIngresar);
       
       ImageIcon logo = new ImageIcon("src/Imagenes/Logo S2.png");
        Icon iconoLogo = new ImageIcon(logo.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_FAST));
       
       labelLogo.setIcon(iconoLogo);
       
       txtUsuario.grabFocus();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        labelLogin = new javax.swing.JLabel();
        labelRegistrarUsuario = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(labelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 22, 32, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setOpaque(false);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel7.setOpaque(false);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setBorder(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        labelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLoginMouseClicked(evt);
            }
        });

        labelRegistrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        labelRegistrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelRegistrarUsuario.setForeground(new java.awt.Color(51, 102, 255));
        labelRegistrarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegistrarUsuario.setText("Crear Cuenta");
        labelRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistrarUsuarioMouseClicked(evt);
            }
        });

        labelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addComponent(labelRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRegistrarUsuario)
                .addGap(12, 12, 12)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 340, 310));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 180, 140));

        jPanel9.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 150));

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (iRespuesta == 0) 
            {            
                System.exit(0);
            }      
    }//GEN-LAST:event_labelCerrarMouseClicked

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void labelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLoginMouseClicked
       
        if (!txtUsuario.getText().equals("") && !txtPassword.getPassword().equals("")) {
             BuscarDirectorio();
             BuscarUsuario(txtUsuario.getText(), txtPassword.getText());
        }
       
        
    }//GEN-LAST:event_labelLoginMouseClicked

    private void labelRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarUsuarioMouseClicked
            BuscarDirectorio();
            BuscarBitacora();
            BuscarArchivoUsuario();
            registroForm formularioRegistro =  new registroForm();
            formularioRegistro.setVisible(true);
            dispose();
    }//GEN-LAST:event_labelRegistrarUsuarioMouseClicked

    private void labelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelLogoMouseClicked

    public void VerificarSiExisteUsuario(String nombreUsuario){
        String rutaBitacoraUsuario = "C:\\MEIA\\bitacora_usuario.txt";
        String rutaDescBitacoraUsuario = "C:\\MEIA\\desc_bitacora_usuario.txt";
        String rutaUsuario = "C:\\MEIA\\usuario.txt";
        String strError = "";
        //Verificar si existe en Bitacora de Usuarios 
         
        if (VerificarSiExiste(rutaBitacoraUsuario, nombreUsuario, strError) == null) {
            System.out.println(strError);
            System.out.println("No existe en Bitacora Usuario");
            if (VerificarSiExisteArchivo(rutaUsuario)) {
                System.out.println(strError);
                if(VerificarSiExiste(rutaUsuario, nombreUsuario, strError) == null){
                    System.out.println("No Existe en Usuario");
                }else {
                    System.out.println("Existe Usuario");
                }
            } else {
                System.out.println("Crearlo en Bitacora");
            }
        }
        else {
            System.out.println("Existe en Bitacora");
        }
        
    }
    
    public void EscribirEnBitacora(Usuario user, String rutaBitacora, String rutaDescriptor){
       
    }
      
    public Usuario VerificarSiExiste(String strPath,String nombreUsuario,String strError)
    {
        File Archivo = new File(strPath);
        if(Archivo.exists()==true)
        {
            if (Archivo.length() > 0) {
                Usuario user = new Usuario();
                FileReader LecturaArchivo;
                try {
                    LecturaArchivo = new FileReader(Archivo);
                    BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                    String Linea="";
                    try {
                        Linea=LeerArchivo.readLine();
                        String[] split;

                        while(Linea != null)
                        {
                            if(!"".equals(Linea))
                            {
                                split=Linea.split("\\|");
                                
                                if (split[9].equals("1")) {
                                    if (split[0].equals(nombreUsuario)) {
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
                                    }
                                    else {
                                        user = null;
                                    }
                                }
                            }
                            Linea=LeerArchivo.readLine();
                        }

                        LecturaArchivo.close();
                        LeerArchivo.close();

                        strError="";
                        return user;

                    } catch (IOException ex) {
                        strError= ex.getMessage();
                        return null;
                    }
                } catch (FileNotFoundException ex) {
                    strError= ex.getMessage();
                    return null;
                }            
        
            }
            else {
                return null;
            }
        }
        else
        {
            strError="No existe el archivo";
            return null;
        }
    }
    
    public boolean VerificarSiExisteArchivo(String ruta){
        File archivo = new File(ruta);
        return archivo.exists();
    }
    public void BuscarDirectorio(){
        if (VerificarExistenciaDirectorio()) {
            System.out.println("El directorio MEIA Existe en ROOT");
       }
       else {
           CrearDirectorioRoot();
       }
    }
    
    
    public boolean VerificarExistenciaDirectorio(){
        String rutaDirectorio = "C:\\MEIA";
        File directorio = new File(rutaDirectorio);
        
        return directorio.exists();
    }
    
    
    public void CrearDirectorioRoot(){
      String rutaDirectorio = "C:\\MEIA";
      File directorio = new File(rutaDirectorio);
      directorio.mkdir();
        System.out.println("Directorio MEIA Creado en ROOT");
    }
    
    public void BuscarUsuario(String nombreUsuario, String password){
        BuscarBitacora();
        BuscarArchivoUsuario();
        String rutaBitacora = "C:\\MEIA\\bitacora_usuario.txt";
        String rutaMaestro = "C:\\MEIA\\usuario.txt";
        String rutaDesciptorBitacora = "C:\\MEIA\\desc_bitacora_usuario.txt";
        String rutaDescriptorMaestro = "C:\\MEIA\\desc_usuario.txt";
        Usuario user = new Usuario();
        if ((user = BuscarEnBitacora(nombreUsuario)) != null) {

            verifcarPassword(user, password, rutaBitacora, rutaDesciptorBitacora);
        }
        else {
            if ((user = BuscarEnArchivoUsuario(nombreUsuario)) != null) {
                
                verifcarPassword(user, password, rutaMaestro, rutaDescriptorMaestro);
            }
            else {

            JOptionPane.showMessageDialog(null, "El usuario no existe");


            }
        }
        
    }
    
    public void verifcarPassword(Usuario user, String password, String archivoLocation, String DescriptorLocation){
        if (user.password.equals(password)) {
            dashboard formularioDashboard = new dashboard(user, archivoLocation, DescriptorLocation);
            formularioDashboard.setVisible(true);
            dispose();
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }
    
    
    public void BuscarBitacora(){
        if (ExisteBitacoraUsuario()) {
                System.out.println("El archivo de Bitacora Usuario Existe");
            }
            else {
                CrearBitacoraUsuario();
            }
    }
    public boolean ExisteBitacoraUsuario(){
        String rutaBitacoraUsuario = "C:\\MEIA\\bitacora_usuario.txt";
        File bitacoraUsuario = new File(rutaBitacoraUsuario);
        return bitacoraUsuario.exists();
    }
    
    public void BuscarArchivoUsuario(){
        if (ExisteArchivoUsuario()) {
                System.out.println("El archivo de Usuario Existe");
            }
            else {
                CrearArchivoUsuario();
            }
    }
    public boolean ExisteArchivoUsuario(){
        String rutaArchivoUsuario = "C:\\MEIA\\usuario.txt";
        File archivoUsuario = new File(rutaArchivoUsuario);
        return archivoUsuario.exists();
    }
    
    public void CrearBitacoraUsuario(){
        String rutaBitacoraUsuario = "C:\\MEIA\\bitacora_usuario.txt";
        String rutaDescriptorBitacoraUsuario = "C:\\MEIA\\desc_bitacora_usuario.txt";
        File bitacoraUsuario = new File(rutaBitacoraUsuario);
        File descBitacoraUsuario = new File(rutaDescriptorBitacoraUsuario);
        
        try{
            bitacoraUsuario.createNewFile();
            descBitacoraUsuario.createNewFile();
            System.out.println("Bitacora de Usuario Creada en conjunto con su descriptor");
        }
        catch(Exception ex){
            System.out.println("Error al crear Bitacora de Usuario");
        }
        
        
    }
    
    public void CrearArchivoUsuario(){
        String rutaArchivoUsuario = "C:\\MEIA\\usuario.txt";
        String rutaDescriptorArchivoUsuario = "C:\\MEIA\\desc_usuario.txt";
        File archivoUsuario = new File(rutaArchivoUsuario);
        File descArchivoUsuario = new File(rutaDescriptorArchivoUsuario);
        
        try{
            archivoUsuario.createNewFile();
            descArchivoUsuario.createNewFile();
            System.out.println("Archivo maestro Usuario Creada en conjunto con su descriptor");
        }
        catch(Exception ex){
            System.out.println("Error al crear Archivo Maestro de Usuario");
        }
        
        
    }
    
    public Usuario BuscarEnBitacora(String nombreUsuario){
        String rutaBitacora = "C:\\MEIA\\bitacora_usuario.txt";
        String rutaDescriptorBitacora = "C:\\MEIA\\desc_bitacora_usuario.txt";
        File archivoBitacora = new File(rutaBitacora);
        File archivoDescriptorBitacora = new File(rutaDescriptorBitacora);
        
        if (archivoBitacora.length() > 0) {
            Usuario user = new Usuario();
                try {
                    FileReader LecturaArchivo = new FileReader(archivoBitacora);
                    BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                    String Linea="";
                    Linea=LeerArchivo.readLine();
                    String[] split;
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split=Linea.replace("=", "").split("\\|");
                            if (Linea.contains(nombreUsuario)) {
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
                            }
                            else{
                                System.out.println("No Se encontro el usuario " + user.nombreUsuario + "en Bitacora");
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
    
    public Usuario BuscarEnArchivoUsuario(String nombreUsuario){
        String rutaArchivoUsuario = "C:\\MEIA\\usuario.txt";
        String rutaDescriptorUsuario = "C:\\MEIA\\desc_usuario.txt";
        File archivoUsuario = new File(rutaArchivoUsuario);
        File archivoDescriptorUsuario = new File(rutaArchivoUsuario);
        
        if (archivoUsuario.length() > 0) {
            Usuario user = new Usuario();
                try {
                    FileReader LecturaArchivo = new FileReader(archivoUsuario);
                    BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                    String Linea="";
                    Linea=LeerArchivo.readLine();
                    String[] split;
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split=Linea.replace("=", "").split("\\|");
                            if (Linea.contains(nombreUsuario)) {
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
                                    System.out.println("Se encontro el usuario " + user.nombreUsuario + "en Archivo Usuario");
                                    break;
                                }
                                else {
                                    System.out.println("El usuario " + user.nombreUsuario + "se dio de baja en Archivo Usuario");
                                    user = null;
                                }
                            }
                            else{
                                System.out.println("No Se encontro el usuario " + user.nombreUsuario + "en Archivo Usuario");
                            }
                        }
                        
                        Linea=LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();
                    return user;
                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo Usuario");
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelRegistrarUsuario;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
