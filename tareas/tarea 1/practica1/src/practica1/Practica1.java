/*
 
 */

package practica1;
import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int N=0;
        double A=0;
        char C;
        double suma=0;
        double diferencia=0;
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        
        System.out.print("Digite el valor A"+"\n");
        N =Integer.parseInt(teclado.nextLine());
        
        
        System.out.print("Digite el valor N"+"\n");
        A =Double.parseDouble(teclado.nextLine());
        
        suma=N+A;
        diferencia=A-N;
        
        
        
        System.out.print("El valor de A es  = "+A+"\n");
        System.out.print("El valor de N es  = "+N+"\n");
        System.out.print("la suma de A + N es  = "+suma+"\n");
        System.out.print("la diferencia de N - A es  = "+diferencia+"\n");
        
        
        
        
        
        
    }
    
}
