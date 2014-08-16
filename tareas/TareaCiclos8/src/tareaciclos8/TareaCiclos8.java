/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaciclos8;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class TareaCiclos8 {
    private static String i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=0;
        int resultado=0;
        int numeroFinal=0;
        int cont=0;
        Scanner teclado=new Scanner(System.in);
        
        
       /**
        * Ciclo for
        */
         System.out.println("Digite el numero"+"\n");
         numero =Integer.parseInt(teclado.nextLine());
        System.out.println("\n");
        
        System.out.println("Digite el numero Final"+"\n");
         numeroFinal =Integer.parseInt(teclado.nextLine());
        System.out.println("\n");
        
        System.out.println("Aqui empieza el Ciclo For"+"\n");
        
        for (int i = 0; i <= numeroFinal; i++)
        {
        resultado= numero*i;  
        
        System.out.print(numero+" * "+ i +" = "+resultado+"\n");
        }
        
        
        
        //Fin Ciclo For
        System.out.println("-------------------------"+"\n");
        /**
         * Ciclo While
         */
        System.out.println("Aqui empieza el Ciclo While"+"\n");
        
        while(cont<=numeroFinal)
        {
        resultado=numero*cont;
        System.out.print(numero+" * "+ cont +" = "+resultado+"\n");
        cont++;
        }
        //Fin Ciclo While
        System.out.println("-------------------------"+"\n");
        /**
         * Ciclo Do While
         */
      System.out.println("Aqui empieza el Ciclo Do While"+"\n");
        cont=0;
      do{
      
      resultado=numero*cont;
        System.out.print(numero+" * "+ cont +" = "+resultado+"\n");
        cont++;
      }while(cont<=numeroFinal);
        //Fin de Ciclo Do While
    }
    
}
