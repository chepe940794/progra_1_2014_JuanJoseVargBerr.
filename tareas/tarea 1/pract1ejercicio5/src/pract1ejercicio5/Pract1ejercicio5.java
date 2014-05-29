/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pract1ejercicio5;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Pract1ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int a=0;
       
        Scanner teclado = new Scanner(System.in);
        
        
         System.out.print("Digite el valor de A"+"\n");
         a =Integer.parseInt(teclado.nextLine());
         
         
        if (a%2==0){
            
             System.out.print("Es par"+"\n");
        }
        else
        {
             System.out.print("Es impar"+"\n");
        }
        
        
        //fin
        
        
    }
    
}
