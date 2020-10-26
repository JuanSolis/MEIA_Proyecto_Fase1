/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan-Gtsk
 */
public class Grupo {
    String creadorGrupo = "";
    String nombreGrupo = "";
    String descriptorGrupo = "";
    int miembros = 0;
    String fechaTransaccion = "";
    int status = 0;
    
    
    public String getGrupoData(){
    
        return  rightPadding(this.creadorGrupo, 20)+ "|" + rightPadding(this.nombreGrupo, 30)+ "|" + rightPadding(this.descriptorGrupo, 60)+ "|" +  rightPadding(String.valueOf(this.miembros), 2)+ "|"+
                rightPadding(this.fechaTransaccion, 20)+ "|" + this.status+ "|";
    }
    
    public String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);
    }
}
