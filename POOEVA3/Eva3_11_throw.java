/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Eva3_11_throw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            throw new Exception("Mi excepcion!!");
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    
}
