/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalista1;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Practicalista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int entradaNumero = 1;
        int entradaNumero2=1;
         int[] arregloOrdenado = null;
         ejercicio1 oejercicio1 = new ejercicio1();

          do {
              System.out.println("lista 1:");
         System.out.println("Por favor introduzca un numero:");
         Scanner entradaEscaner = new Scanner(System.in);
        
          entradaNumero = entradaEscaner.nextInt();
         if (entradaNumero != 0) {
         oejercicio1.Insertar(entradaNumero);
         oejercicio1.arreglo();
         
         
         }
         } while (entradaNumero != 0);
         do {
             System.out.println("lista 2:");
         System.out.println("Por favor introduzca un numero:");
         Scanner entradaEscaner = new Scanner(System.in);
        
          entradaNumero2 = entradaEscaner.nextInt();
         if (entradaNumero2 != 0) {
         oejercicio1.Insertar2(entradaNumero2);
         
         }
         } while (entradaNumero2 != 0);
         
        oejercicio1.Imprimir();
        
            
            System.out.println("La cantidad de nodos de la lista 1 es:"+ 
                    oejercicio1.Cantidad()+" "+"La cantidad de nodos de la lista 2 es:"
                     + oejercicio1.Cantidad2());
            
          System.out.println("Pares e impares 1"+oejercicio1.impParImpar1());
        }
    

}
