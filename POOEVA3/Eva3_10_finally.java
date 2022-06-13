/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva3_10_finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un dato entero");
        int valor = input.nextInt();
        System.out.println("El valor es " + valor);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{//siempre se ejecuta
        
        System.out.println("Esta linea siempre debe de ejecutarse");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
