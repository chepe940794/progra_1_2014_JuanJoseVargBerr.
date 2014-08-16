/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributos;

import java.util.Scanner;


/**
 *
 * @author Profe
 */
public class Atributos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean validar=true;
        int opcion;
        char continuar;
        double monto;
        
        
        
        Account oAccount=new Account();
        Scanner teclado=new Scanner(System.in);
        
        while(validar)
        {
        System.out.println("Digite 1 si quiere realizar un Deposito y "
                + "2 si quiere realizar un Retiro"+"\n");
         opcion =Integer.parseInt(teclado.nextLine());
         
         
         if (opcion==1)
         {
             
         System.out.println("Digite el monto a Depositar"+"\n");
         monto=Double.parseDouble(teclado.nextLine());
         oAccount.Deposito(monto);
         
         }
         if(opcion==2)
         {
           System.out.print("Digite el monto a Retirar"+"\n");
         monto=Double.parseDouble(teclado.nextLine());
         oAccount.Deposito(monto);
         if(oAccount.isHayError())
         {
         System.out.println("El monto que ust va a retirar no puede ser retirado"+"\n");
         
         }
         
         }
         
         System.out.println("El saldo final es de = "+oAccount.getSaldoInicial());
         System.out.println("Desea continuar con otra transaccion S/N");
         continuar=teclado.nextLine().charAt(0);
         
         if ((continuar=='S')||(continuar=='s'))
         {
         validar = true;
         }
         if ((continuar=='N')||(continuar=='n'))
         {
         validar=false;
         }
         
        }
        
        
    }
    
}
