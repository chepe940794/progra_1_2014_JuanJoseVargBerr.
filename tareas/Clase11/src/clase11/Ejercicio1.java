/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase11;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Ejercicio1 {
    
    
    private int [][] matriz;
    private Scanner teclado;
    
    
    public void CargarMatriz()
    {
        teclado=new Scanner(System.in);
        matriz=new int[3][5];
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("Ingrese le numero correspondiente");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void Imprimir()
    {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] +" ");
            }
            System.out.println();
            
        }
    }
    
}
