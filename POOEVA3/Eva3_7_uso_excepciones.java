/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva3_7_uso_excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true;
        do{
        
        
        try{
        System.out.println("Inserte su edad");    
        Scanner input = new Scanner (System.in);
        int edad = input.nextInt();
         System.out.println("Tu edad es:" + edad);
         datoErroneo = false;
        }catch(InputMismatchException e){
            System.out.println("El dato introducido no es valido ");
        
        }
        
        }while(datoErroneo);
        
    }
    
}
