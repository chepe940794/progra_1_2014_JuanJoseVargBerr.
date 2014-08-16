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
public class Ejercicio2 {
    
    
     private int [][] matriz;
     private Scanner teclado;
    
    
    public void CargarMatriz()
    {
        teclado=new Scanner(System.in);
        matriz=new int[4][4];
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese le numero correspondiente");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void ImprimirDiagonal()
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                if(i==j)
                {
                    System.out.print(matriz[i][i]+ " "); 
                }
                else
                {
                    System.out.print("_"+" ");
                    
                }
                
               
            }
           
            
            System.out.println();
        }
    }
    
}
