/*
 * 3.	Solicitar al usuario que ingrese un valor inicial, un valor final 
y el incremento deseado. Estos valores deben ser decimales. El sistema llenará
imprimir los números generados por un ciclo for con los parámetros 
antes mencionados.
 */

package tareaciclos3;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class TareaCiclos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double valorInicial;
        double valorFinal;
        double incremento;
        double sumatoria=0;
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Digite el valor inicial "+"\n");
         valorInicial =Double.parseDouble(teclado.nextLine());
         
         
          System.out.print("Digite el valor final "+"\n");
         valorFinal =Double.parseDouble(teclado.nextLine());
         
          System.out.print("Digite el incremento "+"\n");
         incremento =Double.parseDouble(teclado.nextLine());
        
         sumatoria=valorInicial ;
      while(sumatoria<valorFinal) 
         
         {
             
           sumatoria=sumatoria+incremento;
           
               System.out.println("la sumatoria es "+sumatoria); 
         
         }
     
    }
    
}
