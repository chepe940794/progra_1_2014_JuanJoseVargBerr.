/*
    *Name: Class1
    
    *Information:This is the first class 
    
    *Date:7/5/2014
    
    *Copyright

 */

package clase1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Efrén
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     * This is the main method
     */
    public static void main(String[] args) throws IOException {
        
        double horasTrabajadas=0;
        double costoHora=0;
        double salario=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Hello world" +"\n" );
        
        System.out.print("Digite las horas laboradas por el trabajador" +"\n");
        
        horasTrabajadas =Double.parseDouble(teclado.nextLine());
        
        
        System.out.print("Digite el costo por hora" +"\n");
        
        costoHora =Double.parseDouble(teclado.nextLine());
        
        salario=horasTrabajadas*costoHora;
        
        System.out.print("El salario final es " +salario);
        
        System.out.print("Java epic win" +"\n" );
        
      
        
        
    }
    
}