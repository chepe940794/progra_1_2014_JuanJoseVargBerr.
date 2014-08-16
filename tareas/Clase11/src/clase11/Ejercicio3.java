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
public class Ejercicio3 {
    
     private int [][] matriz;
     private Scanner teclado;
    
    
    public void CargarMatriz()
    {
        teclado=new Scanner(System.in);
        matriz=new int[3][4];
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el numero correspondiente");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void PrimeraFila()
    {
        System.out.println("Primera fila de la matriz");
        for (int f = 0; f < 4; f++) {
            System.out.println(matriz[0][f]+" ");
            
        }
    }
    
    public void UltimaFila()
    {
        System.out.println("Ultima fila de la matriz");
        for (int f = 0; f < 4; f++) {
            System.out.println(matriz[2][f]+" ");
            
        }
    }
    
    public void PrimeraColumna()
    {
        System.out.println("Primera columna de la matriz");
        for (int c = 0; c < 3; c++) {
            System.out.println(matriz[c][0]+" ");
            
        }
    }
    
      public void UltimaColumna()
    {
        System.out.println("Ultima columna de la matriz");
        for (int c = 0; c < 3; c++) {
            System.out.println(matriz[c][3]+" ");
            
        }
    }
    
}
