/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatriz;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Ejercicio1 {
    
     private Scanner teclado;
    private int[][] matriz;
    
    public void CargarMatriz() {
        
        teclado=new Scanner(System.in);
        matriz=new int[2][5];
        
        System.out.println("Carga de la matriz por columna:");
        for(int c=0;c<5;c++) {        
           for(int f=0;f<2;f++) {
                System.out.print("Ingrese componente " + " de la fila " + f + " y la columna "+ c + " :");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
    
     public void Imprimir() {
        for(int f=0;f<2;f++) {
            for(int c=0;c<5;c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    
}
