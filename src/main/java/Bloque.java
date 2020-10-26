/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan-Gtsk
 */
public class Bloque {
    String usuario = "";
    String nombreGrupo = "";
    String usuarioAmigo = "";
    String fechaTransaccion = "";
    int estatus = 0;
    
    
    public String getBloqueData(){
    
        return  rightPadding(this.usuario, 20)+ "|" + rightPadding(this.nombreGrupo, 30)+ "|" + rightPadding(this.usuarioAmigo, 60)+ "|" +  rightPadding(this.fechaTransaccion, 20)+ "|"+
                this.estatus+ "|";
    }
    
    public String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);
    }
    
     public String GetKey()
        {
            return this.usuario + "," + this.nombreGrupo + "," + this.usuarioAmigo;
        }
}
