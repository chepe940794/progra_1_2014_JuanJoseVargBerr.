/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch2t;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Switch2t {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero entero : ");
        num=in.nextInt();
        switch(num%10)
        {
            case 2:case 5:case 8:
                System.out.println("El cuadrado del numero es : "+num*num);break;
            case 4:case 7:case 9:
                System.out.println("El numero multiplicado por 5 es : "+num*5);break;
            default: 
                System.out.println("El numero ingresado es : "+num);break;
        }
    }
    
}
