import java.util.Formatter;

public class SolicitudAmistad {
    public Usuario usuario; 
    public Usuario usuario_amigo; 
    public int aceptado = 0; 
    public String fecha_transaccion = ""; 
    public String fecha_usuario_transaccion = "";
    public int estatus = 0;
    public int positionFechaTransaccion = 65;
    
    
    public String GetText()
        {
            return  rightPadding(usuario.nombreUsuario, 20)+ "|" + rightPadding(usuario_amigo.nombreUsuario, 20) + "|" + String.valueOf(aceptado) + "|" + rightPadding(fecha_transaccion, 20) + "|" + rightPadding(fecha_usuario_transaccion, 20)+ "|" + String.valueOf(estatus);
        }
    public String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);
    }
}
