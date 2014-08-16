/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        int valor1=0;
        int valor2=0;
        double resultado=0;
        char continuar;
        boolean validar=true;
        
        
          Scanner teclado = new Scanner(System.in);
          Operaciones oOperaciones=new Operaciones();
          
          
        do{
        
            System.out.println("Digite la operacion a evaluar"+"\n"); 
            
            System.out.println("1.Suma"); 
            System.out.println("2.Resta"); 
            System.out.println("3.Division"); 
            System.out.println("4.Multiplicacion"); 
            System.out.println("5.Raiz"); 
            System.out.println("6.Potencia"); 
            
            
             System.out.println("Digite una opcion"); 
             opcion =Integer.parseInt(teclado.nextLine());
            
            switch(opcion)
            {
                case 1:
                       System.out.println("Digite el valor del primer digito");
                       valor1 =Integer.parseInt(teclado.nextLine());
        
                       System.out.println("Digite el valor del segundo digito");
                       valor2 =Integer.parseInt(teclado.nextLine());
                       resultado= oOperaciones.Sumar(valor1,valor2);
                        System.out.println(resultado);
                    break;
                case 2:
                       System.out.println("Digite el valor del primer digito");
                       valor1 =Integer.parseInt(teclado.nextLine());
        
                       System.out.println("Digite el valor del segundo digito");
                       valor2 =Integer.parseInt(teclado.nextLine());
                       resultado=oOperaciones.Resta(valor1,valor2);
                       System.out.println(resultado);
                    break;    
                case 3:
                       System.out.println("Digite el valor del primer digito");
                       valor1 =Integer.parseInt(teclado.nextLine());
        
                       System.out.println("Digite el valor del segundo digito");
                       valor2 =Integer.parseInt(teclado.nextLine());
                      resultado= oOperaciones.Division(valor1,valor2);
                      System.out.println(resultado);
                    break;      
                 case 4:
                       System.out.println("Digite el valor del primer digito");
                       valor1 =Integer.parseInt(teclado.nextLine());
        
                       System.out.println("Digite el valor del segundo digito");
                       valor2 =Integer.parseInt(teclado.nextLine());
                      resultado= oOperaciones.Multiplicacion(valor1,valor2);
                      System.out.println(resultado);
                      
                    break; 
                     
                 case 5:
                       System.out.println("Digite el valor del primer digito");
                       valor1 =Integer.parseInt(teclado.nextLine());
                       resultado=oOperaciones.Raiz(valor1);
                       System.out.println(resultado);
                    break;  
                 case 6:
                       System.out.println("Digite el valor del primer digito");
                       valor1 =Integer.parseInt(teclado.nextLine());
        
                       System.out.println("Digite el valor del segundo digito");
                       valor2 =Integer.parseInt(teclado.nextLine());
                      resultado= oOperaciones.Potencia(valor1,valor2);
                      System.out.println(resultado);
                    break; 
                     
                 default :
                    break;
                     
            }
            
            
            
         System.out.println("Desea continuar  S/N");
         continuar=teclado.nextLine().charAt(0);
         
         if ((continuar=='S')||(continuar=='s'))
         {
         validar = true;
         }
         else
         {
         validar=false;
         }
        }while(validar);
        
        
        
       
        
        
        
        }
        
}
        
    
