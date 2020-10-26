
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
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
public class AgregarAGrupo extends javax.swing.JFrame {

    /**
     * Creates new form AgregarAGrupo
     */
    int cantidadRegistros = 0;
    int raiz = 0;
    Usuario usuarioActual;
    public AgregarAGrupo(Usuario actual) {
        initComponents();
        
        usuarioActual = actual;
        AgregarAGrupo.this.setBackground(new Color(0,0,0,0));
         
       
       ImageIcon cerrar = new ImageIcon("src/Imagenes/cancelar.png");
       Icon iconoCerrar = new ImageIcon(cerrar.getImage().getScaledInstance(txtCerrar.getWidth(), txtCerrar.getHeight(), Image.SCALE_FAST));
       
       txtCerrar.setIcon(iconoCerrar);
       
       
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
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtBuscarGrupo = new javax.swing.JTextField();
        txtBuscarAmigo = new javax.swing.JTextField();
        btnAgregarAGrupo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(txtCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 30, 30));

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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 305, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtBuscarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 130, 30));
        jPanel1.add(txtBuscarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, 30));

        btnAgregarAGrupo.setText("Agregar");
        btnAgregarAGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAGrupoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarAGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 130, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Amigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 60, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Grupo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 85, 560, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0)
        {

            LoginForm formLogin = new LoginForm();
            formLogin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_txtCerrarMouseClicked

    private void btnAgregarAGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAGrupoActionPerformed
        try {
            EscribirBloque();
        } catch (IOException ex) {
            Logger.getLogger(AgregarAGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarAGrupoActionPerformed

    public void EscribirBloque() throws IOException{
        
        cantidadRegistros++;  
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String rutaDescriptorBloques = "C:\\MEIA\\Desc_bloques.txt";
        File Archivo = new File(rutaDescriptorBloques);
        
        String rutaAmigosN = "C:\\MEIA\\grupo_amigos_n.txt";
        Bloque nuevoBloque = new Bloque();
        nuevoBloque.usuario = usuarioActual.nombreUsuario;
        nuevoBloque.nombreGrupo = txtBuscarGrupo.getText();
        nuevoBloque.usuarioAmigo = txtBuscarAmigo.getText();
        nuevoBloque.estatus = 1;
        nuevoBloque.fechaTransaccion = formatter.format(date).toString();
        
        
        
     
        
        File ArchivoAmigosN = new File(rutaAmigosN);
        
             
        if (ArchivoAmigosN.exists()) {
             FileWriter escribirEnArchivo = new FileWriter(ArchivoAmigosN,true);
            BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
            bw.write(nuevoBloque.getBloqueData() + System.getProperty("line.separator"));
            bw.close();
            escribirEnArchivo.close(); 
        }
        else {
            ArchivoAmigosN.createNewFile();
            FileWriter escribirEnArchivo = new FileWriter(ArchivoAmigosN,true);
            BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
            bw.write(nuevoBloque.getBloqueData() + System.getProperty("line.separator"));
            bw.close();
            escribirEnArchivo.close(); 
            
        }
     
        
        
        if (Archivo.exists()) {
                FileReader LecturaArchivo = new FileReader(Archivo);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                
                cantidadRegistros = Integer.parseInt(LeerArchivo.readLine());
                LeerArchivo.close();
                LecturaArchivo.close();
                
                Archivo.delete();
                cantidadRegistros++;
            }
            
            
            Archivo.createNewFile();
            
            FileWriter escribirEnArchivo = new FileWriter(Archivo,true);
            BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
            int prueba = cantidadRegistros;
            bw.write(String.valueOf(cantidadRegistros) + System.getProperty("line.separator"));
            bw.close();
            escribirEnArchivo.close(); 
            
           Indice nuevoIndice = new Indice();
        
            nuevoIndice.Registro = cantidadRegistros;
            nuevoIndice.Llave = nuevoBloque.GetKey();
            nuevoIndice.Siguiente = 0;
            nuevoIndice.Estado = 1;
            EscribirIndice(nuevoIndice);
    
    }
    
    public void EscribirIndice(Indice nuevoIndice) throws IOException{
    
        List<Indice> Indices = new ArrayList<Indice>();
        String filePath = "C:\\MEIA\\indices.txt";
        File Archivo = new File(filePath);
//        FileReader LecturaArchivo = new FileReader(Archivo);
//        BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
        
        
        String filePathDescriptor = "C:\\MEIA\\Desc_indices.txt";
        File archivoDescriptor = new File(filePathDescriptor);
        
        if (archivoDescriptor.exists()) {
            FileReader LecturaArchivoDescriptor = new FileReader(archivoDescriptor);
            BufferedReader LeerArchivoDescriptor = new BufferedReader(LecturaArchivoDescriptor);
            
            raiz = Integer.parseInt(LeerArchivoDescriptor.readLine());
            LeerArchivoDescriptor.close();
            LecturaArchivoDescriptor.close();
        }
        else {
            raiz = nuevoIndice.Registro;
            archivoDescriptor.createNewFile();
            FileWriter escribirEnArchivo = new FileWriter(archivoDescriptor,true);
            BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
            bw.write(String.valueOf(raiz) + System.getProperty("line.separator"));
            bw.close();
            escribirEnArchivo.close();
        }
        
        if (Archivo.exists() && raiz != 0) {
                String line;
                FileReader file = new FileReader(filePath);
                BufferedReader fileBuffer = new BufferedReader(file);
                while ((line = fileBuffer.readLine()) != null)
                {
                    Indice IndiceLeido = new Indice();
                    IndiceLeido.Leer(line);
                    Indices.add(IndiceLeido);
                }
                fileBuffer.close();
                file.close();
                
                Indice indiceActual = buscar(raiz, Indices);
                Indice indiceSiguiente;
                
                
                for (Indice item : Indices)
                {
                    indiceSiguiente = buscar(indiceActual.Siguiente, Indices);
                    
                    if (indiceSiguiente == null)
                    {
                        if (indiceActual.CompareTo(nuevoIndice) == 1)
                        {
                            nuevoIndice.Siguiente = indiceActual.Registro;
                            if (indiceActual.Registro == raiz)
                            {
                                raiz = nuevoIndice.Registro;
                   
                                archivoDescriptor.delete();
                                archivoDescriptor.createNewFile();
                                
                                FileWriter escribirEnArchivo = new FileWriter(archivoDescriptor,true);
                                BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
                                bw.write(String.valueOf(raiz) + System.getProperty("line.separator"));
                                
                                bw.close();
                                escribirEnArchivo.close();
                            }
                        }
                        else
                            indiceActual.Siguiente = nuevoIndice.Registro;
                        
                        Indices.add(nuevoIndice);
                        break;
                    }
                    else
                    {
                        if (indiceActual.CompareTo(nuevoIndice) == 1)
                        {
                            nuevoIndice.Siguiente = indiceActual.Registro;
                            Indices.add(nuevoIndice);
                            if (indiceActual.Registro == raiz)
                            {    
                                raiz = nuevoIndice.Registro;
                   
                                archivoDescriptor.delete();
                                archivoDescriptor.createNewFile();
                                
                                FileWriter escribirEnArchivo = new FileWriter(archivoDescriptor,true);
                                BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
                                bw.write(String.valueOf(raiz) + System.getProperty("line.separator"));
                                
                                bw.close();
                                escribirEnArchivo.close();
                                
                                
                            }
                            break;
                        }
                        else if (indiceActual.CompareTo(nuevoIndice) == -1 && indiceSiguiente.CompareTo(nuevoIndice) == 1)
                        {
                            indiceActual.Siguiente = nuevoIndice.Registro;
                            nuevoIndice.Siguiente = indiceSiguiente.Registro;
                            Indices.add(nuevoIndice);
                            break;
                        }
                    }
                    indiceActual = indiceSiguiente;
                }
                Archivo.delete();
                Archivo.createNewFile();
                
                
                FileWriter escribirEnArchivo = new FileWriter(Archivo,true);
                BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
                 
                for (Indice item : Indices){
                
                 bw.write(item.getIndiceData() + System.getProperty("line.separator"));
             
                }
            
                bw.close();
                escribirEnArchivo.close();
            
        }
        else {
            
            Archivo.createNewFile();
            FileWriter escribirEnArchivo = new FileWriter(Archivo,true);
            BufferedWriter bw = new BufferedWriter(escribirEnArchivo);
            bw.write(nuevoIndice.getIndiceData() + System.getProperty("line.separator"));
            bw.close();
            escribirEnArchivo.close();
        }
        
        
        
    }
    
    public Indice buscar(int num, List<Indice> indices){
        
        Indice indiceEncontrado = new Indice();
        for (Indice item : indices) {
            if (item.Registro == num) {
                indiceEncontrado =  item;
                break;
            }
        }
        
        if (indiceEncontrado.Llave.equals("")) {
            indiceEncontrado =  null;
        }
        
        return indiceEncontrado;
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
            java.util.logging.Logger.getLogger(AgregarAGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtBuscarAmigo;
    private javax.swing.JTextField txtBuscarGrupo;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}