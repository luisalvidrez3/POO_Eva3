/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_nullpointerexception;

/**
 *
 * @author luisa
 */
public class Eva3_4_nullpointerexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona Persona = null;
      imprimir(Persona);
        System.out.println("fin de main");
        
    }
    public static void imprimir ( persona Perso ){
       
        masComplicado(Perso);
        System.out.println("fin de imprimir");
    }
    public static void masComplicado(persona Perso){
        System.out.println("Nombre:" + Perso.getNombre());
        System.out.println("fin de mas complicado");
    }
}
class persona{
    private String nombre;

    public persona() {
    }

    public persona(String nombre) {
        this.nombre = nombre;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    
}