/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_try_catch_zero;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva3_6_try_catch_zero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Inserte un numero entero:");
        Scanner input = new Scanner (System.in);
        int entero = input.nextInt();
        
         System.out.println("Inserte un numero entero:");

        int entero2 = input.nextInt();
        try{
        
        System.out.println("Division:" + entero/entero2);
        } catch(ArithmeticException e){
            System.out.println("Dividio entre cero, se produjo un error");
        }
        System.out.println("fin del programa");
    }
}
    
    

