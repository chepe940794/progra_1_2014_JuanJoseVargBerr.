/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9.pkg1;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Clase91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector1=0;
        int vector2=0;
        int Sumatoria;
        int totalvalores=0;       
        ejercicio91 oejercicio91=new ejercicio91();
        Scanner teclado=new Scanner(System.in);
        do
        {
            System.out.print("digite los valores de los dos vectores");
            vector1=teclado.nextInt();
            vector2=teclado.nextInt();
            oejercicio91.Agregarvalorvector1(vector1);
            oejercicio91.Agregarvalorvector2(vector2);
            totalvalores++;
        }while(totalvalores<4);
        
        System.out.println("El valor acomulado del primer vector es: "+oejercicio91.Agregarvalorvector1());
        System.out.println("El valor acomulado del segundo vector es: "+oejercicio91.Agregarvalorvector2());
        System.out.println("la suma de los vectores es: "+oejercicio91.SumarVectores());
        
    }
    
}
