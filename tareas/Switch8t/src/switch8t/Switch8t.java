 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch8t;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Switch8t {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        Scanner in = new Scanner(System.in);
        char dia1;
        int dia,x;
        System.out.print("Ingrese el dia 1 del mes :");
        dia1=in.nextLine().charAt(0);
        switch(dia1)
        {
            case 'L':case 'l': x=0;break;
            case 'M':case 'm': x=1;break;
            case 'X':case 'x': x=2;break;
            case 'J':case 'j': x=3;break;
            case 'V':case 'v': x=4;break;
            case 'S':case 's': x=5;break;
            case 'D':case 'd': x=6;break;
            default: System.out.println("Numero fuera de rango");break;
        }
        System.out.print("Ingrese el dia que es hoy:");
        dia=in.nextInt();
        switch(dia%7)
        {
            case 0: System.out.println("Domingo");break;
            case 1: System.out.println("Lunes");break;
            case 2: System.out.println("Martes");break;
            case 3: System.out.println("Miercoles");break;
            case 4: System.out.println("Jueves");break;
            case 5: System.out.println("Viernes");break;
            case 6: System.out.println("Sabado");break;
            default: System.out.println("Numero fuera de rango");break;
        }
    }
    
}
