/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva3_8_multiples_catch {

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
        } catch(ArithmeticException e1){
            System.out.println("Dividio entre cero, se produjo un error");
        }catch(InputMismatchException e2){
            System.out.println("el valor capturado no es un numero valido");
            
        }
        System.out.println("fin del programa");
    }
    
}
