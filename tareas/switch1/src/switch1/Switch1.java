/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch1;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion=0;
        int numero=0;
        char continuar;
        boolean validar=true;
        String mes;
        
         Scanner teclado = new Scanner(System.in);
         
         
        Operacion oOperacion=new Operacion();
        
        
        do{
        
        System.out.println("Digite el numero para saber el mes"+"\n"); 
      
         
    
                 numero =Integer.parseInt(teclado.nextLine());
                 mes=oOperacion.Mes(numero);
                 System.out.println(mes);
        
        
             
            
            
        
            
            
            
            
        System.out.println("Desea continuar  S/N");
         continuar=teclado.nextLine().charAt(0);
         
         if ((continuar=='S')||(continuar=='s'))
         {
         validar = true;
         }
         else
         {
         validar=false;
         }
        }while(validar);
        
    }
    
}
