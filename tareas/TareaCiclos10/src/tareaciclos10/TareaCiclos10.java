/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaciclos10;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class TareaCiclos10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int numero=0;
        int acum=0;
        int promedio=0;
        
        Scanner teclado=new Scanner(System.in);
        
       do{
           System.out.println("Digite un numero"+"\n");
           numero =Integer.parseInt(teclado.nextLine());
          
       
       }while(numero!=0);
             
        
        System.out.println("La suma de todos es ="+acum+"\n");
          System.out.println("El promedio  es ="+promedio+"\n");
        
    }
    
}
