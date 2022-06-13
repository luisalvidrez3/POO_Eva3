/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_serializable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Eva3_22_serializable_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> miListaPerso = new ArrayList();
        miListaPerso.add(new Persona ("Juan","Perez"));
        
        miListaPerso.add(new Persona ("Ana","Perez"));
        
        miListaPerso.add(new Persona ("Filomeno","Perez"));
        
        miListaPerso.add(new Persona ("CR7","Perez"));
        
        escribirObj(miListaPerso);
        leerObj();
    
}
      public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/Archivo_POO/Archivo4.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch); 
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        
    }
      
       public static void leerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("c:/Archivo_POO/Archivo4.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch); 
          ArrayList<Persona> miListaPerso = (ArrayList<Persona>)leerObjeto.readObject();
          for(int i = 0;i< miListaPerso.size(); i ++){
              Persona persona =miListaPerso.get(i);
            System.out.println("Nombre: "+ persona.getNombre() + persona.getApellido());
        }
            leerObjeto.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
           ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
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