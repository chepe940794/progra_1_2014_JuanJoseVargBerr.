/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pract1ejercicio3;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Pract1ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int N=0;
       int sum=0;
       int sum1=0;
       int sum2=0;
       
       Scanner teclado = new Scanner(System.in);
       
       
       System.out.print("Digite un numero"+"\n");
       N =Integer.parseInt(teclado.nextLine());
       
       
       sum=N+77;
       sum1=sum-3;
       sum2=sum1*2;
       
    System.out.print(N+" incrementado en 77 es ="+sum+"\n");
    System.out.print(N+" decrementado en 3 es ="+sum1+"\n");
    System.out.print(N+" duplicado  es ="+sum2+"\n"); 
       
    //fin
       
              
    }
    
}
