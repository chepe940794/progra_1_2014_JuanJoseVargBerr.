/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9.pkg1;



/**
 *
 * @author Estudiante
 */
public class ejercicio91 {
    
    private int vector1[]=new int[4];
    private int vector2[]=new int[4];
    private int[] Sumatoria;
    
    public void Agregarvalorvector1(int valor)
    {
        for(int i=0; i<vector1.length; i++)
            if(vector1[i]==0)
            {
                vector1[i]=valor;
                break;
            }
            
            
    }
    public void Agregarvalorvector2(int valor)
    {
        for(int i=0; i<vector2.length; i++)
            if(vector2[i]==0)
            {
                vector2[i]=valor;
                break;
            }
            
            
    }
    public void SumarVectores() {
    	Sumatoria=new int[4];
        for(int i=0;i<4;i++) {
            Sumatoria[i]=vector1[i]+vector2[i];
        }
        System.out.println("Vector resultante.");
        for(int i=0;i<4;i++) {
            System.out.println(Sumatoria[i]);
        }
    }

          
}
    
    

