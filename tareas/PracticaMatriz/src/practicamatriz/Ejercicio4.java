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
public class Ejercicio4 {
    
    
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
    
    public void ImprimirMayor() {
    	int mayor=matriz[0][0];
    	int filamayor=0;
    	int columnamayor=0;
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                if (matriz[f][c]>mayor) {
                    mayor=matriz[f][c];
                    filamayor=f;
                    columnamayor=c;
                }
            }
        }
        System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filamayor+ " y en la columna: "+columnamayor);
    }
    
    
    
}
