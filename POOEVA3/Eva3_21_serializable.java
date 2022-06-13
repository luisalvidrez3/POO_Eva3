/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_21_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Eva3_21_serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Pedro","Paramo");
        escribirObj(persona);
    }
    
    public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/Archivo_POO/Archivo3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch); 
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
           
        }
        
    }
    
     public static void leerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("c:/Archivo_POO/Archivo3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch); 
          Persona persona = (Persona)leerObjeto.readObject();
            System.out.println("Nombre: "+ persona.getNombre() + persona.getApellido());
            leerObjeto.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Eva3_21_serializable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
}
class Persona implements Serializable{
    private String nombre;
    private String  apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}