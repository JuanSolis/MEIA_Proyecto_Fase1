/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan-Gtsk
 */
public class Indice {
    int Registro = 0;
    String Posicion = "1." + Registro;
    String Llave = "";
    int Siguiente = 0;
    int Estado = 0;
    
     public int CompareTo(Indice other)
    {
        return Llave.compareTo(other.Llave);
    }
     
     
     public String getIndiceData(){
    
        return  rightPadding(String.valueOf(this.Registro), 20)+ "|" + rightPadding(this.Posicion, 30)+ "|" + rightPadding(this.Llave, 60)+ "|" +  rightPadding(String.valueOf(this.Siguiente), 2)+ "|"+
             this.Estado;
    }
    
    public String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);
    }
     
     
    public void Leer(String values)
    {
        String[] valores = values.split("\\|");
        Registro = Integer.parseInt(valores[0].trim());
        Llave = valores[2].trim();
        Siguiente = Integer.parseInt(valores[3].trim());
        Estado = Integer.parseInt(valores[4].trim());
    }
    
}
