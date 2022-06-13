/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Eva3_19_buffers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Path ruta = Paths.get("c:/Archivo_POO/Archivo.txt");
        InputStream abrirArch;
        InputStreamReader leerArch;
        BufferedReader leerTexto;
        
        try {
            abrirArch = Files.newInputStream(ruta);
            leerArch = new InputStreamReader(abrirArch);
            leerTexto = new BufferedReader(leerArch);
            String linea = leerTexto.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = leerTexto.readLine();
            }
        } catch (IOException ex) {
          
        }
       
        
    }
    
}
