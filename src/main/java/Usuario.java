/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author warfa
 */
public class Usuario<T> {
    public String nombreUsuario = ""; 
    public String nombre = ""; 
    public String apellido = ""; 
    public String password = ""; 
    public int rol = 0; 
    public String fecha_nacimiento = ""; 
    public String correo_alterno = ""; 
    public int telefono = 0;
    public String path_fotografia = "";
    public int estatus = 0;
    
  
 
    
    public String delimiter(String tipoDato, String variable, int CantidadMaxima){
        String cadena = "";
        int cantidadCaracteres = 0;
        int caracteresFaltantes = 0;
        if (tipoDato.equals("txt")) {
             cadena = variable.toString();
             cantidadCaracteres = cadena.length();
  
            if (cantidadCaracteres!= CantidadMaxima ) {
                caracteresFaltantes = CantidadMaxima - cantidadCaracteres;
                for (int i = 0; i < caracteresFaltantes; i++) {
                    cadena = cadena + "=";
                }
            }
       
        }
         
        if (tipoDato.equals("bt")) {
             cadena = String.valueOf(variable);
        }
        return cadena;
    }
    
    
    public String DelimitarCaracteres(){
        
        return delimiter("txt", nombreUsuario, 20) + "|" + delimiter("txt",nombre,30) + "|" + delimiter("txt", apellido, 30) + "|" + delimiter("txt", password, 40) + "|" + delimiter("bt", String.valueOf(rol) ,0 ) + "|" + delimiter("txt", fecha_nacimiento, 19) + "|" +
               delimiter("txt",correo_alterno, 40) + "|" + delimiter("txt", String.valueOf(telefono), 8) + "|" + delimiter("txt", path_fotografia, 200) + "|" + delimiter("bt", String.valueOf(estatus), 0);
    }
}
