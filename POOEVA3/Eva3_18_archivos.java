/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author luisa
 */
public class Eva3_18_archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            // TODO code application logic here
            FileInputStream archivo = new FileInputStream("c:/Archivo_POO/Archivo.txt");
          
        int caracter = archivo.read();
        while(caracter !=-1){
            System.out.println((char)caracter);
            caracter = archivo.read();
        }
        } catch (FileNotFoundException ex) {
              ex.printStackTrace();
        }
         catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
