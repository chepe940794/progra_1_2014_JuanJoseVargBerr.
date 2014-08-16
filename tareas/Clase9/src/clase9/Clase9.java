/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * 
         
        int cantidadValores=0;
        int valores=0;
        Ejercicio1 oEjercicio1=new Ejercicio1();
        
        Scanner teclado=new Scanner(System.in);
        
        do{
            
            System.out.println("Digite los valores  "+ cantidadValores);
            
            valores=teclado.nextInt();
            oEjercicio1.AgregarValor(valores);
            cantidadValores++;
        
        }while(cantidadValores<8);
        
        System.out.println("El valor acumulado  es: "+oEjercicio1.Sumatoria());
       System.out.println("El valor acumulado  es: "+oEjercicio1.SumatoriaMa36());
       System.out.println("El valor acumulado  es: "+oEjercicio1.SumatoriaMa50());
    }
    */
        int cursoA=0;
        int cursoB=0;
        int cantidadValores=0;
        Ejercicio2 oEjercicio2=new Ejercicio2();
        
        Scanner teclado=new Scanner(System.in);
        
        do{
            
            System.out.println("Digite las notas del curso A  "+ cantidadValores);
            for (int i = 0; i < 5; i++) {
              System.out.println("Ingrese notas A");   
            
            cursoA=teclado.nextInt();
            oEjercicio2.AgregarNotasA(cursoA);
            cantidadValores++;
            }
           
            for (int i = 0; i < 5; i++) {
                 System.out.println("Ingrese notas B");   
            
            cursoB=teclado.nextInt();
            oEjercicio2.AgregarNotasB(cursoB);
            cantidadValores++;
            }
            
        
        }while(cantidadValores<5);
        
       System.out.println("El promedio general es de: "+oEjercicio2.Promedio());
    }
}