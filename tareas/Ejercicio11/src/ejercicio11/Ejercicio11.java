/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Ejercicio11 {

    /**
     * 
     * 
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        
        int numero=0;
        int suma=0;
        int suma2=0;
        int cont=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite la cantidad de dolares a convertir" +"\n");
        numero =Integer.parseInt(teclado.nextLine());
        
        
        for (int i = 1; i < numero; i++) 
        
        {
         suma =i*560;
         suma2=suma2+suma;
         cont++;
           System.out.print( cont +" Dolares equivale a =" +suma +"\n");
        }
          System.out.print("la suma de todo es = " +suma2 +" Dolares "+"\n");
      
    }
    
}
