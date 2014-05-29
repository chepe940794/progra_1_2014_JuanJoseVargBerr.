/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pract1ejercicio4;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Pract1ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int vala=0;
        int valb=0;
        int valc=0;
        int vald=0;
        
        
        
        
         Scanner teclado = new Scanner(System.in);
         
         
         System.out.print("Digite el valor de A"+"\n");
         a =Integer.parseInt(teclado.nextLine());
         
         System.out.print("Digite el valor de B"+"\n");
         b =Integer.parseInt(teclado.nextLine());
         
         System.out.print("Digite el valor de C"+"\n");
         c =Integer.parseInt(teclado.nextLine());
         
         System.out.print("Digite el valor de D"+"\n");
         d =Integer.parseInt(teclado.nextLine());
         
         
         
         vala=a;
         valb=b;
         valc=c;
         vald=d;
         
                   
         b=c;
         c=a;
         a=d;
         d=valb;
        
         
          System.out.print("el nuevo valor de A es = "+a+"\n");
          System.out.print("el nuevo valor de B es = "+b+"\n");
          System.out.print("el nuevo valor de C es = "+c+"\n");
          System.out.print("el nuevo valor de D es = "+d+"\n");
             
         
         //fin
              
    }
    
}
