/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan-Gtsk
 */
public class mensaje {
    String usuarioNombre = "";
    String usuarioAmigo = "";
    String fecha = "";
    String contenidoMensaje = "";
    int tipo_mensaje = 0;
    int status = 0;
    
    public String GetText()
        {
            return  rightPadding(this.usuarioNombre, 20)+ "|" + rightPadding(this.usuarioAmigo, 20) + "|" + rightPadding(this.fecha, 20) + "|" + rightPadding(this.contenidoMensaje, 1400) + "|" + String.valueOf(this.tipo_mensaje)+ "|" + String.valueOf(this.status);
        }
    public String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);
    }
}
