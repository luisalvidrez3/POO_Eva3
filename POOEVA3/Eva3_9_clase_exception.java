/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_clase_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva3_9_clase_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
              System.out.println("Inserte un numero entero:");
        Scanner input = new Scanner (System.in);
        int entero = input.nextInt();
        
         System.out.println("Inserte un numero entero:");

        int entero2 = input.nextInt();
        
        System.out.println("Division:" + entero/entero2);
        } catch(Exception e1){
            e1.printStackTrace();
        }
        System.out.println("fin del programa");
    }
    
}
