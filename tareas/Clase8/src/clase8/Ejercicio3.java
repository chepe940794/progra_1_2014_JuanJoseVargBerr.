/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

/**
 *
 * @author juan jose
 */
public class Ejercicio3 {
    
    
    private double salarioMañana[]=new double[4];
    private double salarioTarde[]=new double[4];
    
    public void AgregarSalarioMañana(double sueldo)
    {
        for (int i = 0; i < salarioMañana.length; i++) {
            if(salarioMañana[i]==0)
            {
                salarioMañana[i]= sueldo;
                break;
            }
        }
    }
    
     public void AgregarSalarioTarde(double sueldo)
    {
        for (int i = 0; i < salarioTarde.length; i++) {
            if(salarioTarde[i]==0)
            {
                salarioTarde[i]=sueldo;
                break;
            }
        }
    }
     
     public String ImprimirGastos()
     {
         double sumaSalarioMañana=0;
         double sumaSalarioTarde=0;
         
         for (int i = 0; i < salarioMañana.length; i++) {
             sumaSalarioMañana+=salarioMañana[i];
         }
         for (int i = 0; i < salarioTarde.length; i++) {
             sumaSalarioMañana+=salarioTarde[i];
         }
         
         return "El salario en el turno de la mañana es: "+sumaSalarioMañana+"\n"+
                 "El salario en el turno de la tarde es: "+sumaSalarioTarde+"\n";
     }
    
     
     
}
