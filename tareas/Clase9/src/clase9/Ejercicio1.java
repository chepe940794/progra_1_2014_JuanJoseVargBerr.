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
public class Ejercicio1 {
    
    private int valorAcum[]=new int[8];
    
     public void AgregarValor(int valor)
    {
        for (int i = 0; i < valorAcum.length; i++) 
        {
            if(valorAcum[i]==0)
            {
                valorAcum[i]= valor;
                break;
            }
            
        }
    }
    
    
    public int Sumatoria()
    {
        int sumatoria=0;
        for (int i = 0; i < valorAcum.length; i++) 
        {
            sumatoria+=valorAcum[i];
        }
        return sumatoria;
    }
    
    public int SumatoriaMa36()
    {
        int sumatoria1=0;
        
        for (int i = 0; i < valorAcum.length; i++) 
        {
            if(valorAcum[i]>36)
            {
                sumatoria1+=valorAcum[i];
            }
            
        }
        return sumatoria1;
    }
    
    public int SumatoriaMa50()
    {
        int sumatoria2=0;
        
        for (int i = 0; i < valorAcum.length; i++) 
        {
            if(valorAcum[i]>50)
            {
                sumatoria2++;
            }
            
        }
        return sumatoria2;
    }
    
    
    
}
