/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch6t;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Switch6t {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int d,m,a,ma,nd=0;
        System.out.print("Ingrese dia : ");
        d=in.nextInt();
        System.out.print("Ingrese mes : ");
        m=in.nextInt();
        System.out.print("Ingrese año : ");
        a=in.nextInt();
        ma=m-1;
        if(ma==0) ma=12;
 
          switch(ma)
          {
               case 1: case 3:case 5: case 7: case 8: case 10: case 12:
                   nd=31;
                   break;
               case 4: case 6: case 9: case 11:
                  nd=30;
                  break;
               case 2:
                    if((a%4==0 && a%100!=0) || a % 400==0) nd =29;
                    else nd=28;
                    break;
          }
          d = d-1;
          if(d==0)
          {
             d=nd;
             m=m-1;
             if(m==0)
             {
               m=12;
               a=a-1;
             }
          }
          System.out.println("La fecha del dia anterior es: "+d+"/"+m+"/"+a);
    }
}
        
   
