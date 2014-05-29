/*
 * 5.	Construir un algoritmo que eleve un número decimal a un valor entero 
ingresado por el usuario. No se pueden utilizar las funciones matemáticas la 
idea es lograrlo mediante el uso del ciclo para.
 */

package tareaciclos5;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class TareaCiclos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cont=2;
        double numero;
        double exponente;
        double resultado;
         Scanner teclado=new Scanner(System.in);
         
         
          System.out.print("Digite el numero a elevar "+"\n");
          numero =Double.parseDouble(teclado.nextLine());
         
          System.out.print("Digite el exponente "+"\n");
          exponente =Double.parseDouble(teclado.nextLine()); 
          
          resultado=numero;
          
       while(cont<=exponente)
       {
       resultado=resultado*numero;
       System.out.print(resultado+"\n");
       cont++;
       }
          
    }
    
}
