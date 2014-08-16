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
public class Ejercicio2 {
    
    private Scanner teclado;
    private int[][] matriz;
    
    
    public void CargarMatriz() 
    {
        
        teclado=new Scanner(System.in);
        System.out.println("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.println("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.println("Ingrese componente:");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
    
     public void Intercambiar() {
        for(int c=0;c<matriz[0].length;c++) {
            int aux=matriz[0][c];
            matriz[0][c]=matriz[1][c];
            matriz[1][c]=aux;
        }
    }
    
    public void Imprimir() {
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }    
    
    
}
