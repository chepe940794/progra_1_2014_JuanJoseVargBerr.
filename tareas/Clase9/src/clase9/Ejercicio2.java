/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

/**
 *
 * @author juan jose
 */
public class Ejercicio2 {
    
    
    private int notasA[]=new int[5];
    
     public void AgregarNotasA(int valor)
    {
        for (int i = 0; i < notasA.length; i++) 
        {
            if(notasA[i]==0)
            {
                notasA[i]= valor;
                break;
            }
            
        }
    }
     
     private int notasB[]=new int[5];
    
     public void AgregarNotasB(int valor)
    {
        for (int i = 0; i < notasB.length; i++) 
        {
            if(notasB[i]==0)
            {
                notasB[i]= valor;
                break;
            }
            
        }
    }
     
     public float Promedio()
    {
        float promedioA=0;
        float promedioB=0;
        float sumaPromedios=0;
        float suma1=0;
        float suma2=0;
        float promedio=0;
        
        for (int i = 0; i < notasA.length; i++) 
        {
            suma1=suma1+notasA[i];
            
           
        }
        for (int i = 0; i < notasB.length; i++) {
            suma2=suma2+notasB[i];
        }
        
        promedioA=suma1/5;
        promedioB=suma2/5;
        sumaPromedios=promedioA+promedioB;
        if(promedioA>promedioB)
        {
            System.out.println("El curso A tiene un promedio mayor. "+"con un promedio de: "+promedioA);
        }
        else
        {
            System.out.println("El curso B tiene un promedio mayor. "+"con un promedio de: "+promedioB);
        }
       promedio=sumaPromedios/(notasA.length+notasB.length);
       return promedio;
    }
    
        
    
    
}
