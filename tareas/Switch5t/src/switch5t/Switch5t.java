/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch5t;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Switch5t {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
    int n=0, u, d, c, m;
    System.out.println("CONVERSION DE ARABIGOS A ROMANOS");
    Random rnd = new Random();
    for (int i = 0; i < 3000; i++) {
            n = (int)(rnd.nextDouble() * 3000.0);
             n=n%3000+1;
        }
    System.out.println("El numero generado es : "+n);
    u=n%10; 
    n=n/10;
    d=n%10;
    n=n/10;
    c=n%10;
    n=n/10;
    m=n%10;
 
    switch(m)
    {
      case 1: System.out.print("M");  break;
      case 2: System.out.print("MM");  break;
      case 3: System.out.print("MMM");  break;
    }
    switch(c)
    {
      case 1: System.out.print("C");  break;
      case 2: System.out.print("CC");  break;
      case 3: System.out.print("CCC");  break;
      case 4: System.out.print("CD");  break;
      case 5: System.out.print("D");  break;
      case 6: System.out.print("DC");  break;
      case 7: System.out.print("DCC");  break;
      case 8: System.out.print("DCCC");  break;
      case 9: System.out.print("CM");  break;
    }
    switch(d)
    {
      case 1: System.out.print("X");  break;
      case 2: System.out.print("XX");  break;
      case 3: System.out.print("XXX");  break;
      case 4: System.out.print("XL");  break;
      case 5: System.out.print("L");  break;
      case 6: System.out.print("LX");  break;
      case 7: System.out.print("LXX");  break;
      case 8: System.out.print("LXXX");  break;
      case 9: System.out.print("XC");  break;
    }
 
    switch(u)
    {
      case 1: System.out.print("I");  break;
      case 2: System.out.print("II");  break;
      case 3: System.out.print("III");  break;
      case 4: System.out.print("IV");  break;
      case 5: System.out.print("V");  break;
      case 6: System.out.print("VI");  break;
      case 7: System.out.print("VII");  break;
      case 8: System.out.print("VIII");  break;
      case 9: System.out.print("IX");  break;
    }
        
    }
    
}
