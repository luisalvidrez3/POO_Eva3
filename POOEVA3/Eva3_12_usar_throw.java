/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_usar_throw;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva3_12_usar_throw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        Scanner input = new Scanner(System.in);
        int valor = 0;
        try{
        System.out.println("Introduce un dato entero");
         valor = input.nextInt();
        if(valor<0)
        throw new Exception("El valor: " + valor + " no es valido");
         System.out.println("La edad es: " + valor);
          }catch(Exception e){
        e.printStackTrace();
                      }
       
    }
    
}
