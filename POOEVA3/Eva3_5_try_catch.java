/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva3_5_try_catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println("Inserte su edad");
        Scanner input = new Scanner (System.in);
        int edad = 0; 
        try{
         edad = input.nextInt();
        }catch(InputMismatchException e){
            //e.printStackTrace();
            System.out.println("Fallo la captura!!");
        }
        System.out.println("Tu edad es:" + edad);
        
    }
    
    
}
