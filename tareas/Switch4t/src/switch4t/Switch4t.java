/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch4t;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Switch4t {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int mes,año;
        System.out.print("Ingrese el numero de mes (1-12) :");
        mes=in.nextInt();
        System.out.print("Ingrese el año :");
        año=in.nextInt();
 
 
        switch(mes)
        {
           case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("El mes tiene 31 dias ");break;
           case 4:case 6:case 9:case 11:
                System.out.println("El mes tiene 30 dias ");break;
           case 2:
                if((año%4==0 && año%100!=0) || año%400==0)
                System.out.println("El mes tiene 29 dias ");
                else
                   System.out.println("El mes tiene 28 dias ");break;
           default:
                System.out.println("El istema pausado");break;
        }
    }
    
}
