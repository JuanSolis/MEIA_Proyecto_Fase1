
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Nodo   {

    public String pathArchivo = "C:\\MEIA\\imagen_usuario.txt";
    public int No_registro;
    public int Izq = -1;
    public int Der = -1;
    public String Usuario = "";
    public String path_fotografia = "";
    public String Fec_transac = "";
    public int Estatus = 1;
    int FixedSizedStringLength = ToFixedSizedString().length();
    
    public String ToFixedSizedString()
        {
            return  rightPadding(String.valueOf(No_registro), 3)+ "|" + rightPadding(String.valueOf(Izq), 3) + "|" + rightPadding(String.valueOf(Der), 3) + "|" + rightPadding(this.Usuario, 30) + "|" +rightPadding(path_fotografia, 60) + "|" + rightPadding(Fec_transac, 20) + "|" + String.valueOf(Estatus) + System.getProperty("line.separator");
        }
    public String rightPadding(String str, int num) {
        return String.format("%1$-" + num + "s", str);
    }
    
    public int CompareTo(Nodo other){
        return GetKey().compareTo(other.GetKey());
    }
    
    //ToFixedSizedString
    
    
    
    public String GetKey(){
        return Usuario + "," + path_fotografia;
    }
    
    public void DeserializeText(String DataString){
        String[] Data = DataString.split("\\|");
        No_registro = Integer.parseInt(Data[0].trim());
        Izq = Integer.parseInt(Data[1].trim());
        Der = Integer.parseInt(Data[2].trim());
        Usuario = Data[3].trim();
        path_fotografia = Data[4].trim();
        Fec_transac = Data[5].trim();
        Estatus = Integer.parseInt(Data[6].trim());
    }
    
    public void ReadFromFile() throws FileNotFoundException, IOException{
        
        File Archivo = new File(pathArchivo);

        if(Archivo.exists())
        {

            FileReader LecturaArchivo;

            LecturaArchivo = new FileReader(Archivo);
            BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
            String Linea="";

            RandomAccessFile raf = new RandomAccessFile(pathArchivo, "rw");

            raf.seek((No_registro * FixedSizedStringLength ));
            Linea=LeerArchivo.readLine();

            DeserializeText(Linea);

            raf.close();
            LecturaArchivo.close();
            LeerArchivo.close();
        }
    }
    
    public void WriteToFile() throws FileNotFoundException, IOException{
        File Archivo = new File(pathArchivo);
  
        
        
      
            RandomAccessFile raf = new RandomAccessFile(pathArchivo, "rw");
           raf.seek((No_registro * FixedSizedStringLength ));
           byte[] txt =  ToFixedSizedString().getBytes();
           
           raf.write(txt, 0, FixedSizedStringLength);
           raf.close();

    }
    
}
