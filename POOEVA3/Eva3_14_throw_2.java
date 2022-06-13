/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_throw_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Eva3_14_throw_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona Per = new persona();
        Per.setNombre("Juan");
        try {
            Per.setEdad(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    
}
class persona{
    private int edad;
    private String nombre;

    public persona() {
        
            
    }

    public persona(int edad, String nombre) throws Exception {
       setEdad(edad);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if ((edad >=0) && (edad <=130))
        this.edad = edad;
        else {
            throw new Exception ("Rango de edad incorrecto");}
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
  
            
}
