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
public class Ejercicio3 {
    
    
    private Scanner teclado;
    private int[][] matriz;
    
    
    public void CargarMatriz() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print("Ingrese componente:");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
           
    public void imprimirVertices() {
    	System.out.println("Vértice superior izquierdo:");
        System.out.println(matriz[0][0]);
    	System.out.println("Vértice superior derecho:");        
        System.out.println(matriz[0][matriz[0].length-1]);
    	System.out.println("Vértice inferior izquierdo:");        
        System.out.println(matriz[matriz.length-1][0]);
    	System.out.println("Vértice inferior derecho:");        
        System.out.println(matriz[matriz.length-1][matriz[matriz.length-1].length-1]);
    }    
    
    
}

    

