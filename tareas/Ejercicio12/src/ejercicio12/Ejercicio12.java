/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero=0;
        double suma=0;
        double suma2=0;
        int conta=0;
        double numero2=0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite la cantidad de dolares que desea invertir" +"\n");
        numero =Integer.parseInt(teclado.nextLine());
        
        for(int i = 1; i <= 12; i++)
        {
            suma=1000*0.02;
            numero=suma+numero;
            
            
            
            conta=conta++;
            
            
        }
        System.out.print( conta +" Dolares equivale a =" +suma +"\n");
            
        System.out.print("la suma de todo es = " +numero +" Dolares "+"\n");
    }
    
}