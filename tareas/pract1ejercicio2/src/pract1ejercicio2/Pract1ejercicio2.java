/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pract1ejercicio2;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Pract1ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x=0;
        int y=0;
        double n=0;
        double m=0;
        int sum1=0;
        int rest1=0;
        int mult1=0;
        int div1=0;
        double sum2=0;
        double rest2=0;
        double mult2=0;
        double div2=0;
        
        
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el valor X"+"\n");
        x =Integer.parseInt(teclado.nextLine());
         
        System.out.print("Digite el valor Y"+"\n");
        y =Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor N"+"\n");
        n =Double.parseDouble(teclado.nextLine());
        
        System.out.print("Digite el valor M"+"\n");
        m =Double.parseDouble(teclado.nextLine());
        
        sum1=x+y;
        rest1=x-y;
        mult1=x*y;
        div1=x/y;
        
        sum2=n+m;
        rest2=n-m;
        mult2=n*m;
        div2=n/m;
        
        
        
         System.out.print("La suma de X + Y es ="+sum1+"\n");
         System.out.print("La resta de X - Y es ="+rest1+"\n");
         System.out.print("La multiplicacion de X * Y es ="+mult1+"\n");
        System.out.print("La divicion de X / Y es ="+div1+"\n");
     
        System.out.print("La suma de N + M es ="+sum2+"\n");
         System.out.print("La resta de N - M es ="+rest2+"\n");
         System.out.print("La multiplicacion de N * M es ="+mult2+"\n");
        System.out.print("La divicion de N / M es ="+div2+"\n");
        
    }
    
}
