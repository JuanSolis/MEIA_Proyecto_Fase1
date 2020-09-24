
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginForm extends javax.swing.JFrame {


    public LoginForm() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if (!txtUsuario.getText().equals("")) {
            BuscarDirectorio();
            BuscarUsuario(txtUsuario.getText());
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
        File archivoBitacora = new File(rutaBitacora);
        File archivoDesciptor = new File(rutaDescriptor);
        
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        Map<String,String> formatoDescriptor = new HashMap<String, String>();
        
        
        try
        {
                FileWriter Escribir = new FileWriter(archivoBitacora,true);
                BufferedWriter bw = new BufferedWriter(Escribir);
                bw.write(user.ToString()+ System.getProperty( "line.separator" ));
                bw.close();
                Escribir.close();
                System.out.println("Registro escrito en Bitacora");
                
                try {
                    DescriptorBitacoraUsuario dBU = new DescriptorBitacoraUsuario();
                     FileWriter EscribirEnDescriptor = new FileWriter(archivoDesciptor,true);
                        PrintWriter  bwD = new PrintWriter (EscribirEnDescriptor);
                    if (archivoDesciptor.length() > 0 ) {
                        
                       
                       
                        EscribirEnDescriptor.close();
                        System.out.println("Registro escrito en Bitacora");
                    }
                    else {
                       formatoDescriptor.put("nombre_simbolico:", "bitacora_usuario");
                        formatoDescriptor.put("fecha_creacion:", date.toString());
                        formatoDescriptor.put("usuario_creacion:", user.nombreUsuario);
                        formatoDescriptor.put("fecha_modificacion:", date.toString());
                        formatoDescriptor.put("usuario_modificacion:", user.nombreUsuario);
                        formatoDescriptor.put("#_registros:", String.valueOf(archivoBitacora.length()));
                        formatoDescriptor.put("registros_activos:", "1");
                        formatoDescriptor.put("registros_inactivos:", "0");
                        formatoDescriptor.put("max_reorganizacion:", "3");
                        
                        formatoDescriptor.forEach((key,value) -> {
                            bwD.write((key+value) + System.getProperty( "line.separator" ) );
                       });
                 
                    }
                  
                     bwD.close();
                }
                catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        } 
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
                                        user.rol = split[4];
                                        user.fecha_nacimiento = split[5];
                                        user.correo_alterno = split[6];
                                        user.telefono = split[7];
                                        user.path_fotografia = split[8];
                                        user.estatus = split[9];
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
    
    public void BuscarUsuario(String nombreUsuario){
        BuscarBitacora();
        BuscarArchivoUsuario();
        if (BuscarEnBitacora(nombreUsuario) != null) {
            //Verificar Contrasena
        }
        else {
            if (BuscarEnArchivoUsuario(nombreUsuario) != null) {
                //Verificar Contrasena
            }
            else {
                String rutaDescriptorBitacora = "C:\\MEIA\\desc_bitacora_usuario.txt";
                File archivoDescriptorBitacora = new File(rutaDescriptorBitacora);
                
                if (archivoDescriptorBitacora.length() == 0) {
                    System.out.println("Se Creara El primer Usuario modo Administrador");
                    registroForm formularioRegistro =  new registroForm(nombreUsuario);
                    formularioRegistro.setVisible(true);
                    dispose();
                }
            }
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
                            split=Linea.split("\\|");
                            if (Linea.contains(nombreUsuario)) {
                                user.nombreUsuario = split[0];
                                user.nombre = split[1];
                                user.apellido = split[2];
                                user.password = split[3];
                                user.rol = split[4];
                                user.fecha_nacimiento = split[5];
                                user.correo_alterno = split[6];
                                user.telefono = split[7];
                                user.path_fotografia = split[8];
                                user.estatus = split[9];
                                if (user.estatus.equals("1")) {
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
                            split=Linea.split("\\|");
                            if (Linea.contains(nombreUsuario)) {
                                user.nombreUsuario = split[0];
                                user.nombre = split[1];
                                user.apellido = split[2];
                                user.password = split[3];
                                user.rol = split[4];
                                user.fecha_nacimiento = split[5];
                                user.correo_alterno = split[6];
                                user.telefono = split[7];
                                user.path_fotografia = split[8];
                                user.estatus = split[9];
                                if (user.estatus.equals("1")) {
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
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
