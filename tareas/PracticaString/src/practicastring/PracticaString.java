/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicastring;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class PracticaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion=0;
        Scanner oScanner=new Scanner(System.in);
        
        do{
             System.out.println("Digitela opcion que desea :");
             System.out.println("1. Ejercicio 1 ");
            
             opcion=oScanner.nextInt();
             switch(opcion)
             {
                 case 1:
                     System.out.println("Digite cadena a evaluar");
                     ejercicio1 oejercicio1=new ejercicio1();
                     oScanner=new Scanner(System.in);
                     oejercicio1.setCadena(oScanner.nextLine());
                     System.out.println(oejercicio1.Alrevez());
                     System.out.println(oejercicio1.Palindromo());
                     
                 break;
                     
                     
             }
            
            
            
          }while(opcion<=7);
        
        
    }
        
    
    
}
