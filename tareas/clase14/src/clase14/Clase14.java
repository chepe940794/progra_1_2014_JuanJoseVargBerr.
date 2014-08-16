/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14;

/**
 *
 * @author juan jose
 */
public class Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arreglo = {56, 4, 85, 85, 42};
        int[] arregloOrdenado;
        OrdenamientoSeleccion os = new OrdenamientoSeleccion();
        arregloOrdenado = os.OrdenS(arreglo, "A");
        for (int i = 0; i < arregloOrdenado.length; i++) {

            System.out.println( arregloOrdenado[i]);

        }
    }

}
