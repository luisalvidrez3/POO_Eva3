/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_20_escribir;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Eva3_20_escribir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Path ruta = Paths.get("c:/Archivo_POO/Archivo2.txt");
         OutputStream abrirArch;
         OutputStreamWriter escribirArch;
         BufferedWriter escribirTexto;
         
        try {
            abrirArch = Files.newOutputStream(ruta);
            escribirArch = new OutputStreamWriter (abrirArch);
             escribirTexto = new BufferedWriter (escribirArch);
             escribirTexto.write("Hola Mundo!!!");
             escribirTexto.flush();
             escribirTexto.close();
            
        } catch (IOException ex) {
          ex.printStackTrace();
        }
         
         
    }
    
}
