/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalistas;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class PracticaListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int entradaNumero = 1;
        int[] arregloOrdenado = null;
        Metodos m = new Metodos();
        int[] arreglo = null;

        do {
            System.out.println("Por favor introduzca los numeros:");
            Scanner entradaEscaner = new Scanner(System.in);
            entradaNumero = entradaEscaner.nextInt();
            if (entradaNumero != 0) {
                m.Insertar(entradaNumero);
                System.out.println("Entrada recibida por numero es: \"" + entradaNumero + "\"");
            }
        } while (entradaNumero != 0);
        m.Imprimir();

        arregloOrdenado = m.OrdenamientoB(arreglo, "A");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            System.out.println(arregloOrdenado[i]);
        }
        
        
    }
}
