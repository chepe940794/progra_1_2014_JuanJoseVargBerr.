/*
 *1.	Realizar un programa que lea un número, luego desplegar esa 
cantidad de *.
 */

package tareaciclos1;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class TareaCiclos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int numero=0;
        
        Scanner teclado=new Scanner(System.in);
        
        
          System.out.print("Digite el numero "+"\n");
         numero =Integer.parseInt(teclado.nextLine());
         
         
         System.out.print("\n");
         
         for (int i = 1; i <=numero; i++)
         {
         System.out.println("*");
        
        }
        System.out.print("\n");
        
        
        
    }
    
}
