/*
 * 7.	Ingresar N números enteros y reportar la cantidad de pares y la 
cantidad de impares.
 */

package tareaciclos7;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class TareaCiclos7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=0;
        int cont=1;
        int cantidad1=0;
        int cantidad2=0;
        Scanner teclado=new Scanner(System.in);
        
        
         System.out.print("Digite el numero "+"\n");
          numero =Integer.parseInt(teclado.nextLine());
        
        do
        {
          if(cont%2==0)
          {
          
         cantidad1=cantidad1+1;
          }
           else
          {
         cantidad2=cantidad2+1;
          }
           cont++; 
        }while(cont<=numero);
       
         System.out.print("La cantidad de pares son=  "+cantidad1+"\n");
         System.out.print("La cantidad de impares son=  "+cantidad2+"\n");
    }
    
}
