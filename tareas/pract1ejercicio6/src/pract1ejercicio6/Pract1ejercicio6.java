/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pract1ejercicio6;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Pract1ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int b=0;
        
         Scanner teclado = new Scanner(System.in);
         
         
        System.out.print("Digite el valor de B"+"\n");
         b =Integer.parseInt(teclado.nextLine());
        
         
         if (b>=0){
            System.out.print("Es positivo"+"\n");  
         }
        else
         {
        
         System.out.print("Es negativo"+"\n");
         }
    }
    
}
