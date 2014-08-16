/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15;

/**
 *
 * @author profe
 */
public class OrdenamientoSeleccion {

    public int[] OrdenS(int arreglo[], String ordenamiento) 
    {

        int indice = 0, indice2 = 0, menor = 0, posicion = 0, temporal = 0;
        for (indice = 0; indice < arreglo.length - 1; indice++) {
            menor = arreglo[indice];
            posicion = indice;
            for (indice2 = indice + 1; indice2 < arreglo.length; indice2++) {
                if (arreglo[indice2] > menor) {
                    menor = arreglo[indice2];
                    posicion = indice2;

                }

            }
          if(posicion!=indice){
          temporal=arreglo[indice];
          arreglo[indice]=arreglo[posicion];
          arreglo[posicion]=temporal;
          }
        }  return arreglo;



    }




}