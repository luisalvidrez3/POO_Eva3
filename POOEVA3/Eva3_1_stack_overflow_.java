/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_stack_overflow_;

/**
 *
 * @author luisa
 */
public class Eva3_1_stack_overflow_ {

    /**
     * @param args the command line arguments
     */
    public static int count = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        terminarStack();
        
      
        
    }
    
    
    public static void terminarStack(){
        
       
         count = count +1;
        System.out.println(count);
        terminarStack();
    }
    
}

