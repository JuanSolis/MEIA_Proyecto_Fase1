/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan-Gtsk
 */
public class BackUp {
    public String ruta_absoluta = "";
    public String usuario = "";
    public String fecha_transaccion = "";
            
    public String delimiter(String variable, int CantidadMaxima){
        String cadena = "";
        int cantidadCaracteres = 0;
        int caracteresFaltantes = 0;
    
             cadena = variable;
             cantidadCaracteres = cadena.length();
  
            if (cantidadCaracteres!= CantidadMaxima ) {
                caracteresFaltantes = CantidadMaxima - cantidadCaracteres;
                for (int i = 0; i < caracteresFaltantes; i++) {
                    cadena = cadena + "=";
                }
          
            }
      
        
        return cadena;
    }
    
    
    public String DelimitarCaracteres(){
        
        return delimiter(ruta_absoluta, 200 ) + "|" + delimiter(usuario,20) + "|" + delimiter(fecha_transaccion, 20);
    }
}
