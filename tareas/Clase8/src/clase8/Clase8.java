/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;
import java.util.Scanner;
/**
 *
 * @author juan jose
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /**
        * 
         
        double[] sueldos=new double[5];
        int cantidadTrabajadores=1;
        double sueldo=0;
        
        Scanner teclado=new Scanner(System.in);
        
        
        do{
            
            System.out.println("Digite el sueldo del trabajador # "+ cantidadTrabajadores);
            
            sueldo=teclado.nextDouble();
            sueldos[cantidadTrabajadores-1]=sueldo;
            cantidadTrabajadores++;
        
        }while(cantidadTrabajadores<6);
        
        for (int i = 0; i < sueldos.length; i++) 
        {
            System.out.println("El sueldo del trabajador #"+(i+1)+" es de: "+sueldos[i]);
            
        }*/
        
        int cantidadPersonas=0;
        float alturaPersonas=0;
        Ejercicio2 oEjercicio2=new Ejercicio2();
        
        Scanner teclado=new Scanner(System.in);
        
        do{
            
            System.out.println("Digite la altura de la persona  "+ cantidadPersonas);
            
            alturaPersonas=teclado.nextFloat();
            oEjercicio2.AgregarAltura(alturaPersonas);
            cantidadPersonas++;
        
        }while(cantidadPersonas<6);
        
        System.out.println("El promedio es: "+oEjercicio2.Promedio());
        System.out.println(oEjercicio2.ContarPersonas());
    }
    
}
