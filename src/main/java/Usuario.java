/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author warfa
 */
public class Usuario {
    public String nombreUsuario = ""; 
    public String nombre = ""; 
    public String apellido = ""; 
    public String password = ""; 
    public String rol = ""; 
    public String fecha_nacimiento = ""; 
    public String correo_alterno = ""; 
    public String telefono = "";
    public String path_fotografia = "";
    public String estatus = "";
    
  
    public String ToString(){
        return nombreUsuario + "|" + nombre + "|" + apellido + "|" + password + "|" + rol + "|" + fecha_nacimiento + "|" +
                correo_alterno + "|" + telefono + "|" + path_fotografia + "|" + estatus;
    }
}
