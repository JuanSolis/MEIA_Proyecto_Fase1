
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Writer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan-Gtsk
 */
public class Arbol_BB {
     int Raiz = 0;
     int CantidadNodos = 0;
     int CantidadNodosActivos = 0;
     String pathArchivoDesc = "C:\\MEIA\\Desc_imagen_usuario.txt";

    public Arbol_BB(){
        Raiz = -1;
        CantidadNodos = 0;
        CantidadNodosActivos = 0;
        File Archivo = new File(pathArchivoDesc);
            try {
                if (Archivo.exists())
                {
                    ReadFromFile();
                }
                else
                {
                    WriteToFile();
                }
        }catch(Exception ex){
            System.out.println("Error");
        }
       
    }
    
    
    public void ReadFromFile() throws FileNotFoundException, IOException
        {
            File file = new File(pathArchivoDesc);   
            if(file.exists())
            {
                if (file.length() > 0) {
                    
                    FileReader LecturaArchivo;
              
                        LecturaArchivo = new FileReader(file);
                        BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                        String Linea="";
                      
                        Linea=LeerArchivo.readLine();


                        LecturaArchivo.close();
                        LeerArchivo.close();
                        String[] splitTexto = Linea.split("\\|");

                        Raiz = Integer.parseInt(splitTexto[0]);
                         CantidadNodos = Integer.parseInt(splitTexto[1]);
                         CantidadNodosActivos = Integer.parseInt(splitTexto[2]);     
                            
                }
            }
        }
    
    
    
    public void WriteToFile() throws IOException
    {
        Writer fileWriter = new FileWriter(pathArchivoDesc, false); //overwrites file
        
        String cadena = String.valueOf(Raiz) + "|" + String.valueOf(CantidadNodos) + "|" + String.valueOf(CantidadNodosActivos);
        
        
        fileWriter.write(cadena);
        fileWriter.close();
    }
    
     public boolean Add(Nodo nuevoNodo) throws IOException
        {
            ReadFromFile();
            nuevoNodo.No_registro = CantidadNodos;
            if (Raiz == -1)
            {
                Raiz = nuevoNodo.No_registro;
                nuevoNodo.WriteToFile();
                CantidadNodos++;
                CantidadNodosActivos++;
                WriteToFile();
            }
            else
            {
                if (AddRecursivo(nuevoNodo, Raiz) != null)
                {
                    CantidadNodos++;
                    CantidadNodosActivos++;
                    WriteToFile();
                    return true;
                }
                return false;
            }
            return true;
        }
   
    private Nodo AddRecursivo(Nodo nuevoNodo, int PosActual) throws IOException
    {
        Nodo nodoActual = new Nodo();
        nodoActual.No_registro = PosActual;
        nodoActual.ReadFromFile();

        if (nuevoNodo.CompareTo(nodoActual) == -1)
        {
            if (nodoActual.Izq == -1)
            {
                nodoActual.Izq = nuevoNodo.No_registro;
                nodoActual.WriteToFile();
                nuevoNodo.WriteToFile();
                return nuevoNodo;
            }
            AddRecursivo(nuevoNodo, nodoActual.Izq);
        }
        else if (nuevoNodo.CompareTo(nodoActual) == 1)
        {
            if (nodoActual.Der == -1)
            {
                nodoActual.Der = nuevoNodo.No_registro;
                nodoActual.WriteToFile();
                nuevoNodo.WriteToFile();
                return nuevoNodo;
            }
            AddRecursivo(nuevoNodo, nodoActual.Der);
        }
        else
        {
            return null;
        }
        return nuevoNodo;
    }
     
    
}
