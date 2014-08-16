/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicastring;

/**
 *
 * @author juan jose
 */
public class ejercicio1 {
    
     private String cadena;
     
     
     /**
      * Devolver la palabra alrevez.
      * @return 
      */
     public String Alrevez()
    {
        String retorno="";
        
        for (int i = getCadena().length()-1; i >= 0; i--) 
        {
            retorno+=getCadena().charAt(i);
        }
        return retorno;
    }
     //fin 
     
    /**
     * Palindromo
     */
    
    public boolean Palindromo(){
    boolean valor=true;
    int i,ind;    
    String cadena2="";
    //quitamos los espacios
    for (int x=0; x < cadena.length(); x++) {
        if (cadena.charAt(x) != ' ')
            cadena2 += cadena.charAt(x);
    }
    //volvemos a asignar variables
    cadena=cadena2;    
    ind=cadena.length();
    //comparamos cadenas
    for (i= 0 ;i < (cadena.length()); i++){        
       if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
           //si una sola letra no corresponde no es un palindromo por tanto
           //sale del ciclo con valor false
            valor=false;
            break;
       }
       ind--;
    }
    return valor;
}
     
     
   

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
}
