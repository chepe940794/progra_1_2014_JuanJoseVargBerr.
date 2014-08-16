/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

/**
 *
 * @author juan jose
 */
public class Clase16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] arreglo = {"Mario", "Efren", "Susana", "Campbell", "Agustin", "Elias"};

        BusquedaLineal bl = new BusquedaLineal();

        System.out.println("La busqueda lineal es:" + bl.BuscarNombre(arreglo, "Efren"));

        System.out.println();

        String[] arreglo2 = {"Campbell", "Agustin", "Susana", "Elias", "Efren", "Mario"};
        BusquedaBinarios bb = new BusquedaBinarios();
        System.out.println("La busqueda binaria es:" + bb.BuscarNombre(arreglo2, "Campbell"));

        System.out.println();
    }

}
