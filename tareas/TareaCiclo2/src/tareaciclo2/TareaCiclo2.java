/*
 * 2.	Dado un valor n y otro valor y, desplegar en pantalla números 
correlativos desde 1 hasta n, reemplazando por un * cada vez que corresponda 
desplegar un número múltiplo de y.
 */

package tareaciclo2;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class TareaCiclo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N=0;
        int Y=0;
       
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Digite el numero N "+"\n");
         N =Integer.parseInt(teclado.nextLine());
         
          System.out.print("Digite el numero Y "+"\n");
         Y =Integer.parseInt(teclado.nextLine());
         
      
         
        for (int i = 1; N >=i; i++) 
        {
           if(i%Y==0)
           {
           System.out.print("*");
            System.out.print("-"); 
           }
           else
           {
            System.out.print(i);
            System.out.print("-"); 
           }
           
        }
        
    }
    
}
