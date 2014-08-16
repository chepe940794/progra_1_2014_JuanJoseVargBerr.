/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch3t;
import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Switch3t {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
 
   
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la letra :");
        char  letra;
        letra=in.nextLine().charAt(0);
        switch(letra)
        {
            case 'a':case 'A': System.out.println("EXCELENTE");break;
            case 'b':case 'B': System.out.println("BUENO");break;
            case 'c':case 'C': System.out.println("REGULAR");break;
            case 'd':case 'D': System.out.println("MALO");break;
            case 'e':case 'E': System.out.println("PESIMO");break;
            default: System.out.println("Letra fuera de rango");break;
        }
    }
    
}
