/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaciclo9;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class TareaCiclo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=0;
        int acum=0;
        int promedio=0;
        
        Scanner teclado=new Scanner(System.in);
        
         System.out.println("Ingrese un numero"+"\n");
         numero =Integer.parseInt(teclado.nextLine());
         
         for (int i = 0; i <= 8; i++) {
             System.out.println("Ingrese otro numero"+"\n");
         numero =Integer.parseInt(teclado.nextLine());
             
            acum=acum+numero;
        }
         promedio=acum/10;
          System.out.println("La suma de todos es ="+acum+"\n");
          System.out.println("El promedio  es ="+promedio+"\n");
    }
    
}
